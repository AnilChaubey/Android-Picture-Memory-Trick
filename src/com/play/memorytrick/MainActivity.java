package com.play.memorytrick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button kidsButton;
	Button adultsButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		kidsButton = (Button)findViewById(R.id.kidsButton);
		adultsButton = (Button)findViewById(R.id.adultsButton);
		
		findViewById(R.id.kidsButton).setOnClickListener(
		        new View.OnClickListener() {
		            @Override
		            public void onClick(View v) {
		                // No account, load new account view
		                Intent intent = new Intent(MainActivity.this, PictureManager.class);
		                intent.putExtra("count", "2"); 
		                startActivity(intent);
		            }
		        });
		
		findViewById(R.id.adultsButton).setOnClickListener(
		        new View.OnClickListener() {
		            @Override
		            public void onClick(View v) {

		            	Intent intent = new Intent(MainActivity.this, PictureManager.class);
		                intent.putExtra("count", "1"); 
		                startActivity(intent);
		            }
		        });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
