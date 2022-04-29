#include "Artist.h"
#include <memory>

class Genre
{
public:
    virtual std::unique_ptr<Artist> getArtist() = 0;
};

class BluesFactory : public Genre
{
private:
    int choice;
    
    BBKing *objB;

public:
    BluesFactory()
    {
        std::cout << "1) Stevie Ray Vaughan"
                     "\n2) B.B. King"
                  << std::endl;
        std::cout << "Choice: ";
        std::cin >> choice;
    }

    std::unique_ptr<Artist> getArtist() override
    {
        if (choice == 1)
        {
            std::unique_ptr<StevieRayVaughan> obj = std::make_unique<StevieRayVaughan>();
            return obj;
        }
        else if (choice == 2)
        {
            std::unique_ptr<BBKing> obj = std::make_unique<BBKing>();
            return obj;
        }
        else
        {
            std::cout << "Invalid Choice" << std::endl;
            return nullptr;
        }
    }
};

class MetalFactory : public Genre
{
private:
    int choice;
    Metallica *objM;
    IronMaiden *objI;

public:
    MetalFactory()
    {
        std::cout << "1) Metallica"
                     "\n2) Iron Maiden"
                  << std::endl;
        std::cout << "Choice: ";
        std::cin >> choice;
    }

    std::unique_ptr<Artist> getArtist() override
    {
        if (choice == 1)
        {
            std::unique_ptr<Metallica> obj = std::make_unique<Metallica>();
            return obj;
        }
        else if (choice == 2)
        {
            std::unique_ptr<IronMaiden> obj = std::make_unique<IronMaiden>();
            return obj;
        }
        else
        {
            std::cout << "Invalid Choice" << std::endl;
            return nullptr;
        }
    }
};