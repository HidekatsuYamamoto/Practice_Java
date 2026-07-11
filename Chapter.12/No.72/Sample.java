public class Sample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCD");
        // くうらん
        // B.
        sb.replace(sb.indexOf("B"), sb.indexOf("C"), "X");
        System.out.println(sb);

        // {
        // StringBuilder sa = new StringBuilder("ABCD");
        // System.out.println("[" + sa.indexOf("B") + "/ " + sa.indexOf("B"));
        // sa.replace(sa.indexOf("B"), sa.indexOf("B"), "X");
        // System.out.println("A. :" + sa);
        // }
        // {
        // StringBuilder sc = new StringBuilder("ABCD");
        // System.out.println("[" + sc.indexOf("A") + "/ " + sc.indexOf("B"));
        // sc.replace(sc.indexOf("A"), sc.indexOf("B"), "X");
        // System.out.println("C. :" + sc);
        // }
        // {
        // StringBuilder sd = new StringBuilder("ABCD");
        // System.out.println("[" + sd.indexOf("A") + "/ " + sd.indexOf("C"));
        // sd.replace(sd.indexOf("A"), sd.indexOf("C"), "X");
        // System.out.println("D. :" + sd);
        // }
    }
}

// 72. AXBDと表示したい（１つ選択）。
// A. sb.replace(sb.indexOf("B"), sb.indexOf("B"), "X");
// B. sb.replace(sb.indexOf("B"), sb.indexOf("C"), "X");
// C. sb.replace(sb.indexOf("A"), sb.indexOf("B"), "X");
// D. sb.replace(sb.indexOf("A"), sb.indexOf("C"), "X");
//
// Ans. B
// The substring begins at the specified start and extends to the character at
// index end - 1 or to the end of the sequence if no such character exists.