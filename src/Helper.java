import java.util.Random;

public class Helper {
    
    
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