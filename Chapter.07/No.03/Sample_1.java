public interface Sample_1 {

    int MAX_VALUE = 100;

    void S1_function_1();

    int S1_function_2(int num);

    // protected void S1_function_3();
    // Illegal modifier for the interface method S1_function_3;
    // only public, private, abstract, default, static and
    // strictfp are permittedJava(67109935)

    // JAVA9 private メソッドを使用することでインターフェースの外部から呼び出せない補助メソッドとして利用する。
    private void S1_function_4() {
        System.out.println("S1_function_4 on private function by Sample_1.");
    }

    default void S1_defualt_function_5() {
        System.out.println("S1_defualt_function_5 on default function by Sample_1.");
        S1_function_4();
    }
}