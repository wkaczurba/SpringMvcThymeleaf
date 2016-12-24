package com.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

// TODO: Write tests for the controller.
public class MainControllerTest {

	@Test
	public void indexGetTest() throws Exception  {
		MainController controller = new MainController();
		
		MockMvc mvc = MockMvcBuilders.standaloneSetup(controller)./*setSingleView(
				new InternalResourceView("/WEB-INF/views/index.html")).*/build();
		
		mvc.perform(get("/")).andExpect(view().name("index"));
	}
	
	@Test
	public void registerGetTest() throws Exception {
		MainController controller = new MainController();
		
		MockMvc mvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/form.html")).build();
				
		mvc.perform(get("/register")).andExpect(view().name("form"));
	}
	
	@Test
	public void registerPostTest() throws Exception {
		MainController controller = new MainController();
			
		// This example cannot use .setSingleView(...) as there is a redirect and it will return null;
		MockMvc mvc = MockMvcBuilders.standaloneSetup(controller)
				.build();
		
		// TODO: It should expect some data as well!.
		mvc.perform(post("/register")
				.param("username", "user1")
				.param("password", "password")
				.param("passowrd2", "password")
				.param("email", "email@email.com")
				.param("email2", "email@email.com"))
		        .andExpect(redirectedUrl("/registered"));
	}
	
	@Test
	public void registered() throws Exception {
		MainController controller = new MainController();
		
		MockMvc mvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/registered.html")).build();

		mvc.perform(get("/registered"))
		   .andExpect(view().name("registered"));
	}
}
