package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Simon on 10/23/2017.
 */
public class Menu {
    HashMap<Integer, MenuItem> menu = new HashMap<>();

    public Menu(){
        try {
            File f = new File("signatures.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String[] line = sc.nextLine().split(",");
                menu.put(Integer.parseInt(line[0]), new MenuItem(line[1], Double.parseDouble(line[2])));
            }
        }
        catch (FileNotFoundException f){
            System.out.println("File not found");
        }
    }

    private class MenuItem {
        private final String name;
        private final double cost;

        private MenuItem(String name, double cost){
            this.name = name;
            this.cost = cost;
        }
    }
}
