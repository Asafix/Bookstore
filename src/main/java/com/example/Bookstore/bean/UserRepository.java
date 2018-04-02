package com.example.Bookstore.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Bookstore.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}