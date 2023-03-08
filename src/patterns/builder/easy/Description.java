package patterns.builder.easy;

public class Description {
private String description;
private String additional;

    public Description() {
        this.description ="Initial";
        this.additional="Additional";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
