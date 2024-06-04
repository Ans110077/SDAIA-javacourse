package day2;

public class MyMethod {

    public static double countP(int m,int fm){

        double fm1 = ((m/100)*fm);
        return fm1;


    }
    public static String calD(double s){

       if (s>85)return"Excelant";
        else if (s>75)return"Good";
        else if (s>65)return"not bad";
       else if (s>=50)return"bad";
       else return"fail";




    }


}
