package com.fullstack.projectmanagementbackend.repository;

import com.fullstack.projectmanagementbackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ProjectManagerRepository extends JpaRepository<Project,Long>{

}

