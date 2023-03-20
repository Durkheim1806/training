package cursus.javase.labs.h2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void berichtWordtGeprint(){

        String helloTest = "hello world";

        String helloActual = Hello.printHello();

        assertEquals(helloTest, helloActual);
    }
}
