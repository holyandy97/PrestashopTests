package utils;


import org.openqa.selenium.remote.BrowserType;


public class Properties {
    private final static String DEFAULT_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private final static String SHOP_URL = "http://prestashop-automation.qatestlab.com.ua/ru/";
    private final static String DEFAULT_BROWSER = BrowserType.CHROME;

    public static String getDefaultUrl(){
        return System.getProperty(EnvironmentVariables.BASE_ADMIN_URL.toString(),DEFAULT_URL);
    }
    public static String getShopUrl(){
        return System.getProperty(EnvironmentVariables.VARIABLES.toString(),SHOP_URL);
    }
    public static String getBrowser(){
        return System.getProperty(EnvironmentVariables.BROWSER.toString(),DEFAULT_BROWSER);
    }


}
