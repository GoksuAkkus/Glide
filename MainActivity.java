package com.example.student.jsonproject;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
public class MainActivity extends AppCompatActivity {
ImageView myView;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 myView=findViewById(R.id.imageView);
    }

    public void resimgetirgotur(View view) {

        if(i==0){
        Glide.with(getApplicationContext()).load("https://guzelresimler.info/content/photos/5901/bi/atat%C3%BCrk_24.jpg")
                .thumbnail(0.5f)
                 .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                 .into(myView);
        i++;
        }
        else if(i==1) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata13b.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==2) {
            Glide.with(getApplicationContext()).load("https://i.ytimg.com/vi/_CbQN7A142s/hqdefault.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==3) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata28a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==4) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata2a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==5) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata1a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==6) {
            Glide.with(getApplicationContext()).load("http://resimdiyari.com/upload/2014/03/28/20140328184420-7de62cf9.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==7) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata2a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==8) {
            Glide.with(getApplicationContext()).load("https://i.hizliresim.com/r2aAa3.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i++;
        }
        else if(i==9) {
            Glide.with(getApplicationContext()).load("https://im.haberturk.com/galeri/2012/11/09/ver1447137553/418507/a4e84611997ba40a7116344ff307e31b_840.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i=0;
        }
    }

    public void geriTusu(View view) {
        if(i==0){
            Glide.with(getApplicationContext()).load("https://guzelresimler.info/content/photos/5901/bi/atat%C3%BCrk_24.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i=9;
        }
        else if(i==1) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata13b.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==2) {
            Glide.with(getApplicationContext()).load("https://i.ytimg.com/vi/_CbQN7A142s/hqdefault.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==3) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata28a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==4) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata2a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==5) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata1a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==6) {
            Glide.with(getApplicationContext()).load("http://resimdiyari.com/upload/2014/03/28/20140328184420-7de62cf9.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==7) {
            Glide.with(getApplicationContext()).load("http://biriz.biz/ata/ata2a.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==8) {
            Glide.with(getApplicationContext()).load("https://i.hizliresim.com/r2aAa3.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
        else if(i==9) {
            Glide.with(getApplicationContext()).load("https://im.haberturk.com/galeri/2012/11/09/ver1447137553/418507/a4e84611997ba40a7116344ff307e31b_840.jpg")
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(myView);
            i--;
        }
    }
}
