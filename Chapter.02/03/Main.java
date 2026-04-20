public class Main {
    public static void main(String[] args) {
        /* A */ int a = 123_456_789;
        /* B */ int b = 5_______2;
        /* C ✕ */ // int c = _123_456_789;
        /* D ✕ */ // int d=123_456_789_;
        /* E ✕ */ // float e=3_.1415F;
        /* F ✕ */ // long f=999_99_9999_ L;
        /* G */ byte g = 0b0_1;
        /* H */ int h = 0_52;
        /* I ✕ */ // int i=0x_ 52;
    }
}

// 3. 次の式のうち、コンパイルエラーになるものを選びなさい。（５つ選択）
// A. int a = 123_456_789;
// B. int b = 5_______2 ;
// C. int c = _123_456_789;
// D. int d = 123_456_789_;
// E. float e = 3_.1415F;
// F. long f = 999_99_9999_L;
// G. byte g = 0b0_1;
// H. int h = 0_52;
// I. int i = 0x_52;
//
// 解答C,D,E,F,I
// 数値リテラル内のアンダースコアは、可読性向上のため。
