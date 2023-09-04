package com.getinfy;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.getinfy.entity.CatogoryEntity;
import com.getinfy.entity.ProductEntity;
import com.getinfy.repo.CategoryRepo;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(OneToManyApplication.class, args);
		CategoryRepo repo = context.getBean(CategoryRepo.class);
		
		
		
		
		CatogoryEntity entity=new CatogoryEntity();
		
		entity.setCategoryId(1);
		entity.setName("Electronic");
		entity.setPrice(234.0);
		
		
		ProductEntity p1=new ProductEntity(1,"Mouse");
		ProductEntity p2=new ProductEntity(2,"KeyBoard");
		
		
		entity.setLstofProducts(Arrays.asList(p1,p2));
		
		repo.save(entity);
		
		//repo.deleteById(1);
	}

}
