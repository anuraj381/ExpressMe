package anuraj.ajapps.expressme.data.db;

import java.util.List;

import javax.inject.Inject;

import anuraj.ajapps.expressme.data.db.entitites.User;
import io.reactivex.Observable;

/**
 * Created by lenovo on 3/4/2018.
 */

public class AppDBhelper implements DBhelper {

    @Inject
    public AppDBhelper() {
        //will make it soon...
    }

    @Override
    public Observable<Long> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }
}
