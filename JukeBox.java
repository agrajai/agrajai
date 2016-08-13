package com.tgt.qa.tests.csrportal;

import com.tgt.qa.tests.csrportal.theQueue.queueArrayImplementation;

public class JukeBox 
{
	private Song song;
	private TrackSelector ts;
	private CDPlayer cdplayer;

	//constructor
	public JukeBox(CDPlayer p, TrackSelector ts, Song s)
	{
		this.setPlayer();
		this.setSong(s);
		this.setTs(ts);
	}
	
	public TrackSelector getTs() {
		return ts;
	}

	public void setTs(TrackSelector ts) 
	{
		this.ts = new TrackSelector(cdplayer.getPlayList(), getSong());
	}

	public void setPlayer() 
	{
		cdplayer = new CDPlayer();
	}


	public Song getSong() {
		return song;
	}


	public void setSong(Song song) 
	{
		this.song = new Song();
	}


	//class song
	public class Song
	{
		private String songName;
		
		public String getsongName()
		{
			return songName;
		}
		
		public void setSongName(String s)
		{
			this.songName = s;
		}
	}
	
	//class trackselector
	public class TrackSelector
	{
		private Song currentSong;
		private PlayList pL;
		
		public TrackSelector(PlayList p, Song s)
		{
			this.pL = p;
			this.currentSong = s;
		}
		
		public void setCurrentSong(Song s)
		{
			this.currentSong = s;
		}
		
		public Song getCurrentSong()
		{
			return currentSong;
		}
		
		public String getNextSong()
		{
			return (String) pL.newQueueofArray.peek();
		}

		public PlayList getpL() {
			return pL;
		}

		public void setpL(PlayList pL) {
			this.pL = pL;
		}
	}
	
	//class playlist
	public class PlayList
	{
		private queueArrayImplementation newQueueofArray;
		
		public PlayList(String[] arrStr)
		{
			setNewQueueofArray(arrStr);
		}

		public queueArrayImplementation getNewQueueofArray() {
			return newQueueofArray;
		}

		public void setNewQueueofArray(String[] arrStr) 
		{
			queueArrayImplementation newQueueofArray = new theQueue().new queueArrayImplementation(3);
			
			for (int i = 0; i < arrStr.length; i++) 
			{
				newQueueofArray.enqueue(arrStr[i]);
			}
			
			this.newQueueofArray = newQueueofArray;
		}
	}
	
	public class CDPlayer
	{
		private PlayList p;
		private String[] arrStr = new String[]{"Aamir","SRK","Kajol","AB","SL"};
		
		public CDPlayer()
		{
			setPlayList();
		}
		
		public void setPlayList()
		{
			this.p = new PlayList(arrStr);
		}
		
		public PlayList getPlayList()
		{
			return p;
		}
	}
}
