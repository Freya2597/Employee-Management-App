/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dsouza
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;
    
    public EmployeeHistory()   //constructor
    {
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee()
    {
        Employee newEmployee = new Employee();
        
        history.add(newEmployee);
        
        return newEmployee;
    }

    public void deleteEmployee(Employee emp) {
       history.remove(emp);
    }
    
    public Employee updateEmployee(int selectedrow, Employee newEmployee)
    {
 //Employee newEmployee = new Employee();
        
        //history.add(newEmployee);
       history.set(selectedrow,newEmployee);
       
       return newEmployee;
        
    }

    public ArrayList<Employee> searchFor(String s) {
        ArrayList<Employee> newlist = new ArrayList<Employee>();
        for(Employee e : history)
        {
            if(e.toString().contains(s))
            {
                newlist.add(e);
            }
        }
       
        return newlist;
    }
}
