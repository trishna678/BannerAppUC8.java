import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Utility method to build and return the map of patterns
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> characterMap = new HashMap<>();

        characterMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        characterMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        characterMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return characterMap;
    }

    // Utility method to render banner message
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5; // number of rows per character

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String word = "OOPS";

        renderBanner(word, characterMap);
    }
}
