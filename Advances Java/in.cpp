#include <iostream>
using namespace std;
void fun(int x){
    if(x>0){
        fun(--n);
        cout<<n<<endl;
        fun(--n);
    }
    int main(){
        fun(3);
    }

}