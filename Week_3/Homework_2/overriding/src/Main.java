public class Main {
    public static void main(String[] args) {
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.Hesapla(1000));*/

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(100));
    }
}
}
//Java default olarak overridable bir dildir, yani aksi belirtilmediği sürece ezilebilir.
//Yani inherit ettiği class ı vs. ezebilir.
//Eğer ezilmesini istemiyorsak final keyword'ünü kullanırız. ORNEK :  public final double hesapla(double tutar)0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000-----