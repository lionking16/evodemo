/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 03 04:53:34 GMT 2023
 */

package com.accionlabs.evodemo.simplelogic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Arithmatic_ESTest extends Arithmatic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        Arithmatic.getPositiveOnlyMax(4274, (-2101));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // One of the number is -ve
         //
         verifyException("com.accionlabs.simplelogic.Arithmatic", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        Arithmatic.getPositiveOnlyMax((-1492), (-1492));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // One of the number is -ve
         //
         verifyException("com.accionlabs.simplelogic.Arithmatic", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Arithmatic.getPositiveOnlyMax(70, 0);
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Arithmatic.getPositiveOnlyMax(1177, 1177);
      assertEquals(1177, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Arithmatic.add(1177, 0);
      assertEquals(1177, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      BigDecimal bigDecimal1 = Arithmatic.add(bigDecimal0, bigDecimal0);
      assertTrue(bigDecimal1.equals((Object)bigDecimal0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Arithmatic arithmatic0 = new Arithmatic();
  }
}