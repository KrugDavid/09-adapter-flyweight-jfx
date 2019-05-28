package ohm.softa.a09.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String,Flyweight> flyweightMap = new HashMap<>();

	Flyweight getFlyweight(String path) throws IOException, URISyntaxException {
		if(flyweightMap.containsKey(path))
			return flyweightMap.get(path);

		Flyweight fw = new Flyweight(path);
		flyweightMap.put(path,fw);

		return fw;
	}
}
