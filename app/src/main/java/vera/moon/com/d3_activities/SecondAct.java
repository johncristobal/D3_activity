package vera.moon.com.d3_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondAct extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Receive variables from teh another activity
        //getIntent() to get data feom the activity
        Intent i = getIntent();
        String res = i.getStringExtra("name");

        //Toast.makeText(this,"Data: "+res,Toast.LENGTH_SHORT).show();

        texto = (TextView)findViewById(R.id.textView);

        texto.setText(("Hello "+res));
    }

    public void goBack(View v){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
