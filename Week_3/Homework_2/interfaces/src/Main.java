public class Main {
    public static void main(String[] args) {
        //CustomerManager customerManager = new CustomerManager();
        //customerManager.customerDal = new OracleCustomerDal();
        //customerManager.customerDal = new MsSqlCustomerDal();
        CustomerManager customerManager = new CustomerManager(new MsSqlCustomerDal());
        customerManager.add();
    }
}