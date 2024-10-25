package ADVANCE_JAVA;
import java.util.*;

enum Laptop {
    Macbook(2000), DellXPS(2200), Surface, ThinkPad(1800);

    private int price;

    //Default constructor for the enum Laptop.
    Laptop()
    {
        System.out.println("Def-const called");
        this.price=500;
    }

    // Constructor with price parameter
    private Laptop(int price) {
        System.out.println("Para-const called.");
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class P10 {
    public static void main(String[] args) {
        Laptop x [] = Laptop.values();
        for (Laptop l : x) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
