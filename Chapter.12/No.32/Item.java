abstract class Item {
    public abstract int calcPrice(Item item);

    public void print(Item item) {
        /* Do something */
        System.out.println("Price: " + calcPrice(item));
    }
}
