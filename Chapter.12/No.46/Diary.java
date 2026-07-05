import java.time.LocalDate;

public class Diary {
    private LocalDate now = LocalDate.now();

    public LocalDate getNow() {
        return this.now;
    }
}