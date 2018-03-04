package anuraj.ajapps.expressme.data;

import anuraj.ajapps.expressme.data.db.DBhelper;
import anuraj.ajapps.expressme.data.network.ApiHelper;
import anuraj.ajapps.expressme.data.preferences.PreferencesHelper;

/**
 * Created by janisharali on 27/01/17.
 */

public interface DataManager extends DBhelper, PreferencesHelper, ApiHelper {

    void updateApiHeader(Long userId, String accessToken);

    void setUserAsLoggedOut();

    void updateUserInfo(
            String accessToken,
            Long userId,
            LoggedInMode loggedInMode,
            String userName,
            String email,
            String profilePicPath);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
