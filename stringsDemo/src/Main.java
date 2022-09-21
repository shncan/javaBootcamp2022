public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava güzel";
        System.out.println(mesaj);

     /*   System.out.println("Eleman Sayısı : " +mesaj.length());
        System.out.println("5. eleman : " +mesaj.charAt(4));
        System.out.println("---------///////////-----------");

        //charAt'i belli bir metinde yakalamak istediğimiz ifadeler için kullanırız. Index mantığında çalışır.

        System.out.println(mesaj.concat(" Yaşasın "));

        //yukarıda yeniden oluşturduğumuz ifadeyi daha sonra kullanmak istersek bir değişkene atamalıyız. misal mesaj2 gibi.
        System.out.println(mesaj);

        System.out.println("---------///////////-----------");

        System.out.println(mesaj.startsWith("B")); //startswith ifadesi yapısı gereği boolean yani true false döner.
        // Bu örnekte B ile başlıyor mu dedik. "B" doğru "b" yanlıştır.


        System.out.println(mesaj.endsWith("."));

        System.out.println("---------////////---------");

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); // yapısı gereği bizden bir chararray'i ister, bu yüzden yukardaki karakterler array'ini yaptık.
        //getchar'ın içindeki ifadede sıfırdan başlayarak 4.indexe kadar olanları karakterlere ata demektir. Son index'i dahil etmediği için 1 fazla yazmalıyız.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a")); // verilen karakterlerin metnin içinde kaçıncı karakter olduğunu döndürür.
        // Birden fazla varsa ilk bulduğu yerde kalır, diğerlerini önemsemez.

        System.out.println(mesaj.lastIndexOf("e"));*/

        String yeniMesaj =mesaj.replace(' ','-');
        System.out.println(yeniMesaj); //verilen ifadeleri değiştirmek amaçlı kullanılır

        System.out.println("---------///////////-----------");

        System.out.println(mesaj.substring(2));
        //yukarıda 2. index'ten itibaren metni parçala dedik. Yani g'den. yukarıda bitiş index'i vermediğimiz için sonuna kadar keser.
        //Misal substring(2,5) deseydik 2'yi de hesaba katıp 5'i hesaba katmadan oraya kadar keser alır.

        System.out.println("---------///////////-----------");

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("---------///////////-----------");

        System.out.println(mesaj.toLowerCase());

        System.out.println("---------///////////-----------");

        System.out.println(mesaj.toUpperCase());

        //upper ve lower özellikle de upper arama yaparken misal sql'den veri isteyeceğimiz zaman çok işimize yarar. Çünkü küçük büyük harf duyarlılığı sıkıntısı vardır arama yaparken.

        System.out.println(mesaj.trim());

        //trim'le metnin başındaki ve sonundaki boşlukları atabiliyoruz.
    }
}