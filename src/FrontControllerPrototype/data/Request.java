package FrontControllerPrototype.data;

public class Request {
    private String serviceName;
    private String methodName;
    private Long сatId;
    private Long prodId;
    private Long manId;

    public Request() {
    }

    public Request(String serviceName, String methodName, Long catId, Long prodId, Long manId) {
        this.serviceName = serviceName;
        this.methodName = methodName;
        this.сatId = catId;
        this.prodId = prodId;
        this.manId = manId;
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

    public Long getСatId() {
        return сatId;
    }

    public void setСatId(Long сatId) {
        this.сatId = сatId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getManId() {
        return manId;
    }

    public void setManId(Long manId) {
        this.manId = manId;
    }

    @Override
    public String toString() {
        return "Request{" +
                "serviceName='" + serviceName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", CatId=" + сatId +
                ", ProdId=" + prodId +
                ", ManId=" + manId +
                '}';
    }
}
