#include<bits/stdc++.h>
#include<iostream>
using namespace std;

class Address{
    int houseNo,roadNo,zipcode;
    string street,thana,district;
    public:

// default constructor
    Address(){}

    void setAddress(){
        cout << "Enter houseNo: "; cin >> houseNo;
        cout << "Enter roadNo: "; cin >> roadNo;
        cout << "Enter zipCode: "; cin >> zipcode;
        // cout << "Enter street: "; cin.ignore(); getline(cin, street);
        // cout << "Enter District: "; cin.ignore(); getline(cin, district);
    }

    int getzip(){
        return zipcode;
    }

};

class Employee{
    int employeeID;
    string name;
    string department;
    Address empAddress;
    public:
//constructor for e2
    Employee(int i,string n,string d){
        employeeID = i;
        name = n;
        department = d;
    }
// default constructor
    Employee(){}

// set address
    void setemployee_address(){
        empAddress.setAddress();
    }

// Check zipcode
    bool operator==(int zip){
        if(empAddress.getzip() == zip){
            return true;
        }else{
            return false;
        }
    }

// setter
    void setid(int i){
        employeeID = i;
    }
    void setname(string n){
        name = n;
    }
    void setdepartment(string d){
        department = d;
    }

// Getter
    int getid(){
        return employeeID;
    }
    string getname(){
        return name;
    }
    string getdepartment(){
        return department;
    }

};
// cin operator
istream & operator >> (istream &cin,  Employee &e){
    int x; string n; string d;
    cout<<"Enter Employee ID: ";
    cin>>x; e.setid(x);
    cout<<"Employee Name: ";
    cin>>n; e.setname(n);
    cout<<"Department: ";
    cin>>d; e.setdepartment(d);
    cout<<"-----Enter Address------"<<endl;  e.setemployee_address(); 
    return cin;
};
// cout operator
ostream & operator << (ostream &cout, Employee &e){
    cout<<endl;
    cout<<"Employee ID: "<<e.getid();
    cout<<endl;
    cout<<"Employee Name: "<<e.getname();
    cout<<endl;
    cout<<"Department: "<<e.getdepartment();
    return cout;
};



int main(){
    Employee e1,e2(4161,"S K Day","CSE");

    cout<<"Give input for employee 1: "<<endl;
    cin>>e1;

    cout<<"Complete information of the employees are: "<<endl;
    cout<<"Employee 1"<<e1<<endl<<"Employee 2"<<e2<<endl;

    cout<<"The Employees e1"<<endl;
    if(e1 == 1229){
        cout<<"lives in Bashundhara R/A.";
    }else{
        cout<<"Not lives in Bashundhara R/A.";
    }
return 0;
}