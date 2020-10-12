package ru.mirea.lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void dirOps(String dir){
        File file = new File(dir);
        if (!file.isDirectory() || !file.exists())
            return;
        List<File> fileList = new ArrayList<File>();
        for (File elem : file.listFiles())
            fileList.add(elem);
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(fileList.get(i).getName());
        } catch (Exception e) {
            System.out.println("Файлов меньше 5");
        }
    }

    public static void main(String[] args) {
        String[] list01 = {"one", "two", "three"};
        Conversion<String> list11 = new Conversion<>(list01);
        list11.showList();
        System.out.println(list11.getElementById(2));
        Integer[] list02 = {1, 2, 3};
        Conversion<Integer> list12 = new Conversion<>(list02);
        list12.showList();
        System.out.println(list12.getElementById(2));
        ArrayContainer<String> arr11 = new ArrayContainer<>();
        arr11.setArr(list01);
        arr11.showArr();
        ArrayContainer<Integer> arr12 = new ArrayContainer<>();
        arr12.setArr(list02);
        arr12.showArr();
        dirOps("dir");
    }
}
