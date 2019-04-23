package PropertiesFileDemos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesSetProperty {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		OutputStream os=new FileOutputStream("dataConfig.properties");
		properties.setProperty("url", "https://www.google.com/");
		properties.setProperty("username", "ali");
		properties.setProperty("password", "veli");
		properties.setProperty("operatingSystem","windows10");
		properties.setProperty("browser", "chrome");
		
		properties.store(os, null);

	}

}
