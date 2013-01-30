package key.generator.ap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;


@SuppressWarnings("unused")
public class EncryptionKeyGeneratorApplicationActivity extends Activity {
	
	private static final String TAG = "EncryptionKeyGenAppActivity";
	private static int progress = 0;
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private Handler handler = new Handler();
	
	TextView loadInfoText;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.d(TAG, "Inside onCreate in EncryptionKeyGeneratorApplicationActivity class");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        progressBar = (ProgressBar) findViewById(R.id.SplashProgress);
        progressBar.setVisibility(View.VISIBLE);
        try{
            new Thread(){
                public void run() {
                    while(progressStatus < 10)
                    {
                	initializeApp();
                	progressBar.setProgress(progressStatus);}
                    handler.post( new Runnable(){
                        public void run() {
                            	try{
                                
                        		Log.d(TAG, "Starting KeyDisplayActivity");
                                startActivity( new Intent(EncryptionKeyGeneratorApplicationActivity.this, KeyDisplayActivity.class) );
                                Log.d(TAG,"Exiting Encryption Key Generator Application Activity");
                                finish();
                            	}
                            	catch(Exception e)
                            	{
                            		e.printStackTrace();
                            	}
                        }
                    } );
                }
                public void initializeApp(){
                    try{
                    	Thread.sleep(200);
                    	++progressStatus;
                    }
                    catch(Exception err)
                    {
                    	Log.e(TAG, err.getMessage());
                    }
                }
        }.start();
        }catch (Exception e) {}
             
    }
  }