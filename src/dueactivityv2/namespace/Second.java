package dueactivityv2.namespace;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView label = (TextView) findViewById(R.id.editText1);
        String iltestoricevuto = getIntent().getExtras().getString("IlTestoNelBox");
        label.setText(iltestoricevuto);
	}
	@Override
	public void onStart()
	{
		super.onStart();
		Log.d("Log","onStart");
	}
	@Override
	public void onRestart()
	{
		super.onRestart();
		Log.d("Log","onRestart");
	}
	 @Override
	public void onResume()
	{
		 super.onResume();
		 Log.d("Log", "onResume");
	}
	@Override
	public void onPause()
	{
		super.onPause();
		Log.d("Log", "onPause");
	}
	@Override
	public void onStop()
	{
		super.onStop();
		Log.d("Log", "onStop");
	}
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d("Log", "onDestroy");
	}
}
	