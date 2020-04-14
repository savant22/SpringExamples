package com.cg;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.bean.Book;
import com.cg.dao.BookDaoImpl;
import com.cg.service.BookServiceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	Book bo1;
//	
//	@Autowired
//	BookDaoImpl bo2;
	
	@Autowired
	BookServiceImpl bo3;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
	
		
		
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("\nPress 1 to delete row by ID\nPress 2 to search by ID\nPress 3 to get Book Count"
				+ "\nPress 4 to get book by specific author\nPress 5 to get book by title\nPress 6 to see price\nPress 7 to add data\nPress 8 to exit");
		
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		
		switch(ch)
		
		{
		
		case 1:System.out.println("Enter id to delete:");
		int id=s.nextInt();
		
		bo3.deleteBookById(id);
		System.out.println("deleted");
		break;
		
		case 2:System.out.println("Enter id to search");
		int n=s.nextInt();
		System.out.println("serach by id:"+bo3.getBookById(n));
		break;
		
		case 3:System.out.println("Number of books are : "+bo3.getBookCount());
		break;
		
		case 4:System.out.println("Enter author name to search :");
		String author=s.next();
		System.out.println("Book corresponding to searched author  : "+bo3.getAuthorBook(author));
		break;
		
		case 5:System.out.println("Enter title name to search :");
		String title=s.next();
		System.out.println("Book corresponding to searched title is : "+bo3.getBookByTitle(title));
		break;
		
		case 6:System.out.println("Enter price range\nEnter minimum range:");
		int low=s.nextInt();
		System.out.println("Enter maximum range :");
		int high=s.nextInt();
		
		System.out.println("Book in price range are :"+bo3.getBookInPriceRange(low,high));
		
		break;
		case 7:
			System.out.println("Enter id");
			 //id=s.nextInt();
		bo1.setId(s.nextInt());
		
		System.out.println("Enter title");
		 //title=s.next();
		bo1.setTitle(s.next());
		System.out.println("Enter author");
		//author=s.next();
		bo1.setAuthor(s.next());
		
		System.out.println("Enter price");
		
		//price=s.nextInt();
		bo1.setPrice(s.nextInt());
		
		bo3.create(bo1);
		break;
		case 8:System.exit(0);
	
		}
		}
	}

}
