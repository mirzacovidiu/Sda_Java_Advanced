package com.sda.lectia6.input_output.newiodir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/somedir");
        Files.createDirectory(path);
        Path relativePath = Paths.get("src");
        Files.isDirectory(relativePath, new LinkOption[0]);
    }
}
