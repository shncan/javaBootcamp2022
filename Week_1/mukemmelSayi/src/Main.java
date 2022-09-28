import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BİR SAYI GİRİNİZ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }

        }

        if (total == number) {
            System.out.println("MUKEMMEL SAYI!!!!!!!");
        } else {
            System.out.println("MUKEMMEL SAYI DEGILDIR!!!!!!!!");
        }

    }

    }
