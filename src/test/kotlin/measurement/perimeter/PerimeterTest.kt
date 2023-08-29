package measurement.perimeter

import measurement.shapes.basic.Circle
import measurement.shapes.basic.Rectangle
import measurement.shapes.basic.Sector
import measurement.shapes.basic.Square
import org.junit.Test

class PerimeterTest {
    @Test
    fun calculatePerimeterSquare() {
        val length = 20.0
        val requiredPerimeter = 80.0
        val per = Perimeter()
        val dimension = Square(length = length)
        val calculated = per.calculateSquare(dimension)
        assert(calculated.perimeter == requiredPerimeter)
    }

    @Test
    fun calculateLengthSquare() {
        val perimeter = 80.0
        val requiredLength = 20.0
        val per = Perimeter()
        val dimension = Square(perimeter = perimeter)
        val calculated = per.calculateSquare(dimension)
        assert(calculated.length == requiredLength)
    }

    @Test
    fun calculatePerimeterRectangle() {
        val length = 20.0
        val width = 10.0
        val requiredPerimeter = 60.0
        val per = Perimeter()
        val dimension = Rectangle(length = length, width = width)
        val calculated = per.calculateRectangle(dimension)
        assert(calculated.perimeter == requiredPerimeter)
    }

    @Test
    fun calculateLengthRectangle() {
        val perimeter = 60.0
        val width = 10.0
        val requiredLength = 20.0
        val per = Perimeter()
        val dimension = Rectangle(perimeter = perimeter, width = width)
        val calculated = per.calculateRectangle(dimension)
        assert(calculated.length == requiredLength)
    }

    @Test
    fun calculateWidthRectangle() {
        val perimeter = 60.0
        val length = 20.0
        val requiredWidth = 10.0
        val per = Perimeter()
        val dimension = Rectangle(perimeter = perimeter, length = length)
        val calculated = per.calculateRectangle(dimension)
        assert(calculated.width == requiredWidth)
    }

    @Test
    fun calculateCircumferenceCircle() {
        val radius = 7.0
        val requiredCircumference = 44.0
        val per = Perimeter()
        val dimension = Circle(radius = radius)
        val calculated = per.calculateCircle(dimension)
        assert(calculated.circumference == requiredCircumference)
    }

    @Test
    fun calculateRadiusCircle() {
        val circumference = 44.0
        val requiredRadius =7.0
        val per = Perimeter()
        val dimension = Circle(circumference = circumference)
        val calculated = per.calculateCircle(dimension)
        assert(calculated.radius == requiredRadius)
    }

    @Test
    fun calculatePerimeterSector() {
        val angle = 90.0
        val radius = 7.0
        val requiredPerimeter = 25.0
        val per = Perimeter()
        val dimension = Sector(angle = angle, radius = radius)
        val calculated = per.calculateSector(dimension)
        assert(calculated.perimeter == requiredPerimeter)
    }

    @Test
    fun calculateAngleSectorGivenPerimeter() {
        val perimeter = 25.0
        val radius = 7.0
        val requiredAngle = 90.0
        val per = Perimeter()
        val dimension = Sector(perimeter = perimeter, radius = radius, given = "perimeter")
        val calculated = per.calculateSector(dimension)
        assert(calculated.angle == requiredAngle)
    }

    @Test
    fun calculateRadiusSectorGivenPerimeter() {
        val perimeter = 25.0
        val angle = 90.0
        val requiredRadius = 7.0
        val per = Perimeter()
        val dimension = Sector(perimeter = perimeter, angle = angle, given = "perimeter")
        val calculated = per.calculateSector(dimension)
        assert(calculated.radius == requiredRadius)
    }
}
