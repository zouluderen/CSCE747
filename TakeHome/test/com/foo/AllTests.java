package com.foo;
/**
 * @author Lingxi Zhou 
 * @Date 11/04/2013
 * @email zhou44@email.sc.edu
 * @CSCE747 MidTest Take Home
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MeetingTimeTest1.class, MeetingTimeTest2.class, TimeTest.class })
public class AllTests {

}
