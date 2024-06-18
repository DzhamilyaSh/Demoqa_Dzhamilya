package com.demoqa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private ConfigReader(){
        //Singleton pattern
    }

    static {
        try {
            String path = "src/main//resources/app.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getValue(String key){
        return properties.getProperty(key).trim(); //properties мнодественное число а getProparty  у нас выводит одно значение с множественного Properties
        //key это у нас значение которые указанные в  app.proparties browse,username ,password  и т д.
        // trim нам нужен для того чтобы , если мы добавили в наш proparties в значение какитео пробелы она удалит нам пробелы

    }

//    public static void main(String[] args) {
//        System.out.println(getValue("browser"));
//        System.out.println(getValue("userName"));
//        System.out.println(getValue("password"));
//    }
}
