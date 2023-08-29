package measurement.shapes.basic

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

    fun calculateCircle(circle: Circle): Circle

    fun calculateParallelogram(parallelogram: Parallelogram): Parallelogram

    fun calculatePolygon(polygon: Polygon): Polygon

    fun calculateRectangle(rectangle: Rectangle): Rectangle

    fun calculateRhombus(rhombus: Rhombus): Rhombus

    fun calculateRightTriangle(rightTriangle: RightTriangle): RightTriangle

    fun calculateSector(sector: Sector): Sector

    fun calculateSquare(square: Square): Square

    fun calculateTriangle(triangle: Triangle): Triangle
}