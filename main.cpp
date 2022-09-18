# include <iostream>
# include <fstream>
# include <string>
# include <vector>
# include <stdio.h>  
# include <stdlib.h>
# include <time.h>


using namespace std;

void rules(){
    cout << "This challenge must be played using the artifact of Command" << endl;
    cout << "Before each item is chosen, if the color of the item had not been rolled for, then roll for an item of that type." << endl;
    cout << "If it has been, then you are only aloud to have equipment of that item." << endl;
    cout << "Each player can either roll their individual items, or the item limitation can be shared between tthe entire team." << endl;
    cout << endl;
    cout << "If a purple item is chosen, then at that point, the player with the limitation can choose to either get the corrupted purple item or the corisponging color" << endl;
    cout << "\t eg: If a player gets Tougher times as their white item, then Lost Seer's Lenses (Lens-Maker's Glasses) as their corrupted white item. The next white item can either be Tougher times or Lost Seer's Lenses (Lens-Maker's Glasses) (player's choice)" << endl;
    cout << "carefull, some items are dud items. The last thing you want is rusted/encrusted keys as you can only stack those when they come up" << endl;
    cout << "GOOD LUCK!" << endl;
}

int main (){
    int choice = 0;
    string input = "";
    string color = "";
    ifstream items;
    vector<string> list;
    
    srand(time(NULL));
    
    cout << "Rule of the Challenge" << endl;
    
    rules();
    
    do {
        cout << "What type of item are you spinning for?" << endl;
        cout << "1 - White" << endl;
        cout << "2 - Green" << endl;
        cout << "3 - Red" << endl;
        cout << "4 - Yellow" << endl;
        cout << "5 - Blue" << endl;
        cout << "6 - Blue Equipment" << endl;
        cout << "7 - Corrupted White" << endl;
        cout << "8 - Corrupted Green" << endl;
        cout << "9 - Corrupted Red" << endl;
        cout << "--------------------" << endl;
        cout << "0 - Exit program" << endl;
        
        getline (cin,input);
        choice = input[0] - 48; // bias as this returs the ascii numbers for 0-8 which are 48-57
        
        switch (choice){
            case 0:
                cout << "Closing Program" << endl;
                return 0;
                break;
            case 1:
                color = "White";
                items.open("White.txt");
                break;
            case 2:
                color = "Green";
                items.open("Green.txt");
                break;
            case 3:
                color = "Red";
                items.open("Red.txt");
                break;
            case 4:
                color = "Yellow";
                items.open("Yellow.txt");
                break;
            case 5:
                color = "Blue";
                items.open("Blue.txt");
                break;
            case 6:
                color = "Blue Equipment";
                items.open("BlueEquipment.txt");
                break;
            case 7:
                color = "Corrupted White";
                items.open("Purple_White.txt");
                break;
            case 8:
                color = "Corrupted Green";
                items.open("Purple_Green.txt");
                break;
            case 9:
                color = "Corrupted Red";
                items.open("Purple_Red.txt");
                break;
            default:
                cout << "Error unknown entry" << endl;
                return 404;
        }

        if (items.is_open()){
            while (getline(items,input))
            {
                list.push_back(input);
            }
            
            int rand_num = rand() % list.size();
            
            cout << "your random " << color << " item is : " << list[rand_num] << endl;
            
            while (list.size() != 0)
            {
                list.pop_back();
            }
            
            items.close();
        }
        else {
            cout << "File did not open" << endl;
            return 301;
        }
        
        cout << "Press enter to continue..." << endl;
        getline (cin, input);
        
    }while (choice != 0);
    return 0;
}