package com;

// [　空欄　]
import com.sample.Sample;
import com.sample.test.*;

public class Main {
    public static void main(String[] args) {
        new Sample().sample();
        int num = Integer.parseInt(args[0]);
        new Test().test(num);
    }
}

// ３． 次のプログラムを確認し、Mainクラスの空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
// A.
// import java.lang.Integer;
// import com.*;
//
// B.
// import com.sample.*;
//
// C.
// import com.sample.Sample;
// import com.sample.test.*;
//
// D.
// import com.lang;
//
// 解答C.
// .*でサブクラスまで含まれるわけではない。