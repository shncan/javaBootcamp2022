public class ProductValidator {
public static boolean isValid(Product product){  //static ifadesi nesnenin bir örneğini oluşturuyor ancak 1 kereliğine oluşturuyor. genelde yardıcı araçlarda kullanılır, manager sınıflarında kullanılmaz.
    //static yapılar direkt olarak Class ismiyle çağrılabilir, newlemeye ihtiyaç duymaz. ancak altta oluşturduğumuz bisey metodunu getirebilmek için newlememiz gerekir.
    if(product.price>0 && !product.name.isEmpty()){
        return true;
    }else{
        return false;
    }
}
public void bisey(){

}

public class  BaskaClass{            //class içinde class oluşturmaya inner class denir.
    public static void sil(){

    }
}

}

