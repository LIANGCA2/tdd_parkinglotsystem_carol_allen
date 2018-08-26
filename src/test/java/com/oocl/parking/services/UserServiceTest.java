package com.oocl.parking.services;

import com.oocl.parking.entities.User;
import com.oocl.parking.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;


@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Mock
     UserRepository userRepository;

    @Test
    public void should_return_a_user_when_call_addUser(){


        UserService userService = new UserService(userRepository);
        User user=new User("user_1");
        when(userRepository.save(user)).thenReturn(user);

        User saveUser = userService.addUser(user);

        verify(userRepository).save(user);
        assertThat(saveUser.getPassword().length(),is(6));


    }

}
