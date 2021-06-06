package sample;
import java.io.Serializable;

public class Product implements Serializable{
    String name;
    double price;
    int amount;

    Product(String name, int amount, double price){
	this.name = name;
	this.amount=amount;
	this.price=price;
    }
}

