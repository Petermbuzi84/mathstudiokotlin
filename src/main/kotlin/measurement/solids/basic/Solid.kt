package measurement.solids.basic

interface Solid {
    fun <T> calculateSolid(action: () -> T): T {
        return action()
    }

    fun calculateCone(cone: Cone): Cone

    fun calculateCube(cube: Cube): Cube

    fun calculateCuboid(cuboid: Cuboid): Cuboid

    fun calculateCylinder(cylinder: Cylinder): Cylinder

    fun calculateSphere(sphere: Sphere): Sphere
}