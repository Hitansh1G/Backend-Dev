import java.util.HashMap;
import java.util.Map;
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
public class XUrlImpl implements XUrl {
    private Map<String, String> shortToLongMapping;
    private Map<String, String> longToShortMapping;
    private Map<String,Integer> hitCountMap;
    SlugGenerator slugGenerator;
    private static final String URL = "http://short.url/";
    public XUrlImpl(){
        shortToLongMapping = new HashMap<>();
        longToShortMapping = new HashMap<>();
        hitCountMap = new HashMap<>();
        slugGenerator = new SlugGenerator();
    }
    public String registerNewUrl(String longUrl) {
        if (longToShortMapping.containsKey(longUrl)) {
          return URL + longToShortMapping.get(longUrl)
        }
        String slug = slugGenerator.generateRandomSlug();
        shortToLongMapping.put(slug,longUrl);
        longToShortMapping.put(longUrl,slug);
        hitCountMap.put(longUrl,0);
        return URL + slug;
    }
    public String getUrl(String shortUrl) {
        String longUrl = shortToLongMapping.get(shortUrl.replace(URL, ""));
        if(longUrl != null){
            hitCountMap.compute(longUrl, (k,v) -> v + 1);
        }
        return longUrl;
    }
    public String delete(String longUrl) {
        String slug = longToShortMapping.remove(longUrl);
        shortToLongMapping.remove(slug);
        return URL + slug;
    }
    public String registerNewUrl(String longUrl, String shortUrl) {
        String slug = shortUrl.replace(URL, "");
        if (shortToLongMapping.containsKey(getUrl(null))) {
          return null;
        }
        shortToLongMapping.put(slug,longUrl);
        longToShortMapping.put(longUrl,slug);
        hitCountMap.put(longUrl,0);
        return URL + slug;
    }
    public Integer getHitCount(String longUrl) {
        Map<String, String> countMap;
        return countMap.getOrDefault(longUrl, 0);
    }
 }