package ie.wit.craftBeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import adapters.OptionsCardViewAdapter;
import ie.cm.activities.Base;
import ie.wit.foodie.R;

public class Home extends Base implements OptionsCardViewAdapter.ItemClickListener {

    private OptionsCardViewAdapter adapter;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void add(View v)
    {
        startActivity(new Intent(this,Add.class));
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on item position " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


//TODO... Note reuse later for recycler view::::::
//set up the RecyclerView
// RecyclerView recyclerView = findViewById(R.id.chooseOption);
//LinearLayoutManager horizontalLayoutManager
//        = new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL, false);
//recyclerView.setLayoutManager(horizontalLayoutManager);
// adapter = new OptionsCardViewAdapter(this, viewColors, animalNames);
// adapter.setClickListener(this);
// recyclerView.setAdapter(adapter);