package cursus.javase.labs.h10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AndroidTest {
    @Test
    public void testAndroid() {
        Android a = new Android();
        a.charge(20);
        Assertions.assertEquals(a.greet(), "I'm only half human, but human still.... My energy level is 20%");
        Assertions.assertTrue(a.getLevel() <= 100);
        Assertions.assertThrows(RuntimeException.class, () -> a.charge(100));
    }

}