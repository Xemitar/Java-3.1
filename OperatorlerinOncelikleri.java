package ders4;

public class OperatorlerinOncelikleri {

    public static void main(String[] args) {
        // İşlediğimiz Operatörlerin Öncelik Sırası

        // 1) Parantez
        // 2) ++ , --
        // 3) !
        // 4) * , / , %
        // 5) + , -
        // 6) < , <= , > , >=
        // 7) == , !=
        // 8) && , ||
        // 9) =, +=, -=, *=, /=, %=
        int test = 10;
        System.out.println(3 * test++ + 10 / 2 - (5 % 3));

        test = 10;
        System.out.println(3 * ++test + 10 / 2 - (5 % 3));
    }
}
