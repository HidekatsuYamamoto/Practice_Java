public class SubSample extends Sample {
    int price;

    public SubSample(int price) {
        // super("Default Name", 0); // Call the superclass constructor
        this.price = price;
    }

    public SubSample(String name, int num, int price) {
        super(name, num); // Call the superclass constructor
        this(price);
        // this.price = price;
    }

}
