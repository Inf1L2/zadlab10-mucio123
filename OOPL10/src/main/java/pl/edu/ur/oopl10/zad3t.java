package pl.edu.ur.oopl10;
public class zad3t {
    public void test(){
        zad3 arithmeticThrow = new zad3();
        try{
            arithmeticThrow.test();
            System.err.println("Klasa wyzej przechwycila wyjatek");
        }
        catch(ArithmeticException e){
            System.err.println("Klasa wyzej nie przechwycila wyjatku");
        }
    }
}