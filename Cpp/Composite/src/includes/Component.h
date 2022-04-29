#pragma once
#include <iostream>
#include <vector>

class Component
{
protected:
    const char * componentName;
public:
    virtual void render();
};

class Composite : public Component
{
protected:
    std::vector<Component> *components = new std::vector<Component>;

public:
    void render();
};

class Leaf : public Component
{
public:
    void render();
};