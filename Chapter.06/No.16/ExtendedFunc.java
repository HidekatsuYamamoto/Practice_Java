// A. int calc(int a) {}
// B. double calc(double a, int b) {}
// C. int calc(double a, double b) {}
// D. int calc(double num1, int num2) {}
// E. int calc() {}
// F. int calc(int a, double b) {}
public class ExtendedFunc extends Method {
    // A. int calc(int a) {}
    int calc(int a) {
        System.out.println("A.");
        return a;
    }

    // B. double calc(double a, int b) {}
    // double calc(double a, int b) { 戻り値が同じというルールNG
    // System.out.println("B.");
    // return a + (double)b;
    // }
    // }

    // C. int calc(double a, double b) {}
    int calc(double a, double b) {
        System.out.println("C.");
        return (int) a + (int) b;
    }

    // D. int calc(double num1, int num2) {}
    int calc(double num1, int num2) {
        System.out.println("D.");
        return (int) num1 + num2;
    }

    // E. int calc() {}
    int calc() {
        int i = 5;
        System.out.println("E.");
        return i;
    }

    // F. int calc(int a, double b) {}
    int calc(int a, double b) {
        System.out.println("F.");
        return a + (int) b;
    }
}