package com.kevogaba.department.service;

import com.kevogaba.department.entity.Department;
import com.kevogaba.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentbyId(Long departmentId) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
