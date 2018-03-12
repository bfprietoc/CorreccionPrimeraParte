/*Al ejecutarse este programa, retorna el tiempo estimado por cada instrucción (considerando sumas y productos) para la
multiplicación de dos matrices en java. Se puede evidenciar que cada instrucción demora milesimas de segundo (para n=400) tiene
un promedio de 9.18125x10^-4 seg en un deskop; mientras que en ide one muestra que cada instrucción (para n=400) demora 
7.624999999999998x1094^(-4) seg, es decir que es más ràpido allí
*/

package multiplicacion.de.matrices;
public class MultiplicacionDeMatrices {

    public static void main(String[] args) 
    {
        int h=2;
	while(h<300)
	{
	    
	    
	double cuenta=0;
        for(int u=0;u<10;++u)
        {
        int A[][];
        int B[][];
        int C[][];
        A= new int[h][h];
        B= new int[h][h];
        C= new int[h][h];
        int k=h;
        int m=h;
        int n=h;
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
        double TInicial[];
        double Tfinal[];
        TInicial=new double[n*n];
        Tfinal=new double[n*n];
        double tiempo;
        int y=0;
        TInicial[y]=System.currentTimeMillis();
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
        Tfinal[y] = System.currentTimeMillis();
        tiempo= Tfinal[y]-TInicial[y];
        cuenta+=tiempo/(n*n);
        
        }
        System.out.println("tiempo promedio= "+ cuenta/10);
		h+=10;
	}
    }
}
