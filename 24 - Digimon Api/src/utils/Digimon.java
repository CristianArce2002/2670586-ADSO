package utils;

public class Digimon {
    private String id;
    private String name;
    private String href;
    private String image;

    public Digimon(String id, String name, String href, String image) {
        this.id = id;
        this.name = name;
        this.href = href;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
