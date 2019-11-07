package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Album;

import com.example.demo.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumController {
	private AlbumService albumService;

	public AlbumController(AlbumService albumService) {
		super();
		this.albumService = albumService;
	}
	@RequestMapping("/albums")
	public List<Album> getAllEmployee(){
		return albumService.getAllAbulms();
	}

}
