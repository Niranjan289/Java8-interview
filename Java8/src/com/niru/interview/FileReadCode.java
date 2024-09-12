package com.niru.interview;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadCode {

    public static void main(String[] args) {
        try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\admin\\Desktop\\name.txt"))) {
            lines.map(line -> {
                String name = line.split(",")[0];
                String name2 = line.split(",")[1];
                return null;
            });

            lines.forEach(System.out::println);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
