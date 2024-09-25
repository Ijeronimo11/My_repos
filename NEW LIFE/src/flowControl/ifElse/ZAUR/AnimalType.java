package src.flowControl.ifElse.ZAUR;

public enum AnimalType {
    TIGER(44, "Tiger is living"),
    OWL(234, "Owl is sweety");

    private int code;
    private String description;

    AnimalType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
}
