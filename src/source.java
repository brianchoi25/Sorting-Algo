public class source {
    public static void main(String[] args) {

        double[] testArray = new double[]{3,2,1};
        double[] testArray2 = new double[]{1,1,1};
        double[] input = new double[]{1,2,3,4,5};

        SystemBlock A = new SystemBlock(testArray);

        SystemBlock B = new SystemBlock(testArray2);
        A.conv(input);
        A.addToEnd(B);
        B.conv(testArray2);

        System.out.println(A.result);
        System.out.println(B.result);
        System.out.println("Done");
    }
}
