package part1;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Book[name=").append(getName()).append(", authors={");
        for (Author a : getAuthors()) {
            res.append("Author[name=").append(a.getName()).append(", email=").append(a.getEmail()).append(", gender=").append(a.getGender()).append("}, ");
        }
        res.append("price=").append(getPrice()).append(", qty=").append(getQty()).append("]");
        return res.toString();
    }

    public String getAuthorNames() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < getAuthors().length; i++) {
            res.append(getAuthors()[i].getName());
            if (i != getAuthors().length - 1) {
                res.append(",");
            }
        }
        return res.toString();
    }

}
