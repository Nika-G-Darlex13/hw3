package hw3

fun main(){
    val myEngine = Engine(power = 210)
    val myBody = Body(color = "Красный")
    val myWheelSize = 16

    val generateCar = Car(
        engineCar = myEngine,
        bodyCar = myBody,
        wheelSize = myWheelSize
    )

    generateCar.showDetails()
}