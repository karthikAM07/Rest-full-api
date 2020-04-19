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
