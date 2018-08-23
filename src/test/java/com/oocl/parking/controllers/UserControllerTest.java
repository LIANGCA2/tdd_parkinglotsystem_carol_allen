package com.oocl.parking.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.oocl.parking.entities.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@EnableSpringDataWebSupport
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mvc;

    @MockBean
    private  UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void should_return_204_when_post_a_user() throws Exception{
        User user=mock(User.class);
       when(userService.addUser(any(User.class))).thenReturn(user);

        ResultActions resultActions=mvc.perform(post("/api/v1/users").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(user)));

        resultActions.andExpect(status().isCreated());
    }


}
