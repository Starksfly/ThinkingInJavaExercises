package initialization;

public class E22 {
    static void describe(PaperCurrencyTypes pct)
    {
        System.out.println(pct);
        switch (pct)
        {
            case ONE:       System.out.println("1");
                            break;
            case TWO:       System.out.println("2");
                            break;
            case FIVE:      System.out.println("5");
                            break;
            case TEN:       System.out.println("10");
                            break;
            case TWENTY:    System.out.println("20");
                            break;
            case FIFTY:     System.out.println("50");
                            break;

        }
    }

    public static void main(String[] args)
    {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            describe(s);
    }
}
