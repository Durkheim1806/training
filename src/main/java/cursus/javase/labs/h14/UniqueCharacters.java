package cursus.javase.labs.h14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters {
    Map<String, Integer> stringAlreadyProcessed = new HashMap<>();

    public int giveUniqueCharactersOfString(String input) {


        for (Map.Entry m : stringAlreadyProcessed.entrySet()) {
            if (m.getKey() == input) {
                return (int) m.getValue();
            }
        }


        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            set1.add(input.charAt(i));
        }
        stringAlreadyProcessed.put(input, set1.size());
        return set1.size();
    }
}
