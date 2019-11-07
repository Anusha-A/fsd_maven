package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	public AlbumServiceImpl(AlbumRepository albumRepository) {
		super();
		this.albumRepository = albumRepository;
	}

	private AlbumRepository albumRepository;

	@Override
	public List<Album> getAllAbulms() {
		return albumRepository.findAll();

	}

	@Override
	public void save(Album theAlbum) {
		albumRepository.save(theAlbum);

	}

	@Override
	public Album update(Album theAlbum) {
		
		return null;
	}
	@Override
	public Album fingById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int theId) {
		albumRepository.deleteById(theId);

	}

}
