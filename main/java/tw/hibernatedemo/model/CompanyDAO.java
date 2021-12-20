package tw.hibernatedemo.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class CompanyDAO implements CompanyDAOInterface {

	 private Session session;
	
	 public CompanyDAO(Session session) {
		this.session=session;
	}
	
	@Override
	public CompanyBean insert(CompanyBean comBean) {
	CompanyBean	companyBean = session.get(CompanyBean.class, comBean.getCompanyId());
		if (companyBean ==null) {
			session.save(comBean);
			return comBean;
		}
		return null;
	}

	@Override
	public CompanyBean select(int companyID) {
		
		return session.get(CompanyBean.class, companyID);
	}

	@Override
	public List<CompanyBean> selectAll() {
		Query<CompanyBean> query = session.createQuery("from CompanyBean",CompanyBean.class);
		return query.list();
	}

	@Override
	public CompanyBean updateOne(int companyID, String companyName) {
		CompanyBean companyBean = session.get(CompanyBean.class, companyID);
		if (companyBean!=null) {
			companyBean.setCompanyName(companyName);
		}
		return companyBean;
	}

	@Override
	public boolean delete(int companyID) {
		CompanyBean companyBean = session.get(CompanyBean.class, companyID);
		if (companyBean !=null) {
			session.delete(companyBean);
			return true;
		}
		return false;
	}

}
