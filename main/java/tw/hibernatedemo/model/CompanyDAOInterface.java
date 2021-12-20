package tw.hibernatedemo.model;

import java.util.List;

public interface CompanyDAOInterface {
   CompanyBean insert(CompanyBean companyBean);
   CompanyBean select(int companyID);
   List <CompanyBean> selectAll();
   CompanyBean updateOne(int companyID,String companyName);
   boolean delete(int companyID);
}
