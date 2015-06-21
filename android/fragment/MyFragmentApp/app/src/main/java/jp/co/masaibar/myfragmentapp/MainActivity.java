package jp.co.masaibar.myfragmentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements TitlesFragment.OnTitleSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTitleSelected(int position) {
        DetailFragment detailFragment = DetailFragment.newInstance(position);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.detailFrame, detailFragment)
                .commit();
    }
}
