/*
#include <iostream>
using namespace std;

struct ComplexNo
{
    int real, img;

    void setComplexNo()
    {
        cout << "Enter real value: ";
        cin >> real;
        cout << "Enter imaginary value: ";
        cin >> img;
    }
    void showComplexNo()
    {
        cout << real << (img < 0 ? "" : "+") << img << "i" << endl;
    }
    ComplexNo add(ComplexNo c)
    {
        ComplexNo temp;
        temp.real = real + c.real;
        temp.img = img + c.img;
        return temp;
    }
};

int main()
{
    ComplexNo c1, c2, c3;
    cout<<"Enter for C1"<<endl;
    c1.setComplexNo();
    c1.showComplexNo();

    cout<<"Enter for C2"<<endl;
    c2.setComplexNo();
    c2.showComplexNo();

    cout<<"Add C1 and C2"<<endl;
    c3 = c1.add(c2);
    c3.showComplexNo();
}
*/

// Function call (pass-by-value, pass-by-reference, pass-by-address)
#include<bits/stdc++.h>
#include<iostream>
using namespace std;

//pass-by-value
int add(int a){
    a = a+1;
    return a;
}
//pass-by-referenc
int dosum(int &a){
    a=a+2;
    return a;
}
//pass-by-address
void swap(int *a, int *b){
    int tamp = *a;
    *a=*b;
    *b=tamp;
}

int main(){
    int x=10,h,l,k=20;

//pass-by-value
    cout<<"Pass by value"<<endl;
    cout<<"Before add function the value of x is : "<<x<<endl;

    h = add(x);

    cout<<"Return value of the function : "<<h<<endl;
    cout<<"After adding x value was not changed in pass by value : "<<x<<endl;

//pass-by-referenc
    cout<<"Pass by reference"<<endl;
    cout<<"Before add function the value of k is : "<<k<<endl;

    l = dosum(k);

    cout<<"Return value of the function : "<<l<<endl;
    cout<<"After adding x value was changed in pass by referenc : "<<k<<endl;

//pass-by-address
    cout<<"Pass by address"<<endl;
    int z=100,o=200;

    cout<<"Before swap, value of z : "<<z<<endl;
    cout<<"After swap, value of o : "<<o<<endl;
    swap(&z, &o);
    cout<<"After swap, value of z : "<<z<<endl;
    cout<<"After swap, value of o : "<<o;

return 0;
}