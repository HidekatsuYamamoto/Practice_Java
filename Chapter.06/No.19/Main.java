// 19. Sampleというクラスを定義しようと考えている。このクラスの定義す
// るコンストラクタを修飾できるアクセス修飾子についての説明として、
// 正しいものを選びなさい。
// 
// A. publicなコンストラクタのみ定義できる。
// B. publicかprotectedなコンストラクタのみ定義できる。
// C. private以外のコンストラクタが定義できる。
// D. コンストラクタを修飾するアクセス修飾子に制限はない。
// E. アクセス修飾子で修飾することはできない。
//
public class Main {

    private Main() {
        System.out.println("アクセス修飾子が「private」のコンストラクタ");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Main d = new Main();
        System.out.println("done");
    }
}
// 解答D.
// どのようなアクセス修飾子であっても定義可能。
// そもそもの修飾子のスコープの影響下にはある。