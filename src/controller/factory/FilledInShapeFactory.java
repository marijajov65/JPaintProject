package controller.factory;

import controller.Point;
import controller.factory.AbstractFactory;
import controller.shapes.FilledInEllipse;
import controller.shapes.FilledInRectangle;
import controller.shapes.FilledInTriangle;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.interfaces.IShape;
import view.interfaces.PaintCanvasBase;

public class FilledInShapeFactory extends AbstractFactory {

    @Override
    public IShape getShape(Point start, Point end, int width, int height, ShapeType shapeType, ShapeColor primaryColor, ShapeColor secondaryColor, ShapeShadingType shadingType, PaintCanvasBase canvas) {
        switch(shapeType){
            case RECTANGLE:
                return new FilledInRectangle(start, end,width,height, shapeType, primaryColor, secondaryColor, shadingType, canvas);
            case ELLIPSE:
                return new FilledInEllipse(start, end,width,height, shapeType, primaryColor, secondaryColor, shadingType,canvas);
            case TRIANGLE:
                return new FilledInTriangle(start, end,width,height, shapeType, primaryColor, secondaryColor, shadingType,canvas);
        }
        //default
        return new FilledInRectangle(start, end,width,height, shapeType, primaryColor, secondaryColor, shadingType, canvas);
    }
    }

