package co.edu.uniquindio.managementCompany.factory;

import co.edu.uniquindio.managementCompany.model.ManagementCompany;

public class ModelFactory {

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
}
