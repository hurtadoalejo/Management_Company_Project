package co.edu.uniquindio.managementCompany.factory;

import co.edu.uniquindio.managementCompany.mapping.dto.DepartmentDto;
import co.edu.uniquindio.managementCompany.model.ManagementCompany;
import co.edu.uniquindio.managementCompany.mapping.mappers.DepartmentMappingImpl;

public class ModelFactory {
    private DepartmentMappingImpl departmentMapping = new DepartmentMappingImpl();
    private static ModelFactory modelFactory;
    private ManagementCompany managementCompany;

    private ModelFactory() {
        initializeData();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void initializeData() {
        managementCompany = new ManagementCompany("UQ Software");
    }

    public ManagementCompany getManagementCompany() {
        return managementCompany;
    }

    public void createDepartment(DepartmentDto departmentDto){
        managementCompany.createDepartment(departmentMapping.departmentDtoToDepartment(departmentDto));
    }
}