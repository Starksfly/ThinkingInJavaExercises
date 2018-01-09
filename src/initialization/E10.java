package initialization;

public class E10 {
    public static void main(String[] args)
    {
        LiuBingXin a = new LiuBingXin();
        a.finalize();
    }
}

class LiuBingXin
{
    private String name = "LiuBixngxin";
    protected void finalize()
    {
        System.out.println("finalize() called");
    }

}
