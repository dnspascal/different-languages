#include<iostream>

using namespace std;
int main(){
    //referencing the pointer
    int i=1024;
    int *p;
   int *&r=p;
   r=&i;
   cout<<*p<<endl<<*r<<endl<<i<<endl;
   //dereferencing the int i using its referencing r
   *r=0;
   cout<<i<<endl;

   //constants
   const int buffersize=521;
   extern const int bufferlength;
   // referencing to the constants
   //constant reference is the reference to the constant
   const int v1=1024;
   const int &e=v1;
// binding the constant to reference to the object of different type
// A reference to the constant may refer to the object which is not constant 
 double dval=3.14;
 const int &d=dval;
 cout<<d<<endl;
 //The constant pointer can be used to point the constant object
 const double x=3.14;
 const double *ptr=&x;
 // constant point as the object
 const double *const pip=&x;

 


    return 0;
}