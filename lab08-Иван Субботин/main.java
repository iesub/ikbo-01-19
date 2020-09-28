package ru.mirea.lab08;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File("test.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(line);
            writer.flush();
        } catch (IOException e) {
            System.out.println("No such file or directory");
        }
        try {
            FileReader reader = new FileReader(file);
            int c = 0;
            while((c=reader.read())!=-1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file or directory");
        }

    }
}
