package android.com.demochat.backend;

import android.com.demochat.bin.User;
import android.com.demochat.listeners.ApiListener;

/**
 * Created by amitrai on 23/5/16.
 */
public class CommonTasks {

    private static  CommonTasks instance = null;
    public static CommonTasks getInstance(){
        if(instance == null)
            instance = new CommonTasks();

        return instance;
     }

    /**
     * attempts login
     */
    private void attemptLogin(User user, ApiListener listener){

    }
}
