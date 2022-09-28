public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Adana";
        sehirler[1][0] = "Çanakkale";
        sehirler[1][1] = "Edirne";
        sehirler[1][2] = "Artvin";
        sehirler[2][0] = "Eskişehir";
        sehirler[2][1] = "Erzurum";
        sehirler[2][2] = "Şanlıurfa";

        for (int i = 0; i<=2; i++){
            System.out.println("----------///////////-------------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
        //Çok boyutlu diziler yapısı gereği içiçe yazdığımız for'a ihtiyaç duyar. çünkü ikisinde de bağlı olarak dönmeliyiz.
        //Biz burada 2 boyutlu olarak ele aldık anca 2'den daha fazla da olabilir. Yan yana ekleyerek artırabiliriz.[][][]...
    }
}