package testArray;

import com.zeroten.common.util.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testArray {
    @Test
    public void testSort() {
        int[] arr1 = {1,3,2,5,4};
        int[] arr2 = {1,2,3,4,5};
        Assert.assertEquals(Arrays.toString(arr2), Arrays.toString(ArrayUtils.sort(arr1)));
    }
}
