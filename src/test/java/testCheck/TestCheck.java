package testCheck;

import com.zeroten.common.util.CheckUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestCheck {

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(false, CheckUtils.isAnyEmpty(null,"a","s"));
        Assert.assertEquals(false, CheckUtils.isAnyEmpty(null,null,"s",null,"d","f"));
        Assert.assertEquals(true, CheckUtils.isAnyEmpty("a","s"));
    }


}
