// 21. 次の正しい、ひとつ
//
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        sb.reverse();
        sb.replace(1, 3, "a");
        System.out.println(sb);
    }
}

// A. aade
// B. ade
// C. aba
// D. eaba
//
// 解答D
// StringBuilder sb = new StringBuilder();
// sb.append("abcde");
// sb.reverse(); // edcba
// sb.replace(1, 3, "a"); // dc -> a
// System.out.println(sb); // eaba