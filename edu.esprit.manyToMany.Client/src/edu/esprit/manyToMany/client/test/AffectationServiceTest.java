package edu.esprit.manyToMany.client.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import services.AffectationServiceRemote;

public class AffectationServiceTest {
	private Context context;
	private AffectationServiceRemote proxy;

	@Before
	public void setUp() throws Exception {

		context = new InitialContext();
		proxy = (AffectationServiceRemote) context
				.lookup("edu.esprit.manyToMany/AffectationService!services.AffectationServiceRemote");
		proxy.initDB();
	}

	@Test
	public void test() {
		proxy.addAffectation(1, 3, "dev senior");

	}

}
