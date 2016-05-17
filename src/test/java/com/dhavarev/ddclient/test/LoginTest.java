package com.dhavarev.ddclient.test;

import com.isocialsmart.ddclient.nao.Login;
import com.isocialsmart.ddclient.nao.impl.LoginImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author DaltonD
 */
public class LoginTest {

	public LoginTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	@Ignore
	public void login() {
		Login loginService = new LoginImpl();
		String accessToken = loginService.getAccessToken("daltond", "daltond");
		Assert.assertNotNull("Login Failure", accessToken);
	}
}
