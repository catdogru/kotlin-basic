package module1.sealed

object Constants {
    enum class Food(val energy: Int) {
        FISH(10),
        MEAT(20),
        CARROT(5)
    }

    const val MIN_ENERGY = 10
    const val FULL_ENERGY = 100
}