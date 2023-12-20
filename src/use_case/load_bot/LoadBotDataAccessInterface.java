package use_case.load_bot;

public interface LoadBotDataAccessInterface {

    // loads the bot into memory; returns Boolean of success
    Boolean loadBot(int botID);

    Boolean existByBotID(int botID);

    String getNameByBotID(int botID);
}
