package Zajecia;

public class wrapper {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = new Integer(1);

        // a,b - obiekty
        // Integer - klasa

        System.out.println(a instanceof Object);

        Double c = 2.5;
        Float d = 3.2f;
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;

        //Z wykorzystaniem metod dostępnych w wrapperach wydrukuj
        // - zmienną 'a' jako liczbę zmiennoprzecinkową
        // - zmienną 'e1' jako znak
        // - zmienną 'd' jako liczbę całkowitą

        System.out.println(a);
        System.out.println(a.doubleValue());

        double nowaZmienna = a.doubleValue();


    }
}
