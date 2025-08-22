#include<iostream>
using namespace std;

int x = 10;


int eat(){
x--;
return 0;
}

int display(){
cout<<x<<endl;
return 0;
}
int main(){
display();
eat();
display();
return 0;
}
