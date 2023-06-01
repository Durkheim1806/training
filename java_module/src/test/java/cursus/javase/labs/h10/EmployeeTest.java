package cursus.javase.labs.h10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee e = new Employee("Frans", 12);
        Assertions.assertEquals(e.greet(), "I'm tired of working. This is inhuman!");
    }

}