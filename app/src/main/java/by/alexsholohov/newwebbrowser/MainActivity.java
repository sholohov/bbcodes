package by.alexsholohov.newwebbrowser;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.webkit.*;

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
		
		final Window mRootWindow = getWindow();
		View mRootView = mRootWindow.getDecorView().findViewById(android.R.id.content);
		mRootView.getViewTreeObserver().addOnGlobalLayoutListener(
			new ViewTreeObserver.OnGlobalLayoutListener() {
				public void onGlobalLayout(){
					Rect r = new Rect();
					View view = mRootWindow.getDecorView();
					view.getWindowVisibleDisplayFrame(r);
					// r.left, r.top, r.right, r.bottom
				}
			});
    }
}
