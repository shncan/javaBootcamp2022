public class DortIslem {
    public int carp(int sayi1, int sayi2){
        return sayi1 * sayi2;
    }

    public int carp(int sayi1,int sayi2,int sayi3){
        return sayi1 * sayi2 * sayi3;
    }
}

//yukarıda metod isimleri aynı olmasına rağmen hata vermemesinin sebebi verdiğimiz parametre farkı. burada aynı isimli
//olsalar bile çağırdığımız zaman ikisi de gelecek. bu yapıya overloading diyoruz.