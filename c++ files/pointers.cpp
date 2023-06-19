#include<iostream>
using namespace std;
int main(){
 // pointer pointing to the other pointer
int i = 1024;
int *p=&i;
int **p2;
int ***p3;
int ****p4;
int *****p5;
   p2=&p;
   p3=&p2;
   p4=&p3;
   p5=&p4;
   cout<<*****p5<<endl
   <<****p4<<endl
   <<***p3<<endl
   <<**p2<<endl
   <<*p;
    return 0;

}