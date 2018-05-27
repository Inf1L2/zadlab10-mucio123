package pl.edu.ur.oopl10;
import java.util.Random;
import java.util.Scanner;
public class zad2 {
    public static void zad2()
    {
        int n;
        int[] rand;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        rand = new int[100];
        try{
            System.out.println("podaj ilosc liczb do wylosowania, zakres 0-100");
            n = s.nextInt();
            for(int i=0;i<n;i++)
            {
                rand[i] = r.nextInt(100);
            }
            System.out.print('(');
            for (int i=0;i<n-1;i++)
            {
                System.out.print(rand[i]+",");
            }
            System.out.print(rand[n]+")");

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Blad zakresu(ArrayIndexOutOfBoundsException)");
        }
    }
}