public class Sample {
    int a;
    int b;
    int c;
    int d;

    void setA(int a) {
        a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    int setC(int c) {
        return c;
    }

    int setD(int num) {
        d = num;
        return d;
    }

    void setAll(int x) {
        a = b = this.c = setD(x);
    }

    @Override
    public String toString() {
        return "Sample = [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
    }

    public static void main(String[] args) {

        Sample s = new Sample();
        s.setAll(10);
        System.out.println(s);
    }
}

// 49. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. Sample = [a=10, b=10, c=10, d=10]
// B. Sample = [a=0, b=10, c=10, d=10]
// C. Sample = [a=0, b=0, c=0, d=10]
// D. Compilation error
// E. throw an exception
//
// Ans. A.
