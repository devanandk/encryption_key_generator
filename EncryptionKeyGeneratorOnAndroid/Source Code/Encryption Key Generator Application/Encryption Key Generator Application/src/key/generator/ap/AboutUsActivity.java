package key.generator.ap;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class AboutUsActivity extends Activity {
	private static final String TAG = "AboutUsActivity";
	Button BackButton;
	 public void onCreate(Bundle savedInstanceState) {
		 	Log.d(TAG, "Inside onCreate in AboutUsActivity class");
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.aboutusview);
	        
	        BackButton = (Button) findViewById(R.id.AboutViewBackButton);	
	        BackButton.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					try{
						Log.d(TAG, "Inside click event handler for back button");
						finish();
					}
					catch(Exception e)
					{
						
					}
					
				}
			});
	        }
}
