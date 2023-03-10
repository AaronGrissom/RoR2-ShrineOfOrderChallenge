import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Helper {

    static int numWhite = 0;
    static int numGreen = 0;
    static int numRed = 0;
    static int numYellow = 0;
    static int numOrange = 0;
    static int numBlue = 0;
    static int numBlueE = 0;
    static int numPurpW = 0;
    static int numPurpG = 0;
    static int numPurpR = 0;

    static public void CountItems() {
        File file = new File("Items\\White.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numWhite++;
            }
            sc.close();
            System.out.println(numWhite);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open White.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Green.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numGreen++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Green.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Red.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numRed++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Red.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Yellow.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numYellow++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Yellow.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Orange.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numOrange++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Orange.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Blue.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numBlue++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Blue.txt");
            e.printStackTrace();
        }

        file = new File("Items\\BlueEquipment.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numBlueE++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open BlueEquipment.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_White.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numPurpW++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_White.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_Green.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numPurpG++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_Green.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_Red.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                numPurpR++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_Red.txt");
            e.printStackTrace();
        }
    }
    
    
    // returns random int between min and max (inclusive)
    static int RandInt(int min, int max){
        Random rn = new Random();
        return rn.nextInt(max - min + 1) + min;
    }

    static public void printRules() {
        System.out.println(lightRuler());
        System.out.println("Rules of the Challenge");
        System.out.println("1) This challenge must be played using the artifact of Command");
        System.out.println("2) Each player is allowed access to only 1 rarity of item as though they activated the shrine of order");
        System.out.println("\tThe item rarities are: ");
        System.out.println("\t\t - White, Green, Yellow, Blue, Red");
        System.out.println("\t\t - Purple-White, Purple-Green, Purple-Red" );
        System.out.println("\t\t - Equipment, Blue-Equipment");
        System.out.println("3) Players are not allow to stack an item not on their list.");
        System.out.println("\t - Ex: if the player's white item is \"Lens-Maker's Glasses\" and their white-pruple item is \"Needletick(Tri-Tip Dagger)\"");
        System.out.println("\t\t then the player cannot select the \"Tri-Tip Dagger\" until they recieve their first \"Needletick(Tri-Tip Dagger)\" to corrupt their Tri-tip Dagger");
        System.out.println("\t (in other words, players cannot stack their corrupted items as standard items and then corrupt them all at once.");
        System.out.println("\t They must wait for their first corrupted item before they can start stacking it.");
        System.out.println("4) When players have both standard items and corrupted items of the same rarity in their current build");
        System.out.println("\t(eg \"Lens-Maker's Glasses\"  and \"Needletick(Tri-Tip Dagger)\" then when choosing an item of the corisponding rarity (in this case white)");
        System.out.println("\t\t they can choose either the standard or corrupted item to continue stacking");
        System.out.println(lightRuler());
        System.out.println("There are multiple ways to play:\n");
        System.out.println("Optional: - Either everyone shares the same build, or each player gets their own build");
        System.out.println("Optional: - You can also choose to only allow one type of white/green/yellow/red and choose corrupt it w/o having another item of the same rarity");
        System.out.println("\t eg: If your white item is \"Lens-Maker's Glasses\" then that run your allowed to corrupt the Lense maker glasses");
        System.out.println("\t\t but you do not get another white item, and you cannot roll for another corrupted white item");
        System.out.println(lightRuler());
        System.out.println("GOOD LUCK!");
        System.out.println(heavyRuler());
    }

    // Deviders
    static public String lightRuler() { return "--------------------------------------------"; }
    static public String lightShortRuler() { return "----------------------";}
    static public String heavyRuler() { return "============================================"; }
    static public String heavyShortRuler() { return "======================"; }
}