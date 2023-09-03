// Copyright (c) 2023 Boomi, Inc.
package com.accionlabs.evodemo.customobject;

import java.util.LinkedList;
import java.util.List;

public class EmployeeOps {
    private List<Employee> employees;

    public EmployeeOps (){
        employees = new LinkedList<>();
    }

    public EmployeeOps(List<Employee> employees) {
        this.employees = employees;
    }

    public int getTotalEmployees() throws UnsupportedOperationException{
        if (employees.size() > 0) {
            return employees.size();
        }
        else {
            throw new UnsupportedOperationException("No data");
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getTotalEmployees(List<Employee> employees) throws UnsupportedOperationException{
        this.setEmployees(employees);
        return getTotalEmployees();
    }
}
