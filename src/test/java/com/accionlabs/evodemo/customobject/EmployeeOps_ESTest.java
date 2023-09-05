/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 05 04:32:56 GMT 2023
 */

package com.accionlabs.evodemo.customobject;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.accionlabs.evodemo.customobject.Employee;
import com.accionlabs.evodemo.customobject.EmployeeOps;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmployeeOps_ESTest extends EmployeeOps_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Employee> linkedList0 = new LinkedList<Employee>();
      Employee employee0 = new Employee();
      linkedList0.add(employee0);
      EmployeeOps employeeOps0 = new EmployeeOps(linkedList0);
      int int0 = employeeOps0.getTotalEmployees((List<Employee>) linkedList0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps((List<Employee>) null);
      List<Employee> list0 = employeeOps0.getEmployees();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Employee> linkedList0 = new LinkedList<Employee>();
      Employee employee0 = new Employee();
      linkedList0.add(employee0);
      EmployeeOps employeeOps0 = new EmployeeOps(linkedList0);
      List<Employee> list0 = employeeOps0.getEmployees();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps();
      // Undeclared exception!
      try { 
        employeeOps0.getTotalEmployees((List<Employee>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.accionlabs.evodemo.customobject.EmployeeOps", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps((List<Employee>) null);
      // Undeclared exception!
      try { 
        employeeOps0.getTotalEmployees();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.accionlabs.evodemo.customobject.EmployeeOps", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps();
      try { 
        employeeOps0.getTotalEmployees();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No data
         //
         verifyException("com.accionlabs.evodemo.customobject.EmployeeOps", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Employee> linkedList0 = new LinkedList<Employee>();
      Employee employee0 = new Employee();
      linkedList0.push(employee0);
      EmployeeOps employeeOps0 = new EmployeeOps(linkedList0);
      int int0 = employeeOps0.getTotalEmployees();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps();
      List<Employee> list0 = employeeOps0.getEmployees();
      employeeOps0.setEmployees(list0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EmployeeOps employeeOps0 = new EmployeeOps();
      LinkedList<Employee> linkedList0 = new LinkedList<Employee>();
      try { 
        employeeOps0.getTotalEmployees((List<Employee>) linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No data
         //
         verifyException("com.accionlabs.evodemo.customobject.EmployeeOps", e);
      }
  }
}