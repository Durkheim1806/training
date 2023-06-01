package cursus.javase.labs.h10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TeacherTest {

    @Test
    public void testTeacher() {
        Teacher t = new Teacher("Cheryl", 40);
        Assertions.assertEquals(t.greet(), "Hello, my name is: Cheryl. Nice to meet you!");
    }

}