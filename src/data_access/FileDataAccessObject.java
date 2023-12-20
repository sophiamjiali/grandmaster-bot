package data_access;

import entity.CommonBotMatchData;
import use_case.load_bot.LoadBotDataAccessInterface;

public class FileDataAccessObject implements LoadBotDataAccessInterface {
    // private final CommonBotMatchData botMatchData;

    @Override
    public Boolean loadBot(int botID) {
        return null;
    }

    @Override
    public Boolean existByBotID(int botID) {
        return null;
    }

    @Override
    public String getNameByBotID(int botID) {
        return null;
    }
}
