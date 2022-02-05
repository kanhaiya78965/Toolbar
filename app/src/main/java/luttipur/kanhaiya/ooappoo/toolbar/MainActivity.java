package luttipur.kanhaiya.ooappoo.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void customToolbar(View view) {
        startActivity(new Intent(this,CustomToolbarActivity.class));
    }

    public void collapsingToolbar(View view) {
         startActivity(new Intent(this,CollapsingActivity.class));
    }
}