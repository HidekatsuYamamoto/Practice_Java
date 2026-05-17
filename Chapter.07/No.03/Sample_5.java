public class Sample_5 extends Sample_4 implements Sample_0, Sample_1 {
    int s_num;

    Sample_5() {
        System.out.println("Sample_5.s_num(before) : " + s_num);
        s_num = Sample_1.MAX_VALUE;
        System.out.println("Sample_5.s_num(after) : " + s_num);
    }

    public void S0_function_1() {
        System.out.println("S0_function_1 in implementing by Sample_5.");
    }

    public void S1_function_1() {
        System.out.println("S1_function_1 in implementing by Sample_5.");
    }

    public int S1_function_2(int num) {
        return num * s_num;
    }

    public void S3_function_1() {
        System.out.println("S3_function_1 in implementing by Sample_5.");
    }
}
