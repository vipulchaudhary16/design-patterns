#include <iostream>

class World
{
public:
    static World w;

private:
    World() = delete;
public:
    static World getInstance()
    {
        return w;
    }
    void sayHello()
    {
        std::cout << "Hello" << std::endl;
    }
};

int main(int, char **)
{
    World w = World::getInstance();
    w.sayHello();
}
