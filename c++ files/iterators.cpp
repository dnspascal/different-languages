#include<iostream>
#include<cctype>
using namespace std;
int main(){
    string s("mgaya denis");
    if(s.begin()!=s.end()){
    for(auto it=s.begin(); it!=s.end() && !isspace(*it); ++ it){
        *it=toupper(*it);
    }
        cout<<s;
    }
    return 0;
}