package module1.sealed

import module1.sealed.Constants.Food

fun main() {
    val cat = Cat("Barsik")
    println("${cat.name} says: ${cat.makeSound()}")
    println("${cat.name}'s energy: ${cat.totalEnergy}")
    cat.play()
    println("${cat.name}'s energy: ${cat.totalEnergy}")
    cat.eat(Food.FISH)
    println("${cat.name}'s energy: ${cat.totalEnergy}")
    //cat.sleep()
}