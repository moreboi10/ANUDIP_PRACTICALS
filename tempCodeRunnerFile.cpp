#include<iostream>
using namespace std;
int main() {
    // star pattern 
   for(int i=1; i<6 ; i++)
   {
    for(int j=1 ; j<=i ; j++)
    {
        cout<<j<<" ";
    }
    cout<<endl;
   }
   
   for(int i=5; i>0 ; i--)
   {
    for(int j=1; j<i ; j++)
    {
        cout<<j<<" ";
    }
    cout<<endl;
   }

    return 0;
}