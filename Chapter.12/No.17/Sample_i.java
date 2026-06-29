public interface Sample_i {
    public void test_public();

    // protected void test_protected();
    // B. インタフェースは、protectedを付けて宣言できる。-> ✕
    // Illegal modifier for the interface method test_protected;
    // only public, private, abstract, default, static and strictfp
    // are permittedJava(67109935)
}
