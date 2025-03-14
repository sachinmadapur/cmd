package pac1;

import org.testng.annotations.Test;

public class ContactTest {
@Test
public void createContacttest() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");

	
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("createContact");
//mvn test -Durl=//http:google.com -Dbrowser=chrome -Dusername=admin -Dpassword=admin
}
@Test
public void modifyContacttest() {
	System.out.println("modifyContact");
}
@Test
public void A() {
	System.out.println("createmodifyUsingParameter123");
}

@Test
public void B() {
	System.out.println("createmodifyUsingParameter123");
}
@Test
public void C() {
	System.out.println("createmodifyUsingParameter123");
}
}
