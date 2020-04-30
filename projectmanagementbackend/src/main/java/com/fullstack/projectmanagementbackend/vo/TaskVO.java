package com.fullstack.projectmanagementbackend.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskVO {
	private Long taskId;
	private String taskName;
	private String startDate;
	private String endDate;
	private String priority;
	private String status;
	private ParentTaskVO parentTask;
	private UserVO employeeDetails;
	private ProjectVO projectDetails;

	}
