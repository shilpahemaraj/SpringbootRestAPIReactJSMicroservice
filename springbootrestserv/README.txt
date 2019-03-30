SpringbootRestApiService:
	Step 1: Create Resource Interface
	
	Step 2: Implement Resource Interface
	
	Step 3: Create User class and use lombok to create builder and getter. Add dependency in pom.xml
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<scope>provided</scope>
		</dependency>
		
	Step 4: Create Static User list 
	
	Step 5: Register Class in ResourceConfig.
			@Component
			public class JerseyConfig extends ResourceConfig{
	 			public JerseyConfig() {
				 register(UserResource.class);
	 			}
			}
	Step 6: Test using Postman
		http://localhost:8080/users/1
