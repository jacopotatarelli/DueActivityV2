package dueactivityv2.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DueActivityV2Activity extends Activity {
    

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText text = (EditText) findViewById(R.id.editText1);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(DueActivityV2Activity.this,Second.class);
				String iltesto = text.getText().toString();  
				intent.putExtra("il testo nel box",iltesto);
				startActivity(intent);
			}
		});
        
    }
}