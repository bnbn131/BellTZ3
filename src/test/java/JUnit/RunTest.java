package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunTest {

    @Before
    public void printBefore(){
        System.out.println("Before");
    }

    @Test
    public void printStrTest(){
        System.out.println("Test String");
        String str1 = "Test";
        String str2 = "Test";

        assertEquals(str1, str2);
    }

    @Test
    public void falseIntTest(){
        System.out.println("Test int");
        int i = 1;
        int j = 2;

        assertEquals(i, j);
    }

    @After
    public void printAfter(){
        System.out.println("After");
    }

}
