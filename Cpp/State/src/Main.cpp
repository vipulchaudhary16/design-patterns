#include <iostream>

class AlertState
{
public:
    virtual void performTask() = 0;
};

class Mute : public AlertState
{
public:
    void performTask() override
    {
        std::cout << "Mute" << std::endl;
    }
};

class Unmute : public AlertState
{
public:
    void performTask() override
    {
        std::cout << "Un-Mute" << std::endl;
    }};

class Context
{
private:

    AlertState *state;
public:
    Context()
    {
        state = new Unmute();
    }

public:
    AlertState *getState()
    {
        return state;
    }
    void setState(AlertState &state)
    {
        this->state = &state;
        // this->state->performTask();
    }

// public:
//     ~Context()
//     {
//         delete this->state;
//     }
};

int main(int, char**) {
    Context ctx;
    ctx.getState()->performTask();
    Mute m;
    ctx.setState(m);
    ctx.getState()->performTask();
}
