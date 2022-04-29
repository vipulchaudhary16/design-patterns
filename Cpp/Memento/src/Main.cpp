#include <iostream>
#include <string>
#include <vector>

class Memento
{
private:
    std::string state;

public:
    Memento(std::string state)
        : state(state) {}

public:
    std::string getState() const
    {
        return state;
    }
};

class CareTaker
{
private:
    std::vector<Memento *> mementoList;

public:
    void add(Memento *memento)
    {
        mementoList.emplace_back(memento);
    }
    Memento *get(const int &index)
    {
        return mementoList.at(index);
    }
};

class Originator
{
private:
    std::string state;

public:
    void setState(std::string state)
    {
        this->state = state;
    }
    std::string getState() const
    {
        return state;
    }
    Memento *saveStateToMemento()
    {
        return new Memento(state);
    }
    void restoreFromMemento(Memento memento)
    {
        state = memento.getState();
    }
};

int main()
{
    std::string state;
    Originator o;
    CareTaker c;

    state = "State 1";
    o.setState(state);
    state = "State 2";
    o.setState(state);
    c.add(o.saveStateToMemento());
    state = "State 3";
    o.setState(state);
    c.add(o.saveStateToMemento());

    o.restoreFromMemento(*(c.get(0)));
    std::cout << o.getState() << std::endl;
    o.restoreFromMemento(*(c.get(1)));
    std::cout << o.getState() << std::endl;
}
