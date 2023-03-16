import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        char character;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (Character.isLetter(character)) {
                if (!map.containsKey(character)) {
                    map.put(character, 1);
                } else {
                    int x = map.get(character);
                    map.put(character, x + 1);
                }
            }
        }

        System.out.println("Максимальное число символов: " + maxChar(map));
        System.out.println("Минимальное число символов: " + minChar(map));

    }

    private static Map.Entry<Character, Integer> maxChar(Map<Character, Integer> map) {
        Map.Entry<Character, Integer> maxChar = null;
        for (Map.Entry<Character, Integer> max : map.entrySet()) {
            if (maxChar == null || max.getValue() > maxChar.getValue()) {
                maxChar = max;
            }
        }
        return maxChar;
    }

    private static Map.Entry<Character, Integer> minChar(Map<Character, Integer> map) {
        Map.Entry<Character, Integer> minChar = null;
        for (Map.Entry<Character, Integer> min : map.entrySet()) {
            if (minChar == null || min.getValue() < minChar.getValue()) {
                minChar = min;
            }
        }
        return minChar;
    }
}