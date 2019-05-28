package ohm.softa.a09.model;


import javafx.scene.image.Image;
import ohm.softa.a09.resource.ResourceLoader;

public class Flyweight {

	private final Image image;
	private ResourceLoader<Image> loader = new ResourceLoader<>(Image::new);

	Flyweight(String path){

		this.image = loader.loadResource(ClassLoader.getSystemClassLoader(),path);
	}

	public Image getImage() {
		return image;
	}
}
