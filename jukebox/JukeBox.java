package com.tgt.qa.tests.csrportal.jukebox;

public class JukeBox 
{
	private TrackSelector ts;
	
	public JukeBox(PlayList p, TrackSelector ts)
	{
		
	}
	
	public Song getCurrentSong()
	{
		return ts.getCurrSong();
	}
	
}
