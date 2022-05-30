package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import animals.Animal;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Animal animalParse(HttpServletRequest request) {
		Animal animal = new Animal("Tiger", 5, "qwerty");
		JsonElement jsonElement = bodyParse(request);
		animal.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		animal.setAge(jsonElement.getAsJsonObject().get("age").getAsInt());
		animal.setInfo(jsonElement.getAsJsonObject().get("name").getAsString());
		return animal;
	}
}
