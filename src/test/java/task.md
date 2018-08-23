```
1.
    given new user and mock userService.addUser
    when post /api/v1/users
    then return http status is 204
    
2.
    given new user
    when call userService.addUser
    then return user
    
3.
    given new user
    when call userRepository.save
    then return user
    
```