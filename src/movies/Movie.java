package movies;

public class Movie {

    private String name, category;

    public Movie(String n, String cat) {
        this.name = n;
        this.category = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
