public class CustomerManager {
    private Customer customer;
    private Person person;
    private CreditManager creditManager;

    public CustomerManager(Customer customer, CreditManager creditManager) {
        super();
        this.customer = customer;
        this.creditManager = creditManager;
    }


    public CustomerManager(Person person) {
        super();
        this.person = person;
    }


    public void Save() {


        System.out.println("Müşteri Kaydedildi :" );
    }

    public void Delete() {

        //System.out.println("Müşteri Silindi : " + person.FirstName);
    }

    public void giveCredit() {

        creditManager.calculate();
        System.out.println("Kredi verildi");

        creditManager.save();
    }
}
