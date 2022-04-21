package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
