package com.fullstack.projectmanagementbackend;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.projectmanagementbackend.controller.ProjectManagementController;
import com.fullstack.projectmanagementbackend.service.ProjectManagementService;
import com.fullstack.projectmanagementbackend.vo.UserVO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class ProjectmanagementbackendApplicationTests {

	private ProjectManagementController projectManagerController;
	private ProjectManagementService projectManagerService;
	ObjectMapper mapper = new ObjectMapper();

	@Before
	public void setUp() throws Exception {
		projectManagerService = Mockito.mock(ProjectManagementService.class);
		projectManagerController = new ProjectManagementController(projectManagerService);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testGetUsers() throws JsonParseException, JsonMappingException, IOException {
		TypeReference<List<UserVO>> mapType = new TypeReference<List<UserVO>>() {};
		List<UserVO> allUsers = null;
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("users.json").getFile());
		allUsers = mapper.readValue(file, mapType);
		when(projectManagerService.retriveUsers()).thenReturn(allUsers);
		List<UserVO> allUsersList = projectManagerController.getUsers();
		Assert.assertNotNull(allUsersList);
		verify(projectManagerService,times(1)).retriveUsers();
		verifyNoMoreInteractions(projectManagerService);
	}

	@Test
	public void testUpdateUsers() throws JsonParseException, JsonMappingException, IOException {
		UserVO user = null;
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("user.json").getFile());
		user = mapper.readValue(file, UserVO.class);
		doNothing().when(projectManagerService).updateUser(user);
		projectManagerController.updateUsers(user);
		verify(projectManagerService,times(1)).updateUser(user);
		verifyNoMoreInteractions(projectManagerService);
	}
}
