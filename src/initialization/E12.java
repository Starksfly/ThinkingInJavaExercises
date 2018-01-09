package initialization;

public class E12 {
    public static void main(String[] args)
    {
        Tank tank1 = new Tank();
        tank1.setState(true);
        Tank tank2 = new Tank();
        System.gc();
        System.runFinalization();

    }
}

class Tank
{
    boolean state = false;



    Tank()
    {
        this.state = true;
    }

    public void setState(boolean state)
    {
        this.state = state;
    }

    protected void finalize()
    {
        if(this.state)
        {
            System.out.println("Error");
        }

    }

}
