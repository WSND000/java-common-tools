package testCheck;

import com.zeroten.common.util.CheckUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestCheck {

    @Test
    public void testIsAnyEmpty() {
        Assert.assertEquals(false, CheckUtils.isAnyEmpty(null,"a","s"));
        Assert.assertEquals(false, CheckUtils.isAnyEmpty(null,null,"s",null,"d","f"));
        Assert.assertEquals(true, CheckUtils.isAnyEmpty("a","s"));
    }

    @Test
    public void testIsEmpty() {
        Object[] arr1 = null;
        Object[] arr2 = new Object[4];
        Object[] arr3 = {1,"a","2",4,"sadasd"};
        Assert.assertEquals(true,CheckUtils.isEmpty(arr1));
        Assert.assertEquals(false,CheckUtils.isEmpty(arr2));
        Assert.assertEquals(false,CheckUtils.isEmpty(arr3));
    }

    @Test
    public void testEquals() {
        String str1 = "hello";
        String str2 = new String("hello");
        Assert.assertEquals(true,CheckUtils.equals("hello","hello"));
        Assert.assertEquals(false,CheckUtils.equals(null,"hello"));
        Assert.assertEquals(true,CheckUtils.equals(null,null));
        Assert.assertEquals(true,CheckUtils.equals(str1,"hello"));
        Assert.assertEquals(false,CheckUtils.equals(str2,"hello"));
        Assert.assertEquals(false,CheckUtils.equals(str1,str2));
    }

    @Test
    public void testEquals2() {
        Integer n1 = 1;
        Integer n2 = new Integer(1);
        Integer n3 = null;
        Assert.assertEquals(false,CheckUtils.equals2(1,2));
        Assert.assertEquals(false,CheckUtils.equals2(1,n3));
        Assert.assertEquals(true,CheckUtils.equals2(n1,1));
        Assert.assertEquals(true,CheckUtils.equals2(n2,1));
        Assert.assertEquals(true,CheckUtils.equals2(n1,n2));
    }
}
