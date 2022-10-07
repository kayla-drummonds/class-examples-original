package com.teksystems.shapes;

public class ShapesApplication {

    public static void main(String[] args) {
        Circle circle = new Circle(100);
        System.out.println("Area of Circle " + circle.getArea());

        Shape shape = new Shape();
        shape.displayShapeName();
        System.out.println(shape instanceof Shape);
        
        System.out.println("+++++++++");

        // it’s fine because a Circle is a Shape by inheritance
        Shape shapeCircle = new Circle(100);  // UpCasting
        shapeCircle.displayShapeName();
        System.out.println("Area of Circle " + shapeCircle.getArea());
        System.out.println(shapeCircle);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircle instanceof Circle); // true
        System.out.println(circle instanceof Circle); // false because Shape is not a Circle

        System.out.println("--------------------");
        Shape shapeRectangle = new Rectangle("Red"); //UpCasting
        shapeRectangle.displayShapeName();
        shapeRectangle.setHeight(2);
        shapeRectangle.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangle.getArea());
        System.out.println(shapeRectangle);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangle instanceof Rectangle); // true
        System.out.println(shape instanceof Rectangle); // false because Shape is not a Rectangle

        System.out.println("--------------------");
        Shape shapeTriangle = new Triangle("Blue"); //UpCasting
        shapeTriangle.displayShapeName();
        shapeTriangle.setHeight(2);
        shapeTriangle.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangle.getArea());
        System.out.println(shapeTriangle);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeTriangle instanceof Triangle); // true
        System.out.println(shape instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3); //UpCasting
        cylinderShape.displayShapeName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);  // Run cylinderShape's toString()


    }

}
