package com.fullstack.projectmanagementbackend.repository;

import java.util.List;

import com.fullstack.projectmanagementbackend.entity.ParentTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;





@Repository
public interface ParentTaskManagerRepository extends JpaRepository<ParentTask,Long>{

	@Query("SELECT t FROM ParentTask t where t.projectId = ?1")
	public List<ParentTask> findAllParentTaskByProjectId(String projectId);
}

