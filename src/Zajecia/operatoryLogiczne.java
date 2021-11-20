package Zajecia;

public class operatoryLogiczne {
    static boolean  czyJestPelnoletni = true;

    public static void main(String[] args) {
        // czyJestPelnoletni = true         czyJestPelnoletni = falsz
        // !czyJestPelnoletni = false       !czyJestPelnoletni = true

        if(czyJestPelnoletni){
            //ten kod się wykona tylko wtedy kiedy zmienna czyJestPelnoletni = true
        }

        if(!czyJestPelnoletni){
            //ten kod się wykona tylko wtedy kiedy zmienna czyJestPelnoletni = false
        }

        int i = 1, j=2, k = 0;

        System.out.println(i<k); // false
        System.out.println(i<j); // true
        System.out.println((i<k) && (i<j)); // false - przy AND każdy składnik musi być prawdą, żeby całość miała wartość true
        System.out.println((i<k) || (i<j)); // true - przy OR którykolwiek musi być prawdą, żeby całość miała wartość true

        int nazwa = 4;
        nazwa = nazwa + 7;

        nazwa += 7;
        nazwa -= 8;
    }


}
