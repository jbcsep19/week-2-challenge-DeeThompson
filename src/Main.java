import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Random r = new Random();
        Random m = new Random();
        Random b = new Random();
        Random s = new Random();
        Random v = new Random();
        Random g = new Random();
        Random q = new Random();
        Random sc = new Random();
        Random  c = new Random();


        String[] rice = {"white rice, ", "brown rice, ", "no rice,","all rice ", "3.50"};
        String[] meat = new String[]{"chicken,", "steak", "carnidas,", "chorizo,", "sofritas,", "5.00"};
        String[] beans = {"pinto, ", "black, ", "all the beans,", "4.50"};
        String[] salsa = {"mild salsa, ", "medium salsa, ", "hot salsa,", "no salsa,", "all salsa,", "3.50"};
        String[] veggies = {"lettuce, ", "fajita veggies, ", "no veggies,", "all veggies,","5.00"};
        String[] cheese = {" add cheese, ", "no cheese,", "6.00"};
        String[] guac = {"add quac, ", "no guac,", "4.50"};
        String[] queso = {"add queso, ", "no queso,", "5.00"};
        String[] sourcream = {"add sourcream, ", "no sourcream,", "6.00"};
        double[] price1 = {3.00};
        double [] price2 = {.50};

        for (int i = 0; i < 26; i++) {
            //for (int j = 0; j < 26; j++) {
            System.out.print("Burrito "+i+": ");
            System.out.print(rice[r.nextInt(3)]+",");
            System.out.print(meat[m.nextInt(4)]+", " );
            System.out.print(beans[b.nextInt(3)]+", ");
            System.out.print(salsa[s.nextInt(5)]+", ");
            System.out.print(cheese[c.nextInt(2)]+", ");
            System.out.print(cheese[q.nextInt(3)]+", ");
            System.out.print(queso[q.nextInt(3)]+",");
            System.out.print(sourcream[sc.nextInt(3)]+", ");
            System.out.print(veggies[v.nextInt(3)]+",");

            int norice = 0;
            int allrice = 0;


            {
                System.out.println( " " );
            }
            if ( norice != allrice )
            {
                System.out.println( " " );
            }
            if ( norice == allrice )
            {
                System.out.println( " " );
            }

            }




        }
            }


















