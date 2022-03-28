class Book{
    String title;

    void setTitle(String title){
        this.title = title;
    }
}

public class exTP4X1 {

    public static void main(String[] args) {
        Book oneBook = new Book();
        oneBook.setTitle("oi");
        System.out.println(oneBook.title);
    }
}