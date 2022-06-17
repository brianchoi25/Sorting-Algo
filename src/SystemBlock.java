public class SystemBlock implements I_filter{

    double[] systemResponse;

    //----------Constructor pass System response-------------
    public SystemBlock(double input[]){
        this.systemResponse = input;
    }

    public double[] conv(double inputSignal[]){

        int n = systemResponse.length;
        int m = inputSignal.length;

        double[] result = new double[(n+m-1)];

        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                result[i+j] += (systemResponse[i]*inputSignal[j]);
            }
        }
        return result;
    }

}
