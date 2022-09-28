public class Product {
/*  ELLE YAZILAN


    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;


    //getter
    public int getId(){
        return _id;
    }

    //setter
    public int setId(int id){
        _id=id;
    }

*/


    public Product(int id,String name,String description,double price,int stockAmount,String renk){
        System.out.println("YAPICI BLOG ÇALIŞTI");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    //over kısmı
    public Product(){

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;


    //getter
    public int getId(){
        return id;
    }

    //setter
    public int setId(int id){
        this.id=id;
        return id;  //bu kısımda hata veriyordu, çözüm : return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

   //kod'un set kısmını siliyoruz, çünkü yazılabilir olmasını istemiyoruz sadece get olabilsin.
}

