package net.javaguides.employeeservice.mapper;

import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper  EMPLOYEE_MAPPER = Mappers.getMapper(EmployeeMapper.class);

    Employee mapToEmployee(EmployeeDto employeeDto);

    EmployeeDto mapToEmployeeDto(Employee employee);
}
