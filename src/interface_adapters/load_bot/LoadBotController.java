package interface_adapters.load_bot;

import use_case.load_bot.LoadBotInputBoundary;
import use_case.load_bot.LoadBotInputData;

public class LoadBotController {
    private LoadBotInputBoundary loadBotInteractor;

    // default constructor
    public LoadBotController(LoadBotInputBoundary loadBotInteractor) {
        this.loadBotInteractor = loadBotInteractor;
    }

    // default execute method; take input data to hand to interactor
    public void execute(int botID) {
        // create a new input data object to hand off
        LoadBotInputData loadBotInputData = new LoadBotInputData(botID);
        this.loadBotInteractor.execute(loadBotInputData);
    }
}
