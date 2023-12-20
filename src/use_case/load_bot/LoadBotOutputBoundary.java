package use_case.load_bot;

public interface LoadBotOutputBoundary {
    void prepareSuccessView(LoadBotOutputData name);
    void prepareFailView(String error);
}
