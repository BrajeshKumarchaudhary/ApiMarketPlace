package com.java.api.ds.concepts.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.common.ApiMessages;
import com.java.api.exception.ApiException;
import com.java.api.swagger.annotation.Common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/dsconcepts")
@Api(tags = "Data Structure Concepts")
public class DataStructureConceptsController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(DataStructureConceptsController.class);

	@GetMapping("wis_ds")
	@ApiOperation(value = "what is data structure")
	@Common
	public String ds() throws ApiException {
//	       if(true)throw new ApiException(ApiMessages.INTERNAL_SERVER_ERROR_CODE, ApiMessages.INTERNAL_SERVER_ERROR_MESSAGE);
		return "dataStructure";
	}

}
