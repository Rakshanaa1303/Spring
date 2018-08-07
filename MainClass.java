import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		Computer c = (Computer) con.getBean("comp");
		
		System.out.println(c.getBrandname());
		System.out.println(c.cpu.getCPUName());
		System.out.println(c.key.getKeyBrand());
		System.out.println(c.key.getKeyPrice());

	}

}
