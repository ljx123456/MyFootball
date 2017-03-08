package com.example.alu.myfootball.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alu.myfootball.R;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;


/**
 * Created by alu on 2017/3/3.
 */

public class InternetActivity extends BaseActivity {
    private ProgressBar progressBar;
    private WebView webView;
    private TextView textView;
    private Button button;
    private Intent intent;
    @Override
    public void initView() {
        progressBar= (ProgressBar) findViewById(R.id.progressBar);
        webView= (WebView) findViewById(R.id.webView);
        textView= (TextView) findViewById(R.id.internet_tv);
       button= (Button) findViewById(R.id.btn_share);
    }

    @Override
    public void addLayout() {
        setContentView(R.layout.activity_internet);
        initView();
        WebSettings webSettings = webView.getSettings();
        // User settings
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);//关键点
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
        webSettings.setSupportZoom(true); // 支持缩放

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    progressBar.setVisibility(View.INVISIBLE);
                } else {
                    if (View.INVISIBLE == progressBar.getVisibility()) {
                        progressBar.setVisibility(View.VISIBLE);
                    }
                    progressBar.setProgress(newProgress);
                }
                super.onProgressChanged(view, newProgress);
            }
        });
        //跳转网页
        intent = getIntent();
        webView.loadUrl(intent.getStringExtra("url"));
//        UMImage image = new UMImage(InternetActivity.this, intent);//网络图片
        final UMWeb web = new UMWeb(intent.getStringExtra("url"));
        web.setTitle(intent.getStringExtra("title"));//标题
//        web.setThumb(thumb);  //缩略图
//        web.setDescription("my description");//描述

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareAction(InternetActivity.this).
                        setDisplayList(SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN,SHARE_MEDIA.QZONE)
//                        setPlatform(SHARE_MEDIA.QQ)
//                        .withText("hello")
                        .withMedia(web)
                        .setCallback(new UMShareListener() {
                            @Override
                            public void onStart(SHARE_MEDIA share_media) {

                            }

                            @Override
                            public void onResult(SHARE_MEDIA share_media) {
                                Toast.makeText(InternetActivity.this, "成功了", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onError(SHARE_MEDIA share_media, Throwable throwable) {
                                Toast.makeText(InternetActivity.this, "失败了", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCancel(SHARE_MEDIA share_media) {

                            }
                        }).open();
            }
        });

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DB_C(InternetActivity.this).add(intent.getStringExtra("url"),
//                        intent.getStringExtra("cover_pic"),
//                        intent.getStringExtra("caption"),
//                        intent.getStringExtra("screen_name"));
//                Toast.makeText(InternetActivity.this,"收藏成功",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack(); //goBack()表示返回WebView的上一页面
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
}
