import java.awt.image.DataBuffer;

public class Main {
    public static void main(String[] args) {
        /*EmailLogger logger = new EmailLogger();
        logger.Log("Mesaj kayıt");

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};

        for (BaseLogger logger : loggers){
                logger.Log("Log Mesaj");
        }*/
    CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
    customerManager.add();

    }
}