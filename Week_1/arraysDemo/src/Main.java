public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";


        System.out.println("--//--//--//--");


        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        //array'in içinde belirlediğimiz eleman sayısı kadar değer verebiliriz.


        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);

        }


        System.out.println("--//--//--//--");

        for(String ogrenci:ogrenciler){
            //genel kullanım yukakaridaki gibidir.
            System.out.println(ogrenci);
        }

        //yukarıda ogrencilerde ogrenci şeklinde gez dedik.


    }
}