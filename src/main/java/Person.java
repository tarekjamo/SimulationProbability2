import java.util.ArrayList;
import java.util.List;

/**
 * Created by nour on 9/12/2015.
 */
public class Person {
    public int id ;
    public double  frequency;
    public static Random random ;

    public Person(int id) {
        this.id = id ;
        this.frequency =Settings.frequency ; 
    }

    public  boolean goToRoom() {
        return    Random.decide(frequency) ;
    }


    public int chooseRoom(Room[] rooms, List<Room> tried,List<Room> possibilites, int trial) {

        if(tried.size() == rooms.length) {
            Statistics.failedSecondTimeTrial();
            return -1 ;
        }
        else {
            trial++ ;
            int possibilitesCount = possibilites.size() ;
            int decision = Random.randomNumber(possibilitesCount) ;
            if(rooms[decision].isOccupied()){
                Statistics.process(false, trial) ;
                possibilites.remove(rooms[decision]);
                tried.add(rooms[decision]) ;
                return chooseRoom(rooms,possibilites,tried,trial) ;
            }
            else {
                Statistics.process(true,trial) ;
                rooms[decision].occupy(this);
                return decision ;
            }


        }



    }

}
