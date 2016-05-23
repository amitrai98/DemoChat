package android.com.demochat.bin;

/**
 * Created by amitrai on 23/5/16.
 */
public class BaseBean {
    public transient String statusMessage;
    public transient int statusCode;
    public transient String statusMsg;
    //    public transient String URL;
    private transient String progressMsg = "Please wait...";
    private transient boolean progressEnable = true;

    protected BaseBean() {
    }

    public String getProgressMsg() {
        return progressMsg;
    }

    public void setProgressMsg(String progressMsg) {
        this.progressMsg = progressMsg;
    }

    public boolean isProgressEnable() {
        return progressEnable;
    }

    public void setProgressEnable(boolean enbale) {
        progressEnable = enbale;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
