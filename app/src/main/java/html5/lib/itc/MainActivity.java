package html5.lib.itc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import html5.lib.itc.myhtml5.A;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A.aaa(this);
    }
}
