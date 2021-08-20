package com.sda.coding_exercises.ex32;

import java.io.*;

/**
 *  Write a program that will be able to save the list of items (e.g. cars) to a file in such a format that it can also read
 * this file and create a new list of items and write it to the console
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer("30000", "20000", "123545", "1233", "12325");
        writeObject(computer);
        writeObject(computer);
        Computer computer2 = readObject("C:/Users/ACASA/IdeaProjects/curs_Java/ex32.txt");
        System.out.println(computer2);

    }

    public static <T> void writeObject(T object) throws IOException
    {
        File file = new File("C:/Users/ACASA/IdeaProjects/curs_Java/ex32.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(object);
        }
    }

    public static <T> T readObject(String filePath) throws IOException, ClassNotFoundException
    {
        File file = new File(filePath);

        T object;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream =
                     new ObjectInputStream(fileInputStream))
        {
            object = (T) objectInputStream.readObject();
        }

        return object;
    }
}
