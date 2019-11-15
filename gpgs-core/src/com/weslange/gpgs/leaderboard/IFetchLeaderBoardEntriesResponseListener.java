package com.weslange.gpgs.leaderboard;

import com.badlogic.gdx.utils.Array;

/**
 * Callback for
 * {@link com.weslange.gpgs.IGameServiceClient#fetchLeaderboardEntries(String, int, boolean, IFetchLeaderBoardEntriesResponseListener)}
 *
 * @author mgsx
 */
public interface IFetchLeaderBoardEntriesResponseListener {
    /**
     * Called when leaderBoard entries are received.
     *
     * @param leaderBoard null if leaderBoard couldn't be fetched.
     */
    void onLeaderBoardResponse(Array<ILeaderBoardEntry> leaderBoard);
}
