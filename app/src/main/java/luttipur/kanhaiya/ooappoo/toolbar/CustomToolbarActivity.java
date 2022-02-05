package luttipur.kanhaiya.ooappoo.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;

public class CustomToolbarActivity extends AppCompatActivity {
    Toolbar customToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);

        customToolbar = findViewById(R.id.customT);
        setSupportActionBar(customToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int Id = item.getItemId();

        if (Id == R.id.share){
            Toast.makeText(getApplicationContext(), "Share", Toast.LENGTH_SHORT).show();
        }else if (Id==R.id.about){
            Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();

        }else if (Id==R.id.Exit){
            Toast.makeText(getApplicationContext(), "Exit", Toast.LENGTH_SHORT).show();

        }else if (Id==R.id.search){
            Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();

        }else if (Id==R.id.setting){
            Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}