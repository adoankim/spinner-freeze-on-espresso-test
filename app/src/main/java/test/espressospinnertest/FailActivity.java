package test.espressospinnertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

public class FailActivity extends AppCompatActivity {


    private static final int NUM_OF_ITEMS = 60;
    private AppCompatSpinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);

        setupView();
    }

    private void setupView() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        spinner = (AppCompatSpinner) findViewById(R.id.spinner);
        spinner.setAdapter(buildAdapter());

    }

    private SpinnerAdapter buildAdapter() {
        return new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                generateValues(NUM_OF_ITEMS));
    }

    private Integer[] generateValues(int length) {

        if(length <= 0) {
            return new Integer[]{};
        }

        Integer[] values = new Integer[length];
        for(int i=1; i <= length; i++){
            values[i-1] = i;
        }
        return values;
    }
}
