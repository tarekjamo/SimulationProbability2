/**
 * Created by nour on 9/12/2015.
 */
public class Room {
    public int id ;
    private boolean occupied = false ;
    Person person = null ;

    public Room(int id){
        this.id = id ;
    }

    public boolean isOccupied() {
        return occupied ;
    }

    public void occupy(Person person) {
        occupied = true  ;
        this.person = person ;
    }

    public void free() {
        occupied = false  ;
        this.person = null ;
    }
}
