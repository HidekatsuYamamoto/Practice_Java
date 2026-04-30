// 19. switch文の条件式が戻せる型として、正しいものを選びなさい（６つ選択）。
//

public class Main {

    protected enum Fruit {
        Orange,
        Apple,
        Melon
    };

    public static void main(String[] args) {
        /* A ① */char a = 'A';
        /* B ② */byte b = Byte.MAX_VALUE;
        /* C ③ */short c = Short.MAX_VALUE;
        /* D ④ */int d = Integer.MAX_VALUE;
        /* E ⑤ */long e = Long.MAX_VALUE;
        /* F ✕ */String f = "ABC";
        /* G ⑥ */ Fruit g = Fruit.Orange;
        /* H ✕ */boolean h = true;

        switch (a) {
            case 'A':
                System.out.println("char OK");
                break;
            default:
                System.out.println("char NG");
                break;
        }

        switch (b) {
            case Byte.MAX_VALUE:
                System.out.println("byte OK");
                break;
            default:
                System.out.println("byte NG");
                break;
        }

        switch (c) {
            case Short.MAX_VALUE:
                System.out.println("short OK");
                break;
            default:
                System.out.println("short NG");
                break;
        }

        switch (d) {
            case Integer.MAX_VALUE:
                System.out.println("int OK");
                break;
            default:
                System.out.println("int NG");
                break;
        }
        switch (e) {
            case Long.MAX_VALUE:
                System.out.println("long OK");
                break;
            default:
                System.out.println("long NG");
                break;
        }

        switch (f) {
            case "ABC":
                System.out.println("String OK");
                break;
            default:
                System.out.println("String NG");
                break;
        }

        switch (g) {
            case Fruit.Orange:
                System.out.println("enum OK");
                break;
            default:
                System.out.println("enum NG");
                break;
        }

        switch (h) {
            case true:
                System.out.println("boolean OK");
                break;
            default:
                System.out.println("boolean NG");
                break;
        }

    }
}

// 解答A,B,C,D,F,G
// 現在のJDKだと全部OK