/**
 * 
 */

/**
 * @author konra
 *
 */
import java.util.Random;
public class PROYECTO_PRIMERTRIMESTRE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(); 
		int[][] mapa = new int[10][10];
		int aux;
		int j = 0;
		int k=0;
		int x=0;
		int cimas=k;
		int masalta=x;
		Random aleatorio = new Random();
		for (int i = 0; i < mapa.length; i++) {
			for ( j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = j;
				aux= aleatorio.nextInt(10);
				mapa[i] [j] = aux;
					System.out.print(mapa[i][j] + " ");
			}
				System.out.println("");{
	}
}
		for( int i=1; i<9-1; i++) {
			for( j=1; j<9-1; j++) {
		if(mapa[i][j]>mapa[i-1][j-1] && mapa[i][j]>mapa[i-1][j] && mapa[i][j]>mapa[i-1][j+1] && mapa[i][j]>mapa[i][j-1] && mapa[i][j]>mapa[i][j+1] && mapa[i][j]>mapa[i+1][j-1] && mapa[i][j]>mapa[i+1][j] && mapa[i][j]>mapa[i+1][j+1]) {
			cimas++;
		}
	}
}
		for( int i=1; i<9-1; i++) {
			for( j=1; j<9-1; j++) {
			if(cimas==9) {
				masalta++;
			}
			}
		}
		
		
                

  	System.out.println("El mapa tiene"  +cimas +"cimas");
 	 System.out.println("de las cuales"+masalta+"tienen la maxima altura");
	}
}
