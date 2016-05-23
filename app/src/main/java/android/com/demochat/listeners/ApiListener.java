package android.com.demochat.listeners;

/**
 * Created by amitrai on 23/5/16.
 */
public interface ApiListener {
    public void onSuccess(Object response);
    public void onError(String error);
}
