package com.fullstack.projectmanagementbackend.repository;

import com.fullstack.projectmanagementbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface UserManagerRepository extends JpaRepository<User,Long>{

}

