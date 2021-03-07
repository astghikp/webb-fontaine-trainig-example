package Generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAPI {

    @Test
    public void testExchangeElements() {
        int index1 = 2;
        int index2 = 4;
        Assert.assertTrue(GenericMethods.exchangeElements(index1, index2, ArraysDB.arrayInt1));
    }

    @Test
    public void testExchangeElementsIndexBiggerThanArrayLength() {
        int index1 = 5;
        int index2 = 4;
        Assert.assertFalse(GenericMethods.exchangeElements(index1, index2, ArraysDB.arrayInt1));
    }

    @Test
    public void testExchangeElementsForString() {
        int index1 = 1;
        int index2 = 4;
        Assert.assertTrue(GenericMethods.exchangeElements(index1, index2, ArraysDB.arrayString));
    }

    @Test
    public void testRemoveElement() {
        int index1 = 1;
        Assert.assertEquals(GenericMethods.removeElement(index1, ArraysDB.arrayInt2), "[1, 2, 3, 5, 8, 13]");
    }

    @Test
    public void testRemoveElementString() {
        int index = 4;
        Assert.assertEquals(GenericMethods.removeElement(index, ArraysDB.arrayString), "[test, back, java, generic]");
    }

    @Test
    public void testRemoveElementBiggerThanArrayLength() {
        int index = 6;
        Assert.assertEquals(GenericMethods.removeElement(index, ArraysDB.arrayString), "");
    }

    @Test
    public void testMaxElement() {
        Assert.assertEquals(GenericMethods.maxElement(ArraysDB.arrayInt2), "13");
    }

    @Test
    public void testMinElement() {
        Assert.assertEquals(GenericMethods.minElement(ArraysDB.arrayDouble1), "-4.5");
    }

    @Test
    public void testAverage() {
        Assert.assertEquals(GenericMethods.averageOfArray(ArraysDB.arrayInt1), "5.6");
    }
}
