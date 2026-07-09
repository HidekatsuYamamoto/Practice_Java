public class Sample_C implements SamplePtr {
    private String[] array;

    // C. ✕
    public Sample_C(String str) {
        // this.array[0] = str;
        this.array = str;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}
