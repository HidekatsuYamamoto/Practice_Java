// 11. 次のSampleクラスの2行目の空欄に入るコードとして、正しいものを選びなさい（２つ選択）。
public class Sample {
    public void hello(String name) throws SampleException { // ）｛の間に、「空欄」
        if (name == null) {
            throw new SampleException();
        }
        if ("".equals(name)) {
            throw new TestException();
        }
        // do something
    }
}
// A. throws SampleException, TestException
// B. throws SampleException; TestException
// C. throws TestException
// D. throws SampleException
// E. 何も記述しなくてもよい。
//
// Answer. A. D.
