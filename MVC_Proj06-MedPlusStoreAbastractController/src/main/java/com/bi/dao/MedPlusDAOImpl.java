package com.bi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bi.bo.MedicineDetailsBO;

public class MedPlusDAOImpl implements MedPlusDAO {
	private String ALL_MEDCINE_DETAILS="SELECT MID,MEDNAME,PRICE,MFGDATE,EXPIRY FROM MVC_MEDPLUS_STORE";
	private JdbcTemplate jt;
	public MedPlusDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<MedicineDetailsBO> retrieveAllMedicines() {
		List<MedicineDetailsBO> listBo=(List<MedicineDetailsBO>)jt.query(ALL_MEDCINE_DETAILS,new MedRowMapper());
		return listBo;
	}
	
	private class MedRowMapper implements RowMapper<MedicineDetailsBO>{

		public MedicineDetailsBO mapRow(ResultSet rs, int pos) throws SQLException {
			//place resultSet object into bo object
			MedicineDetailsBO medBo=new MedicineDetailsBO();
			medBo.setMedId(rs.getInt(1));
			medBo.setMedName(rs.getString(2));
			medBo.setPrice(rs.getInt(3));
			medBo.setMfgDt(rs.getDate(4));
			medBo.setExpiryDt(rs.getDate(5));
			return medBo;
		}
		
	}

	
}
