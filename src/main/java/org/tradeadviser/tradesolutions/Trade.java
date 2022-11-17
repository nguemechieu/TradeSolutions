package org.tradeadviser.tradesolutions;
public class Trade {
    public final int id;
    public final String name;
    public final int quantity;
    public final double price;

    public Trade(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

        System.out.println(id + " " + name + " " + quantity + " ");
        System.out.println(price);

        System.out.println(price * quantity);

        System.out.println(price / quantity);

    }


    public  String ServerStatus() {

        if (quantity == 0) {
            return "no";
        }
        return null;
    }




    public String toString() {
        return name + " " + id + " " + quantity + " " + price;

        //return name + " " + id + " " + quantity + " " + price;
    }
    void OrderClosed() {
        System.out.println("Order Closed");

    }
    void OrderOpened() {
        System.out.println("Order Opened");
    }
    void OrderUpdated() {
        System.out.println("Order Updated");
    }
    void OrderCancelled() {
        System.out.println("Order Cancelled");
        System.out.println(id + " " + name + " " + quantity + "");
    }

    void TrailingOrder(){

    }

    void OrderReduceSize(){

    }

}
