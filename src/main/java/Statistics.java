import com.sun.javafx.collections.NonIterableChange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nour on 9/12/2015.
 */
public class Statistics {
    public static int  foundFromFirstTime= 0 ;
    public static int  failedFirstTimetrial= 0 ;
    public static int  foundFromSecondTime= 0 ;
    public static int  failedSecondTimetrial= 0 ;

    //public static int full = 0 ;

   // public static List<Integer> results = new ArrayList<Integer>() ;


    public static void foundFromFirstTime() {
        foundFromFirstTime++ ;
    }

    public static void failedFirstTimeTrial() {
        failedFirstTimetrial++ ;
    }
    public static void foundFromSecondTime() {
        foundFromSecondTime++ ;
    }
    public static void failedSecondTimeTrial() {
        failedSecondTimetrial++ ;
    }

    public static void process(boolean found, int count) {
        if(found) {
            if(count==1) {
                foundFromFirstTime() ;
            }
            if(count==2) {
                foundFromSecondTime() ;
            }
        }
        else {
            if(count==1) {
                failedFirstTimeTrial() ;
            }
            if(count==2) {
                failedSecondTimeTrial() ;
            }
        }
    }

    public static void reset() {
        foundFromFirstTime= 0 ;
        failedFirstTimetrial= 0 ;
        foundFromSecondTime= 0 ;
        failedSecondTimetrial= 0 ;
    }

    public static void print() {
      //  System.out.println(foundFromFirstTime) ;
    //    System.out.println(failedFirstTimetrial) ;
  //      System.out.println(foundFromSecondTime) ;
//        System.out.println(failedSecondTimetrial) ;


        double result1 = (double)foundFromFirstTime / (foundFromFirstTime+failedFirstTimetrial);
        double result2 = (double)foundFromSecondTime / (foundFromSecondTime+failedSecondTimetrial);

       // System.out.println("Frequency = " + Settings.frequency+"Probability finding from first time ratio"+result1 + " found from first time " + foundFromFirstTime) ;
      //  System.out.println("Frequency = " + Settings.frequency+"Probability finding from second time ratio"+ result2 + "found from second time "+ foundFromSecondTime) ;

       System.out.println("1,"+Settings.frequency+","+result1+","+foundFromFirstTime+","+failedFirstTimetrial) ;
        System.out.println("2,"+ Settings.frequency+","+ result2+","+foundFromSecondTime+","+failedSecondTimetrial) ;
    }
}
