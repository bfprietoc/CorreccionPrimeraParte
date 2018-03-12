/*Acá se encuentra el código del punto 2. hecho en Java.

Para que valor de n, el programa hace overflow?

Resultados:

El overflow se produce en el momento que para un entero n, f(n+1) es mayor que el rango de cada tipo de entero. Es decir, por
ejemplo un byte tiene un rango desde -128 a 127; por tanto hará overflow en 128 ya que excede o desborda el uso de la cantidad
de memoria asignada.

overflow en:
	Para el tipo de entero byte tiene overflow en n=12.
	Para el tipo de entero short tiene overflow en n=24.
	Para el tipo de entero int tiene overflow en n=47.
	Para el tipo de entero long tiene overflow en n=93.
*/

package fibonacci;

/**
 *

 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        long n=5000;
	long anm1=0;
	long an=1;
	long an1;
	long a=1;
	while(a<n)
	{
		an1=an+anm1;
		anm1=an;
		an=an1;	
		a=a+1;
		if(an1<0)
		{
			System.out.println("overflow in n="+a);
			break;	
		}
	}
    }
    
}
