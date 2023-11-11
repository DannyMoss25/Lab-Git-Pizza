import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What style of pizza do you want? New York or Chicago");
        String style = myObj.nextLine();  // Read user input

        System.out.println("What toppings of pizza? cheese, veggie, pepperoni and clam");
        String toppings = myObj.nextLine();  // Read user input

        if(style.equals("New York")  || style.equals("new york")  || style.equals("NY")  || style.equals("ny")  || style.equals("nyc")  || style.equals("NYC")){
            //System.out.println("NY SELECTED");
            NYPizzaStore store = new NYPizzaStore() {};
            String pizza = String.valueOf(store.createPizza(toppings));
            System.out.println(pizza);
            //////
        }
        else{
            ChicagoPizzaStore store = new ChicagoPizzaStore() {};
            String pizza = String.valueOf(store.createPizza(toppings));
            System.out.println(pizza);
        }


    }
}