package by.alexsholohov.bbcodes;

import android.app.*;
import android.os.*;
import android.webkit.*;
import by.alexsholohov.bbcodes.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl("file:///android_asset/web_sources/index.html");

		//ActionBar actionBar = getActionBar();
		//actionBar.hide();
    }
}
