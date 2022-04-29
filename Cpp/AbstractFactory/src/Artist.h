#include <iostream>
#include <vector>
#include <string>

class Artist
{
public:
    virtual std::vector<std::string> getSongs() = 0;
};

class IronMaiden : public Artist
{
private:
    std::vector<std::string> songs;

public:
    IronMaiden()
    {
        songs.reserve(3);
        songs.emplace_back("No More Lies");
        songs.emplace_back("Dance of Death");
        songs.emplace_back("Gates of Tomorrow");
    }

    std::vector<std::string> getSongs()
    {
        return songs;
    }
};

class Metallica : public Artist
{
private:
    std::vector<std::string> songs;

public:
    Metallica()
    {
        songs.reserve(3);
        songs.emplace_back("Fade to Black");
        songs.emplace_back("Nothing Else Matters");
        songs.emplace_back("And the Justice for All");
    }

    std::vector<std::string> getSongs()
    {
        return songs;
    }
};

class StevieRayVaughan : public Artist
{
private:
    std::vector<std::string> songs;

public:
    StevieRayVaughan()
    {
        songs.reserve(3);
        songs.emplace_back("Pride and Joy");
        songs.emplace_back("Little Wing");
        songs.emplace_back("Texas Flood");
    }

    std::vector<std::string> getSongs()
    {
        return songs;
    }
};

class BBKing : public Artist
{
private:
    std::vector<std::string> songs;

public:
    BBKing()
    {
        songs.reserve(3);
        songs.emplace_back("The Thrill is Gone");
        songs.emplace_back("When my Heart Beats Like a Hammer");
        songs.emplace_back("Why I Sing The Blues");
    }

    std::vector<std::string> getSongs()
    {
        return songs;
    }
};