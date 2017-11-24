package com.main;

import InOutput.InOut;

//Обработка данных лабораторных работ
public class Main {
    public static void main(String[] args) {

        InOut inp = new InOut();

        int n ;
        n = inp.GetInt();
        double[]  mass = new double[n];
//        double[] mass = {1,3,0,2,7};
        double[] qe = new double[n];
        Calc calc = new Calc(n);
        OutScr scr = new OutScr(n);
        for (int i =0;i<n;i++) mass[i]= inp.GetDouble();

        calc.setCommon(mass);
        calc.setQuads(qe);

        scr.setM1(mass);
        //scr.setMax(calc.getMaxdX());
        //scr.setMin(calc.getMindX());
        scr.setSQ(calc.getSumQ());
        scr.setS(calc.getS());
        scr.setA(calc.getAverage());
        scr.setX(calc.getDelX());
        scr.setM2(calc.getQuadevis());
       /* for (double x:mass) System.out.println(x); //Для отладки
        max=calc.getMaxdX();
        min=calc.getMindX();
        System.out.println(" min var : "+mass[min]);
        System.out.println(" max var : "+mass[max]);
        System.out.println(" sum of q :"+calc.getSumQ());
        System.out.println(" Sigma : "+calc.getS());
        System.out.println(" Result : "+calc.getAverage()+"+/-"+calc.getDelX());
        mass = calc.getQuadevis();
        for (double x:mass
             ) {
            System.out.println(x);
        }*/
       scr.SCR();
    }
}
