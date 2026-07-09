public class Sample_D implements SamplePtr {
    private String[] array;

    // D. ✕
    public Sample_D(String[] array) {
        array = array;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}