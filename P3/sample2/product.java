package sample2;

public class product {
    int price,id;
    String name;

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public product(int price, int id, String name) {
        this.price = price;
        this.id = id;
        this.name = name;
    }
}
