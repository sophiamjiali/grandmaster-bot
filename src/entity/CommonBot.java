package entity;

public class CommonBot implements Bot {
    private final int botID;
    private final String name;

    // default constructor
    public CommonBot(int botID, String name) {
        this.botID = botID;
        this.name = name;
    }

    // retrieves the bots name
    @Override
    public String getName() {
        return null;
    }

    // retrieves the bots ID
    @Override
    public int getBotID() {
        return 0;
    }

    // ...?
    @Override
    public void getMatchData() {

    }
}
