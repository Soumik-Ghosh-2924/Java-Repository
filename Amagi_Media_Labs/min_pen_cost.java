package Amagi_Media;

import java.util.*;

public class min_pen_cost {

    static class Shop 
    {
        int pensInStock;
        int pricePerPen;
        int deliveryCost;
        
        Shop(int pensInStock, int pricePerPen, int deliveryCost) 
        {
            this.pensInStock = pensInStock;
            this.pricePerPen = pricePerPen;
            this.deliveryCost = deliveryCost;
        }
        
        // Calculate the total cost to buy all pens from this shop
        int totalCost() {
            return (pensInStock * pricePerPen) + deliveryCost;
        }
        
        // Calculate the cost for a given number of pens
        int costForPens(int numberOfPens) {
            return (numberOfPens * pricePerPen) + deliveryCost;
        }
    }

    public static int findMinimumCost(int N, List<Shop> shops) {
        // Sort shops based on the total cost to buy their entire stock
        shops.sort(Comparator.comparingInt(shop -> shop.costForPens(Math.min(N, shop.pensInStock))));

        int pensNeeded = N;
        int totalCost = 0;
        
        // Iterate through sorted shops to buy pens until we meet the requirement
        for (Shop shop : shops) {
            if (pensNeeded <= 0) {
                break;
            }
            int pensToBuy = Math.min(pensNeeded, shop.pensInStock);
            totalCost += shop.costForPens(pensToBuy);
            pensNeeded -= pensToBuy;
        }

        // If we could not meet the requirement of N pens
        if (pensNeeded > 0) {
            return -1; // or throw an exception or return some indication of failure
        }
        
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of pens needed
        int N = sc.nextInt();

        // Read number of shops
        int M = sc.nextInt();

        // List to store shops
        List<Shop> shops = new ArrayList<>();

        // Read shop details
        for (int i = 0; i < M; i++) {
            int n = sc.nextInt(); // pens in stock
            int p = sc.nextInt(); // price per pen
            int d = sc.nextInt(); // delivery cost
            shops.add(new Shop(n, p, d));
        }

        // Find the minimum cost to buy N pens
        int result = findMinimumCost(N, shops);
        
        if (result != -1) {
            System.out.println("Minimum cost to buy " + N + " pens is: " + result);
        } else {
            System.out.println("It is not possible to buy " + N + " pens.");
        }
        
        sc.close();
    }
}


