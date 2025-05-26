public class ThirdClass {
    public static void main(String[] args) {
        double x = 20F;
        double y = 80F;
        double z = x + y;
        System.out.println("Z is " + z + "\n");

        double r = z % 40F;
        System.out.println("r is " + r + "\n");

        boolean decision = (r != 0)? false:true;
        System.out.println("bool is " + decision + "\n");

        if (!decision)
            System.out.println("got some remainder");
    }
}
