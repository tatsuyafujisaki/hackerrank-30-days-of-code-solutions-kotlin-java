class MyBook extends Book {
    private final int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.printf("Title: %s%n", title);
        System.out.printf("Author: %s%n", author);
        System.out.printf("Price: %d%n", price);
    }
}
