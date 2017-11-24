package com.main;/*Artemii 18:40 
    Выводит на экра в виде таблицы все данные
*/

public class OutScr {
    OutScr(int n )
    {
        this.n = n;
    }
    // Переменные и массивы
    private int n,max,min;
    private double [] m1,m2 = new double[n];
    private double SQ,S,A,X;

    // Getter and setters
    /*
    public void setMax(int max) {
        this.max = max;
    }
    public void setMin(int min) {
        this.min = min;
    }
    */
    public void setM1(double[] m1) {
        this.m1 = m1;
    }
    public void setM2(double[] m2) {
        this.m2 = m2;
    }
    public void setSQ(double SQ) {
        this.SQ = SQ;
    }
    public void setS(double s) {
        S = s;
    }
    public void setA(double a) {
        A = a;
    }
    public void setX(double x) {
        X = x;
    }
    // Methods
    void SCR()
    {
        for (int i =0;i<n;i++)
        {
            /*
            if (m1[i]==m1[max])
            {
                System.out.printf("|  %d  ||  %.2f  ||  MAX  |\n",i+1,m1[i]);
            }
            else
            {
                if (m1[i]==m1[min])
                {
                    System.out.printf("|  %d  ||  %.2f  ||  min  |\n",i+1,m1[i]);
                }
                else System.out.printf("|  %d  ||  %.2f  ||  %.2f  |\n",i+1,m1[i],m2[i]);
            }
            */
            System.out.printf("|  %d  ||  %.2f  ||  %.2f  |\n",i+1,m1[i],m2[i]);
        }
        System.out.printf("----------------------------------\n");
        System.out.printf("Tc =  %.2f| Tic = %.2f\n",A,SQ);
        System.out.printf("| Sigma = %.2f |",S);
        System.out.printf("|  Result  = %.2f +/- %.3f  |\n",A,X);
    }
}
