package com.pulppy.user.bean;

public class MusicInfoDTO {
	
	private int id__p;
	private String songname__p;
	private String songalbum__p;
	private boolean songActive__p;
	private int songListen__p;
	private String songLink__p;
	private String datecreate__p;
	public int getId__p() {
		return id__p;
	}
	public void setId__p(int id__p) {
		this.id__p = id__p;
	}
	public String getSongname__p() {
		return songname__p;
	}
	public void setSongname__p(String songname__p) {
		this.songname__p = songname__p;
	}
	public String getSongalbum__p() {
		return songalbum__p;
	}
	public void setSongalbum__p(String songalbum__p) {
		this.songalbum__p = songalbum__p;
	}
	public boolean isSongActive__p() {
		return songActive__p;
	}
	public void setSongActive__p(boolean songActive__p) {
		this.songActive__p = songActive__p;
	}
	public int getSongListen__p() {
		return songListen__p;
	}
	public void setSongListen__p(int songListen__p) {
		this.songListen__p = songListen__p;
	}
	public String getSongLink__p() {
		return songLink__p;
	}
	public void setSongLink__p(String songLink__p) {
		this.songLink__p = songLink__p;
	}
	public String getDatecreate__p() {
		return datecreate__p;
	}
	public void setDatecreate__p(String datecreate__p) {
		this.datecreate__p = datecreate__p;
	}
	public MusicInfoDTO(int id__p, String songname__p, String songalbum__p, boolean songActive__p, int songListen__p,
			String songLink__p, String datecreate__p) {
		super();
		this.id__p = id__p;
		this.songname__p = songname__p;
		this.songalbum__p = songalbum__p;
		this.songActive__p = songActive__p;
		this.songListen__p = songListen__p;
		this.songLink__p = songLink__p;
		this.datecreate__p = datecreate__p;
	}
	public MusicInfoDTO() {
		super();
		
	}
	
}
