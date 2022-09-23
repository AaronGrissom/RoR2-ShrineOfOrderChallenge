# include <iostream>
# include <fstream>
# include <string>
# include <vector>
# include <stdio.h>  
# include <stdlib.h>
# include <time.h>
# include <ctype.h>


using namespace std;

void rules(){
    cout << "******************************************************" << endl;
    cout << "Rule of the Challenge" << endl;
    cout << "This challenge must be played using the artifact of Command" << endl;
    cout << "Before each item is chosen, if the color of the item had not been rolled for, then roll for an item of that type." << endl;
    cout << "If it has been, then you are only aloud to have equipment of that item." << endl;
    cout << "Each player can either roll their individual items, or the item limitation can be shared between tthe entire team." << endl;
    cout << endl;
    cout << "If a purple item is chosen, then at that point, the player with the limitation can choose to either get the corrupted purple item or the corisponging color" << endl;
    cout << "\t eg: If a player gets Tougher times as their white item, then Lost Seer's Lenses (Lens-Maker's Glasses) as their corrupted white item. The next white item can either be Tougher times or Lost Seer's Lenses (Lens-Maker's Glasses) (player's choice)" << endl;
    cout << "carefull, some items are dud items. The last thing you want is rusted/encrusted keys as you can only stack those when they come up" << endl;
    cout << "GOOD LUCK!" << endl;
    cout << "******************************************************" << endl;
}

int main (){
    char choice = 'q';
    string input = "";
    string color = "";
    ifstream items;
    vector<string> list;
    bool skip = false;
    
    srand(time(NULL));
    
    cout << "******************************************************" << endl;
    cout << "Welcome to the Shrine of Order Challenge" << endl;
    
    rules();
    
    do {
        cout << "What type of item are you spinning for?" << endl;
        cout << "W - White (Common)" << endl;
        cout << "G - Green (Uncommon)" << endl;
        cout << "R - Red (Legendary)" << endl;
        cout << "O - Orange (Equipment)" << endl;
        cout << "Y - Yellow (Boss)" << endl;
        cout << "B - Blue (Lunar)" << endl;
        cout << "1 - Blue Equipment (Lunar Equipment)" << endl;
        cout << "2 - Corrupted White (Common Void)" << endl;
        cout << "3 - Corrupted Green (Uncomon Void)" << endl;
        cout << "4 - Corrupted Red (Legendary Void)" << endl;
        cout << "--------------------" << endl;
        cout << "0 - Exit program" << endl;
        cout << "? - rules" << endl;
        
        getline(cin,input);
        choice = toupper(input[0]);
        
        switch (choice){
            case '0':
                cout << "Closing Program" << endl;
                return 0;
                break;
            case 'W':
                color = "White";
                items.open("White.txt");
                break;
            case 'G':
                color = "Green";
                items.open("Green.txt");
                break;
            case 'R':
                color = "Red";
                items.open("Red.txt");
                break;
            case 'Y':
                color = "Yellow";
                items.open("Yellow.txt");
                break;
            case 'O':
                color = "Orange";
                items.open("Orange.txt");
                break;
            case 'B':
                color = "Blue";
                items.open("Blue.txt");
                break;
            case '1':
                color = "Blue Equipment";
                items.open("BlueEquipment.txt");
                break;
            case '2':
                color = "Corrupted White";
                items.open("Purple_White.txt");
                break;
            case '3':
                color = "Corrupted Green";
                items.open("Purple_Green.txt");
                break;
            case '4':
                color = "Corrupted Red";
                items.open("Purple_Red.txt");
                break;
            case '?':
                rules();
                break;
            default:
                cout << "-------------------------------------------------" << endl;
                cout << "---------------Error unknown entry---------------" << endl;
                cout << "-------------------------------------------------" << endl;
                skip = true;
        }

        if (items.is_open()){
            while (getline(items,input))
            {
                list.push_back(input);
            }
            
            int rand_num = rand() % list.size();
            
            cout << "****************************************" << endl;
            cout << "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" << endl;
            cout << "your random " << color << " item is : " << list[rand_num] << endl;
            cout << "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" << endl;
            cout << "****************************************" << endl;
            
            while (list.size() != 0)
            {
                list.pop_back();
            }
            
            items.close();
        }
        else {
            if (choice != 'r' && choice != '?' && !skip){
                cout << "File did not open" << endl;
                return 404;
            }
            skip = false;
        }        
    }while (choice != 0);
    return 0;
}