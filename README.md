添加Spring Security依赖
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
</dependency>
添加依赖后默认开始授权验证
无论访问哪个Url，都会先访问localhost：port/login

控制台获取密码
2019-11-19 14:14:36.882  INFO 43716 --- [           main] .s.s.UserDetailsServiceAutoConfiguration : 

Using generated security password: **803cb247-3ce7-4c6b-9092-31fd6bd38dc9**

用户默认为user
密码每次都是随机生成的密码
