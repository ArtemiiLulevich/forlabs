package com.main;

public class Calc {
    Calc(int n )
    {
        //this.n=7;
        this.n=n;
    }
    //Переменные и массивы
    private int maxdX = 0,mindX = 0,n;//Макс индекс, мин индекс, количество переменных в массиве
    private double stu = 2.77,sumQ=0,S=0;// Коэф Стьюдента, Сумма отклонений, Сигма
    private double [] common;


    private double [] quads ;//Массив отклонений


    //Getters and Setters
    public void setQuads(double[] quads) {
        this.quads = quads;
    }
    public void setCommon(double[] common)
    {
        this.common = common;
    }
    /*
    public int getMaxdX() {
        return maxdX = Max();
    }
    public int getMindX() {
        return mindX = Min();
    }
    */
    public double getSumQ() {
        return sumQ=quadevi();
    }
    public double getS() {
        return S=sigma();
    }
    public double getDelX() {
        return stu*sigma();
    }
    public double getAverage() {
        return average();
    }
    public double[] getQuadevis() {
        return quads;
    }

    //Methods
    /*
    private int Max()//Индекс Максимального значения в массиве
    {
        int Mi = 0,i = 0;
        double max = 0;
        for (double x : common
                ) {

            if (x > max) {
                max=x;
                Mi = i;
            }
            i++;
        }
        return Mi;
    }
    private int Min()//Индекс минимального значения в массиве
    {
        int mi=0,i = 0;
        double min = common[0];
        for (double x : common
                ) {

            if (x <= min) {
                min=x;
                mi = i;
            }
            i++;
        }
        return mi;
    }
    */
    private double average()//Среднее значение в массиве
    {
        double sum=0;
        for (double x:common)
        {
            /*
            if (x==common[maxdX]) continue;
            else
                if (x==common[mindX]) continue;
                else sum+=x;
                */
            sum+=x;
        }
        //sum/=(n-2);
        sum/=n;
        return sum;
    }
    private double quadevi()//Сумма квадратичного отклонения, составление массива отклонений
    {
        double sum = average();
        for (int i =0;i<n;i++)
        {
            /*
            if (common[i]==common[maxdX])
            {
                quads[i]=0;
                continue;
            }
            else
            {
                if (common[i]==common[mindX])
                {
                    quads[i]=0;
                    continue;
                }
                else quads[i]=Math.pow(sum-common[i],2);
            }
            */
            quads[i]=Math.pow(sum-common[i],2);
        }
        for (int i = 0;i<n;i++)
        {
            sumQ +=quads[i];
        }
        return sumQ;
    }
    private double sigma()//Подсчет сигмы
    {
        //S = Math.sqrt(sumQ/((n-2)*(n-3)));
        S = Math.sqrt(sumQ/((n)*(n-1)));
        return S;
    }

}

