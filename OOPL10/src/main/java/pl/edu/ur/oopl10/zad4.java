package pl.edu.ur.oopl10;
import java.util.Random;
public class zad4 {
    public static void zad4(){
        Random r = new Random();
        int i=0;
        int j=0;
        do{
            int a,b;
            double wynik;
            a = r.nextInt(21)-10;
            b = r.nextInt(21)-10;
            try{
                wynik = a/b;
                System.out.println(j+" wynik="+wynik);
                j++;
            }catch (ArithmeticException e){
                System.err.println("Dzielenie przez 0)");
                i++;
            }
        }while(i!=3);
    }
}