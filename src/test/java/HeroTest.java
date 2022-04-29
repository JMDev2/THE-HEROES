import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroTest {
           @Test
        public void all_returnsAllInstancesOfArray_true(){
               Hero hero = new Hero("Superman",30, "eating", "sleeping", 2, 4);
               assertEquals(true, hero instanceof Hero);
        }
        @Test
    public void getName_instantiatesWithName_String() {
            Hero hero = new Hero("Superman",30, "eating", "sleeping", 2, 4);
            assertEquals("Superman", hero.getHeroName());

        }
    @Test
    public void getName_instantiatesWithAge_String() {
        Hero hero = new Hero("Superman",30, "eating", "sleeping", 2, 4);
        assertEquals(30, hero.getHeroAge());

    }
    @Test
    public void getName_instantiatesWithStrength_String() {
        Hero hero = new Hero("Superman",30, "eating", "sleeping", 2, 4);
        assertEquals("eating", hero.getHeroStrength());

    }

}
