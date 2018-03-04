package anuraj.ajapps.expressme.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import anuraj.ajapps.expressme.data.db.entitites.User;

/**
 * Created by lenovo on 3/4/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
}
