package com.tgt.qa.tests.csrportal.jukebox;

import com.tgt.qa.tests.csrportal.theQueue;
import com.tgt.qa.tests.csrportal.theQueue.queueArrayImplementation;

public class PlayList 
{
	private Song song;
	private queueArrayImplementation songQueue;
	
	public PlayList()
	{
		setSongQueue(prepSongQueue());
	}
	
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	public queueArrayImplementation getSongQueue() {
		return songQueue;
	}
	public void setSongQueue(queueArrayImplementation songQueue) {
		this.songQueue = songQueue;
	}
	
	private queueArrayImplementation prepSongQueue()
	{
		theQueue sq = new theQueue();
		queueArrayImplementation q = sq.new queueArrayImplementation(5);
		q.enqueue("Kumar Shanu");
		q.enqueue("Kumar Kishore");
		q.enqueue("Nigam Sonu");
		q.enqueue("Alisha");
		q.enqueue("Rathod");
		
		return q;
	}
}
