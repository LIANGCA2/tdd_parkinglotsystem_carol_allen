package com.oocl.parking.services;

import com.oocl.parking.controllers.UserService;
import com.oocl.parking.entities.User;
import com.oocl.parking.repositories.UserRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Mock
     UserRepository userRepository;

    @Test
    public void should_return_a_user_when_call_addUser(){


        UserService userService = new UserService(userRepository);
        User user=new User("user_1");
        when(userRepository.save(user)).thenReturn(user);

        userService.addUser(user);

        verify(userRepository).save(user);
        
    }

}
