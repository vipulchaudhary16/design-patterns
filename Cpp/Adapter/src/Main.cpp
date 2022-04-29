#include <iostream>

class Pen
{
public:
    virtual void write(const char *str) = 0;
};

class PilotPen
{
public:
    void mark(const char *str)
    {
        std::cout << str << std::endl;
    }
};

class PenAdapter : public Pen
{
private:
    PilotPen obj;

public:
    void write(const char *str)
    {
        obj.mark(str);
    }
};

class AssignmentWork
{
private:
    Pen *p;

public:
    Pen *getPen() const
    {
        return p;
    }

    void setPen(Pen *obj)
    {
        p = obj;
    }

    void writeAssignment(const char *str)
    {
        p->write(str);
    }
};

int main()
{
    Pen *p = new PenAdapter();
    AssignmentWork ass;
    ass.setPen(p);
    ass.writeAssignment("Halniii!");
}
