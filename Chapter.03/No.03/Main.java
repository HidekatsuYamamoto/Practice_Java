// 3-3
// 次の式のうち、コンパイルエラーになるものを選びなさい（３つ選択）。
public class Main {

    public static void main(String[] args) {
        /* A ✕ */ // byte a = 0b10000000; 0b01111111がmax
        /* B 〇 */ short b = 128 + 128;
        /* C ✕ */ // int c = 2 * 3L; // can't assign 'L' to integer property.
        /* D ✕ */ // float d = 10.0; // can't set 10.0 to float property. 'f'Symbol is required at
                  // the end.
    }
}

// 解答A,C,D