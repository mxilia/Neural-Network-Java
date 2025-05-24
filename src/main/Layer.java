package main;

import java.util.Random;

public class Layer {
    public int lSize, rSize;
    public String actFunc;

    WrapMatrix weight, bias;

    public Layer(int lSize, int rSize, String actFunc) {
        this.lSize = lSize;
        this.rSize = rSize;
        this.actFunc = actFunc;
        genWeight();
        bias = new WrapMatrix(this.rSize, 1);
    }

    private void genWeight() {
        weight = new WrapMatrix(lSize, rSize);
        Random rand = new Random();
        int mx = Math.max(lSize, rSize), mn = Math.min(lSize, rSize);
        double sqrtVal = Math.sqrt(2.0/(double)lSize);
        for(int i=0;i<weight.row;i++){
            for(int j=0;j<weight.col;j++){
                double val = rand.nextDouble(mx-mn+1)+(double)mn*sqrtVal;
                weight.setVal(i, j, val);
            }
        }
    }
}
