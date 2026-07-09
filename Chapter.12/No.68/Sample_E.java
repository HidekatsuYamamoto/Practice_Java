public class Sample_E implements SamplePtr {
    private String[] array;

    // E. 〇
    public Sample_E(String... array) {
        this.array = array;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}