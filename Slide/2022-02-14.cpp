#include<iostream>
using namespace std;

int arr4[20];   //data segment

int main(){
    int arr[15]={11,22,33,44,55};

    //Possibility-1: 11,22,33,44,55,0,0,0,....0
    //Possibility-2: 11,22,33,44,55,garbage,g,g,....g
    //Possibility-3: 11,22,33,44,55,11,22,33,44,55,11,22,33,44,55 //repeated

    int arr2[]={11,22,33,44,55};    //initializer list
    int arr3[10000];                   //stack


    cout<<"arr="<<arr<<endl;
    cout<<"arr[2]="<<arr[2]<<endl;
    cout<<"*(arr+2)="<<*(arr+2)<<endl;

    cout<<"arr2[7]="<<arr2[7]<<endl;
    cout<<"*(arr2+7)="<<*(arr2+7)<<endl;

    cout<<"arr[7]="<<arr[7]<<endl;
    cout<<"arr3[12000]="<<arr3[12000]<<endl;
    return 0;
}

