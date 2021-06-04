package sample;

import java.util.ArrayList;

public class Database{
    protected static int numberOfProducts=24;
    protected static ArrayList<Product>list = new ArrayList<Product>(numberOfProducts);

    protected static void initialize(){
	//Grocery Products	
	list.add(new Product("Barley Powder",0,18));
	list.add(new Product("Flour",0,30));
	list.add(new Product("Soyabean oil",0,110));
	list.add(new Product("Pulses",0,100));
	list.add(new Product("Egg",0,28));
	list.add(new Product("Suger",0,40));
	list.add(new Product("TazaTea",0,55));
	list.add(new Product("Mirzapore Tea",0,55));
	
	list.add(new Product("NESCAFE",0,500));
	list.add(new Product("Suzi",0,25));
	list.add(new Product("Mustard Oil",0,150));
	list.add(new Product("Dabur Honey",0,165));
	list.add(new Product("Termeric Power",0,200));
	list.add(new Product("Spice Powder",0,225));
	list.add(new Product("Black Pepper",0,200));
	list.add(new Product("White Pepper",0,300));

	list.add(new Product("Tomato Sauce",0,150));
	list.add(new Product("Plain Rice",0,50));
	list.add(new Product("Basmati Rice",0,100));
	list.add(new Product("Chinigura Rice",0,110));
	list.add(new Product("Cumin",0,550));
	list.add(new Product("Coriander Powder",0,70));
	list.add(new Product("Aarong Ghee",0,285));
	list.add(new Product("Aarong Sour Yogurt",0,196));
	
	// Food Products
	list.add(new Product("Potato Chips",0,10));
	list.add(new Product("Corn Chips",0,15));
	list.add(new Product("Chicken Noodles",0,65));
	list.add(new Product(" Veg Noodles",0,30));
	list.add(new Product("Ramen",0,135));
	list.add(new Product("Dark Chocolate",0,150));
	list.add(new Product("Milk Chocolate",0,170));
	list.add(new Product("Butter",0,160));

	list.add(new Product("Cheese",0,200));
	list.add(new Product("Chocobar",0,25));
	list.add(new Product("Cone",0,45));
	list.add(new Product("Sweet Pickles",0,125));
	list.add(new Product("Spicy Pickles",0,125));
	list.add(new Product("Oreo Biscuit",0,80));
	list.add(new Product("EnergyPlus",0,60));
	list.add(new Product("Horlics",0,270));

	list.add(new Product("CocaCola",0,60));
	list.add(new Product("Sprite",0,60));
	list.add(new Product("Pepsi",0,50));
	list.add(new Product("7up",0,50));
	list.add(new Product("Toast",0,40));
	list.add(new Product("Bread",0,40));
	list.add(new Product("Dan Cake",0,30));
	list.add(new Product("Nuts",0,200));

	// Cleaning Items
	list.add(new Product("Vimbar",0,20));
	list.add(new Product("Wheel Bar",0,20));
	list.add(new Product("Lux Soap",0,32));
	list.add(new Product("Lifebouy Soap",0,24));
	list.add(new Product("Dettol Soap",0,25));
	list.add(new Product("Surf-exel Powder",0,60));
	list.add(new Product("Wheel Powder",0,50));
	list.add(new Product("Rin Powder",0,60));

	list.add(new Product("Harpic",0,80));
	list.add(new Product("Dettol Liquid",0,40));
	list.add(new Product("Savlon Liquid",0,40));
	list.add(new Product("Domex Liquid",0,60));
	list.add(new Product("Red Hit Spray",0,175));
	list.add(new Product("Black Hit Spray",0,175));
	list.add(new Product("ACI Aerosol",0,160));
	list.add(new Product("Vixol Bathroom",0,64));

	list.add(new Product("Lizol Floor Clean",0,242));
	list.add(new Product("Glass Cleaner",0,140));
	list.add(new Product("TV Screen Cleaner",0,40));
	list.add(new Product("Septol",0,80));
	list.add(new Product("Plastic Spray Gun",0,75));
	list.add(new Product("Floor Mop",0,150));
	list.add(new Product("Spin Duster",0,200));
	list.add(new Product("Scrubber",0,20));

    }

    private static void printDatabase(){
	for(int i=0; i<numberOfProducts; i++)  {
	    System.out.println(list.get(i).name+"--"+list.get(i).amount+" kg --"+list.get(i).price+" Tk.");
	}
    }

    protected static String generateString(int index){
	String temp;
	temp = Database.list.get(index).name + "   " + Integer.toString(Database.list.get(index).amount)+ " Kg  (" +  Double.toString(Database.list.get(index).price)+"Tk X "+ Integer.toString(Database.list.get(index).amount) + ") = " + Double.toString(Database.list.get(index).price * Database.list.get(index).amount)+ " Tk";

	return temp;
    }

    protected static int getIndex(String productName){
	for(int i=0; i<numberOfProducts; i++){
	    if(list.get(i).name.equals(productName)) return i;
	}
	return -1;
    }
   }

