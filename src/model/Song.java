package model;

import java.util.ArrayList;

public class Song {
	private String IdSong;
	private ArrayList<String> arrlist;
	
	public String getIdSong() {
		return IdSong;
	}
	public void setIdSong(String idSong) {
		IdSong = idSong;
	}
	public ArrayList<String> getArrlist() {
		return arrlist;
	}
	public void setArrlist(ArrayList<String> arrlist) {
		this.arrlist = arrlist;
	}
	
}
