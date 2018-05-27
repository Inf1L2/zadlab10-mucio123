package pl.edu.ur.oopl10;
//import java.util.Scanner;
public class zad3 extends Exception {
    public void test(){
        double dzielna = 10;
        double dzielnik = 0;
        double wynik;
        try{
            wynik = dzielna / dzielnik;
        }
        catch(ArithmeticException e){
            System.err.println("Dzielenie przez 0(ArithmeticException)");
        }
    }
}