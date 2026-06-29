public abstract class Sample_a {
    public abstract void test();
    // private abstract void test();
    // D. 抽象メソッドは、privateを付けて宣言できる。→ ✕
    // The abstract method test in type Sample_a can only set a visibility modifier,
    // one of public or protectedJava(67109226)
}
