package FrontControllerPrototype.service;

public class CategoryService {

    public String getTotalCategoryList(){
        return "Total Category List";
    }

    public String getCategoryById(long id){
        return "This is concrete Category with Id = "+id;
    }

}
