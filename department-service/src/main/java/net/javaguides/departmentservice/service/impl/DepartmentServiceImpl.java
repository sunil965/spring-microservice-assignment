package net.javaguides.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import net.javaguides.departmentservice.repository.DepartmentRepository;
import net.javaguides.departmentservice.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    private ModelMapper mapper;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = mapper.map(departmentDto, Department.class);

        Department savedDepartment = departmentRepository.save(department);

        return mapper.map(department, DepartmentDto.class);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        return mapper.map(department, DepartmentDto.class);
    }
}
