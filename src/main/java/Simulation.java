import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by nour on 9/12/2015.
 */
public class Simulation {

    public static void main(String[] args) {

        Person[] peoples = new Person[50];
        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = new Person(i);
        }

        Room[] rooms = new Room[2];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i);
        }

       // for (double x = 0; x < 1; x = x + 0.05)
        //{
          //  Settings.frequency = x ;
            simulateDay(peoples, rooms);

        //}

        }

    private static void simulateDay(Person[] peoples, Room[] rooms) {
        for (int ITERATION = 0; ITERATION < Settings.ITERATION; ITERATION++) {
            freeRooms(rooms);
            for (int i = 0; i < peoples.length; i++) {

                if (peoples[i].goToRoom()) {
                    List<Room> tried = new ArrayList<Room>();
                    List<Room> possibilities = new ArrayList<Room>();
                    for (int j = 0; j < rooms.length; j++) {
                        possibilities.add(rooms[j]);
                    }
                    int trial = 0;
                    int a = peoples[i].chooseRoom(rooms, tried, possibilities, trial);

                } else {
                   peoples[i].frequency += Settings.add;
                }

            }

        }
        Statistics.print();
        Statistics.reset();
    }


    public static void freeRooms(Room[] rooms) {
        for(int i = 0 ; i < rooms.length ;i++) {
            rooms[i].free();
        }
    }
}
