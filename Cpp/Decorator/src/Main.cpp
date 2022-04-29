#include <iostream>

class Shape
{
public:
    virtual void draw() = 0;
};

class Circle : public Shape
{
public:
    void draw()
    {
        std::cout << "Circle" << std::endl;
    }
};

class ShapeDecorator : public Shape
{
protected:
    Circle decoratedCircle;

public:
    ShapeDecorator() {}

    ShapeDecorator(Circle circle)
        : decoratedCircle(circle)
    {}

    void draw()
    {
        decoratedCircle.draw();
    }
};

class Decorate : public ShapeDecorator
{
private:
    bool is3D = false;
    void setBorder()
    {
        std::cout << "Border: Blue" << std::endl;
    }

    void set3D()
    {
        std::cout << "Converted to 3D";
    }

public:
    Decorate(Circle circle, bool is3D)
        : ShapeDecorator(circle), is3D(is3D)
    {}

    void draw()
    {
        decoratedCircle.draw();
        setBorder();
        if (is3D)
            set3D();
    }
};

int main()
{
    Circle circle;
    circle.draw();
    Decorate d(circle, true);
    d.draw();
}
