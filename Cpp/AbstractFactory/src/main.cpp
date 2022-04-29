#include "Genre.h"

int main()
{
    int d = 0;
    std::cout << "1) Easy"
                 "\n2) Hard"
              << std::endl;
    std::cout << "Enter Level of Difficulty: ";
    std::cin >> d;

    Genre *factory;
    std::vector<std::string> songs;

    if (d < 1 && d > 2)
    {
        std::cout << "Invalid Choice" << std::endl;
    }
    else
    {
        if (d == 1)
        {
            BluesFactory factoryB;
            factory = &factoryB;
        }
        else if (d == 2)
        {
            MetalFactory factoryM;
            factory = &factoryM;
        }
        songs = factory->getArtist()->getSongs();
        for (size_t i = 0; i < songs.size(); i++)
        {
            std::cout << songs[i] << std::endl;
        }
    }
}
