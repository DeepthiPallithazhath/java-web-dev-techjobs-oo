package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    Job obj1;
    Job obj2;

    @Before
    public void createJobObjects()
    {
        obj1=new Job();
        obj2=new Job();
    }
    @Test
    public void testSettingJobId()
    {
      assertEquals(obj2.getId(),obj1.getId(),1);
    }
    @Test
    public void testCheckIdAssertTrue()
    {
        assertTrue(obj1.getId()!= obj2.getId());
    }
    @Test
    public void testCheckIdAssertFalse()
    {
        assertFalse(obj1.getId()== obj2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields()
    {

/*        try
        {*/
        Job jobObj=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobObj.getName(), "Product tester");
        assertTrue(jobObj.getEmployer() instanceof Employer);
        assertEquals(jobObj.getEmployer().getValue(), "ACME");
        assertTrue(jobObj.getLocation() instanceof Location);
        assertEquals(jobObj.getLocation().getValue(), "Desert");
        assertTrue(jobObj.getPositionType() instanceof PositionType);
        assertEquals(jobObj.getPositionType().getValue(), "Quality control");
        assertTrue(jobObj.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobObj.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void  testJobsForEquality()
    {
        Job jobObj=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobObj1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobObj.equals(jobObj1));

    }
    @Test
    public void  testToString()
    {
        Job jobObj=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" +
                " ID: " + 3 +
                "\n Name: " + "Product tester" +
                "\n Employer: " + "ACME" +
                "\n Location: " + "Desert" +
                "\n PositionType: " + "Quality control" +
                "\n CoreCompetency: " + "Persistence" +
                "\n",jobObj.toString());

    }
    @Test
    public void  testNotAvaliableValue()
    {
        Job jobObj=new Job("hello", new Employer("sigma"), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\n" +
                " ID: " + 3 +
                "\n Name: " + "hello" +
                "\n Employer: " + "sigma" +
                "\n Location: " + "Data not avaliable" +
                "\n PositionType: " + "Data not avaliable" +
                "\n CoreCompetency: " + "Data not avaliable" +
                "\n",jobObj.toString());
        System.out.println(jobObj.toString());

    }
    @Test
    public void  testNullValue()
    {
        Job jobObj=new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.",jobObj.toString());
    }




}
