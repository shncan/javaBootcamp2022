public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1 = 34;
        int sayi2 = 40;

        sayi1 = sayi2;
        sayi1= 99;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};

        sayilar2 = sayilar1;
        sayilar1[0] = 100;
        System.out.println(sayilar2[0]);
    }
}