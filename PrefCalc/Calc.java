package PrefCalc;

import java.util.Scanner;

public class Calc {

    private static Scanner in = new Scanner(System.in);


    public static void main(String args[]){

        String str = in.nextLine();

        String[] strings = str.split(" ");

        Queue queue1 = new Queue();

        for(int i = 0; i < strings.length; i++){

            if(isNumber(strings[i]))
            {
                queue1.insert(Double.parseDouble(strings[i]));
            }
            else
            {
                double tmp1 = queue1.remove();
                double tmp2 = queue1.remove();

                switch (strings[i])
                {
                    case "+":

                        queue1.insert((tmp1 + tmp2));
                        break;

                    case "-":

                        queue1.insert((tmp1 - tmp2));
                        break;

                    case "*":

                        queue1.insert((tmp1 * tmp2));
                        break;

                    case "/":

                        queue1.insert((tmp1 / tmp2));
                        break;
                }
            }
        }
        if(!queue1.isEmpty())
        {
            System.out.println(queue1.getFront());
        }
        else
        {
            System.out.println("Ошибка");
        }
    }

    private static boolean isNumber(String string){

        try {
            Double.parseDouble(string);

            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }

}
