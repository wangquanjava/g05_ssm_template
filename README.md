# g05_ssm_template
#### 1.需要修改的
1. 修改pom.xml中artifactId、tomcat虚拟目录
2. 修改web.xml中<display-name>、<servlet-name>
3. 修改org.eclipse.wst.common.component中的项目名
4. 修改jdbc.properties中数据库用户信息

#### 2.自身功能
4. 配置了一个默认的拦截器，没做任何处理，允许通过了com.git.intercepor.DemoInteceptor，springmvc.xml
5. 采用c3p0连接池
6. 添加listener，用于监测服务器启动和关闭，web.xml\com.git.listener.ContextListener
7. 配置pom.xml，支持服务器和本地开发的不用配置jdbc.properties、jdbc_product.properties、jdbc_development.properties