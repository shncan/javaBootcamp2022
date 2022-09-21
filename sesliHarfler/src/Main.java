import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("SESLİ HARF GİRİNİZ");
        Scanner read = new Scanner(System.in);

        char harf = read.next().charAt(0);

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("KALIN SESLİ HARF!!!!!!!!!!");
                break;
            default:
                System.out.println("İNCE SESLİ HARF!!!!!!!!!!!!!!!");
        }



    }
}