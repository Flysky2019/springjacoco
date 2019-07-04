package test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JacocoJunitTest {

    private JacocoTest test = new JacocoTest();

    /**
     * 测试最大值函数（正常情况）
     */
    @Test
    public void testMaxNumNormal() {
        Assert.assertEquals(3, test.maxNum(2, 1, 3));
    }

    @Rule
    public ExpectedException exc = ExpectedException.none();

    /**
     * 测试最大值函数（正常情况）
     */
    @Test
    public void testMaxNumException() {
        exc.expect(IllegalArgumentException.class);
        exc.expectMessage("参数异常！");
        test.maxNum();
    }

    @Test
    public void testPrint() {
        Assert.assertEquals("09", test.print(9));
        Assert.assertEquals("11", test.print(11));
    }

}
