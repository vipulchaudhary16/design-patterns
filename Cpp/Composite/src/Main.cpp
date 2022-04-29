#include "./includes/Composites.h"
#include "./includes/Leafs.h"

void Component::render()
{

    std::cout << componentName << " Rendering" << std::endl;
}

void Composite::render()
{
    std::cout << componentName << std::endl;
    for (size_t index = 0; index < components->size(); index++)
    {
        components->at(index).render();
    }
}

void Leaf::render()
{
    std::cout << componentName << std::endl;
}

Zombies::Zombies()
{
    componentName = "Zombies";
}

Skeletons::Skeletons()
{
    componentName = "Skeletons";
}

Players ::Players()
{
    componentName = "Players";
}

Mobs::Mobs()
{
    componentName = "Mobs";
    Zombies z;
    components->emplace_back(z);
    Skeletons s;
    components->emplace_back(s);
}

Game::Game()
{
    componentName = "Game";
    Mobs m;
    components->emplace_back(m);
    Players p;
    components->emplace_back(p);
}

int main() {
    Game g;
    g.render();
}
