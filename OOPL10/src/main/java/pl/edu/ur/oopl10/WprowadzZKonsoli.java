package pl.edu.ur.oopl10;
import java.nio.charset.CharacterCodingException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class WprowadzZKonsoli
{
    public static void wprowadzint()
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe całkowitą: ");
        try {
            a = s.nextInt();
            System.out.println(a);
        }catch (Exception c){
            System.err.println("Nieprawidłowy format");
        }
    }
    public static void wrowadzchar()
    {
        char zn;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz znak: ");
        try {
            zn = s.next().charAt(0);
            System.out.println(zn);
        }catch (Exception c){
            System.err.println("Nieprawidłowy format!");
        }
    }
    public static void wprowadzshort(){
        short sh;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        try {
            sh = s.nextShort();
            System.out.println(sh);
        }catch (Exception c)
        {
            System.err.println("Nieprawidłowy format");
        }
    }
    public static void wprowadzdouble(){
        double ad;
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        try {
            ad = s.nextDouble();
            System.out.println(ad);
        }catch (Exception c)
        {
            System.err.println("Nieprawidłowy format");
        }
}
    public static void zad1menu()
    {
        int w1;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1.Int,2.Short,3.Char,4.Double");
            w1 = s.nextInt();
            switch (w1) {
                case 1:
                    wprowadzint();
                    break;
                case 2:
                    wprowadzshort();
                    break;
                case 3:
                    wrowadzchar();
                    break;
                case 4:
                    wprowadzdouble();
                    break;
                case 5:
                    Main.main(new String[0]);
                    break;
            }
        }while(w1!=5);
    }
}
