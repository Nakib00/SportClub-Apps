/*
#include<iostream>
using namespace std;

struct ComplexNo{
    int real, img;

    void setComplexNo(){
        cout<<"Enter real value: "; cin>>real;
        cout<<"Enter imaginary value: "; cin>>img;
    }
    void showComplexNo(){
        cout<<real<<(img<0?"":"+")<<img<<"i"<<endl;
    }
    ComplexNo add(ComplexNo c){
        ComplexNo temp;
        temp.real = real + c.real;
        temp.img = img + c.img;
        return temp;
    }
};

void doSome(int y){
    cout<<"y="<<y<<endl;
}

void doSome2(int& y){
    cout<<"y="<<y<<endl;
}
int main(){
    int x=12;
    doSome(x); //doSome(23);

    ComplexNo c1, c2, c3;
    c1.setComplexNo();      c1.showComplexNo();

    c2.setComplexNo();      c2.showComplexNo();

    c3 = c1.add(c2);        c3.showComplexNo();
}
*/

//-----------------------------------------------------------
#include<iostream>
using namespace std;
struct Person{
	//fields...

	//void buyFood(){cout<<"Food is bought."<<endl;}
	Person buyFood(){
		cout<<"Food is bought."<<endl;
		//need to return whoever is the client of the method call
		return *this;
	}

	Person arrangeLivingRoom(){
		cout<<"Living room is arranged."<<endl;
		return *this;
	}

	Person greetGuest(){
		cout<<"Guests are greeted."<<endl;
		return *this;
	}

	void serveFood(){
		cout<<"Food is served."<<endl;
	}
};

int main(){
	Person babu, shafiq;

	/*
	babu.buyFood();			//during executuin, 'this' will point to babu
	//...				//at this point 'this' will be NULL
	babu.arrangeLivingRoom();	//during executuin, 'this' will point to babu
	babu.greetGuest();		//during executuin, 'this' will point to babu
	babu.serveFood();		//during executuin, 'this' will point to babu

	shafiq.buyFood();		//during executuin, 'this' will point to shafiq
	*/

	babu.buyFood().arrangeLivingRoom().greetGuest().serveFood(); //error
		//void.arrangeLivingRoom().greetGuest().serveFood();
	return 0;

}
