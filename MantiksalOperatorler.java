package ders4;

public class MantiksalOperatorler {

    public static void main(String[] args) {
        // !, ||, &&
        // true veya false sonuç döndürürler.

        // ! (değil operatörü)
        // true olan sonucu false, false olanı true yapar!
        System.out.println(!(3 == 3));

        boolean sonuc = false;
        System.out.println(!sonuc);

        // && (ve operatörü)
        // her iki yanında bulunan şartlardan 
        // her ikisi de true ise sonucu true döndürür.
        // diğer tüm durumlarda false sonuç döndürür.
        sonuc = ((3 > 2) && (3 != 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);

        sonuc = ((3 > 2) && (3 == 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);

        sonuc = ((3 < 2) && (3 == 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);

        // || (veya operatörü)
        // her iki yanında bulunan şartlardan 
        // her ikisi de false ise sonucu false döndürür.
        // diğer tüm durumlarda true sonuç döndürür.
        sonuc = ((3 > 2) || (3 != 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);

        sonuc = ((3 > 2) || (3 == 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);

        sonuc = ((3 < 2) || (3 == 2));
        System.out.println("sonuc değişkeninin değeri: " + sonuc);
    }
}
