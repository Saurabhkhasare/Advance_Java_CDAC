package tester;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

public class TestHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory())
		{
			System.out.println("hibernate booted successfully..."+sf);
		}//sf.close() --> Data Base connection pool cleanded up...
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}
