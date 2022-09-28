public class Main {
    public static void main(String[] args) {


        int sayilar[] = new int[] { 1, 2, 5, 7, 9 };
        int aranacak = 1;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            } else {
                varMi = false;
            }
        }
        System.out.println(varMi);

//
//        int[] sayilar = new int[]{1,2,5,7,9,0};
//        int aranacak = 2;
//        boolean varMi=false;
//
//
//        for(int sayi : sayilar){
//            if(sayi == aranacak ){
//                varMi=true;
//                break;
//            }
//        }
//        if(varMi) {
//            System.out.println("SAYI BULUNMAKTADIR");
//        }else{
//            System.out.println("SAYI YOK!!!!!!!!!!!");
//        }
    }
}