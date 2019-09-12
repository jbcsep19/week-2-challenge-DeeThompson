import java.util.Random;

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


        String[] rice = {"white rice, ", "brown rice, ", "no rice, all rice "};
        String[] meat = new String[]{"chicken,", "steak", "carnidas,", "chorizo,", "sofritas,", "veggies,", "none,", "all,"};
        String[] beans = {"pinto, ", "black, ", "none,"};
        String[] salsa = {"mild, ", "medium, ", "hot,", "none,", "all,"};
        String[] veggies = {"mild, ", "medium, ", "hot,", "none,", "all,"};
        String[] cheese = {"yes, ", "no,"};
        String[] guac = {"yes, ", "no,"};
        String[] queso = {"yes, ", "no,"};
        String[] sourcream = {"yes, ", "no,"};

        for (int i = 0; i < 26; i++) {
            //for (int j = 0; j < 26; j++) {
                System.out.print("Burrito "+i+": ");
                System.out.print(rice[r.nextInt(3)]+",");
                System.out.print(meat[m.nextInt(5)]+", " );
                System.out.print(beans[b.nextInt(2)]+", ");
                System.out.print(salsa[s.nextInt(4)]+", ");
                System.out.print(cheese[c.nextInt(2)]+", ");
                System.out.print(cheese[q.nextInt(2)]+", ");
                System.out.print(queso[q.nextInt(2)]+",");
                System.out.print(sourcream[sc.nextInt(2)]+", ");



                System.out.println();
            }
        }

    }




