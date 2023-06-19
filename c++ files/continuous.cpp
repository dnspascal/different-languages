#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> v;
    const vector<int> cv;
    auto it1=v.begin();
    auto it2=cv.begin();
    auto it3=v.cbegin();    // it has iterator type const_iterator
        
        signed int x;
        for(x=-20;x<=20;++x){
            cout<<x<< '\t';
            bool; // boolean data
            char;// characters
            wchar_t; // wide character  8 bits
            char16_t;// uncode character 16 bits (Unicode is a
                           //standard for representing characters used in essentially any natural language)
            char32_t; // uncode character 16 bits
            short; // short interger 16 bits
            int; //  short interger 16 bits
            long; // long interger 32 bits
             long long; // long interger 64 bits
            float; // single precison floating point
            double; // double precison floating point
            long double; // extended precision floating point
        
        bool b=42;
        cout<<b;
        }
    return 0;
} 