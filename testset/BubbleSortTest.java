
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int arr[]= {1,6,2,2,5};
		int actuals[] = {1,2,2,5,6};
		int result[] = BubbleSort.BubbleSort(arr);
		
		Assert.assertArrayEquals(result, actuals);
	}
}
