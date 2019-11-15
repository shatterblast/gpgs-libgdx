package com.weslange.gpgs.achievement;

import com.badlogic.gdx.utils.Array;

/**
 * Response listener for
 * {@link com.weslange.gpgs.IGameServiceClient#fetchAchievements(IFetchAchievementsResponseListener)}
 * <p>
 * This listener may not be called on UI thread. Use Gdx.app.postRunnable or convinience class
 * FetchAchievementsResponseRenderThreadListener
 *
 * @author mgsx
 */
public interface IFetchAchievementsResponseListener {

    /**
     * Response with achievement list
     *
     * @param achievements null if achievements couldn't be fetched.
     */
    void onFetchAchievementsResponse(Array<IAchievement> achievements);

}
