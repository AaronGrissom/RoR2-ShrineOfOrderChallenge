import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);
        Integer Choice = 0;
        Integer numPlayers = 0;

        ArrayList <Player> PCs = new ArrayList<Player>();

        System.out.println(Helper.heavyRuler());
        System.out.println("Welcome to the Shrine of Order Challenge");
        Helper.printRules();
        System.out.print("\nHow many Players are there :");

        if (scnr.hasNextInt()){numPlayers = scnr.nextInt();}
        
        for (int i = 0; i < numPlayers; i++){
            PCs.add(new Player());
        }

        scnr.close();

    }
}
