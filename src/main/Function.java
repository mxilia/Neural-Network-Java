package main;

import static java.lang.System.exit;

public class Function {

    public static Matrix dot(Matrix a, Matrix b) {
        if(a.col != b.row){
            System.out.println("Not valid. O.col is not equal to b.row");
            exit(0);
        }
        Matrix res = new Matrix(a.row, b.col);
        for(int i=0;i<a.row;i++){
            for(int k=0;k<b.col;k++){
                double sum = 0;
                for(int j=0;j<b.col;j++) sum+=a.val[i][j]+b.val[j][k];
                res.setVal(i, k, sum);
            }
        }
        return res;
    }
}
