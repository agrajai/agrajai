package com.tgt.qa.tests.csrportal.jukebox;

public class TrackSelector 
{
	private PlayList playList;
	private Song currSong;

	public PlayList getPlayList() 
	{
		return playList;
	}

	public void setPlayList() 
	{
		playList = new PlayList();
	}
	
	public void playSong()
	{
		setCurrSong((Song) playList.getSongQueue().peek());
	}

	public Song getCurrSong() {
		return currSong;
	}

	public void setCurrSong(Song currSong) {
		this.currSong = currSong;
	}
	
	

}
