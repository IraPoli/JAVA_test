package org.example.jdbc.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
  Properties property = new Properties();

  public PropertiesReader() {
    FileInputStream fileInputStream;
    try {
      fileInputStream = new FileInputStream("src/main/java/org/example/jdbc/properties/config.properties");
      property.load(fileInputStream);
      fileInputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getDBURL() {
    return property.getProperty("db.url");
  }

  public String getDBName() {
    return property.getProperty("db.user.name");
  }
  public String getDBPassword() {
    return property.getProperty("db.user.password");
  }

}
