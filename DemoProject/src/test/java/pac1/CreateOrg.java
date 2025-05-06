package pac1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrg {
	@Test
	public void createOrg() {
		
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
		Reporter.log("Org created", true);
	}
	@Test
	public void deleteOrg() {

	}
	@Test
	public void modifyOrg() {
		Reporter.log("Org is modified", true);	
	}
	
	@Test
	public void createOrgWithContact() {
		Reporter.log("Org is created with contact", true);	
	}
	
}








