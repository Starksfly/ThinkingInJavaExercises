package initialization;

public class E11 {
    public static void main(String[] args)
    {
        LiuBingXin a = new LiuBingXin(); // The class named LiuBingXin has been defined in initialization/E10
        System.gc();
        System.runFinalization();
    }
}
