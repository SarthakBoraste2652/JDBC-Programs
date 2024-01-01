package org.sarthakab.entity;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
	int addEmployee(Employee emp) throws SQLException;
	
	int deleteEmpByEmpNo(int empNo) throws SQLException ;
	
	int updateEmpByEmpNo(int empNo) throws SQLException;
	
	List<Employee> getAllEmployees() throws SQLException;
}
