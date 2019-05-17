package com.capgemini.songinfoservice.service;

import java.util.List;

import com.capgemini.songinfoservice.entity.Song;

public interface SongService {

	public Song addNewSong(Song song);

	public List<Song> getAllSongs();
	
	public Song getSongById(int songId);

	public List<Song> getAllSongsByAlbmId(int albumId);

	public List<Song> getAllSongsByArtistId(int artistId);
}
