package measurement.area.shapes

import measurement.shapes.*
import kotlin.math.sqrt

class Area : Shape {
    override fun calculateSquare(square: Square): Square {
        return Square(
            area = square.length * square.length,
            length = sqrt(square.area)
        )
    }

    override fun calculateRectangle(rectangle: Rectangle): Rectangle {
        return Rectangle(
            area = rectangle.length * rectangle.width,
            length = rectangle.area / rectangle.width,
            width = rectangle.area / rectangle.length
        )
    }

    override fun calculateCircle(circle: Circle): Circle {
        return Circle(
            area = (22 * circle.radius * circle.radius) / 7,
            radius = calculateShape {
                val root: Double = (7 * circle.area) / 22
                sqrt(root)
            }
        )
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
}