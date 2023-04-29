package cursus.javase.labs.h14;

import org.junit.jupiter.api.Test;

class ConcordanceTest {

    @Test
    public void test() {
        Concordance c1 = new Concordance();
        System.out.println(c1.giveOccuranceOfCharacters("twee").entrySet());
        System.out.println(c1.giveOccuranceOfCharacters2("twee").entrySet());
        System.out.println(c1.giveOccuranceOfCharacters2("hello world").entrySet());
    }
}