
import org.junit.Assert;
import org.junit.Test;

public class BackPackTest {

	@Test
	public void testBackPack_Solution() {
		int m = 10;
        int n = 3;
       
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
		int[][]result = BackPack.BackPack_Solution(m, n, w, p);
		int[]re0 = new int[11];
		int[]re1 = new int[11];
		int[]re2 = new int[11];
		int[]re3 = new int[11];
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]);
				if(j==result[0].length-1)
					System.out.println("n");
			}
			
		}
		System.out.println(result.length);
		System.out.println(result[0].length);

		for(int i=0; i<11; i++) {
			re0[i] = result[0][i];
			System.out.print(re0[i]);
		}
		for(int l=0; l<11; l++) {
			re1[l] = result[1][l];
			System.out.print(re1[l]);
		}
		for(int j=0; j<11; j++) {
			re2[j] = result[2][j];
			System.out.print(re2[j]);
		}
		for(int k=0; k<11; k++) {
			re3[k] = result[3][k];
			System.out.print(re3[k]);
		}
		
		
		
		
		int[]ac0 = {0,0,0,0,0,0,0,0,0,0,0};
		int[]ac1 = {0,0,0,4,4,4,4,4,4,4,4};
		int[]ac2 = {0,0,0,4,5,5,5,9,9,9,9};
		int[]ac3 = {0,0,0,4,5,6,6,9,10,11,11};
		
		Assert.assertArrayEquals(re0, ac0);
		Assert.assertArrayEquals(re1,ac1);
		Assert.assertArrayEquals(re2, ac2);
		Assert.assertArrayEquals(re3, ac3);
	}		

}
