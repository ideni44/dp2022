package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import sneakers.Sneakers;

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
	
	public static Sneakers sneakersParse(HttpServletRequest request) {
		Sneakers sneakers = new Sneakers();
		JsonElement jsonElement = bodyParse(request);
		sneakers.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		sneakers.setImg(jsonElement.getAsJsonObject().get("img").getAsString());
		sneakers.setDescription(jsonElement.getAsJsonObject().get("description").getAsString());
		return sneakers;
	}
	
	public static int getNextId(List<Sneakers> list) {
		int maxId = 0;
		
		Iterator<Sneakers> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByUserId(int id,List<Sneakers> list) {
		int listId = id;
		
		Iterator<Sneakers> iterator = list.iterator();
		while(iterator.hasNext()) {
			Sneakers temp = iterator.next();
			if(temp.getId()== listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}