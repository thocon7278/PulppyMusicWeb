package com.pulppy.user.action;

import java.util.ArrayList;
import java.util.List;

import com.pulppy.user.bean.MusicInfoDTO;
import com.pulppy.user.model.AccountDAO;
import com.pulppy.user.model.MusicDAO;

public class LoadingIndexPage {
	public List<MusicInfoDTO> musicDTOList = new ArrayList<MusicInfoDTO>();

	public List<MusicInfoDTO> getMusicDTOList() {
		return musicDTOList;
	}

	public void setMusicDTOList(List<MusicInfoDTO> musicDTOList) {
		this.musicDTOList = musicDTOList;
	}

	public String Init() {
		MusicDAO musicdao = new MusicDAO();
		musicDTOList = musicdao.getAllSong();
		for (MusicInfoDTO musicInfoDTO : musicDTOList) {
			System.out.println("xxxx" +  musicInfoDTO.getSongname__p());
			System.out.println("xxxx" +  musicInfoDTO.getSongLink__p());
		}
		return "SUCCESS";
	}
}
