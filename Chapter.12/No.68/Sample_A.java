public class Sample_A implements SamplePtr {
    private String[] array;

    // A. 〇
    public Sample_A(String[] array) {
        this.array = array;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}
