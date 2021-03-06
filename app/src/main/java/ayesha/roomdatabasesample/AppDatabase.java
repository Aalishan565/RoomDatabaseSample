package ayesha.roomdatabasesample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Aalishan on 07/03/18.
 */

@Database(entities = {User.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}

