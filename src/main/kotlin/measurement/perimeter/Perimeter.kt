package measurement.perimeter

import measurement.shapes.*

class Perimeter : Shape {
    override fun calculateSquare(square: Square): Square {
        return Square(
            perimeter = 4 * square.length,
            length = square.perimeter / 4
        )
    }

    override fun calculateRectangle(rectangle: Rectangle): Rectangle {
        return Rectangle(
            perimeter = 2 * (rectangle.length + rectangle.width),
            length = (rectangle.perimeter - 2 * rectangle.width) / 2,
            width = (rectangle.perimeter - 2 * rectangle.length) / 2
        )
    }

    override fun calculateCircle(circle: Circle): Circle {
        return Circle(
            circumference = (2 * 22 * circle.radius) / 7,
            radius = (circle.circumference * 7) / (2 * 22)
        )
    }

    override fun calculateSector(sector: Sector): Sector {
        return Sector(
            length = (sector.angle * 22 * sector.radius) / (180 * 7),
            perimeter = calculateShape {
                val length = (sector.angle * 22 * sector.radius) / (180 * 7)
                2 * sector.radius + length
            },
            radius = when (sector.given) {
                "length" -> (630 * sector.length) / (11 * sector.angle)
                "perimeter" -> {
                    val bracket = 1260 + 11 * sector.angle
                    (630 * sector.perimeter) / bracket
                }
                else -> sector.radius
            },
            angle = when (sector.given) {
                "length" -> (630 * sector.length) / (11 * sector.radius)
                "perimeter" -> {
                    val bracket = sector.perimeter - 2 * sector.radius
                    (630 * bracket) / (11 * sector.radius)
                }
                else -> sector.angle
            }
        )
    }
}