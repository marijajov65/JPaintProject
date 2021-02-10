package controller;

import controller.shapes.FilledInRectangle;
import model.interfaces.IShape;
import view.interfaces.PaintCanvasBase;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ShapeListSelected {

    //ShapeList collection class
    private static final ArrayList<IShape> selectedList = new ArrayList<>();
    private static PaintCanvasBase canvas;
    private static FilledInRectangle boundingBox;

    public ShapeListSelected(PaintCanvasBase canvas){

        this.canvas = canvas;
    }

    public static void push(IShape shape) {
        if (shape == null) throw new IllegalArgumentException();
        selectedList.add(shape);
    }

    public static void pop() {
        if (selectedList.isEmpty()) throw new EmptyStackException();
        selectedList.remove(selectedList.size()-1);
    }

    public static void clearAll() {
        selectedList.clear();
    }

    public static ArrayList<IShape> getList(){
        return selectedList;
    }

    public static void setBoundingBox(FilledInRectangle box){
        boundingBox = box;
    }

    public static FilledInRectangle getBoundingBox(){
        return boundingBox;
    }


}