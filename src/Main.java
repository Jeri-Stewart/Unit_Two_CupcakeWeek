import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Create an ArrayList
    ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

    // create objects for Cupcake, Red-velvet and chocolate

    Cupcake cupcake = new Cupcake();
    RedVelvet redVelvet = new RedVelvet();
    Chocolate chocolate = new Chocolate();

    // set pricing for generic cupcake
    Scanner input = new Scanner(System.in);
    System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
    cupcake.type();
    System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
    String priceText = input.nextLine();

    double price = Double.parseDouble(priceText);

    cupcake.setPrice(price);

    // set pricing for Red-Velvet cupcake
    System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
    redVelvet.type();
    System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
    String redVelvetPriceText = input.nextLine();

    double redVelvetPrice = Double.parseDouble(redVelvetPriceText);

    redVelvet.setPrice(redVelvetPrice);

    // set pricing for Chocolate cupcake
    System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
    chocolate.type();
    System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
    String chocolatePriceText = input.nextLine();

    double chocolatePrice = Double.parseDouble(chocolatePriceText);

    chocolate.setPrice(chocolatePrice);

    // add cupcakes to cupcakeMenu ArrayList
    cupcakeMenu.add(cupcake);

    cupcakeMenu.add(redVelvet);

    cupcakeMenu.add(chocolate);

    // DRINKS //
    ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
    Drink water = new Drink();
    Soda soda = new Soda();
    Milk milk = new Milk();

    // set pricing for water
    System.out.println("We are deciding on the price for water. Here is the description: ");
    water.type();
    System.out.println("How much would you like to charge for the drink? (Input a numerical number taken to 2 decimal places)");
    String waterPriceText = input.nextLine();

    double waterPrice = Double.parseDouble(waterPriceText);

    water.setPrice(waterPrice);

    // set pricing for soda
    System.out.println("We are deciding on the price for our soda. Here is the description: ");
    soda.type();
    System.out.println("How much would you like to charge for the drink (Input a numerical number taken to 2 decimal places)");
    String sodaPriceText = input.nextLine();

    double sodaPrice = Double.parseDouble(sodaPriceText);

    soda.setPrice(sodaPrice);


    // set pricing for milk
    System.out.println("We are deciding on the price for milk. Here is the description: ");
    milk.type();
    System.out.println("How much would you like to charge for this drink? (Input a numerical number taken to 2 decimal places)");
    String milkPriceText = input.nextLine();

    double milkPrice = Double.parseDouble(milkPriceText);

    milk.setPrice(milkPrice);

    // add cupcakes to cupcakeMenu ArrayList
    drinkMenu.add(water);

    drinkMenu.add(soda);

    drinkMenu.add(milk);

    //call Order constructor
    new Order(cupcakeMenu, drinkMenu);

    }
}

class Cupcake {
    public double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

}
class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

// Create Drink Class
class Drink
{
    public double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void type()
    {
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {
    public void type()
    {
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink
{
    public void type()
    {
        System.out.println("A bottle of milk");
    }
}