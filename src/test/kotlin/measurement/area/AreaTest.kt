package measurement.area

import measurement.area.shapes.Area
import measurement.shapes.Circle
import measurement.shapes.Rectangle
import measurement.shapes.Sector
import measurement.shapes.Square
import org.junit.Test

class AreaTest {
    @Test
    fun calculateAreaSquare() {
        val length = 4.0
        val requiredArea = 16.0
        val areaInstance = Area()
        val square = Square(length = length)
        val results = areaInstance.calculateSquare(square)
        assert(results.area == requiredArea)
    }

    @Test
    fun calculateLengthSquare() {
        val area = 16.0
        val requiredLength = 4.0
        val areaInstance = Area()
        val square = Square(area = area)
        val results = areaInstance.calculateSquare(square)
        assert(results.length == requiredLength)
    }

    @Test
    fun calculateAreaRectangle() {
        val length = 4.0
        val width = 8.0
        val requiredArea = 32.0
        val areaInstance = Area()
        val rectangle = Rectangle(length = length, width = width)
        val results = areaInstance.calculateRectangle(rectangle)
        assert(results.area == requiredArea)
    }

    @Test
    fun calculateLengthRectangle() {
        val area = 32.0
        val width = 8.0
        val requiredLength = 4.0
        val areaInstance = Area()
        val rectangle = Rectangle(area = area, width = width)
        val results = areaInstance.calculateRectangle(rectangle)
        assert(results.length == requiredLength)
    }

    @Test
    fun calculateWidthRectangle() {
        val length = 4.0
        val area = 32.0
        val requiredWidth = 8.0
        val areaInstance = Area()
        val rectangle = Rectangle(length = length, area = area)
        val results = areaInstance.calculateRectangle(rectangle)
        assert(results.width == requiredWidth)
    }

    @Test
    fun calculateAreaCircle() {
        val radius = 7.0
        val requiredArea = 154.0
        val areaInstance = Area()
        val circle = Circle(radius = radius)
        val results = areaInstance.calculateCircle(circle)
        assert(results.area == requiredArea)
    }

    @Test
    fun calculateRadiusCircle() {
        val area = 154.0
        val requiredRadius = 7.0
        val areaInstance = Area()
        val circle = Circle(area = area)
        val results = areaInstance.calculateCircle(circle)
        assert(results.radius == requiredRadius)
    }

    @Test
    fun calculateAreaSector() {
        val angle = 60.0
        val radius = 84.0
        val requiredArea = 3696.0
        val areaInstance = Area()
        val sector = Sector(angle = angle, radius = radius)
        val results = areaInstance.calculateSector(sector)
        assert(results.area == requiredArea)
    }

    @Test
    fun calculateAngleSector() {
        val area = 3696.0
        val radius = 84.0
        val requiredAngle = 60.0
        val areaInstance = Area()
        val sector = Sector(area = area, radius = radius)
        val results = areaInstance.calculateSector(sector)
        assert(results.angle == requiredAngle)
    }

    @Test
    fun calculateRadiusSector() {
        val angle = 60.0
        val area = 3696.0
        val requiredRadius = 84.0
        val areaInstance = Area()
        val sector = Sector(angle = angle, area = area)
        val results = areaInstance.calculateSector(sector)
        assert(results.radius == requiredRadius)
    }
}