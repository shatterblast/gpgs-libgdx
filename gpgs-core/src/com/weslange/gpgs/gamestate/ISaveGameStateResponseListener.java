package com.weslange.gpgs.gamestate;

/**
 * Response listener for
 * {@link com.weslange.gpgs.IGameServiceClient#saveGameState(String, byte[], long, ISaveGameStateResponseListener)}
 * <p>
 * Created by Benjamin Schulte on 12.08.2017.
 */

public interface ISaveGameStateResponseListener {

    /**
     * Result of save game request
     *
     * @param success   true if game state was sucessfully saved
     * @param errorCode null if succesful
     */
    void onGameStateSaved(boolean success, String errorCode);
}
