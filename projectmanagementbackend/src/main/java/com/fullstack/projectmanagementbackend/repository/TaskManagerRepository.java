package com.fullstack.projectmanagementbackend.repository;

import com.fullstack.projectmanagementbackend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TaskManagerRepository extends JpaRepository<Task,Long>{

	@Query("SELECT count(*) FROM Task where projectDetails.projectId = ?1")
	public Long getTotalTasksForProjectId(Long projectId);
}

