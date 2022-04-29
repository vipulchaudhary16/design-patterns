#include <iostream>
#include <string>
#include <vector>

class Game
{
protected:
    std::string gameName;

public:
    virtual void play(){
        std::cout << "Playing " << gameName << std::endl;
    }
};

class Minecraft : public Game
{
public:
    Minecraft()
    {
        gameName = "Minecraft";
    }

public:
    void play() override
    {
        std::cout << "Playing " << gameName << std::endl;
    }
};

class ForzaHorizon : public Game
{
public:
    ForzaHorizon()
    {
        gameName = "Forza Horizon 5";
    }

public:
    void play() override
    {
        std::cout << "Playing " << gameName << std::endl;
    }
};

class CallOfDuty : public Game
{
public:
    CallOfDuty()
    {
        gameName = "Call of Duty";
    }

public:
    void play() override
    {
        std::cout << "Playing " << gameName << std::endl;
    }
};

class GameStore
{
private:
    std::vector<Game> *games;

public:
    GameStore()
    {
        games = new std::vector<Game>;

        games->reserve(3);
        Minecraft m;
        ForzaHorizon f;
        CallOfDuty c;
        games->emplace_back(m);
        games->emplace_back(f);
        games->emplace_back(c);
    }
    GameStore(std::vector<Game> *games)
        : games(games) {}
    ~GameStore()
    {
        delete games;
    }

public:
    Game getGame(const int &index)
    {
        return games->at(index); // returning a copy instead of a pointer
    }
};

int main()
{
    GameStore myStore;
    myStore.getGame(0).play();
    myStore.getGame(1).play();
    myStore.getGame(2).play();
}
