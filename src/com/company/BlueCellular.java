package com.company;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

class Colour {

    private String name;
    private String code;

    public Colour(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

public class BlueCellular {


    public static void main(String[] args) {

        Map<Integer, Colour> cols = new HashMap<>();

        cols.put(1, new Colour("AliceBlue", "#f0f8ff"));
        cols.put(2, new Colour("GreenYellow", "#adff2f"));
        cols.put(3, new Colour("IndianRed", "#cd5c5c"));
        cols.put(4, new Colour("khaki", "#f0e68c"));
        cols.put(5, new Colour("khaki", "#f0e68c"));

        System.out.printf("The size of the map is %d%n", cols.size());

        int key = 4;

        if (cols.containsKey(key)) {

            System.out.printf("The map contains key %d%n", key);
        }

        cols.remove(1);

        System.out.printf("The size of the map is %d%n", cols.size());

        cols.replace(3, new Colour("VioletRed", "#d02090"));

        for (int i = 1; i <= cols.size(); i++) {
            if (cols.get(i) == null) {
                System.out.println("not %d" + i);
            } else {


                System.out.printf("Colour name:%s colour code:%s %n",

                        cols.get(i).getName(), cols.get(i).getCode() + i);

            }
        }
    }

}
