package co.edu.uniquindio.managementCompany.mapping.dto;

import co.edu.uniquindio.managementCompany.model.Employee;
import java.util.LinkedList;

public record DepartmentDto(
    String name,
    int code,
    LinkedList<Employee> employeesList
){
}
