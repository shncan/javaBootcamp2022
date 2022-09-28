import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int number = 25;
        int remainder = number % 2;*/       //yapıdır, anlam olarak kalan demektir.
        //System.out.println(remainder);


        Scanner read = new Scanner(System.in);

        System.out.println("ENTER A NUMBER");
        int number = read.nextInt();


        int reminder = number %2;
        boolean numPrime =true;

        //üst tarafta önce öncülü sorgulayıp döngümüzde sıkıntı yaşatmaması için deneyip devre dışı bırakıyoruz.



        if(number<1){
            System.out.println("INVALID NUMBER !!!!!!!!!!!");
        }

        //yukarıda direkt olarak asal sayı sorgusu bile yapılamayacak sayıları devre dışı bırakıyoruz.

        if(number==1){
            System.out.println(" 1 is not a prime number");
            return;
        }

        //number<1 koşuluna sokamadğımız 1'i ayrıca eliyoruz.

        for (int i = 2;i<number;i++){
            if(number % i == 0 ){
                numPrime = false;
            }
        }

        if(numPrime){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }


    }
}