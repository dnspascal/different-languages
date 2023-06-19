#include<iostream>
using namespace std;
int main(){
    const string hexdigits("0123456789ABCDEF");
    cout<<"enter the numbers from 0 to 15\n"
        <<"after you finished press enter"
        <<endl;
        string::size_type n;
        string result;
        while(cin>>n){
        if(n<hexdigits.size())
        result=hexdigits[n];
        cout<<result<<endl;


        }
             return 0;
}