package com.isocialsmart.ddclient;

import com.isocialsmart.ddclient.nao.Login;
import com.isocialsmart.ddclient.nao.impl.LoginImpl;

/**
 *
 * @author DaltonD
 */
public class DDService {
	private String accessToken;
	private Login loginService;

	public DDService() {
		loginService = new LoginImpl();
	}
	
	public void doLogin(String username, String password) {
		accessToken = loginService.getAccessToken(username, password);
	}
	
	
}
