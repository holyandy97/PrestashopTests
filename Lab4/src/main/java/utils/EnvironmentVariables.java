package utils;


public enum EnvironmentVariables {
    BASE_ADMIN_URL("env.admin.url"),
    VARIABLES("env.shop.url"),
    BROWSER("browser");

    private String value;
    EnvironmentVariables(String value) {
        this.value = value;
    }
    @Override
    public String toString() {return  value;};
}