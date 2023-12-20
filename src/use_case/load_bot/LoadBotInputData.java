package use_case.load_bot;

public class LoadBotInputData {
    private final int botID;

    // default constructor
    public LoadBotInputData(int botID) {
        this.botID = botID;
    }

    // retrieve the bots name
    int getBotID() {
        return this.botID;
    }
}
