package com.example.RestAPIforCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestAPIforCRUD.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
