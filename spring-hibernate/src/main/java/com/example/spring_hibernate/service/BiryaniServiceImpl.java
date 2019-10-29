package com.example.spring_hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_hibernate.dao.BiryaniDao;
import com.example.spring_hibernate.entity.Biryani;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("biryaniService")
public class BiryaniServiceImpl implements BiryaniService {
	@Autowired
	private BiryaniDao biryaniDao;
	
	@Override
	@Transactional
	public Biryani createMenu(Biryani biryani) {
		
		return biryaniDao.createMenu(biryani);
	}
	@Override
	public List<Biryani> getMenu(){
		return biryaniDao.getMenu();
	}
	
	@Override
	public Biryani getBiryani(int id) {
		Biryani biryani = biryaniDao.getBiryani(id);
		if(biryani==null)
		{
			return null;
		}
		return biryani;
	}
	
	public List<Biryani> getByName(String biryaniname){
		return biryaniDao.getByName(biryaniname);
	}
	public Biryani updateBiryani(String biryaniname,int cost, int id) {
		return biryaniDao.updateBiryani(biryaniname, cost, id);
	}
	public void deleteMenuItem(int id) {
		
	}
}
