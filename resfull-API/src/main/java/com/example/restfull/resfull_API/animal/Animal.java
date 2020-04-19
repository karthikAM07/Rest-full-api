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
