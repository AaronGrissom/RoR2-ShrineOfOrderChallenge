import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Helper.CountItems();

        Integer Choice = 0;
        Integer numPlayers = 0;

        ArrayList <Player> PCs = new ArrayList<Player>();

        System.out.println(Helper.heavyRuler());
        System.out.println("Welcome to the Shrine of Order Challenge");
        Helper.printRules();
        System.out.print("\nHow many Players are there :");

        if (Helper.scnr.hasNextInt()){numPlayers = Helper.scnr.nextInt();}

        while (numPlayers < 1 || numPlayers > 4){
            System.out.println("Please enter a number from 1 - 4: ");
            if (Helper.scnr.hasNextInt()){numPlayers = Helper.scnr.nextInt();}
        }
        
        for (int i = 0; i < numPlayers; i++){
            PCs.add(new Player(i+1));
        }

        System.out.println("Are you plaing with the Void DLC? Y/N");
        Boolean noPurple = false;
        if (Helper.parsBoolInput()){
            for (int i = 0; i < numPlayers; i++){
                PCs.get(i).SetNoPuple();
            }
            noPurple = true;
        }
        System.out.println("Are you going to the Lunar Shop? Y/N");
        Boolean noBlue = false;
        if (Helper.parsBoolInput()){
            for (int i = 0; i < numPlayers; i++){
                PCs.get(i).SetNoLunar();
            }
            noPurple = true;
        }

        do{
            Choice = -31415926;

            System.out.println(Helper.lightShortRuler() + "Main menu" + Helper.lightShortRuler());
            System.out.println("1 - Print items for all players");
            System.out.println("2 - Print items for specific player");
            System.out.println("3 - Re-Roll items for a specific player");
            System.out.println("4 - Re-Roll items for all player");
            System.out.println("0 - Exit\n");
            System.out.print("Option: ");
            if (Helper.scnr.hasNextInt()){Choice = Helper.scnr.nextInt();}
            else {System.out.println(Helper.scnr.nextLine() + " is not an option"); Choice = -31415926;}

            switch (Choice){
                // TODO: Add ability to reroll one type of item
                case 1:
                    System.out.println(Helper.lightShortRuler());
                    for (int i = 0; i < numPlayers; i++){
                        System.out.println(PCs.get(i).GetInfo());
                        System.out.println(Helper.lightShortRuler());
                    }
                    break;
                case 2:
                    System.out.println(Helper.lightShortRuler());
                    int p_2 = 0;
                    System.out.print("Which player's items would you like to see: ");
                    if (Helper.scnr.hasNextInt()){
                        System.out.println(Helper.lightShortRuler());
                        p_2 = Helper.scnr.nextInt();
                        if (p_2 > 0 && p_2 <= numPlayers){
                            System.out.println(PCs.get(p_2-1).GetInfo());
                        } else {
                            System.out.println("Sorry, there is no player " + p_2);
                        }
                    }
                    else {System.out.println("sorry thre is no player '" + Helper.scnr.nextLine() + "'");}
                    break;
                case 3:
                    System.out.println("Which player would you like to reroll items for? Enter 0 to escape:");
                    int p_3 = 0;
                    if (Helper.scnr.hasNextInt()){
                        System.out.println(Helper.lightShortRuler());
                        p_3 = Helper.scnr.nextInt();
                        if (p_3 > 0 && p_3 <= numPlayers){
                            System.out.println("Generating new Items for player " + p_3);
                            PCs.get(p_3-1).GenerateItems();
                            if (noPurple) PCs.get(p_3-1).SetNoPuple();
                            if (noBlue) PCs.get(p_3-1).SetNoLunar();
                            System.out.println("Done");
                        } else {
                            if (p_3 == 0) System.out.println("Escaping..."); else
                            System.out.println("Sorry, there is no player " + p_3);
                        }
                    }
                    else {System.out.println("sorry thre is no player '" + Helper.scnr.nextLine() + "'");}
                    break;
                case 4:
                    System.out.println("Rerolling items for all players");
                    for (int i = 0; i < numPlayers; i ++) {
                        PCs.get(i).GenerateItems();
                        if (noPurple)PCs.get(i).SetNoPuple();
                        if (noBlue)PCs.get(i).SetNoLunar();
                    }
                    System.out.println("Done");
                    break;
                case 5:
                    System.out.println("Which player would you like to reroll for?");
                    int p_5 = 0;
                    if (Helper.scnr.hasNextInt()) {p_5 = Helper.scnr.nextInt();}
                    if (p_5 > 0 && p_5 <= numPlayers){
                        System.out.println("Which item would you like to reroll for player " + p_5 + " ?");
                        int item = 0;
                        if (Helper.scnr.hasNextInt()) {item = Helper.scnr.nextInt();}
                        if (item != 0){
                            switch (item) {
                                case 1:
                                    PCs.get(p_5).SetWhite(null); //TODO: See previouse todo
                            }
                        }
                    }
                case 0:
                case -31515926:
                    break;
                default:
                    System.out.println(Choice + " is not an option");
            }

        }while (Choice != 0);
        Helper.scnr.close();

    }
}
