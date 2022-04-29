#include <iostream>
#include <string>

class OperatingSystem
{
public:
    virtual void about() = 0;
    virtual void specs() = 0;
};

class Android : public OperatingSystem
{
public:
    void about()
    {
        std::cout << "Android OS" << std::endl;
    }
    void specs()
    {
        std::cout << "Open Source" << std::endl;
    }
};

class IOS : public OperatingSystem
{
public:
    void about()
    {
        std::cout << "IOS" << std::endl;
    }
    void specs()
    {
        std::cout << "Secure" << std::endl;
    }
};

class OSFactory
{
public:
    OperatingSystem *getOS(const std::string requirement)
    {
        if(requirement == "secure")
        {
            return new IOS();
        }
        else{
            return new Android();
        }

    }
};

int main() {
    OSFactory suggest;
    suggest.getOS("secure")->about();
}
