package measurement.shapes

/*
* The interface describes how the shapes classes should implement
* the shapes dimensional calculations. The functions need to
* determine the dimensions by calculations and return the shape
* with the calculated variables and attributes
* */
interface Shape {
    fun <T> calculateShape(action: () -> T): T {
        return action()
    }

    fun calculateSquare(square: Square): Square

    fun calculateRectangle(rectangle: Rectangle): Rectangle

    fun calculateCircle(circle: Circle): Circle

    fun calculateSector(sector: Sector): Sector
}