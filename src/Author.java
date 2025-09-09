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

    @Override
    public String toString() {
        return "Автор " + authorName + " " + authorSurname;
    }

    @Override
    public boolean equals(Object ot) {
        if (ot == null || getClass() != ot.getClass()) return false;
        Author author = (Author) ot;
        boolean checkNameAndSurname = authorName.equals(authorName) && authorSurname.equals(author.authorSurname);
        return checkNameAndSurname;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }
}