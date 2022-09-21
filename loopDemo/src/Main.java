public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=10;i+=2){
            System.out.println((i));
        }

        System.out.println("DÖNGÜ BİTTİ");

        //While KISMI
        int i=2;
        while(i<10){
            System.out.println(i);
            i+=2;

            //eğer i++ kısmını yazmazsak sonsuz döngüye girer, artmadığı için.
        }

        //Do-While

        int j=1;
        do{
            System.out.println("Loglandı..!!");
            System.out.println(j);
            j+=2;
        }while(j<10);

        System.out.println("DO-WHILE DÖNGÜ BİTTİ");


    }
}