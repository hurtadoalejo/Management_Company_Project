package co.edu.uniquindio.managementCompany;

import co.edu.uniquindio.managementCompany.factory.ModelFactory;
import co.edu.uniquindio.managementCompany.mapping.dto.DepartmentDto;
import co.edu.uniquindio.managementCompany.model.Employee;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crearPropietarioDto(modelFactory);
        System.out.println(modelFactory.getManagementCompany().getDepartmentsList().get(0).getName());
    }

    private static void crearPropietarioDto(ModelFactory modelFactory) {
        DepartmentDto departmentDto = new DepartmentDto("Luz", 24, new LinkedList<Employee>());
        modelFactory.createDepartment(departmentDto);
    }
}