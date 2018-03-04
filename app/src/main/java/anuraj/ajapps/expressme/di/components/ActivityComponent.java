package anuraj.ajapps.expressme.di.components;

import anuraj.ajapps.expressme.di.PerActivity;
import anuraj.ajapps.expressme.di.modules.ActivityModule;
import anuraj.ajapps.expressme.ui.splash.SplashActivity;
import dagger.Component;

/**
 * Created by lenovo on 3/4/2018.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);

}
