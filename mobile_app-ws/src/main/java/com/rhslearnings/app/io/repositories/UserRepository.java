package com.rhslearnings.app.io.repositories;

import org.springframework.data.repository.CrudRepository;//Basic repo for crud opns.
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rhslearnings.app.io.entity.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
	//Query Methods
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String id);
}
