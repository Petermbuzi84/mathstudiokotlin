package measurement.shapes

interface Shape {
    fun <T> calculateShape(action: () -> T): T {
        return action()
    }

    fun calculateSquare(square: Square): Square

    fun calculateRectangle(rectangle: Rectangle): Rectangle

    fun calculateCircle(circle: Circle): Circle

    fun calculateSector(sector: Sector): Sector
}