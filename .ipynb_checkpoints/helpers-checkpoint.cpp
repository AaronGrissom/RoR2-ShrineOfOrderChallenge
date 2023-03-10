# ifndef HELPER_CPP
# define HELPER_CPP

# include <fstream>
# include <iostream>
# include <string>
# include <limits.h>

using namespace std;

void print_devider(){
	cout << "******************************************************" << endl;
}

void rules(){
    print_devider();
    cout << "Rules of the Challenge" << endl << endl;
	
	cout << "There are 2 ways to paly, either each player has a set of items, or every player has the same set of items" << endl << endl;
	
	cout << "1) This challenge must be played using the artifact of Command" << endl;
    cout << "2) Each player is allowed access to only 1 rarity of item as though they activated the shrine of order" << endl;
		cout << "\tThe tiem rarities are: " << endl;
			cout << "\t\t White, Green, Yellow, Blue, Red" << endl;
			cout << "\t\t Purple-White, Purple-Green, Purple-Red" << endl;
			cout << "\t\t Equipment, Blue-Equipment" << endl << endl;
	
    cout << "3) Players are not allow to stack an item not on their list. Ex: if the player's white item is \"Lens-Maker's Glasses\" and their white-pruple item is \"Needletick(Tri-Tip Dagger)\" then the player cannot select the Tri-Tip Dagger unrill they recieve their first purple-white item to corrupt their Tri-tip Dagger" << endl;
		cout << "\t (in other words, players cannot stack their corrupted items as standard items and then corrupt them all at once. They must wait for their first corrupted item before they can continue stacking it." << endl;
	
    cout << "4) When players have both standard items and corrupted items of the same rarity already selected (eg \"Lens-Maker's Glasses\"  and \"Needletick(Tri-Tip Dagger)\") then when choosing an item of the rarity they can choose either the standard item or corrupted item to continue stacking" << endl;
	cout << "GOOD LUCK!" << endl;
    print_devider();
}

int randomInt(int min = INT_MIN, int max = INT_MAX) {

	// https://www.digitalocean.com/community/tutorials/random-number-generator-c-plus-plus
	
	srand(time(NULL));
	
	// Providing a seed value
	srand((unsigned) time(NULL));
	
	// Generating random value
	int range = max - min + 1;
	
	return min + (rand() % range);
	
}

class Player {
	
	public:
		// constructor
		Player(){
			if (items.is_open()){
				cout << "Test Passed" << endl;
				items.close();
			} else {
				cout << "Error: Failed to Read File Red.txt" << endl;
			}
			
			Red = "Red";
		}
	
	// private Variables
	private:
		fstream items;
		
		// To Hold what the players will have as items
		string Red;
		string Green;
		string White;
		string Yellow;
		string Orange;
	
		string Purple_Red;
		string Purple_Green;
		string Purple_White;
	
		string BlueEquipment;
		string Blue;
	
	
	
	// Public Variables
	// constructor
	// setter
	// getter
};

# endif