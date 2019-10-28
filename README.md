# kotlinDemo
demo of springboot with lotlin
关于测试
这里，笔者推荐 IDEA 的 Editor REST Client。IDEA 的 Editor REST Client 在 IntelliJ IDEA 2017.3 版本就开始支持，在 2018.1 版本添加了很多的特性。
```
### 查询用户列表
GET http://localhost:8080/authors
Accept : application/json
Content-Type : application/json;charset=UTF-8
 
### 查询用户信息
GET http://localhost:8080/authors/15
Accept : application/json
Content-Type : application/json;charset=UTF-8
 
### 新增方法
POST http://localhost:8080/authors
Content-Type: application/json
 
{
    "user_id": "21",
    "real_name": "梁桂钊",
    "nick_name": "梁桂钊"
}
 
### 更新方法
PUT http://localhost:8080/authors/21
Content-Type: application/json
 
{
    "real_name" : "lianggzone",
    "nick_name": "lianggzone"
}
 
### 删除方法
DELETE http://localhost:8080/authors/21
Accept : application/json
Content-Type : application/json;charset=UTF-8
```
总结
通过，上面这个简单的案例，我们发现 Spring Boot 整合 Kotlin 非常容易，并简化 Spring 应用的初始搭建以及开发过程。