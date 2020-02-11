package com.kodilla.testing.shape;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<String> figures = new ArrayList<String>();

    public void addFigure(Shape shape) {
        figures.add("circle");
        figures.add("square");
        figures.add("triangle");
    }

    public void removeFigure(Shape shape) {
        figures.remove("circle");
    }

    public void getFigure(int n) {
        figures.get(2);
    }

    public void showFigures() {
        for(String all: figures) {
            System.out.println(all);
        }
    }
}
