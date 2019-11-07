package com.example.demo.service;

import java.awt.font.ImageGraphicAttribute;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;

@Service
public class ImageServiceImpl implements ImageService {
	
	private ImageRepository imageRepository;

	@Override
	public List<Image> getAllAbulms(Image theImage) {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}

	@Override
	public void save(Image theImage) {
		imageRepository.save(theImage);

	}

	@Override
	public Image update(Image theImage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image fingById(int theId) {
		
		return null;
	}

	@Override
	public void delete(int theId) {
		imageRepository.deleteById(theId);

	}

}
