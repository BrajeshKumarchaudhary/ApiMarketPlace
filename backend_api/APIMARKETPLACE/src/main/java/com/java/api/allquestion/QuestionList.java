package com.java.api.allquestion;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.exception.ApiException;
import com.java.api.swagger.annotation.Common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/question")
@Api(tags = "All Question List")
public class QuestionList {
	org.slf4j.Logger logger = LoggerFactory.getLogger(QuestionList.class);
	
	@GetMapping("/ds/concepts")
	@ApiOperation(value = "List of all  data structure question.")
	@Common
	public List<String> ds() throws ApiException {
		List<String> list=new ArrayList<String>();
		list.add("What is Data Structure?");
		list.add("Why we study Data Structure?");
		list.add("How many type of Data Structure?");
		return list;
	}

	@GetMapping("/os/concepts")
	@ApiOperation(value = "List of all  operatin System question.")
	@Common
	public List<String> os() throws ApiException {
		List<String> list=new ArrayList<String>();
		list.add("What is Operating System?");
		list.add("Why we study Operating System?");
		list.add("What is role of Operating system in Computer?");
		return list;
	}
	
	@GetMapping("/db/concepts")
	@ApiOperation(value = "List of all  DataBase Management question.")
	@Common
	public List<String> db() throws ApiException {
		List<String> list=new ArrayList<String>();
		list.add("What is Data Base?");
		list.add("Why we  study Data Base?");
		list.add("What is role of DataBase in Computer?");
		return list;
	}
	
}
