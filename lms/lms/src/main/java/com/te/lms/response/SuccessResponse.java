package com.te.lms.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class SuccessResponse {

	private Object data;
	private Boolean error;
	private String message;
}
