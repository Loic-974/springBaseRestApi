package com.baseRestApi.springjwt.payload.request;



public class LoginRequest {
	@jakarta.validation.constraints.NotBlank
  private String username;

	@jakarta.validation.constraints.NotBlank
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
