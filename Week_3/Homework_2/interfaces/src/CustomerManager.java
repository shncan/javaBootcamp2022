public class CustomerManager {

    private CustomerDal customerDal;
    public CustomerManager(CustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //iş kodları burada yazılır. Veriler doğru mu ? o mu bu mu gibi şeyler...
        customerDal.add();
    }
}
