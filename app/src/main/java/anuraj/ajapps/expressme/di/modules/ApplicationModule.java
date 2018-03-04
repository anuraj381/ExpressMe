package anuraj.ajapps.expressme.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import anuraj.ajapps.expressme.BuildConfig;
import anuraj.ajapps.expressme.data.AppDataManager;
import anuraj.ajapps.expressme.data.DataManager;
import anuraj.ajapps.expressme.data.db.AppDBhelper;
import anuraj.ajapps.expressme.data.db.DBhelper;
import anuraj.ajapps.expressme.data.network.ApiHeader;
import anuraj.ajapps.expressme.data.network.ApiHelper;
import anuraj.ajapps.expressme.data.network.AppApiHelper;
import anuraj.ajapps.expressme.data.preferences.AppPreferencesHelper;
import anuraj.ajapps.expressme.data.preferences.PreferencesHelper;
import anuraj.ajapps.expressme.di.ApiInfo;
import anuraj.ajapps.expressme.di.ApplicationContext;
import anuraj.ajapps.expressme.di.DatabaseInfo;
import anuraj.ajapps.expressme.di.PreferenceInfo;
import anuraj.ajapps.expressme.utils.AppConstants;
import dagger.Module;
import dagger.Provides;

/**
 * Created by lenovo on 3/4/2018.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DBhelper provideDbHelper(AppDBhelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

}
