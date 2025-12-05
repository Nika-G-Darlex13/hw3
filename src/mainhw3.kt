package hw3

fun main() {
    val myEngine = Engine(power = 210)
    val myBody = Body(color = "Красный")
    val myWheelSize = 16

    val generateCar = Car(
        carEngine = myEngine,
        carBody = myBody,
        wheelSize = myWheelSize
    )
    generateCar.showDetails()
}