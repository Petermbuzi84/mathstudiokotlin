package measurement.area

import measurement.shapes.basic.*
import kotlin.math.sqrt

/*
* This class contains functions that handles all related calculations
* of areas of shapes. It only contains base shapes and not derived shapes.
* Some of the base shapes include: Square, Rectangle, Circle, Sector, Triangle
* */
class Area : Shape {
    override fun calculateCircle(circle: Circle): Circle {
        return Circle(
            area = (22 * circle.radius * circle.radius) / 7,
            radius = calculateShape {
                val root: Double = (7 * circle.area) / 22
                sqrt(root)
            }
        )
    }

    override fun calculateParallelogram(parallelogram: Parallelogram): Parallelogram {
        TODO("Not yet implemented")
    }

    override fun calculatePolygon(polygon: Polygon): Polygon {
        TODO("Not yet implemented")
    }

    override fun calculateRectangle(rectangle: Rectangle): Rectangle {
        return Rectangle(
            area = rectangle.length * rectangle.width,
            length = rectangle.area / rectangle.width,
            width = rectangle.area / rectangle.length
        )
    }

    override fun calculateRhombus(rhombus: Rhombus): Rhombus {
        TODO("Not yet implemented")
    }

    override fun calculateRightTriangle(rightTriangle: RightTriangle): RightTriangle {
        TODO("Not yet implemented")
    }

    override fun calculateSector(sector: Sector): Sector {
        return Sector(
            area = (11 * sector.angle * sector.radius * sector.radius) / 1260,
            radius = calculateShape {
                val root: Double = (315 * sector.area) / (11 * sector.angle)
                2 * sqrt(root)
            },
            angle = (1260 * sector.area) / (11 * sector.radius * sector.radius)
        )
    }

    override fun calculateSquare(square: Square): Square {
        return Square(
            area = square.length * square.length,
            length = sqrt(square.area)
        )
    }

    override fun calculateTriangle(triangle: Triangle): Triangle {
        TODO("Not yet implemented")
    }
}