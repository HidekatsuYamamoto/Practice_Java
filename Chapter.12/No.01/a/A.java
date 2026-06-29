// １．次の２つのコードのクラスファイルを生成するためのコマンドとして、正しいものを選びなさい（１つ選択）。
// A. java a/A.java
// B. java b/B.java
// C. javac b/B.java
// java a/A.java
// D. javac a/A.java
// java a/A
package a;

import b.B;

public class A {
    public static void main(String[] args) {
        B b = new B();
    }
}

// １．解答D
// クラスファイル生成を問うた問題であり、A,Bでは実行はされるが、生成されず。
// Cは、A.classが生成されない。Dが正解なのは、A.javaのコンパイル時に、B.classも
// 生成されるため。ちなBはmainが無いので実行時にエラーになる。
// 動作するしないを問うのではくclassファイルが生成されているかなので注意。