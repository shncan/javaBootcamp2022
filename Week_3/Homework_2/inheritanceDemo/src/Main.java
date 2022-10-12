public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager()); //metodu tanımlarken extend edilen base krediyle tanımladığımız için burada onu inherite eden classları yazabiliyoruz

    }

}