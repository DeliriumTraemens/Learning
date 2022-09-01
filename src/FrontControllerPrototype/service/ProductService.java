package FrontControllerPrototype.service;

public class ProductService {

    public String getProdListByCat(){
        return "This is a list of Products from Category number 1111";
    }

    public String getProductById(long id){
        return "This is a Product with Id "+id;
    }
}
