package com.fullstack.projectmanagementbackend.service;

import com.fullstack.projectmanagementbackend.vo.ParentTaskVO;
import com.fullstack.projectmanagementbackend.vo.ProjectVO;
import com.fullstack.projectmanagementbackend.vo.TaskVO;
import com.fullstack.projectmanagementbackend.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public interface ProjectManagementService {
	/**
	 * 
	 * @return
	 */
	public List<TaskVO> retriveTasks();
	
	/**
	 * 
	 * @param task
	 */
	public void updateTask(TaskVO task);
	
	/**
	 * 
	 * @return
	 */
	public List<ParentTaskVO> retriveParentTasks();
	
	/**
	 * 
	 * @param projectId
	 * @return
	 */
	public List<ParentTaskVO> retriveParentTasksForProjectId(String projectId);
	
	/**
	 * 
	 * @param parentTask
	 */
	public void updateParentTask(ParentTaskVO parentTask);
	
	/**
	 * 
	 * @return
	 */
	public List<ProjectVO> retriveProjects();
	
	/**
	 * 
	 * @param project
	 */
	public void updateProject(ProjectVO project);
	
	/**
	 * 
	 * @return
	 */
	public List<UserVO> retriveUsers();
	
	/**
	 * 
	 * @param user
	 */
	public void updateUser(UserVO user);

}
