package anuraj.ajapps.expressme.data.db;

import java.util.List;

import anuraj.ajapps.expressme.data.db.entitites.User;
import io.reactivex.Observable;

/**
 * Created by lenovo on 3/4/2018.
 */

public interface DBhelper {

    Observable<Long> insertUser(final User user);
    Observable<List<User>> getAllUsers();

}
