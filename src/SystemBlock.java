public class SystemBlock implements I_filter{

    double[] systemResponse;
    double[] result;
    SystemBlock prev; // Allows connections to other system blocks for input
    SystemBlock next; // Allows connections to other system blocks for output


    //----------Constructor pass System response-------------
    public SystemBlock(double input[]){
        if( this.prev != null) {
            this.systemResponse = this.prev.getSystemResponse();
        }else{
            this.systemResponse = input;
        }

    }

    public SystemBlock(){
        if( this.prev != null) {
            this.systemResponse = this.prev.getSystemResponse();
        }
    }

    public double[] getSystemResponse(){return systemResponse;}

    public void addToEnd(SystemBlock A){
        this.next = A;
        A.prev = this;
        A.systemResponse = this.result;
    }

    public void setNext(SystemBlock A ){this.next = A;} //Sets the next block

    public void setPrev(SystemBlock A ){this.prev = A;} //Sets the previous block

    public double[] conv(double inputSignal[]){

        int n = systemResponse.length;
        int m = inputSignal.length;

        this.result = new double[(n+m-1)];

        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                this.result[i+j] += (systemResponse[i]*inputSignal[j]);
            }
        }
        return this.result;
    }


}
