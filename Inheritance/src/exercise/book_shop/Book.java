package exercise.book_shop;

public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        String[] names = author.split("\\s+");
        if (names.length != 1) {
            int charValue = Character.getNumericValue(names[1].charAt(0));
            for (int i = 0; i < 10; i++) {
                if (charValue == i) {
                    throw new IllegalArgumentException("Author not valid!");
                }
            }
        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
