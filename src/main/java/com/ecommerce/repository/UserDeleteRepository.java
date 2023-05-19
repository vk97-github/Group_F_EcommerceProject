package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserDelete;

@Repository
public interface UserDeleteRepository extends JpaRepository<UserDelete, Integer> {

}
