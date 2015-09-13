/**
 * Created by nour on 9/12/2015.
 */
public  class  Random {


    public static boolean decide(double probability) {

        double a = Math.random() * 1000 + 1 ;

        double limit = probability * 1000 ;

        if(a<limit)
        {
            return true ;
        }
        else {
            return false;
        }
    }

    public static int randomNumber(int  possibilitesCount) {

        int a = (int)(Math.random() * possibilitesCount ) ;
        return a ;

    }
}
