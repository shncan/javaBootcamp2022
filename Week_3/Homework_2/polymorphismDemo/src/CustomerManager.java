public class CustomerManager {

    private BaseLogger logger; //Field oluşturduk çünkü tüm logları tutabilecek tek yapı inherite edilen baselogger

    public CustomerManager(BaseLogger logger){ //burada da constructor yapısı var,new'lendiği zaman burası çalışsın istiyoruz
        this.logger = logger;
    }

    public void add(){
        System.out.println("Müşteri Eklendi!!");
        this.logger.log("Log Mesaj");
    }
}
