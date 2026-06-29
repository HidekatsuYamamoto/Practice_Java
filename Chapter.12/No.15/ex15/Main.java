package ex15;

import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        var d = new Sample("sample");
        logger.info(d.toString());
    }
}

// A. javac ex15/Sample.java ex15/Main.java
// java -cp build ex15.Main
// B. javac -d build ex15/Sample.java ex15/Main.java
// java -cp build ex15.Main
// C. javac -d build ex15/Sample.java ex15/Main.java
// java ex15.Main
// D. javac -d build ex15/Sample.java ex15/Main.java
// java build.ex15.Main
//
// 解答B.
//
// Aは、javac ex15/Sample.java ex15/Main.javaで同じdirにclassは作るが、
// java -cp build ex15.Mainでbuildを指定されてもNG。
// Bは、javac -d build ex15/Sample.java ex15/Main.javaでbuild配下に作成。
// java -cp build ex15.Mainで動く。
// Cは、java ex15.Main でbuild配下でないのでNG。
// Dは、java build.ex15.Main でNG。