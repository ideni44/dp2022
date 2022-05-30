package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import sneakers.Sneaker;

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
	
	public static Sneaker sneakerParse(HttpServletRequest request) {
		Sneaker sneaker = new Sneaker("NKM","qwerty", 5,);
		JsonElement jsonElement = bodyParse(request);
		sneaker.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		sneaker.setSize(jsonElement.getAsJsonObject().get("size").getAsInt());
		sneaker.setDesc(jsonElement.getAsJsonObject().get("desc").getAsString());
		return sneaker;
	}
}