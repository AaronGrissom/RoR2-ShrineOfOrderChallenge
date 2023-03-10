import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Helper.CountItems();

        Scanner scnr = new Scanner(System.in);
        Integer Choice = 0;
        Integer numPlayers = 0;

        ArrayList <Player> PCs = new ArrayList<Player>();

        System.out.println(Helper.heavyRuler());
        System.out.println("Welcome to the Shrine of Order Challenge");
        Helper.printRules();
        System.out.print("\nHow many Players are there :");

        if (scnr.hasNextInt()){numPlayers = scnr.nextInt();}

        while (numPlayers < 1 || numPlayers > 4){
            System.out.println("Please enter a number from 1 - 4: ");
            if (scnr.hasNextInt()){numPlayers = scnr.nextInt();}
        }
        
        for (int i = 0; i < numPlayers; i++){
            PCs.add(new Player(i+1));
        }

        do{
            Choice = -31415926;

            System.out.println(Helper.lightShortRuler() + "Main menu" + Helper.lightShortRuler());
            System.out.println("1 - Print items for all players");
            System.out.println("2 - Print items for specific player");
            System.out.println("0 - Exit\n");
            System.out.print("Option: ");
            if (scnr.hasNextInt()){Choice = scnr.nextInt();}
            else {System.out.println(scnr.nextLine() + " is not an option"); Choice = -31415926;}

            switch (Choice){
                // TODO: Add ability to remove all purple items
                // TODO: Add ability to select only one type of equipment
                // TODO: Add ability to reroll one type of item
                // TODO: Add ability ro reroll all items for one player
                // TODO: Add ability to reroll all items for all players
                case 1:
                    for (int i = 0; i < numPlayers; i++){
                        System.out.println(PCs.get(i).GetInfo());
                        System.out.println(Helper.lightShortRuler());
                    }
                    break;
                case 2:
                    int p = 0;
                    System.out.print("Which player's items would you like to see: ");
                    if (scnr.hasNextInt()){
                        p = scnr.nextInt();
                        if (p > 0 && p <= numPlayers){
                            System.out.println(PCs.get(p-1).GetInfo());
                        } else {
                            System.out.println("Sorry, there is no player " + p);
                        }
                    }
                    else {System.out.println("sorry thre is no player '" + scnr.nextLine() + "'");}
                case 0:
                case -31515926:
                    break;
                default:
                    System.out.println(Choice + " is not an option");
            }

        }while (Choice != 0);
        scnr.close();

    }
}
