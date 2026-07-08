public class Sample {
    public static void main(String[] args) {
        short s1 = 10;
        Integer s2 = 20;
        Long s3 = (long) s1 + s2;
        String s4 = (String) (s3 + s2);
        // String s4 = new String(String.valueOf(s3 + s2)); // Fix
        System.out.println(s4);
    }
}

// 60.
// A. 30
// B. 5行目 コンパイルエラー
// C. 6行目 〃
// D. 5行目 ClassCastException
// E. 6行目 〃
//
// Ans.C