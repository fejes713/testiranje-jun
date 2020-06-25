package z1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BankaTest extends TestCase {

    Banka b = new Banka();

    @Test
    public void test1 () {
        Assert.assertEquals("Nije zaposlen, u bracnom odnosu, ima finansiskih problema, < 20 god", 2, b.klasifikuj(19, true, true, true));
    }

    @Test
    public void test2 () {
        Assert.assertEquals("", 0, b.klasifikuj(21, true, true, true));
    }

    @Test
    public void test3 () {
        Assert.assertEquals(2, b.klasifikuj(45, true, true, true));
    }

    @Test
    public void test4 () {
        Assert.assertEquals(2, b.klasifikuj(19, true,false, false));
    }

    @Test
    public void test5 () {
        Assert.assertEquals(1, b.klasifikuj(30, true, false, true));
    }

    @Test
    public void test6 () {
        Assert.assertEquals(3, b.klasifikuj(45, true, false, true));
    }

    @Test
    public void test7 () {
        Assert.assertEquals(1, b.klasifikuj(19, false, false, false));
    }

    @Test
    public void test8 () {
        Assert.assertEquals();
    }

}