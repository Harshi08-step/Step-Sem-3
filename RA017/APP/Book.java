class Book {
    String title;
    String author;
    double price;

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.title = "The Alchemist";
        b.author = "Paulo Coelho";
        b.price = 450.00;

        b.display();
    }
}