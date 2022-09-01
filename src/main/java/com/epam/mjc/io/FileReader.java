package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = null;
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String name = br.readLine().substring(6);
            Integer age = Integer.parseInt(br.readLine().substring(5));
            String email = br.readLine().substring(7);
            Long phone = Long.parseLong(br.readLine().substring(7));
            profile = new Profile(name, age, email, phone);
            System.out.println(profile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return profile;
    }
}
