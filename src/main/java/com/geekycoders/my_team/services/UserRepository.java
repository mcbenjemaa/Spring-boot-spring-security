package com.geekycoders.my_team.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekycoders.my_team.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
