package main;

public class WrapMatrix {
    public int row, col;
    Matrix O, T;

    public WrapMatrix(int row, int col) {
        this.row = row;
        this.col = col;
        O = new Matrix(row, col);
        T = new Matrix(row, col);
    }

    public void equalMatrix(Matrix a) {
        this.row = a.row;
        this.col = a.col;
        O = new Matrix(row, col);
        T = new Matrix(row, col);
        for(int i=0;i<row;i++) for(int j=0;j<col;j++) setVal(i, j, a.val[i][j]);
    }

    public void setVal(int i, int j, double val) {
        if(i<0 || j<0 || i>=row || j>=col){
            System.out.println("i j out of bound.");
            return;
        }
        O.setVal(i, j, val);
        T.setVal(j, i, val);
    }
}
