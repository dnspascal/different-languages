#include<iostream>
using namespace std;
int main(){
    typedef double wages;
    wages  hourly,weekly,monthly;
    using  SI = string;
    using sales_item= string;
    sales_item soap,clothes,electronics, services;
     SI food;
     SI pockects;
     SI biscuits;
     SI cosmetics;
     SI others;
     int val1=0;
     int val2=4;
   int &ci=val1;
     auto item=val1+val2;
     decltype(ci) x=2;
    return 0;
}
