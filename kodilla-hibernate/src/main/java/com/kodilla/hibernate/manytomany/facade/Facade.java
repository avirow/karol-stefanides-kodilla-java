package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import static com.kodilla.hibernate.manytomany.facade.NameCondition.nameCondition;

@Service
public class Facade {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    public List<Employee> searchEmployeeByLastNameFragment(String lastNameFragment){
        return employeeDao.findByAnyPartOfLastName(nameCondition(lastNameFragment));
    }

    public List<Company> searchCompanyByNameFragment(String nameFragment){
        return companyDao.findNameOfCompanyByAnyPartOfName(nameCondition(nameFragment));
    }
}
