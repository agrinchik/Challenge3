package academy.learnprogramming.oochallenge

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

  fun applyBrake(decrement: Int) {
    speed -= decrement;
  }

  fun speedUp(increment: Int) {
    speed += increment;
  }

  open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
}

open class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            KotlinBicycle(cadence, speed, gear) {

  private var color: String = ""

  constructor(colorParameter: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
              this(seatHeight, cadence, speed, gear) {
    color = colorParameter
    println("color: $color")
  }

  // companion object. Immutable List<String> called availableColors
  // initialize the list to "blue", "red", "white", "black", "green" and "brown"
  companion object {
    val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
  }


  override fun printDescription() {
    super.printDescription()
    println("The mountain bike has a seat height of $seatHeight inches.")
  }
}

open class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
            KotlinBicycle(cadence, speed, gear) {

  override fun printDescription() {
    super.printDescription()
    println("The road bike has a tire width of $tireWidth MM.")
  }
}

fun main(args: Array<String>) {

  val bicycle = KotlinBicycle(11, 12, 13)
  val mountainBike = KotlinMountainBike(123, 4, 5, 6)
  val roadBike = KotlinRoadBike(7, 8, 9, 45)
  bicycle.printDescription()
  mountainBike.printDescription()
  roadBike.printDescription()

  val bicycle2 = KotlinBicycle(11, 12)
  val mountainBike2 = KotlinMountainBike(123, 4, 5)
  val roadBike2 = KotlinRoadBike(45, 7, 8)
  bicycle2.printDescription()
  mountainBike2.printDescription()
  roadBike2.printDescription()

  val mountainBike3 = KotlinMountainBike("green", 123, 4, 5)
  mountainBike3.printDescription()

  println(KotlinMountainBike.availableColors)


}


