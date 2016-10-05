package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pulppy.user.bean.AccountDTO;
import com.pulppy.user.bean.MusicInfoDTO;
import com.pulppy.user.connection.MySQLConnUtils;

public class MusicDAO {
	public static MusicInfoDTO musicDTO;
	MusicInfoDTO musicdto = new MusicInfoDTO();

	public List<MusicInfoDTO> getAllSong() {
		List<MusicInfoDTO> listsong = new ArrayList<MusicInfoDTO>();
		try {
			String soql = "Select * from music__t ";
			MySQLConnUtils sqlconn = new MySQLConnUtils();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(soql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id__p");
				String name = rs.getString("songname__p");
				String album = rs.getString("songalbum__p");
				String songLink = rs.getString("songLink__p");
				int songListen = rs.getInt("songListen__p");
				boolean songActive = rs.getBoolean("songActive__p");
				String date = rs.getString("datecreate__p");
				MusicInfoDTO musicdto = new MusicInfoDTO();
				musicdto.setId__p(id);
				musicdto.setSongname__p(name);
				musicdto.setSongalbum__p(album);
				musicdto.setSongLink__p(songLink);
				musicdto.setSongListen__p(songListen);
				musicdto.setSongActive__p(songActive);
				musicdto.setDatecreate__p(date);
				listsong.add(musicdto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listsong;
	}

}
