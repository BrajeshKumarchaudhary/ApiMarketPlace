package com.java.api.swagger.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.java.api.common.ApiMessages;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = { @ApiResponse(code = ApiMessages.SUCCESS_CODE, message = ApiMessages.SUCCESS_MESSAGE),
		@ApiResponse(code = ApiMessages.INVALID_REQUEST_CODE, message = ApiMessages.INVALID_REQUEST_MESSAGE),
		@ApiResponse(code = ApiMessages.INTERNAL_SERVER_ERROR_CODE, message = ApiMessages.INTERNAL_SERVER_ERROR_MESSAGE) })
public @interface Common {

}
