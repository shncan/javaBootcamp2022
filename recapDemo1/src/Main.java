public class Main {
    public static void main(String[] args) {
        int sayi1 = 23;
        int sayi2 = 24;
        int sayi3 = 33;
        int sayiBuyuk=sayi1;
    System.out.println("Değişkenli Çözüm");
        if(sayiBuyuk<sayi2) {
            sayiBuyuk = sayi2;
        }
        if (sayiBuyuk<sayi3) {
            sayiBuyuk = sayi3;
        }
      System.out.println("En Büyük Sayı =" + sayiBuyuk);


        System.out.println("2.ci Çözüm");

     if(sayi1>sayi2 && sayi1 > sayi3){
    System.out.println("Sayi1 En büyüktür");
    }else if (sayi2>sayi1 && sayi2>sayi3) {
        System.out.println("Sayi2 En Büyüktür");
    }else {
        System.out.println("Sayi3 En Büyüktür");
    }


    }

}