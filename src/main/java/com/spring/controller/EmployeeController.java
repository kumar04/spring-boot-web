/**
 * 
 */
package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.EmployeeModel;
import com.spring.response.ResponseModel;
import com.spring.response.Status;

/**
 * @author rpatra
 *
 */
@Controller
@RequestMapping("/employee/")
public class EmployeeController {

	@GetMapping("/1")
	public ResponseEntity<String> getIndex2() {

		ResponseEntity<String> response = new ResponseEntity<>("index data response", HttpStatus.OK);
		return response;
	}

	@GetMapping("/2")
	
	public ResponseEntity<ResponseModel> getEmployeeJsonInfo() {
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setStudentID(1);
		employeeModel.setStudentName("AB");
		
		
		Status status=new Status("success",HttpStatus.OK);
		ResponseModel responseModel=new ResponseModel(employeeModel, status);
		ResponseEntity<ResponseModel> response = new ResponseEntity<>(responseModel, HttpStatus.OK);
		return response;
	}
	

	@GetMapping("/3")
	
	public ResponseEntity<ResponseModel> getEmployeeJsonListInfo() {
		List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();
		
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setStudentID(1);
		employeeModel.setStudentName("AB");
		

		EmployeeModel employeeModel2 = new EmployeeModel();
		employeeModel2.setStudentID(2);
		employeeModel2.setStudentName("CD");
		

		EmployeeModel employeeModel3 = new EmployeeModel();
		employeeModel3.setStudentID(3);
		employeeModel3.setStudentName("EF");
		
		employeeModelList.add(employeeModel);
		employeeModelList.add(employeeModel2);
		employeeModelList.add(employeeModel3);
		
		Status status=new Status("success",HttpStatus.OK);
		ResponseModel responseModel=new ResponseModel(employeeModelList, status);
		ResponseEntity<ResponseModel> response = new ResponseEntity<>(responseModel, HttpStatus.OK);
		return response;
	}
}
