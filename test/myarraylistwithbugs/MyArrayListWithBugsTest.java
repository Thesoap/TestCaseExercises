/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylistwithbugs;

import java.lang.IndexOutOfBoundsException;
import MyArrayListWithBugs.MyArrayListWithBugs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim
 */
public class MyArrayListWithBugsTest {

    @Test
    public void testAdd() {
        Object o = "Hej";
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        assertEquals("Hej", instance.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddFail() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(6, "Hej");
    }

    /**
     * Test of get method, of class MyArrayListW thBugs.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFail() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.get(6);
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add("Hej");
        assertEquals("Hej", instance.get(0));
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add("Hej");
        instance.remove(0);
        assertEquals(null, instance.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFail() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.remove(6);
    }

    public void testExpandList() {
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        for (int i = 0; i < 6; i++) {
            instance.add("Hej" + i);
        }
        assertEquals("Hej5", instance.get(5));
    }

}
