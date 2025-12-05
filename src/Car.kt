package hw3

class Car(
    val wheelSize: Int,
    val carEngine: Engine,
    val carBody: Body,
) {
    val wheels: List<Wheel> = listOf(
        Wheel(wheelSize),
        Wheel(wheelSize),
        Wheel(wheelSize),
        Wheel(wheelSize),
    )

    fun showDetails() {
        println("Цвет кузова: ${carBody.getColor()}")
        println("Мощность двигателя: ${carEngine.getPower()} л.с.")
        println("Размер колес: ${wheelSize} дюймов (Всего: ${wheels.size} шт)")
    }
}
