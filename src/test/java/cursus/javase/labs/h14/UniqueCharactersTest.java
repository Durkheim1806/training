package cursus.javase.labs.h14;

import org.junit.jupiter.api.Test;

class UniqueCharactersTest {

    @Test
    public void testUniqueCharacters() {
        UniqueCharacters uc1 = new UniqueCharacters();
        System.out.println(uc1.giveUniqueCharactersOfString("twee"));
        System.out.println(uc1.giveUniqueCharactersOfString("twee"));
    }

}