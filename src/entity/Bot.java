package entity;

public interface Bot {
    // returns the full name of the player the bot is mimicking
    String getName();

    // returns the unique ID associated with the bot
    int getBotID();

    void getMatchData(); // change return type
}