package tw.cinema.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebFilter("/OpenSessionViewFilter")
public class OpenSessionViewFilter implements Filter {

    private Session session;
    //response 給user 完才關閉session
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			this.session= factory.getCurrentSession();
			
			session.beginTransaction();
			System.out.println("begin transaction");
			
			chain.doFilter(request, response);
			
			session.getTransaction().commit();
			System.out.println("transaction ok!");
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("transaction rollback");
		}finally {
			System.out.println("session close");
		}
		
	}

	
	

}
