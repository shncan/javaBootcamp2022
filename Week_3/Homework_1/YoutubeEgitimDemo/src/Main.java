public class Main {
    public static void main(String[] args) {
       /* int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;

        System.out.println(sayi2);


        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {100,200,300};

        sayilar2 = sayilar1;

        sayilar1[0] = 5000;

        System.out.println(sayilar2[0]);
*/

        CustomerManager customerManager =new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();

    }


}