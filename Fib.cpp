/*Acá se encuentra el código del punto 2. Hecho en c++.


Para que valor de n, el programa hace overflow?


Resultados:

	Para el tipo de entero short tiene overflow en n=24.
	Para el tipo de entero int tiene overflow en n=47.
	Para el tipo de entero long tiene overflow en n=47.
	Para el tipo de entero long long tiene overflow en n=93.
	
*/


#include <iostream>

using namespace std;
int main()
{
	short int n=5000;
	short int anm1=0;
	short int an=1;
	short int an1;
	short int a=1;
	//cout<<"Digite n: ";
	//cin>>n;
	cout<<endl;
	while(a<n)
	{
		an1=an+anm1;
		anm1=an;
		an=an1;	
		a=a+1;
		if(an1<0)
		{
			cout<<"overflow in n="<<a;
			break;	
		}
	}
	//cout<<an1;
}
