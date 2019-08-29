
import org.junit.*;

import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void test_findMax(){
        Finder find = new Finder();
        int[] i = new int[]{1,17,19,13,41,26};
        int[] j = new int[]{-1,-2,-3,-4,9};
        int[] k = new int[]{4,4,4,4,4,4};
        int max1 = find.findMax(i);
        int max2 = find.findMax(j);
        int max3 = find.findMax(k);

        //test
        assertEquals(max1,41);
        assertEquals(max2, 9);
        assertEquals(max3,4);

    }

    @Test
    public void test_FindMin(){
        Finder find = new Finder();
        int[] i = new int[]{7,1,433,23,45,67,78};
        int[] j = new int[]{-1,-321,432,123};
        int[] k = new int[]{3,3,5,9,11,43};
        int min1 = find.findMin(i);
        int min2 = find.findMin(j);
        int min3 = find.findMin(k);
        //test
        assertEquals(min1,1);
        assertEquals(min2,-321);
        assertEquals(min3,3);
    }

    @Test(expected = NullPointerException.class)
    public void test_findnullMax(){
        Finder find = new Finder();
        int[] i;
        i = null;
        int max1 = find.findMax(i);

    }

    @Test(expected = NullPointerException.class)
    public void test_findemptyMax(){
        Finder find = new Finder();
        int[] j = new int[]{};
        int max2 = find.findMax(j);
    }
    @Test(expected = NullPointerException.class)
    public void test_findnullMin(){
        Finder find = new Finder();
        int[] i;
        i = null;
        int min1 = find.findMin(i);
    }
    @Test(expected = NullPointerException.class)
    public void test_findemptyMin(){
        Finder find = new Finder();
        int[] j = new int[]{};
        int min2 = find.findMin(j);
    }

}