package com.ochabmateusz.cres.cresnoteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ochabmateusz.cres.cresnoteservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
