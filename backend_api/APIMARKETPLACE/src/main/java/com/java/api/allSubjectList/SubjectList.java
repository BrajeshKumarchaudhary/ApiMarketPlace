package com.java.api.allSubjectList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.exception.ApiException;
import com.java.api.swagger.annotation.Common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/subject")
@Api(tags = "All Subject List")
public class SubjectList {
	@GetMapping("/all")
	@ApiOperation(value = "List of all  avaialable Computer Subject")
	@Common
	public List<String> ds() throws ApiException {
		List<String> list=new ArrayList<String>();
		list.add("DataStructure");
		list.add("Operating System");
		list.add("DataBase");
		list.add("Algorithm");
		list.add("Java");
		list.add("Python");
		list.add("Java Script");
		list.add("Machine Learning");
		list.add("Mixed Type Question");
		return list;
	}
}
