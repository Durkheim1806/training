package cursus.javase.labs.h14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {

    public Map<Character, Integer> giveOccuranceOfCharacters(String input) {
        Map<Character, Integer> occurance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            occurance.put(input.charAt(i), i);
        }

        return occurance;
    }

    public Map<Character, List<Integer>> giveOccuranceOfCharacters2(String input) {

        Map<Character, List<Integer>> occuranceTotal = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (occuranceTotal.containsKey(input.charAt(i))) {
                occuranceTotal.get(input.charAt(i)).add(i);
            } else {
                ArrayList<Integer> initlist = new ArrayList<>();
                initlist.add(i);
                occuranceTotal.put(input.charAt(i), initlist);
            }
        }

        return occuranceTotal;
    }
}
