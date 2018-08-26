```
1.
    given 添加一个用户
    when post /users
    then 返回204状态码
    
2.
    given 一个新用户
    when call 添加新用户的接口
    then 返回新用户
    
3.
    given 一个新用户
    when call 储存新用户到数据库的接口
    then 返回存入的新用户
    
```