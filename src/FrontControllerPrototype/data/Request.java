package FrontControllerPrototype.data;

import FrontControllerPrototype.enums.ServEnum;
public class Request {
   private String serviceName;
   private String methodName;
   private Long CatId;
   private Long ProdId;
   private Long ManId;

    public Request() {
    }

    public Request(String serviceName, String methodName, Long catId, Long prodId, Long manId) {
        this.serviceName = serviceName;
        this.methodName = methodName;
        CatId = catId;
        ProdId = prodId;
        ManId = manId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Long getCatId() {
        return CatId;
    }

    public void setCatId(Long catId) {
        CatId = catId;
    }

    public Long getProdId() {
        return ProdId;
    }

    public void setProdId(Long prodId) {
        ProdId = prodId;
    }

    public Long getManId() {
        return ManId;
    }

    public void setManId(Long manId) {
        ManId = manId;
    }

    @Override
    public String toString() {
        return "Request{" +
                "serviceName='" + serviceName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", CatId=" + CatId +
                ", ProdId=" + ProdId +
                ", ManId=" + ManId +
                '}';
    }
}
