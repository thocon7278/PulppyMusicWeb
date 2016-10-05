package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pulppy.user.bean.AccountDTO;
import com.pulppy.user.connection.MySQLConnUtils;

public class AccountDAO {
	public AccountDTO checkAccount(String email, String pass) {
		AccountDTO accdto = new AccountDTO();
		try {
			String soql = "Select * from account__t where email__p = '" + email + "' and password__p = '" + pass + "'";
			MySQLConnUtils sqlconn = new MySQLConnUtils();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(soql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				accdto.setValid(true);
				accdto.setUsername__p(rs.getString("username__p"));
				accdto.setEmail__p(rs.getString("email__p"));
				accdto.setRole__p(rs.getString("role__p"));
				accdto.setMobilephone__p(rs.getInt("mobilephone__p"));
				accdto.setDatetime__p(rs.getDate("datecreate__p").toString());
				accdto.setId__p(rs.getString("id__p"));
				accdto.setBitcoin__p(rs.getInt("bitcoin__p"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accdto;
	}
}
