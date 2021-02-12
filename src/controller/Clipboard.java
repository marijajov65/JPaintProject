package controller;

import controller.shapes.Shape;
import model.interfaces.IShape;

import java.util.ArrayList;

public class Clipboard {
    private static ArrayList<IShape> copiedItems = new ArrayList<IShape>();

    public static void addToClipBoard(IShape shape){
        Shape newShape = null;
        try {
            newShape = (Shape)((Shape)shape).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        newShape.setStart(newShape.getStart().getX()+50,newShape.getStart().getY()+50);
        copiedItems.add((IShape) newShape);
    }

    public static void clearClipboard(){
        copiedItems.clear();
    }
    public static ArrayList<IShape> getCopiedItems(){
        return new ArrayList<>(copiedItems);
    }

/*
    public static void pasteFromClipboard(){
        ShapeDrawer sd = new ShapeDrawer();
        for(IShape shape: copiedItems){
            ShapeList.getList().add(shape);
        }
        sd.drawSelected(copiedItems,ShapeList.getCanvas());
    }

*/


}