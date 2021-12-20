package tw.hibernatedemo.service;

import java.util.List;

import org.hibernate.Session;

import tw.hibernatedemo.model.CompanyBean;
import tw.hibernatedemo.model.CompanyDAO;

public class CompanyServiceImpl implements CompanyService {

	private CompanyDAO companyDAO;
		
	
	 public CompanyServiceImpl(Session session) {
	    this.companyDAO	=new CompanyDAO(session);
	}
	@Override
	public CompanyBean select(int id) {
		CompanyBean theBean = companyDAO.select(id);
		return theBean;
	}

	@Override
	public List<CompanyBean> selectAll() {
		List<CompanyBean> theComs= companyDAO.selectAll();
		return theComs;
	}

	@Override
	public CompanyBean insert(CompanyBean comBean) {
		CompanyBean oneCom = companyDAO.insert(comBean);
		return oneCom;
	}

	@Override
	public CompanyBean updateOne(int comId, String changeName) {
		CompanyBean oneCom = companyDAO.updateOne(comId, changeName);
		return oneCom;
	}

	@Override
	public boolean delete(int id) {
		boolean oneCom = companyDAO.delete(id);
		return oneCom;
	}

}
