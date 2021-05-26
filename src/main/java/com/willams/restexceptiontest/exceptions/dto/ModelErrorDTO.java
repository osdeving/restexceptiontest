package com.willams.restexceptiontest.exceptions.dto;

public class ModelErrorDTO {
	private String code;
	private String message;
	
	
	public ModelErrorDTO(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}


	public static ModelErrorDTO notFound() {
		ModelErrorDTO ret = new ModelErrorDTO(StatusError.NOT_FOUND.getCode(), StatusError.NOT_FOUND.getMessage());
		return ret;
	}
	
	public static ModelErrorDTO badRequest() {
		ModelErrorDTO ret = new ModelErrorDTO(StatusError.INVALID_ARGUMENT.getCode(), StatusError.INVALID_ARGUMENT.getMessage());
		return ret;
	}
}
