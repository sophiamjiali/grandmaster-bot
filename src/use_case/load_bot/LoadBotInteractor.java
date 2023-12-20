package use_case.load_bot;

public class LoadBotInteractor implements LoadBotInputBoundary {

    final LoadBotDataAccessInterface dataAccessObject;
    final LoadBotOutputBoundary loadBotPresenter;

    // default constructor
    public LoadBotInteractor(LoadBotDataAccessInterface loadBotDataAccessInterface,
                             LoadBotOutputBoundary loadBotOutputBoundary) {
        this.dataAccessObject = loadBotDataAccessInterface;
        this.loadBotPresenter = loadBotOutputBoundary;
    }

    // attempts to load the selected bots data into memory
    @Override
    public void execute(LoadBotInputData loadBotInputData) {
        // get the associated values needed from the input data object
        int botID = loadBotInputData.getBotID();

        // if the bot does not exist, prepare fail view
        if (!dataAccessObject.existByBotID(botID)) {
            loadBotPresenter.prepareFailView("BotID cannot be found.");
        } else {  // bot exists; attempt to load the bots data into memory
            // attempt to load the bot into memory
            if (!dataAccessObject.loadBot(botID)) {  // if returns as failure
                loadBotPresenter.prepareFailView("Bot could not be loaded.");
            } else {
                // successfully loaded, prepare success view
                String name = dataAccessObject.getNameByBotID(botID);
                LoadBotOutputData loadBotOutputData = new LoadBotOutputData(name);
                loadBotPresenter.prepareSuccessView(loadBotOutputData);
            }
        }
    }
}
