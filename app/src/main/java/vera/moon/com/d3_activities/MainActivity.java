package vera.moon.com.d3_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayList<String> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView)findViewById(R.id.listView);

        friends = new ArrayList<>();
        friends.add("Monica");
        friends.add("Jose");
        friends.add("Vera");
        friends.add("Diana");

        ArrayAdapter adap = new ArrayAdapter(this,android.R.layout.simple_list_item_1,friends);
        lista.setAdapter(adap);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),SecondAct.class);

                //pass variables....using putExtra
                intent.putExtra("name",friends.get(i));

                startActivity(intent);
            }
        });
    }

    public void changeAct(View v){

        Intent i = new Intent(this,SecondAct.class);

        //pass variables....using putExtra
        i.putExtra("name","value");

        startActivity(i);

    }
}
