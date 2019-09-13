
import java.util.Random;

public class Main {
    public static void main(String[]args) {


        System.out.println("");
        // ********** Declaring and Randomizing individual Arrays **********

        String[] rice = {"white","brown","no rice"};
        Random riceOrder = new Random();

        String[] meat = {"chicken","steak", "carnidas", "chorizo","sofritas","veggies"};
        Random meatOrder = new Random();

        String[] beans= {"pinto", "black", " no beans"};
        Random beansOrder = new Random();

        String[] salsa = {"mild salsa","medium salsa", "hot salsa", "no salsa"};
        Random salsaOrder = new Random();

        String[] veggies = {"lettuce","fajita veggies","no veggies"};
        Random veggiesOrder = new Random();

        // ********** Declaring an Array of 10 Burritos **********
        String [] burritoCustomizations = new String [10];


        //********** Customizing 10 Burrito Arrays **********


        for (int i = 0; i < burritoCustomizations.length; i++) {
        int indexRice  = riceOrder.nextInt(rice.length );
        int indexMeat  = meatOrder.nextInt(meat.length);
        int indexBeans = beansOrder.nextInt(beans.length);
        int indexSalsa = salsaOrder.nextInt(beans.length);
        int indexVeggies = veggiesOrder.nextInt(beans.length);

            burritoCustomizations [i] = "Burrito" + " " + (i +1) + ":" + " "
                + rice[indexRice] + ", "
                + meat[indexMeat] + ", "
                + beans[indexBeans]+ ", "
                + salsa[indexSalsa]+ ", "
                + veggies[indexVeggies]+ ".";

            System.out.println(burritoCustomizations[i]);
        }

       }
    }



