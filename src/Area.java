import java.util.ArrayList;

public class Area {
    boolean[] walls = new boolean[4];
    ArrayList<Player> players = new ArrayList<>();
    public Area(boolean[] w) {
       for(int i=0; i<w.length; i++) {
           walls[i] = w[i];
       }
       for(int i= w.length-1; i<walls.length; i++) {
            walls[i] = Main.randomint(3)==0;
       }

    }

}
