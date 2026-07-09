public class Sample_B implements SamplePtr {
    private String[] array;

    // B. ✕
    public Sample_B(String... array) {
        array = array;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}
