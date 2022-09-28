public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("COK İYİ");
            case 'B':
                System.out.println("İYİ");
            case 'C':
                System.out.println("NORMAL");
            case 'D':
                System.out.println("İYİ DEĞİL");
            case 'F':
                System.out.println("KÖTÜ");
                break;
            default:
                System.out.println("GEÇERSİZ");
        }
    }
}