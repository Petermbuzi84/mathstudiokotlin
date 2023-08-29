import measurement.perimeter.Perimeter
import measurement.shapes.basic.Sector

fun measurementQuestion() {
    val angle = 105.0
    val radius = 8.4
    /* use the functions to provide an answer for the following question
    * A minor arc of a circle subtends an angle of 105 degrees at the center
    * of the circle. If the radius of the circle is 8.4 cm, find the length
    * of the major arc.
    * */

    val majorAngle = 360 - angle
    val sector = Sector(angle = majorAngle, radius = radius)
    val perimeter = Perimeter()
    val results = perimeter.calculateSector(sector)

    println(results.length) // print the answer here = the solution is 37.4 cm
}

fun main() {
    println("===========================MathStudio===========================")
    measurementQuestion()
    println("================================================================")
}