package com.example.spring_hibernate.service;

import java.util.List;

import com.example.spring_hibernate.entity.Biryani;

public interface BiryaniService {
	public Biryani createMenu(Biryani biryani);
	public List<Biryani> getMenu();
	public Biryani getBiryani(int id);
	public List<Biryani> getByName(String biryaniname);
	public Biryani updateBiryani(String biryaniname,int cost, int id);
	public void deleteMenuItem(int id);
}
