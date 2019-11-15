package com.weslange.gpgs.gamestate;

import com.badlogic.gdx.utils.Array;

/**
 * Callback for {@link com.weslange.gpgs.IGameServiceClient#fetchGameStates(IFetchGameStatesListResponseListener)}
 *
 * @author mgsx
 */
public interface IFetchGameStatesListResponseListener {
    /**
     * Called when game state list was loaded
     *
     * @param gameStates null if game states couldn't be fetched.
     */
    void onFetchGameStatesListResponse(Array<String> gameStates);
}
