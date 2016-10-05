package com.pulppy.user.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pulppy.user.bean.AccountDTO;
import com.pulppy.user.bean.MusicInfoDTO;
import com.pulppy.user.connection.MySQLConnUtils;
import com.pulppy.user.model.AccountDAO;
import com.pulppy.user.model.MusicDAO;


public class CheckLoign extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String username;
	public String password;
	public AccountDTO accdto;
	public MusicInfoDTO musicdto;
	private List<MusicInfoDTO> listobject = new ArrayList<MusicInfoDTO>();
	
	
	public List<MusicInfoDTO> getListobject() {
		return listobject;
	}

	public void setListobject(List<MusicInfoDTO> listobject) {
		this.listobject = listobject;
	}

	// all struts logic here
	public String execute() throws Exception {
		return "SUCCESS";
	}

	public String Init() {
		if (accdto != null) {
			return "SUCCESS";
		} else {
			return "FAIL";
		}
	}

	public String checkLogin() {
		AccountDAO accdao = new AccountDAO();
		MusicDAO musicdao = new MusicDAO();
		
		
		accdto = accdao.checkAccount(username, password);
		if (accdto.isValid() == true) {
			return "SUCCESS";
		}
		return "FAIL";
	}
}