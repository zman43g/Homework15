public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
    public String toString() {
        return "Автор " + authorName +" "+ authorSurname;
    }

    public int hashCode() {
        return java.util.Objects.hash(authorName,authorSurname);
    }
}