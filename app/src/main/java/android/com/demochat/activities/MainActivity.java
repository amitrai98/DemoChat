package android.com.demochat.activities;

import android.com.demochat.R;
import android.com.demochat.fragment.fragmentLogin;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements fragmentLogin.OnFragmentInteractionListener{

    private FrameLayout frameLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * initializing view
     */
    private void init(){
        frameLayout = (FrameLayout) findViewById(R.id.container);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new fragmentLogin())
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
