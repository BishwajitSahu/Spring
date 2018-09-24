package com.bi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bi.bo.MedPlusBO;
@Repository("medDao")
public class MedPlusDAOImpl implements MedPlusDAO {
	private final String  QUERY="SELECT MID,MEDNAME,PRICE,MFGDATE,EXPIRE FROM MVC_MEDPLUS_STORE";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<MedPlusBO> getMedicines() {
		List<MedPlusBO> listBo=jt.query(QUERY, new Resu)
		return null;
	}

}
