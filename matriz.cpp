/*Al ejecutarse este programa, retorna el tiempo estimado por cada instrucción (considerando sumas y productos) para la
multiplicación de dos matrices de 2x2 hasta 300x300 en c++.*/

#include <iostream>
#include <ctime> 
using namespace std;

int main()
{
	int h=2;
	while(h<300)
	{
		
	
    double cuenta=0;
    for(int u=0;u<10;u++)
    {
	
		int A[h][h], B[h][h], C[h][h];
    	int k=h;
		int m=h;
		int n=h;
		unsigned t[n*n], td[n*n];
    
    	for(int i=0; i<k; ++i)
    	{
    		for(int j=0; j<m; ++j)
        	{
            	A[i][j]=1;
       		}
		}
    	for(int i=0; i<m; ++i)
    	{
    		for(int j=0; j<n; ++j)
        	{
				B[i][j]=2;
        	}
		}   
    	for(int i=0; i<k; ++i)
    	{
    		for(int j=0; j<n; ++j)
    		{
    			C[i][j] = 0;
			}
		}	
		
		int y=0;
		t[y]=clock();
    	for(int i=0; i<k; ++i)
   		{
    		for(int j=0; j<n; ++j)
    		{
    			for(int z=0; z<m; ++z)
    			{
    				C[i][j] += A[i][z] * B[z][j];
				}
			}
		}
		td[y]=clock();
		double time= (double(td[y]-t[y])/CLOCKS_PER_SEC);
		cuenta+=time/(n*n);
		//cout<<"tiempo= "<< time/(n*n);
	}	
	
	
	cout<<"tiempo promedio= "<<h<<" "<< cuenta/10<<endl;
	h+=10;
	}
	
	
    return 0;
}
