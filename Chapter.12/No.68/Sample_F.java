public class Sample_F implements SamplePtr {
    private String[] array;

    // F. ✕
    public Sample_F(Object[] array) {
        // this.array = (String[]) array;
        this.array = array;
    }

    @Override
    public void print() {
        for (String str : this.array) {
            System.out.println(str);
        }
    }
}
