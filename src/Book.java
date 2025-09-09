public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Название книги " + title + ", автор " + author.toString() + ", год издания " + publicationYear;
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) {
            return true;
        } else if (oth == null || getClass() != oth.getClass()) {
            return false;
        } else {
            Book b1 = (Book) oth;
            boolean checkBookTitle;
            checkBookTitle = title.equals(b1.title) && author.getAuthorName().equals(b1.author.getAuthorName()) && author.getAuthorSurname().equals(b1.author.getAuthorSurname()) && publicationYear == b1.publicationYear;
            return checkBookTitle;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }


}