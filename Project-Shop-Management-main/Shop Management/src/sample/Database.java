package sample;

import java.util.ArrayList;

public class Database{
    public static ArrayList<Product>list = new ArrayList<Product>();
    public static int NumberOfProducts=24;

    public static void initialize(){
// THIS PORTION WILL NEED EDITING-----------------------------
        for(int i=1; i<=NumberOfProducts; i++){
            list.add(new Product("Product "+i, 0, 20));
        }

    }

    public static void printDatabase(){
        for(int i=0; i<NumberOfProducts; i++)  {
            System.out.println(list.get(i).name+"--"+list.get(i).amount+" kg --"+list.get(i).price+" Tk.");
        }
    }
}

class Product{
    String name;
    double price;
    int amount;

    Product(String name, int amount, double price){
        this.name = name;
        this.amount=amount;
        this.price=price;
    }
}