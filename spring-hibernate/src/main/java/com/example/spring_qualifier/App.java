package com.example.spring_qualifier;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_hibernate.entity.Biryani;
import com.example.spring_hibernate.factory.MyContextFactory;
import com.example.spring_hibernate.service.BiryaniService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Biryani> list=null;
    	
		BiryaniService service=MyContextFactory.getMyContextFactory();
		//Biryani thebiryani=service.createMenu(new Biryani("KababChikenBiryani",110));
	/*	list = service.getMenu();
		for(Biryani b:list)
		{
			System.out.println(b);
		}*/
		//System.out.println(thebiryani);
		/*Biryani thebiryani=service.getBiryani(2);
		System.out.println(thebiryani);*/
		/*list = service.getByName("KababChikenBiryani");
		for(Biryani b:list)
		{
			System.out.println(b);
		}*/
		
		/*Biryani c=service.updateBiryani("PotRoastedBiryani", 160, 1);
		if(c!=null)
		{
			System.out.println("upadted "+c);
		}
		else {
			System.out.println("no record found");	
		}*/
		service.deleteMenuItem(1);
		System.out.println("ok");
    }
}
