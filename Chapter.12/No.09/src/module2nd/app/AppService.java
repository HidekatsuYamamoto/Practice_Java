package app;

import function.FunctionService;

public class AppService {

    public void test() {

        FunctionService service = new FunctionService();

        System.out.println(service.getMessage());
    }
}