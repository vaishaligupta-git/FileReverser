package com.example.vaishali.filereverser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReverser {

    public String readFile(String filePath) throws IOException{
        return new String (Files.readAllBytes(Paths.get(ˇ)));
    }

    public String reverseContent(String content) throws IOException{
        return new StringBuilder(content).reverse().toString();
    }

    public void writeFile(String filePath, String content) throws IOException{
        Files.write(Paths.get(filePath), content.getBytes());
    }

    public void reverseFileContent(String inputFilePath, String outputFilePath) throws IOException {
        String content = readFile(inputFilePath);
        String reversedContent = reverseContent(content);
        writeFile(outputFilePath, reversedContent);
    }
}
