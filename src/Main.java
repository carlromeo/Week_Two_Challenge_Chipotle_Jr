
import java.util.Random;

public class Main {
    public static void main(String[]args) {


        System.out.println("");

        String[] rice = {"white","brown","no rice"};
        String[] meat = {"chicken","steak", "carnidas", "chorizo","sofritas","veggies"};
        String[] beans= {"pinto", "black", " no beans"};
        String[] salsa = {"mild salsa","medium salsa", "hot salsa", "no salsa"};
        String[] veggies = {"lettuce","fajita veggies","no veggies"};

        Random riceOrder = new Random();
        Random meatOrder = new Random();
        Random beansOrder = new Random();
        Random salsaOrder = new Random();
        Random veggiesOrder = new Random();

        int indexRice  = riceOrder.nextInt(rice.length );
        int indexMeat  = meatOrder.nextInt(meat.length);
        int indexBeans = beansOrder.nextInt(beans.length);
        int indexSalsa = salsaOrder.nextInt(beans.length);
        int indexVeggies = veggiesOrder.nextInt(beans.length);

            System.out.print("Burito 1: "
                    + rice[indexRice] + ", "
                    + meat[indexMeat] + ", "
                    + beans[indexBeans]+ ", "
                    + salsa[indexSalsa]+ ", "
                    + veggies[indexVeggies]+ ".");




//        }

       }
    }



