package com.aek.yifudai.service.api;

public enum Code {
	
	OK(0, "OK"), 
	INTERNAL_SERVER_ERROR(1, "Internal Server Error"),
	REQUEST_PARAMS_NOT_VALID(2, "Request params not valid"),
	AUTHENTICATION_FAILED(3, "Authentication failed"),
	API_ACCOUNT_WAS_LOCKED(4, "API account was locked"),
	RESOURCE_NOT_FOUND(5, "Resource not found"),
	ACCESS_TOKEN_NOT_VALID_OR_EXPIRED(6, "Access token not valid or expired"),
	METHOD_NOT_ALLOWED(7, "Method not allowed"),
	REQUEST_TIMESTAMP_NOT_VALID(8, "Request timestamp not valid"),
	NO_MATCHING_DATA(9, "No matching data"),
	REPEATED_SUBMISSION(10, "Repeated submission"),
	SOME_ITEMS_FAILURE(11, "Some items failure"),
	
    INTERNAL_REQUEST_ERROR(12, "internal_request_error"),
    JSON_FORMAT_ERROR(13, "json_format_error");

	private Code(int error_code, String error_msg) {
		this.error_code = error_code;
		this.error_msg = error_msg;
	}

	private int error_code;
	private String error_msg;

	public int getError_code() {
		return error_code;
	}

	public String getError_msg() {
		return error_msg;
	}


}
