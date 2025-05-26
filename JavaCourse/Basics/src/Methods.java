public class Methods {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;



        if (validate(x))
            System.out.println("Equals 5");
        else
            System.out.println("NOT Equal 5");

        if (validate(y))
            System.out.println("Equals 5");
        else
            System.out.println("NOT Equal 5");
    }

    public static boolean validate(int val)
    {
        return (val == 5) ? true : false;
    }
}
