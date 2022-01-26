import module1.sealed.Cat
import module1.sealed.Constants.Food
import module1.sealed.Dog
import module1.sealed.Hamster
import module1.sealed.Pet
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFails

class PetTest {
    private val petList = mutableListOf<Pet>()

    @BeforeTest
    fun fillPetList() {
        petList.add(Cat("Tom"))
        petList.add(Dog("Tuzik"))
        petList.add(Hamster("Noname"))
    }

    @Test
    fun playTest() {
        petList.forEach { pet ->
            assertFails {
                while (true) {
                    pet.play()
                }
            }

        }
    }

    @Test
    fun playEat() {
        petList.forEach { pet ->
            assertFails {
                while (true) {
                    pet.eat(Food.MEAT)
                }
            }
        }
    }
}