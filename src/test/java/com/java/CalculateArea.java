package com.java;

class CalculateArea {

    public static void main(String[] args) {

        CalculateArea calculateArea = new CalculateArea();
        calculateArea.getAreaOfTriangle();
        calculateArea.getPerimeterOfRectangle();
        calculateArea.getAreaOfCircle();
        calculateArea.getAreaOfSquare();
        calculateArea.getAreaOfTrapezoid();
        calculateArea.getPerimeterOfCircle();
        calculateArea.getPerimeterOfRectangle();
        calculateArea.getPerimeterOfSquare();
        calculateArea.getPerimeterOfTriangle();
        calculateArea.getVolumeOfCube();
        calculateArea.getVolumeOfRightRectangularPrism();
    }

    public int getPerimeterOfRectangle(){
        int length = 4 , width = 4 , perimeter;
        perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter of a Rectangle is : " +perimeter);
        return perimeter;
    }

    public int getPerimeterOfSquare(){
        int length_of_side = 5 , perimeter;
        perimeter = 4 * length_of_side;
        System.out.println("Perimeter of a Square is : " +perimeter);
        return perimeter;
    }

    public int getPerimeterOfTriangle(){
        int a = 10 , b = 45 , c = 25 , perimeter;
        perimeter = a + b + c;
        System.out.println("Perimeter of a Triangle is : " +perimeter);
        return perimeter;
    }

    public double getPerimeterOfCircle(){
        double  pi = 3.14 , radius = 3.5 , perimeter;
        perimeter = 2 * pi * radius;
        System.out.println("Perimeter of a Triangle is : " +perimeter);
        return perimeter;
    }

    public double getAreaOfTriangle() {
        double base = 5, height = 10, areaOfTriangle;
        areaOfTriangle = (0.5) * base * height;
        System.out.println("Area of Triangle is : " + areaOfTriangle);
        return areaOfTriangle;
    }

    public double getAreaOfCircle() {
        double pi = 3.14, radius = 10, areaOfCircle;
        areaOfCircle = pi * radius * radius;
        System.out.println("Area of Triangle is : " + areaOfCircle);
        return areaOfCircle;
    }

    public int getAreaOfSquare(){
        int sides = 8 , areaOfSquare;
        areaOfSquare = sides * sides;
        System.out.println("Area of Triangle is : " + areaOfSquare);
        return areaOfSquare;
    }

    public double getAreaOfTrapezoid(){
        double b1 = 5 , b2 = 6 , height = 8 , areaOfTrapezoid;
        areaOfTrapezoid = (b1 + b2 / 2) * height;
        System.out.println("Area of Trapezoid is : " + areaOfTrapezoid);
        return areaOfTrapezoid;
    }

    public int getVolumeOfCube(){
        int length_of_side = 10 , volumeOfCube;
        volumeOfCube = length_of_side^3;
        System.out.println("Volume of Cube is : " + volumeOfCube);
        return volumeOfCube;
    }

    public int getVolumeOfRightRectangularPrism(){
        int length = 10 , width = 25 , height = 50 , volumeOfRightRectangularPrism;
        volumeOfRightRectangularPrism = length * width * height;
        System.out.println("Volume of Right Rectangular Prism is : " + volumeOfRightRectangularPrism);
        return volumeOfRightRectangularPrism;
    }
}


