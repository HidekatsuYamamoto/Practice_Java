public class Main {
    public static void main(String[] args) {
        String[] str = new String[2];
        int i = 0;
        for (String s : str) {
            str[i].concat("e" + i);
            i++;
        }
        for (i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}

// 74.
// A. e0
// e1
// B. null e0
// null e1
// C. null
// null
// D. throw an exception
//
// Ans. D.