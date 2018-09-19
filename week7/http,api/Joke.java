public class Joke {

    private String category;
    private String icon_url;
    private String id;
    private String joke_url;
    private String value;

    public Joke(String category, String icon_url, String id, String joke_url, String value) {
        this.category = category;
        this.icon_url = icon_url;
        this.id = id;
        this.joke_url = joke_url;
        this.value = value;
    }

    public Joke(String icon_url, String id, String joke_url, String value) {
        this.category = null;
        this.icon_url = icon_url;
        this.id = id;
        this.joke_url = joke_url;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke_url() {
        return joke_url;
    }

    public void setJoke_url(String joke_url) {
        this.joke_url = joke_url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
