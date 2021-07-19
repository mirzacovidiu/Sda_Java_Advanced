package com.sda.lectia6.input_output.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        writeObject();
        Person person = readObject();
    }

    public static void writeObject() throws IOException {
        File file = new File("src/file2.txt");
        Person person = new Person("Michael", "Dudikoff");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Throwable var3 = null;

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Throwable var5 = null;

            try {
                objectOutputStream.writeObject(person);
            } catch (Throwable var28) {
                var5 = var28;
                throw var28;
            } finally {
                if (objectOutputStream != null) {
                    if (var5 != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable var27) {
                            var5.addSuppressed(var27);
                        }
                    } else {
                        objectOutputStream.close();
                    }
                }

            }
        } catch (Throwable var30) {
            var3 = var30;
            throw var30;
        } finally {
            if (fileOutputStream != null) {
                if (var3 != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable var26) {
                        var3.addSuppressed(var26);
                    }
                } else {
                    fileOutputStream.close();
                }
            }

        }

    }

    public static Person readObject() throws IOException, ClassNotFoundException {
        File file = new File("src/file2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        Throwable var3 = null;

        Person person;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Throwable var5 = null;

            try {
                person = (Person)objectInputStream.readObject();
            } catch (Throwable var28) {
                var5 = var28;
                throw var28;
            } finally {
                if (objectInputStream != null) {
                    if (var5 != null) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable var27) {
                            var5.addSuppressed(var27);
                        }
                    } else {
                        objectInputStream.close();
                    }
                }

            }
        } catch (Throwable var30) {
            var3 = var30;
            throw var30;
        } finally {
            if (fileInputStream != null) {
                if (var3 != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable var26) {
                        var3.addSuppressed(var26);
                    }
                } else {
                    fileInputStream.close();
                }
            }

        }

        return person;
    }
}

