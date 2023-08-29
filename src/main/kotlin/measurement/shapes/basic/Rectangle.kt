package measurement.shapes.basic

/*
* This data class describes some of the variables and other attributes
* that describe the rectangle shape, including, its name, length, width,
* perimeter, area
* */
data class Rectangle(
    val name: String = "rectangle",
    val length: Double = 0.0,
    val width: Double = 0.0,
    val perimeter: Double = 0.0,
    val area: Double = 0.0
)
