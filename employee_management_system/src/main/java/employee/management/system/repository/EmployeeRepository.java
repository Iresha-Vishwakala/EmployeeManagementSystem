package employee.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employee.management.system.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}