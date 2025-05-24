package main;

public class Matrix {
    public int row, col;
    public double[][] val;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        val = new double[row+5][col+5];
    }

    public void setVal(int i, int j, double val) {
        if(i<0 || j<0 || i>=row || j>=col) return;
        this.val[i][j] = val;
    }

}
