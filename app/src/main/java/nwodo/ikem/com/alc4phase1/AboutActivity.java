package nwodo.ikem.com.alc4phase1;

import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = findViewById(R.id.about_alc);

        webView.setWebViewClient(new WebViewClient(){
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            // ignore ssl error
            if (handler != null){
                handler.proceed();
            } else {
                super.onReceivedSslError(view, null, error);
            }
        }
        });
        webView.loadUrl("https://andela.com/alc/");
    }

    }



