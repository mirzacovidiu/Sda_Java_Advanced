package com.sda.lectia6.input_output;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


    public class Main {

        public static void main(String[] args) {
            new File("src/file.txt");
            new File("file.txt");
        }

        public static void firstExample() throws IOException {
            File file = new File("file.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Throwable var2 = null;

            try {
                String fileLine;
                try {
                    while((fileLine = bufferedReader.readLine()) != null) {
                        System.out.println(fileLine);
                    }
                } catch (Throwable var11) {
                    var2 = var11;
                    throw var11;
                }
            } finally {
                if (var2 != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable var10) {
                        var2.addSuppressed(var10);
                    }
                } else {
                    bufferedReader.close();
                }

            }

        }

        public static void secondExample() throws IOException {
            File file = new File("src/file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Throwable var2 = null;

            try {
                String fileLine = "file line";
                bufferedWriter.write(fileLine);
            } catch (Throwable var11) {
                var2 = var11;
                throw var11;
            } finally {
                if (var2 != null) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable var10) {
                        var2.addSuppressed(var10);
                    }
                } else {
                    bufferedWriter.close();
                }

            }

        }

        public static void thirdExample() throws IOException {
            File file = new File("src/file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            Throwable var2 = null;

            try {
                String fileLine = "\nappended file line";
                bufferedWriter.write(fileLine);
            } catch (Throwable var11) {
                var2 = var11;
                throw var11;
            } finally {
                if (var2 != null) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable var10) {
                        var2.addSuppressed(var10);
                    }
                } else {
                    bufferedWriter.close();
                }

            }

        }
    }


