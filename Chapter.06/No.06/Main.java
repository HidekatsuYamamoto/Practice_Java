// 6. 次の中から正しいものを選びなさい（２つ選択）。
// A. staticなメソッドから、staticなメソッドを呼び出せない。
// B. staticなメソッドから、staticでないフィールドにアクセスできる。
// C. staticなメソッドから、staticでないメソッドを呼び出せる。
// D. staticなメソッドから、staticなフィールドにアクセスできる。
// E. staticではないメソッドから、staticなフィールドにアクセスできる。
// F. staticではないメソッドから、staticなメソッドを呼び出せない。
//
// 正解：D, E
public class Main {
    static int staticField = 10;
    int instanceField = 20;

    public static void main(String[] args) {
        // D. staticなメソッドから、staticなフィールドにアクセスできる。
        System.out.println("Static Field: " + staticField);

        // E. staticではないメソッドから、staticなフィールドにアクセスできる。
        Main mainInstance = new Main();
        mainInstance.instanceMethod();
    }

    public void instanceMethod() {
        // E. staticではないメソッドから、staticなフィールドにアクセスできる。
        System.out.println("Static Field from instance method: " + staticField);
    }
}

// staticなメンバは、クラスのロード後、すぐに行われる。
// insutanceの有無にかかわらず、利用可能である。
// staticではないメンバは、インスタンスが生成された後に利用可能になる。
// そのため、staticなメソッドからは、staticでないフィールドやメソッドにアクセスできない。
// 逆に、staticではないメンバからは、staticなフィールドやメソッドにアクセスできる。
// staticなメソッドは、クラス全体で共有されるため、インスタンスに依存しない動作をすることができます。
// 以上のことから、正しい選択肢はDとEになります。
// Aは誤りです。staticなメソッドからは、他のstaticなメソッドを呼び出すことができます。
// Bは誤りです。staticなメソッドからは、staticでないフィールドにアクセスできません。
// Cは誤りです。staticなメソッドからは、staticでないメソッドを呼び出すことができません。
// Fは誤りです。staticではないメソッドからは、staticなメソッドを呼び出すことができます。
