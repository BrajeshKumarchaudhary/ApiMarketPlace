package com.java.api.home;

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
@RequestMapping("/default")
@Api(tags = "Home Page By Default View Display")
public class HomeController {

	@GetMapping("/common")
	@ApiOperation(value = "List of all Home Page  question.")
	@Common
	public List<String> common() throws ApiException {
		List<String> list=new ArrayList<String>();
		list.add("What is Data Structure?");
		list.add("Why we study Data Structure?");
		list.add("How many type of Data Structure?");
		list.add("What is Operating System?");
		list.add("Why we study Operating System?");
		list.add("What is role of Operating system in Computer?");
		list.add("What is Data Base?");
		list.add("Why we  study Data Base?");
		list.add("What is role of DataBase in Computer?");
		return list;
	}
	
	
	
}
