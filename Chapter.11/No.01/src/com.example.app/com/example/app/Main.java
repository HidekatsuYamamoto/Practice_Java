package com.example.app;

import com.example.message.MessageService;
// import com.example.Common.*; 

public class Main {

    public static void main(String[] args) {

        MessageService service = new MessageService();

        System.out.println(service.getMessage());

        // Common c = new Common("test");
        // c.getName();
    }
}

// c:\Users\yokan\study\Practice_Java\Chapter.11\No.01>javac --module-path mods
// ^
// More? -d mods/com.example.app ^
// More? src/com.example.app/module-info.java ^
// More? src/com.example.app/com/example/app/Main.java
// src\com.example.app\com\example\app\Main.java:4: エラー:
// パッケージcom.example.Commonは表示不可です
// import com.example.Common.*;
// ^
// (パッケージcom.example.Commonはモジュールcom.example.Commonで宣言されていますが、モジュールcom.example.appに読み込まれていません)
// エラー1個
//
// 理由：Commonは、モジュールとして公開されていない。
//
// 1. 次の説明のうち、正しいものを選びなさい（２つ選択）。
// A. モジュールの設定は、module-info.javaに記述する。
// B. モジュールの設定では、どのパッケージを公開するかを記述する。
// C. モジュールの設定では、どのパッケージを利用するかを記述する。
// D. moduke-info.javaが無くてもモジュール化することができる。
//
// 解答：A. B.
//
//
// 2. 次の説明のうち、正しいものを選びなさい（１つ選択）。
// libディレクトリにあるsampleモジュールを実行したい。エントリーポイントを持つクラスを
// com.test.Helloとしたときのコマンドとして正しいものを選びなさい。
// A. java -m lib sample/com.test.Hello
// B. java --module-path lib com.test.Hello
// C. java --module-path lib -m com.test.Hello
// D. java --module-path lib -m sample/com.test.Hello
// E. java --module-path lib -m sample com.test.Hello
//
// 解答：D.
// java --module-path ディレクトリ名 -m クラスの完全パス
//
// 3. sampleモジュールは、com.sampleパッケージを公開し、testモジュールを利用している。
// しっくりくるmodule-info.javaを１つ選択せよ。
//
// A.
// module sample {
// exports test; <---- com.sample
// requires com.sample; <---- test
// }
//
// B.
// module sample {
// export com.sample; <---- exports
// require test; <---- requires
// }
//
// C.
// module sample {
// requires com.sample; <---- exports
// requires test;
// }
//
// D.
// module sample {
// exports com.sample;
// requires test;
// }
//
// 解答 D.