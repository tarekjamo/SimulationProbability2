import java.util.ArrayList;
import java.util.List;

/**
 * Created by nour on 9/12/2015.
 */
public class Test {
    public static void main(String[] args) {
        int min = 100 ;
        int max = -100 ;
        for(int i = 0 ; i<10000 ;i++) {
            int a = Random.randomNumber(1000);
            if(a<min){
                min = a ;
            }
            if(a>max){
                max = a ;
            }
        }

        System.out.println("max = " + max ) ;

        System.out.println("min = " + min ) ;


        List<String> list =  new ArrayList<String>() ;
        list.add("one");
        list.add("two");

        list.add("three");

        list.add("four");

        list.add("five");
        list.add("six");
        list.add("seven");

        System.out.println("size list = " + list.size() ) ;
        System.out.println(list.get(0)) ;
        System.out.println(list.get(2)) ;
        list.remove(2);
        System.out.println(list.get(2)) ;


    }
}
