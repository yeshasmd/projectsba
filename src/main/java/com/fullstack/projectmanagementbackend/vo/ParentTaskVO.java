package com.fullstack.projectmanagementbackend.vo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentTaskVO {

	private Long parentTaskId;
	private String parentTaskName;
	private String projectId;

}
