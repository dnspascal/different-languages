#include<iostream>
#include<vector>
using namespace std;
int main(){
    string d;
    vector<string>s1;
    int n;
    cout<<"enter the size vector"<<endl;
    cin>>n;
    cout<<"enter them strings"
        <<endl;
    while(cin>>d){
        s1.push_back(d);
        if(s1.capacity()==5)
        break;
    }
    for(auto c: s1)
    cout<<d<<endl;
    return 0;
    }