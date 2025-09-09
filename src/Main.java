//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author migelDeServantes = new Author("Мигель", "де Сервантес");
        Author richardRusso = new Author("Ричард", "Руссо");
        Book empireFalls = new Book("Эмпайр Фоллз", richardRusso, 2018);
        Book donKihot = new Book("Дон Кихот", migelDeServantes, 1579);
        donKihot.setPublicationYear(1569);
        System.out.println("Назавание " + donKihot.getTitle() + ", год издания " + donKihot.getPublicationYear() + ", автор " + donKihot.getAuthor().getAuthorName() + " " + donKihot.getAuthor().getAuthorSurname());
        System.out.println("Назавание " + empireFalls.getTitle() + ", год издания " + empireFalls.getPublicationYear() + " , автор " + empireFalls.getAuthor().getAuthorName() + " " + empireFalls.getAuthor().getAuthorSurname());
        System.out.println(richardRusso);
        System.out.println(empireFalls);
        System.out.println(migelDeServantes.equals(richardRusso));
        System.out.println(empireFalls.equals(donKihot));
        ;

    }
}