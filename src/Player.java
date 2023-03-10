import java.io.File;
import java.io.FileNotFoundException;
import java.util.EnumMap;
import java.util.Scanner;

public class Player {
    public int ID;

    private EnumMap<Item, String> items = new EnumMap<>(Item.class);

    Player(int id) {
        ID = id;
        items.put(Item.White, "White");
        items.put(Item.Green, "Green");
        items.put(Item.Red, "Red");
        items.put(Item.Yellow, "Yellow");
        items.put(Item.Orange, "Orange");
        items.put(Item.Blue, "Blue");
        items.put(Item.Blue_E, "Blue_E");
        items.put(Item.Purple_W, "PW");
        items.put(Item.Purple_G, "PG");
        items.put(Item.Purple_R, "PR");
        GenerateItems();
    }

    // Getters
        public String GetWhite(){return items.get(Item.White);}
        public String GetGreen(){return items.get(Item.Green);}
        public String GetRed(){return items.get(Item.Red);}
        public String GetYellow(){return items.get(Item.Yellow);}
        public String GetOrange(){return items.get(Item.Orange);}
        public String GetBlue(){return items.get(Item.Blue);}
        public String GetBlueE(){return items.get(Item.Blue_E);}
        public String GetPurpleW(){return items.get(Item.Purple_W);}
        public String GetPurpleG(){return items.get(Item.Purple_G);}
        public String GetPurpleR(){return items.get(Item.Purple_R);}
    // Setters
    public void SetWhite(String newItem) {
        items.remove(Item.White);
        items.put(Item.White, newItem);
    }
    public void SetGreen(String newItem) {
        items.remove(Item.Green);
        items.put(Item.Green, newItem);
    }
    public void SetRed(String newItem) {
        items.remove(Item.Red);
        items.put(Item.Red, newItem);
    }
    public void SetYellow(String newItem) {
        items.remove(Item.Yellow);
        items.put(Item.Yellow, newItem);
    }
    public void SetOrange(String newItem) {
        items.remove(Item.Orange);
        items.put(Item.Orange, newItem);
    }
    public void SetBlue(String newItem) {
        items.remove(Item.Blue);
        items.put(Item.Blue, newItem);
    }
    public void SetBlueE(String newItem) {
        items.remove(Item.Blue_E);
        items.put(Item.Blue_E, newItem);
    }
    public void SetPurpleW(String newItem) {
        items.remove(Item.Purple_W);
        items.put(Item.Purple_W, newItem);
    }
    public void SetPurpleG(String newItem) {
        items.remove(Item.Purple_G);
        items.put(Item.Purple_G, newItem);
    }
    public void SetPurpleR(String newItem) {
        items.remove(Item.Purple_R);
        items.put(Item.Purple_R, newItem);
    }
    // Other Functions

    public String GetInfo() {
        String info = "";

        info += "Player: " + ID + "\n";
        info += "\tWhite: " + GetWhite() + "\n";
        info += "\tGreen: " + GetGreen() + "\n";
        info += "\tRed: " + GetRed() + "\n";
        info += "\tYellow: " + GetYellow() + "\n";
        info += "\tOrange: " + GetOrange() + "\n";
        info += "\tBlue: " + GetBlue() + "\n";
        info += "\tBlue Equipment: " + GetBlueE() + "\n";
        info += "\tPurple (White): " + GetPurpleW() + "\n";
        info += "\tPurple (Green): " + GetPurpleG() + "\n";
        info += "\tPurple (Red): " + GetPurpleR() + "\n";

        return info;
    }

    public void SetNoPuple() {
        SetPurpleG("");
        SetPurpleR("");
        SetGreen("");
    }

    public void SetOneEquipment() {
        if (Helper.RandInt(1, 2) % 2 == 0){
            SetBlueE("");
        }
        else {SetOrange("");}
    }

    public void SetNoLunar() {
        SetBlue("");
        SetBlueE("");
    }

    public void GenerateItems(){
        
        File file = new File("Items\\White.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numWhite); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetWhite(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open White.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Green.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numGreen); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetGreen(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Green.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Red.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numRed); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetRed(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Red.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Yellow.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numYellow); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetYellow(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Yellow.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Orange.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numOrange); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetOrange(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Orange.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Blue.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numBlue); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetBlue(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Blue.txt");
            e.printStackTrace();
        }

        file = new File("Items\\BlueEquipment.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numBlueE); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetBlueE(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open BlueEquipment.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_White.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numPurpW); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetPurpleW(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_White.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_Green.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numPurpG); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetPurpleG(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_Green.txt");
            e.printStackTrace();
        }

        file = new File("Items\\Purple_Red.txt");
        try (Scanner sc = new Scanner(file)) {
            String item = "";
            for (int i = 0; i < Helper.RandInt(1, Helper.numPurpR); i++){
                item = sc.nextLine();
            }
            sc.close();
            SetPurpleR(item);

        } catch (FileNotFoundException e) {
            System.out.println("Could not open Purple_Red.txt");
            e.printStackTrace();
        }
    }

}
