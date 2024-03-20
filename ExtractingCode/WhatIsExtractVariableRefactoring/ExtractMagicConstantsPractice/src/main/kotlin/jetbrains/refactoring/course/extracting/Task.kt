package jetbrains.refactoring.course.extracting

private const val SPEED_OF_LIGHT = 299792458.0

private const val PLANCK_CONSTANT = 6.62607015e-34

private const val waveLength = 0.5e-6

fun calculatePhotonEnergy(): Double {
    val frequency = SPEED_OF_LIGHT / waveLength
    return PLANCK_CONSTANT * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (SPEED_OF_LIGHT * SPEED_OF_LIGHT)
}



fun main() {
    val photonEnergy = calculatePhotonEnergy()
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
