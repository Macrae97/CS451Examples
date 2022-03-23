package week_7.composite;

import java.util.List;

abstract class Shape {

    int x = 0;
    int y = 0;

    int getX(){return this.x;}
    int getY(){return this.y;}

    void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    abstract int width();
    abstract int height();
    abstract void draw();
}

//leaf class
class Rectangle extends Shape {

    public int height;
    public int width;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    int width() {
        return width;
    }

    @Override
    int height() {
        return height;
    }

    @Override
    void draw() {
        System.out.println("drawing rectangle at: " +
                this.x + ", " + this.y +
                "; width : " + width() +
                "; height : " + height());
    }
}

//leaf class
class Circle extends Shape {

    public int radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    int width() {
        return radius * 2;
    }

    @Override
    int height() {
        return radius * 2;
    }

    @Override
    void draw() {
        System.out.println("drawing circle at: " +
                this.x + ", " + this.y +
                "; width : " + width() +
                "; height : " + height());
    }
}

//composite
class GroupShapes extends Shape{

    private List<Shape> children;

    public GroupShapes(List<Shape> children){
        this.children = children;
    }

    public int getX(){
        if (children.size() == 0){
            return 0;
        }
        int x = children.get(0).getX();
        for (Shape child : children) {
            if (child.getX() < x){
                x = child.getX();
            }
        }
        return x;
    }

    public int getY(){
        if (children.size() == 0){
            return 0;
        }
        int y = children.get(0).getY();
        for (Shape child : children) {
            if (child.getY() < y){
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    int width() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : children) {
            int relativeX = child.getX() - x;
            int childWidth = relativeX + child.width();
            if (childWidth > maxWidth){
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    int height() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : children) {
            int relativeY = child.getY() - y;
            int childHeight = relativeY + child.height();
            if (childHeight > maxHeight){
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    void move(int x, int y){
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    void draw() {
        System.out.println("Drawing composite...");
        for (Shape child : children) {
            child.draw();
        }
    }
}
