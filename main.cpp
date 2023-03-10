# include <iostream>
# include <fstream>
# include <vector>
# include "helpers.cpp"

using namespace std;

int main (){
	
    print_devider();
    cout << "Welcome to the Shrine of Order Challenge" << endl;
	
    rules();
	
	int numPlayers = 0;
	vector <Player> PCs;
	
	cout << "How many players are playing?" << endl;
	cin >> numPlayers;
	
	PCs.push_back(new Player);
	PCs.pop_back();
	
    return 0;
}