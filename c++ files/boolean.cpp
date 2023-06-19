#include<iostream>
using namespace std;
int main(){
    bool denis;
     denis=(1>2 || 3>1);
     denis=denis && (3>4);
     denis=denis ||(2>1);
     cout<<denis;
     constexpr unsigned sz=42;
     return 0;

}