package measurement.shapes

/*
* This data class describes some of the variables and other attributes
* that describe the sector shape, including, its name,
* given options (perimeter, length), angle, radius, length, perimeter
* area
* */
data class Sector(
    val name: String = "sector",
    val given: String = "",
    val angle: Double = 0.0,
    val radius: Double = 0.0,
    val length: Double = 0.0,
    val perimeter: Double = 0.0,
    val area: Double = 0.0
)
