public class Main {
    public static void main(String[] args) {
        /*String mesaj = "Hava Çok Güzel";
        String yeniMesaj = mesaj.substring(0,4);
        System.out.println(yeniMesaj);*/

        /*String mesaj = "Hava Çok Güzel";         //HATALI, INT DONDURUYOR.
        String yeniMesaj = topla();
        System.out.println(yeniMesaj);*/

        String mesaj = "Hava Çok Güzel";           //DOGRU, STRING DONDURUYOR.
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(2,8);
        System.out.println(sayi);
        int toplam = topla2(1,3,5,7,9);
        System.out.println(toplam);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
        return;
    }

    public static int topla(int sayi1, int sayi2){
        return  sayi1 + sayi2;
    }


    public static int topla2(int... sayilar) {
        int toplam=0;
        for(int sayi :sayilar){
            toplam +=sayi;
        }

        return toplam;

        //buradaki ... yani üç nokta ile birden fazla sayı gönderebiliyoruz demektir. buna variable argument denir.
        //java burada ... ile bir nevi int array gibi görüyor diyebiliriz.
    }

    public static String sehirVer(){
        return "İstanbul";
    }
}