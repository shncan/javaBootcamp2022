public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        int toplama = dortIslem.Topla(6,7);
        System.out.println(toplama);

        int cikarma = dortIslem.Cikar(8,9);
        System.out.println(cikarma);

        int carpma = dortIslem.Carp(6,6);
        System.out.println(carpma);

        int bolme = dortIslem.Bol(12,6);
        System.out.println(bolme);
    }

}