package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.CatogoryEntity;

public interface CategoryRepo extends JpaRepository<CatogoryEntity, Integer>{

}
