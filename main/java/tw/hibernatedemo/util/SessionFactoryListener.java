package tw.hibernatedemo.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class SessionFactoryListener implements ServletContextListener {

  
    public SessionFactoryListener() {
        
    }
   
    //網站打開就一直保持連線
   public void contextInitialized(ServletContextEvent sce)  { 
        HibernateUtil.getSessionFactory();
        System.out.println("session factory open");
   }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
         HibernateUtil.closeSessionFactory();
         System.out.println("session factory close");
    }

	
   
}
