package Debug;

public class Debug1A
{
    public static void main(String args[])
    {
        int width = 12, length = 10, height = 8;
        Debug1 box1 = new Debug1();
        Debug1 box2 = new Debug1();
        System.out.println("The dimensions of the first box are");
        box1.showData();
        System.out.print("  The volume of the first box is ");
        showVolume(box1);
        System.out.println("The dimensions of the second box are");
        box2.showData();
        System.out.print("  The volume of the second box is ");
        showVolume(box2);
    }
    public static void showVolume(Debug1 aBox)
    {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
