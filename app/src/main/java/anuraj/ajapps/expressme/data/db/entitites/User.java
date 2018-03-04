package anuraj.ajapps.expressme.data.db.entitites;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by anuraj on 3/4/2018.
 */

@Entity
public class User {

    @PrimaryKey
    @NonNull
    public String id;

    public String name;

    public String lastName;

    public int age;
}