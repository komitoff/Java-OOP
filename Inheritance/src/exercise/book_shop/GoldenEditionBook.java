package exercise.book_shop;

public class GoldenEditionBook extends Book {

    public double getPrice() {
        return super.getPrice() + (super.getPrice() * 0.3);
    }


    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }
}
