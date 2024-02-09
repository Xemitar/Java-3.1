package ders4;

public class EsitlikveIliskiselOperatorler {

    public static void main(String[] args) {
        // ==, !=, >, <, >=, <=
        // true veya false sonuç döndürürler.

        // == (eşit mi?)
        // sağındaki ve solundaki ifadelerin birbirine eşit olup-olmadığını
        // sorgular ve ona göre boolean bir sonuç döndürür.
        System.out.println("3 sayısı 2'ye eşit mi? -> " + (3 == 2));
        System.out.println("3 sayısı 3'e eşit mi? -> " + (3 == 3));

        // != (eşit değil mi?)
        System.out.println("3 sayısı 2'ye eşit değil mi? -> " + (3 != 2));
        System.out.println("3 sayısı 3'e eşit değil mi? -> " + (3 != 3));

        // > ile < (büyük ile küçük)
        System.out.println("3 sayısı 2'den büyük mü? -> " + (3 > 2));
        System.out.println("3 sayısı 2'den küçük mü? -> " + (3 < 2));

        System.out.println("3 sayısı 3'ten büyük mü? -> " + (3 > 3));
        System.out.println("3 sayısı 3'ten küçük mü? -> " + (3 < 3));

        // >= ile <= ("büyük veya eşit" ile "küçük veya eşit")
        System.out.println("4 sayısı, 3'ten büyük veya 3'e eşit mi? -> " + (4 >= 3));
        System.out.println("3 sayısı, 3'ten büyük veya 3'e eşit mi? -> " + (3 >= 3));
        System.out.println("2 sayısı, 3'ten büyük veya 3'e eşit mi? -> " + (2 >= 3));

        System.out.println("2 sayısı, 3'ten küçük veya 3'e eşit mi? -> " + (2 <= 3));
        System.out.println("3 sayısı, 3'ten küçük veya 3'e eşit mi? -> " + (3 <= 3));
        System.out.println("4 sayısı, 3'ten küçük veya 3'e eşit mi? -> " + (4 <= 3));

        // => "büyük veya eşit" operatörü bu değildir!
        // System.out.println("4 sayısı, 3'ten büyük veya 3'e eşit mi? -> " + (4 => 3));
    }
}
