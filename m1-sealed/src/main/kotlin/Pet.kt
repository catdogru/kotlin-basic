package module1.sealed

import module1.sealed.Constants.FULL_ENERGY
import module1.sealed.Constants.Food
import module1.sealed.Constants.MIN_ENERGY
import java.util.concurrent.TimeUnit

sealed class Pet(val name: String) {
    var totalEnergy = FULL_ENERGY
    abstract val playEnergy: Int
    abstract val hoursForSleep: Long

    fun makeSound() = when (this) {
        is Dog -> "Woof!"
        is Cat -> "Leave me alone stupid human"
        is Hamster -> "Hrumhrumhrum"
    }

    fun play() {
        if (totalEnergy - playEnergy > MIN_ENERGY) {
            println("$name playing")
            totalEnergy -= playEnergy
        } else {
            throw Exception("$name is tired")
        }
    }

    fun eat(food: Food) {
        if (totalEnergy + food.energy <= FULL_ENERGY) {
            println("$name eats")
            totalEnergy += food.energy
        } else throw Exception("no need more food")
    }

    fun sleep() {
        println("$name goes to sleep")
        Thread.sleep(TimeUnit.HOURS.toMillis(hoursForSleep))
    }
}

class Dog(name: String) : Pet(name) {
    override var playEnergy = 20
    override val hoursForSleep = 10L
}

class Cat(name: String) : Pet(name) {
    override var playEnergy = 10
    override val hoursForSleep = 15L
}

class Hamster(name: String) : Pet(name) {
    override var playEnergy = 5
    override val hoursForSleep = 8L
}