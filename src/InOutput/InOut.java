package InOutput;
/*
I/O класс, с проверкой введенных данных.
 */

import java.util.Scanner;

public class InOut {

    public double GetDouble()
    {
        double x=0.0;
        Scanner scr = new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите число : ");
            if(scr.hasNextDouble())
            {
                x = scr.nextDouble();
                break;
            }
            else
            {
                String str = scr.next();
                if (str.equals("x"))
                {
                    break;
                }
                else
                {
                    System.out.println("Неверное введенное значение!");
                }
            }
        }
        return x;
    }


    public int GetInt()
    {
        int x=0;
        Scanner scr = new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите число : ");
            if(scr.hasNextInt())
            {
                x = scr.nextInt();
                break;
            }
            else
            {
                String str = scr.next();
                if (str.equals("x"))
                {
                    break;
                }
                else
                {
                    System.out.println("Неверное введенное значение!");
                }
            }
        }
        return x;
    }
}
