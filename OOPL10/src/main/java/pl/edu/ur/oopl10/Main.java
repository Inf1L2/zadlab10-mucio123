package pl.edu.ur.oopl10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int w;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Wybierz zadanie 1-5: ");
            w = s.nextInt();
            switch (w) {
                case 1:
                    WprowadzZKonsoli.zad1menu();
                    break;
                case 2:
                    zad2.zad2();
                    break;
                case 3:
                    zad3t z3 = new zad3t();
                    z3.test();
                    break;
                case 4:
                    zad4.zad4();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("koniec programu");
                    break;
                default:
                    System.err.println("zly argument");
                    break;
            }
        }while (w!=6);
    }
    
}