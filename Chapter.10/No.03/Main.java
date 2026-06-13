// 3. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        try {
            sample();
            sub();
        } catch (SampleException e) {
            System.out.println("A");
        } catch (SubSampleException e) { // Unreachable catch block
            System.out.println("B");
        }
    }

    private static void sample() throws SampleException {
        throw new SampleException();
    }

    private static void sub() throws SubSampleException {
        throw new SubSampleException();
    }
}

// A. A
// B. B
// C. B A
// D. No display
// E. Compilation error
// F. Throw exception
//
// Answer. E.