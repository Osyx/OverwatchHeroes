package net.azurewebsites.osyx.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "net.azurewebsites.osyx.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCategory(View view) {
        Intent intent = new Intent(this, DisplayHeroCategory.class);
        Button button = (Button) findViewById(view.getId());
        String category = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, category);
        startActivity(intent);
    }
}
