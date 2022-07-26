import java.util.Random;

public class SlugGenerator {
    private static final int NUM_CHARS_IN_SLUG = 9;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    private Random random;
    public SlugGenerator() {
        random = new Random();
    }
    public String generateRandomSlug() {
        char[] result = new char[NUM_CHARS_IN_SLUG];
        for (int i = 0; i < NUM_CHARS_IN_SLUG; i++) {
            int randomIndex = random.nextInt(ALPHABET.length() - 1);
            result[i] = ALPHABET.charAt(randomIndex);
        }
        return new String(result);
    }
}
