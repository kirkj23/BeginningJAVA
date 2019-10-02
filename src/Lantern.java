public class Lantern
{
    public static void main(String[] args)
    {
        first();
        second();
        empty();

        first();
        second();
        third();
        second();
        first();
        second();

    }

    public static void first()
    {
        System.out.println("    *****");
        System.out.println("  *********");
    }
    public static void second()
    {
        System.out.println("*************");
    }
    public static void third()
    {
        System.out.println("* | | | | | *");

    }
    public static void empty()

    {
        System.out.println(" ");
    }
}

