# include <iostream>
# include <fstream>
# include <string>
# include <vector>
# include <stdio.h>  
# include <stdlib.h>
# include <time.h>


using namespace std;

int main (){
    int choice = 0;
    string input = "";
    string color = "";
    ifstream items;
    vector<string> list;
    
    srand(time(NULL));
    
    do {
        cout << "What type of item are you spinning for?" << endl;
        cout << "1 - White" << endl;
        cout << "2 - Green" << endl;
        cout << "3 - Orange" << endl;
        cout << "4 - Red" << endl;
        cout << "5 - Yellow" << endl;
        cout << "6 - Purple" << endl;
        cout << "7 - Blue" << endl;
        cout << "8 - Blue Equipment" << endl;
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
                color = "Orange";
                items.open("Orange.txt");
                break;
            case 4:
                color = "Red";
                items.open("Red.txt");
                break;
            case 5:
                color = "Yellow";
                items.open("Yellow.txt");
                break;
            case 6:
                color = "Purple";
                items.open("Purple.txt");
                break;
            case 7:
                color = "Blue";
                items.open("Blue.txt");
                break;
            case 8:
                color = "Blue Equipment";
                items.open("BlueEquipment.txt");
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