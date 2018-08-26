package com.oocl.parking.repository;

import com.oocl.parking.entities.User;
import com.oocl.parking.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void should_add_user(){
        User user = new User("name_1", "username_1", "123456", "carol@oocl.com", "18320419687", "下班", "normal");

        User saveUser=userRepository.save(user);

        assertThat(saveUser.getUsername(),is("username_1"));
    }
}
