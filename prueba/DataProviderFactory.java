package prueba;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {

    @DataProvider(name = "acommodation")
    public static Object[][] acommodationDataProvider() {
        return new Object[][] {
                {"Boston", 2},
                {"Tokyo", 2},
                {"Venecia", 2},
        };
    }




}
