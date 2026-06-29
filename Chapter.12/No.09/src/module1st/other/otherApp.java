package other;

import app.AppService;
import function.FunctionService;

public class otherApp {

    public static void main(String[] args) {
        AppService apps = new AppService();
        FunctionService service = new FunctionService();

        apps.test();
        System.out.println(service.getMessage());
    }
}