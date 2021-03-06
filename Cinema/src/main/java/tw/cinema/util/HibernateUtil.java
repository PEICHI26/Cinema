package tw.cinema.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    
	//優先載入static 全域變數 creatSessionFactory()方法放進factory變數裡
	private static final SessionFactory factory = creatSessionFactory();
	
    //註冊到 hibernate.cgf.xml 連線到database
	private static SessionFactory creatSessionFactory() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		return factory;
	}
    //用public讓外面使用 回傳factory
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	public static void closeSessionFactory() {
		if (factory!= null) {
			factory.close();
		}
	}
	
}
