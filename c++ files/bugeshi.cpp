#include <iostream>
#include<string>
using namespace std;
int main(){
string name;
cout<<"enter your name"<<endl;
getline(cin,name);
    while(name.empty()){
         cout<<"enter your name";
         cout<<"\n";
         getline(cin,name);
    }
    cout<<"your name is\t"<<name<<endl;
return 0;
}
