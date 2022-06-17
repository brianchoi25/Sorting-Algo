public class source {
    public static void main(String[] args) {

        double[] testArray = new double[]{3,2,1};
        double[] input = new double[]{1,2,3,4,5};

        SystemBlock A = new SystemBlock(testArray);
        System.out.println(A.conv(input));
    }
}
