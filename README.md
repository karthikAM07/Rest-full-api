# Restfull-API
 RESTful API for querying the animals-[search,Insert, delete];
 
 retriveAllAnimal in JSON formate using <B>GET</B> methos: http://localhost:8010/animals ;

 
 Create the new item using <B>POST</B> method in our service;
 
 We can delete the particular item using <B>DELETE</B> method in our service ;
 

 
 
 <b><h1>Example Requests</h1></b> 
 
<b> GET http://localhost:8010/animals </b>
```
[
    {
        "id": 1,
        "name": "Rooster",
        "language": "Danish",
        "sound": "kykyliky"
    },
    {
        "id": 2,
        "name": "Rooster",
        "language": "Dutch",
        "sound": "kukeleku"
    },
    {
        "id": 3,
        "name": "Rooster",
        "language": "Finnish",
        "sound": "kukko kiekuu"
    },
    {
        "id": 4,
        "name": "Rooster",
        "language": "French",
        "sound": "cocorico"
    },
    {
        "id": 5,
        "name": "Rooster",
        "language": "German",
        "sound": "kikeriki"
    },
    {
        "id": 6,
        "name": "Rooster",
        "language": "Hebrew",
        "sound": "coo-koo-ri-koo"
    },
    {
        "id": 7,
        "name": "Rooster",
        "language": "Italian",
        "sound": "chicchirichi"
    },
    {
        "id": 8,
        "name": "Rooster",
        "language": "Japanese",
        "sound": "ko-ke-kok-ko-o"
    },
    {
        "id": 9,
        "name": "Rooster",
        "language": "Portuguese",
        "sound": "cucurucu"
    },
    {
        "id": 10,
        "name": "Rooster",
        "language": "Russian",
        "sound": "kukareku"
    },
    {
        "id": 11,
        "name": "Rooster",
        "language": "Swedish",
        "sound": "kuckeliku"
    },
    {
        "id": 12,
        "name": "Rooster",
        "language": "Turkish",
        "sound": "kuk-kurri-kuuu"
    },
    {
        "id": 13,
        "name": "Rooster",
        "language": "Urdu",
        "sound": "kuklooku"
    }
]
```


<b> GET http://localhost:8010/animals/10 </b>
```
{
    "id": 10,
    "name": "Rooster",
    "language": "Russian",
    "sound": "kukareku"
}
```
![image](https://user-images.githubusercontent.com/63912537/79681631-4f6fac00-824e-11ea-91d2-4bc99e92fcdc.png)


<b> POST http://localhost:8010/animals </b>
```
{
        "id": 14,
        "name": "Rooster",
        "language": "Tamil",
        "sound": "tkkykyk"
    }
```
![image](https://user-images.githubusercontent.com/63912537/79681646-64e4d600-824e-11ea-8cec-c6e2a4b0706f.png)

![image](https://user-images.githubusercontent.com/63912537/79681667-85149500-824e-11ea-81af-b08c2631b9e3.png)


<b> GET http://localhost:8010/animals/1000 </b>

i.Get request to a non existing resource.
ii.The response shows a Customized Message Structure
```
{
    "timestamp": "2020-04-18T15:05:17.788+0000",
    "message": "id-100",
    "details": "uri=/animals/100"
}
```

<b>POST http://localhost:8010/animals with Validation Errors </b>

<b>Request</b>
```
{
        "id": 15,
        "name": "R",
        "language": "Kannada",
        "sound": "kkkaaakaa"
    }
```
<b>Response - 400 Bad Request</b>
```
{
    "timestamp": "2020-04-18T15:12:58.063+0000",
    "message": "Validation Failed",
    "details": "org.springframework.validation.BeanPropertyBindingResult: 1 errors\nField error in object 'animal' on field 'name': rejected value [R]; codes [Size.animal.name,Size.name,Size.java.lang.String,Size]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [animal.name,name]; arguments []; default message [name],2147483647,2]; default message [min have 2 char]"
}
```
<b> DELETE http://localhost:8010/animals/10 </b>

![image](https://user-images.githubusercontent.com/63912537/79681818-bfcafd00-824f-11ea-9a72-991e9fc4d582.png)


<b>/pom.xml</b>
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.3.RELEASE</version><!-- 2.3.0.BUILD-SNAPSHOT -->
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.example.restfull</groupId>
	<artifactId>resfull_API</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>resfull_API</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<!-- <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency> -->


	    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-hateoas</artifactId>
		</dependency>
		
	<!-- 	<dependency>
   		 <groupId>com.fasterxml.jackson.dataformat</groupId>
    	 	<artifactId>jackson-dataformat-xml</artifactId>
		</dependency> -->
		
		<dependency>
    	<groupId>io.springfox</groupId>
    	<artifactId>springfox-swagger2</artifactId>
    	<version>2.9.2</version>
		</dependency>
		
		<dependency>
    	<groupId>io.springfox</groupId>
    	<artifactId>springfox-swagger-ui</artifactId>
    	<version>2.9.2</version>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

	<repositories>
		<repository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
		</repository>
		<repository>
			<id>spring-snapshots</id>
			<name>Spring Snapshots</name>
			<url>https://repo.spring.io/snapshot</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>
	<pluginRepositories>
		<pluginRepository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
		</pluginRepository>
		<pluginRepository>
			<id>spring-snapshots</id>
			<name>Spring Snapshots</name>
			<url>https://repo.spring.io/snapshot</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</pluginRepository>
	</pluginRepositories>

</project>
```

<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/Exception/CustomaizeResponseEntityExceptionHandler.java</b>
```
package com.example.restfull.resfull_API.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.restfull.resfull_API.user.animalNotFoundException;

@ControllerAdvice
@RestController
public class CustomaizeResponseEntityExceptionHandler 
extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException
	(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse=
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
	
	return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	@ExceptionHandler(animalNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotException
	(animalNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse=
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
	
	return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionResponse exceptionResponse=
				new ExceptionResponse(new Date(), "Validation Failed", ex.getBindingResult().toString());
	
		return new  ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

}

```
<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/Exception/ExceptionResponse.java</b>
```
package com.example.restfull.resfull_API.Exception;

import java.util.Date;




public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String details;
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
}

```

<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/ResfullApiApplication.java</b>

```
package com.example.restfull.resfull_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResfullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResfullApiApplication.class, args);
	}

}

```
<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/SwaggerConfig.java</b>
```
package com.example.restfull.resfull_API;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2);
	}
}

```

<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/animal/Animal.java</b>
```
package com.example.restfull.resfull_API.animal;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Animal {
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min=2, message="min have 2 char")
	private String name;
	
	private String language;
	private String sound;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", language=" + language + ", sound=" + sound + "]";
	}
	public Animal(Integer id, String name, String language, String sound) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.sound = sound;
	}
	public Animal() {
		
	}
	
}

```

<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/animal/AnimalDaoService.java</b>
```
package com.example.restfull.resfull_API.animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AnimalDaoService {

	private static List<Animal> animals = new ArrayList<>();
	private static int animalCount=3;
	static {
		animals.add(new Animal(1, "Rooster", "Danish", "kykyliky"));
		animals.add(new Animal(2, "Rooster", "Dutch", "kukeleku"));
		animals.add(new Animal(3, "Rooster","Finnish", "kukko kiekuu"));
		animals.add(new Animal(4, "Rooster","French", "cocorico"));
		animals.add(new Animal(5, "Rooster","German", "kikeriki"));
		animals.add(new Animal(6, "Rooster","Hebrew", "coo-koo-ri-koo"));
		animals.add(new Animal(7, "Rooster","Italian", "chicchirichi"));
		animals.add(new Animal(8, "Rooster","Japanese", "ko-ke-kok-ko-o"));
		animals.add(new Animal(9, "Rooster","Portuguese", "cucurucu"));
		animals.add(new Animal(10, "Rooster","Russian", "kukareku"));
		animals.add(new Animal(11, "Rooster","Swedish", "kuckeliku"));
		animals.add(new Animal(12, "Rooster","Turkish", "kuk-kurri-kuuu"));
		animals.add(new Animal(13, "Rooster","Urdu", "kuklooku"));
	}
	
	public List<Animal> findAll(){
		return animals;
	}
	public Animal save(Animal animal){
		if(animal.getId()==null){
			animal.setId(++animalCount);
		}
		animals.add(animal);
		return animal;
	}
	public Animal findOne(int id){
		for(Animal animal:animals){
			if(animal.getId()== id){
				return animal;
			}
		}
		return null;
	}
	
	public Animal deleteAnimal(int id){
		Iterator <Animal> iterator = animals.iterator();
		while(iterator.hasNext()){
			Animal animal = iterator.next();
			if(animal.getId()== id){
				iterator.remove();
				return animal;
			}
		}
		return null;
	}
}

```
<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/animal/animalNotFoundException.java</b>
```
package com.example.restfull.resfull_API.animal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class animalNotFoundException extends RuntimeException {

	public animalNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

```
<b>/resfull_API/src/main/java/com/example/restfull/resfull_API/animal/AnimalResource.java</b>
```
package com.example.restfull.resfull_API.animal;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AnimalResource {
    
	@Autowired
	AnimalDaoService service;
	
	//retriveAllAnimal
	//GET /animals
	@GetMapping("/animals")
	public List<Animal> retriveAllAnimal(){
		return service.findAll();
	}
	
	//retriveOneAnimal
	@GetMapping("/animals/{id}")
	public Animal findAnimal(@PathVariable int id){
		Animal animal = service.findOne(id);
		
		if (animal==null) throw new animalNotFoundException("id-"+id);
		
		org.springframework.hateoas.Resource<Animal> resource 
		= new org.springframework.hateoas.Resource<Animal>(animal);
		
	//ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()),retriveAllAnimal());
		return animal;
	}
	
	//creating Animal
	//POST/Animal
	@PostMapping("/animals")
	public ResponseEntity<Object> createAnimal(@Valid @RequestBody Animal animal){
		Animal savedAnimal = service.save(animal);
	
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedAnimal.getId())
		.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	//delete animal
	@DeleteMapping("/animals/{id}")
	public Animal deleteAnimal(@PathVariable int id){
		Animal animal = service.deleteAnimal(id);
		if (animal==null) throw new animalNotFoundException("id-"+id);
		return animal; 
	}
}

```



 <h2> H2-Console</h2>
http://localhost:8010/h2-console
 
