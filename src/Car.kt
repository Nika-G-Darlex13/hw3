package hw3

class Car (
    wheelSize: Int,
    val engineCar: Engine,
    val bodyCar: Body
) {
    val wheels: List<Wheel> = listOf(
        Wheel(wheelSize),
        Wheel(wheelSize),
        Wheel(wheelSize),
        Wheel(wheelSize))

    fun showDetails() {
        println("Цвет кузова: ${bodyCar.getColor()}")
        println("Мощность двигателя: ${engineCar.getPower()} л.с.")
        println("Размер колес: ${wheels.first().getSize()} дюймов (Всего: ${wheels.size} шт)")
    }
}
