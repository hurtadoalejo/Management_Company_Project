package co.edu.uniquindio.managementCompany.mapping.mappers;

import co.edu.uniquindio.managementCompany.mapping.dto.DepartmentDto;
import co.edu.uniquindio.managementCompany.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMappingImpl {

    public List<DepartmentDto> getDepartmentsDto(List<Department> listDepartments) {
        if (listDepartments == null) {
            return null;
        }
        List<DepartmentDto> listDepartmentsDto = new ArrayList<DepartmentDto>(listDepartments.size());
        for(Department department : listDepartments) {
            listDepartmentsDto.add(departmentToDepartmentDto(department));
        }

        return listDepartmentsDto;
    }

    public DepartmentDto departmentToDepartmentDto(Department department) {
        return new DepartmentDto(department.getName(),department.getCode(),department.getEmployeesList());
    }

    public Department departmentDtoToDepartment(DepartmentDto departmentDto) {
        Department department = new Department();
        department.setName(departmentDto.name());
        department.setCode(departmentDto.code());
        department.setEmployeesList(departmentDto.employeesList());
        return department;
    }
}
