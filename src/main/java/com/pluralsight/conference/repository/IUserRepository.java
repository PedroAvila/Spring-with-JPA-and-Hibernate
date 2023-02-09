package com.pluralsight.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.conference.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	//User save(User user);

}