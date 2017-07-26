package anonymous;

public class Wardrobe {

    public Cloth getCloth(String type) throws IllegalArgumentException {
        if ("Zara".equals(type)) {
            return new ZaraPants();
        }
        throw new IllegalArgumentException("No such cloth");
    }
}
