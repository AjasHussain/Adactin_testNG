package Project_adactin;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_testNG {
	
	@Test
	@Parameters({"uname", "passwd"})
	private void Credentialdata(String uname, String passwd) {
		System.out.println("UN; "+ uname);
		System.out.println("PW; "+ passwd);

	}

}
