public class Appendix_Sample {
    public void doProcess() {
        Runnable r = () -> {
            System.out.println("hello!");
        };

        Thread thread = new Thread(r);
        thread.start();
        System.out.println("finish!");
    }

}
