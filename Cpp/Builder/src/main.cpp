#include <iostream>

class MyBuilder;

class Phone
{
private:
    const char *m_brand;
    const char *m_ram;
    const char *m_processor;
public:
    Phone(const char* brand, const char* ram, const char* processor)
        : m_brand(brand), m_ram(ram), m_processor(processor)
    {}
    void printSpecifications()
    {
        std::cout << "Brand: " << m_brand << std::endl;
        std::cout << "Ram: " << m_ram << std::endl;
        std::cout << "Processor: " << m_processor << std::endl;
    }
};

class Builder
{
public:
    virtual MyBuilder *setProcessor(const char *processor) = 0;
    virtual MyBuilder *setRam(const char *ram) = 0;
    virtual MyBuilder *setBrand(const char *brand) = 0;
    virtual Phone *getPhone() = 0;
};

class MyBuilder : public Builder
{
private:
    const char *brand;
    const char *ram;
    const char *processor;

public:
    MyBuilder *setBrand(const char *brand)
    {
        this->brand = brand;
        return this;
    }
    MyBuilder *setRam(const char *ram)
    {
        this->ram = ram;
        return this;
    }
    MyBuilder *setProcessor(const char *processor)
    {
        this->processor = processor;
        return this;
    }
    Phone *getPhone()
    {
        return new Phone(brand, ram, processor);
    }
};

int main()
{
    MyBuilder tell;
    Phone *newPhone = tell.setBrand("One Plus")->setRam("6 GB")->setProcessor("Snapdragon 845")->getPhone();
    newPhone->printSpecifications();
    delete newPhone;
}
