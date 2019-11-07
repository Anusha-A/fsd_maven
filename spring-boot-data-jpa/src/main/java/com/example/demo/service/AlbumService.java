package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Album;


public interface AlbumService {
	
	public List<Album> getAllAbulms();
	public void save(Album theAlbum);
	public Album update(Album theAlbum);
	public Album fingById(int theId);
	public void delete(int theId);

}
