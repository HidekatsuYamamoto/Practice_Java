public class Sample {
    private int num;

    public Sample(int num) {
        // [ 空欄 ]
        this.num = num; // A.
        setNum(num); // D.
    }

    public int getNum() {
        return num; // this...
    }

    public void setNum(int num) {
        this.num = num;
    }
}