package co.edu.uniquindio.managementCompany.model;

import co.edu.uniquindio.managementCompany.services.IContributor;

import java.util.LinkedList;

public abstract class Employee implements IContributor {
    private String name;
    private String id;
    private Department associatedDepartment;
    private LinkedList<Project> associatedProjectsList;

    /**
     * Method constructor for the class Employee
     * @param name Name of the employee to create
     * @param id ID of the employee to create
     * @param department Department of the employee to create
     */
    public Employee(String name, String id, Department department) {
        this.name = name;
        this.id = id;
        this.associatedDepartment = department;
        this.associatedProjectsList = new LinkedList<>();
    }

    /**
     * Method to obtain the Employee's name
     * @return Employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to modify the Employee's name
     * @param name New name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to obtain the Employee's ID
     * @return Employee's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Method to modify the Employee's ID
     * @param id New ID of the employee
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Method to obtain the Employee's associated department
     * @return Employee's associated department
     */
    public Department getassociatedDepartment() {
        return associatedDepartment;
    }

    /**
     * Method to modify the Employee's associated department
     * @param department New department of the employee
     */
    public void setAssociatedDepartment(Department department) {
        this.associatedDepartment = department;
    }

    /**
     * Method to obtain the list of projects associated with the employee
     * @return List of projects associated with the employee
     */
    public LinkedList<Project> getAssociatedProjectsList() {
        return associatedProjectsList;
    }

    /**
     * Method to modify the list of projects associated with the employee
     * @param associatedProjectsList New list of projects associated with the employee
     */
    public void setAssociatedProjectsList(LinkedList<Project> associatedProjectsList) {
        this.associatedProjectsList = associatedProjectsList;
    }
}