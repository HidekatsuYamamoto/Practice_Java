public class Sample {

    {
        System.out.println("初期化子");
    }

    public Sample() {
        System.out.println("A");
        this("B");
    }

    public Sample(String str) {
        System.out.println(str);
    }
}