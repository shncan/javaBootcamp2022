public class Main {
    public static void main(String[] args) {

//        Product product = new Product(id:1, name:"Laptop", description:"Dell", price:20000, stockAmount:2, renk:"Beyaz");


        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Dell");
        product.setPrice(20000);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}