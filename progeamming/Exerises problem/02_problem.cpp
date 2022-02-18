#include<bits/stdc++.h>
#include<iostream>
using namespace std;

class Date{
    int day,year;
    string mounth;
    public:

    void setJoinedDate(){
        cout << "Enter Date: "; cin >> day;
        cout << "Enter Mounth: "; cin >> mounth;
        cout << "Enter Year: "; cin >> year;
    }

    int getyear(){
        return year;
    }

    string getmonth(){
        return mounth;
    }

};

class Employee{
    int employeeID;
    string name;
    string department;
    Date dateOfJoining;
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
    void setemployeejoindate(){
        dateOfJoining.setJoinedDate();
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
// Check year
    bool operator==(int year){
        if(dateOfJoining.getyear()==year){
            return true;
        }else{
            return false;
        }
    }
//check Mounth
    bool operator==(string mounth){
        if(dateOfJoining.getmonth()==mounth){
            return true;
        }else{
            return false;
        }
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
    cout<<"-----Enter Joined date------"<<endl;  e.setemployeejoindate(); 
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

    cout<<"Mr./Ms. "<<e1.getname()<<endl;

    if(e1==2017 && e1=="may"){
        cout<<"joined the company in may 2017."<< endl;
    }else{
        cout<<"did NOT join the company in may 2017."<< endl;
    }

return 0;
}