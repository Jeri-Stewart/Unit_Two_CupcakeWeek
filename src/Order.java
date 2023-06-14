import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Order {
    // create public constructor function with 2 parameters
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu)
    {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        //create arr list to hold objects that do not have to be the same type
        ArrayList<Object> order = new ArrayList<Object>();

        //Create an if statement that checks if placeOrder equals Y ignoring capitalization
        if (placeOrder.equalsIgnoreCase("Y")){
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu");
            System.out.println("CUPCAKES:");

            // create itemNumber variable
            int itemNumber = 0;

            for(int i = 0; i < cupcakeMenu.size(); i++){
                //increment itemNumber
                itemNumber++;
                System.out.println(itemNumber + "-");
                // Output the type of cupcake at cupcakeMenu at i by calling the type() method.
                cupcakeMenu.get(i).type();
                // Print price and then print new line
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }

            //DRINKS//
            System.out.println("DRINKS:");

            for (int i = 0; i < drinkMenu.size(); i++) {
                // increment itemNumber
                itemNumber++;

                System.out.print(itemNumber + "-");

                drinkMenu.get(i).type();

                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }

            //Placing an Order
            boolean ordering = true;
            while(ordering){
                System.out.println("What would you like to order? Please use the number associated with each item to order");
                int orderChoice = input.nextInt();

                // Correct the terminal scanner input location
                input.nextLine();


                // create if/else statement that checks order number and adds the respective item from the cupcake menu to the orderlist
                if (orderChoice == 1){
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order.");

                }
                else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order.");
                }
                else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order.");
                }
                else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order.");
                }
                else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order.");
                }
                else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order.");
                }
                else{
                    System.out.println("Sorry, we don't seem to have that on the menu");
                }

                // actions for continuing order
                System.out.println("Would you like to continue ordering? (Y/N)");
                String continueOrder = input.nextLine();

                if (!continueOrder.equalsIgnoreCase("Y"))
                {
                    // Set ordering equal to false
                    ordering = false;
                }
            }
            // Print the first item in the order ArrayList
            System.out.println(order.get(0));

            //Print the second item in the order ArrayList
            System.out.println(order.get(1));

            // Create a double variable named subtotal and set it to 0.0;
            Double subTotal = 0.0;

            for (int i = 2; i < order.size(); i++){
                // Check if order at i is equal to cupcakeMenu at 0
                if (order.get(i).equals(cupcakeMenu.get(0)))
                {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(0).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(0).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(0).getPrice();
                }
                // Check if order at i is equal to cupcakeMenu at 1
                else if (order.get(i).equals(cupcakeMenu.get(1)))
                {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(1).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(1).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(1).getPrice();
                }
                //check if order at i is equal to cupcakeMenu at 2
                else if (order.get(i).equals(cupcakeMenu.get(2)))
                {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(2).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(2).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(2).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 0
                else if (order.get(i).equals(drinkMenu.get(0)))
                {
                    // Print the type of drink at drinkMenu index 0
                    drinkMenu.get(0).type();

                    // Print the price of drink at drinkMenu index 0
                    System.out.println(drinkMenu.get(0).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                    subTotal = subTotal + drinkMenu.get(0).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 1
                else if (order.get(i).equals(drinkMenu.get(1)))
                {
                    // Print the type of drink at drinkMenu index 1
                    drinkMenu.get(1).type();

                    // Print the price of drink at drinkMenu index 0
                    System.out.println(drinkMenu.get(1).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                    subTotal = subTotal + drinkMenu.get(1).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 2
                else if (order.get(i).equals(drinkMenu.get(2)))
                {
                    // Print the type of drink at drinkMenu index 2
                    drinkMenu.get(2).type();

                    // Print the price of drink at drinkMenu index 2
                    System.out.println(drinkMenu.get(2).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 2
                    subTotal = subTotal + drinkMenu.get(2).getPrice();
                }
            }
            // Print subtotal
            System.out.println("$" + subTotal + "\n");

            // Create a new CreateFile()
            new CreateFile();
            // Create a new WriteToFile() with the parameter order
            new WriteToFile(order);
//
        }
        else
        {
            System.out.println("Have a nice day then");
        }


    }
}


class CreateFile {
    public CreateFile(){
        try
        {
            File salesData = new File("salesData.txt");

            // Create an if statement with that parameter salesData.createNewFile()
            // .createNewFile() will return true if a new file is created
            if (salesData.createNewFile())
            {
                System.out.println("File created: " + salesData.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
        }
    }
}

class WriteToFile {
    public WriteToFile(ArrayList<Object> order){
        try
        {
            // Create a new FileWriter object set it equal to new FileWriter whose constructor
            // parameters are the name of the object "salesData.txt", and the boolean true, which is an option that
            // allows for appending to the file
            FileWriter fw = new FileWriter("salesData.txt", true);

            // Create a new PrintWriter object named salesWriter, and set it equal to new PrintWriter object whose
            // constructor parameter is the FileWriter object fw created previously.
            PrintWriter salesWriter = new PrintWriter(fw);

            // Print each value in order.
            for (int i = 0; i < order.size(); i++) {
                salesWriter.println(order.get(i));
            }

            // Stop the writer
            salesWriter.close();

            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
        }

    }
}