public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        try {
            s.hello(null);
        } catch (SampleException e) {
            System.out.println("SampleException.");
        } catch (TestException e) {
            System.out.println("TestException.");
        }
    }
}
