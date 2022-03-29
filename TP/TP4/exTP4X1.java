class Book{
    String title;

    // construtor
    Book(String title){
        this.title = title;
    }

    void setTitle(String title){
        this.title = title;
    }
}

public class exTP4X1 {

    public static void main(String[] args) {
        Book oneBook = new Book("Joaozinho");
        System.out.println(oneBook.title);
        oneBook.setTitle("oi");
        System.out.println(oneBook.title);
    }
}