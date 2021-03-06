package tw.cinema.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class SessionFactoryListener implements ServletContextListener {

    
    public SessionFactoryListener() {
        
    }
    //websit一開啟就跟資料庫保持連線
    public void contextInitialized(ServletContextEvent sce)  { 
        HibernateUtil.getSessionFactory();
        
    }
	//server close,websit close
    public void contextDestroyed(ServletContextEvent sce)  { 
         HibernateUtil.closeSessionFactory();
    }

	
   
	
}
