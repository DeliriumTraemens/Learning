package FrontControllerPrototype.enums;

import FrontControllerPrototype.service.CategoryService;
import FrontControllerPrototype.service.ProductService;

public enum ServEnum {
    CatService("cat", CategoryService.class),
    ProdService("prod", ProductService.class);

    public String name;
    public Class<?> className;

    private ServEnum(String name, Class<?> className) {
        this.name = name;
        this.className = className;
    }
}
