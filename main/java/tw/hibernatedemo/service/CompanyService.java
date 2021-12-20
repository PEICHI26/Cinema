package tw.hibernatedemo.service;

import java.util.List;
import tw.hibernatedemo.model.CompanyBean;

public interface CompanyService {
   CompanyBean select(int id);
   List <CompanyBean> selectAll();
   CompanyBean insert(CompanyBean comBean);
   CompanyBean updateOne(int comId, String changeName);
   boolean delete(int id);
}
