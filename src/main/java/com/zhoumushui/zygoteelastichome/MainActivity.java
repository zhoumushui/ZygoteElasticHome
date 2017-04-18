package com.zhoumushui.zygoteelastichome;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zhoumushui.zygoteelastichome.view.BezelImageView;
import com.zhoumushui.zygoteelastichome.view.ElasticScrollView;
import com.zhoumushui.zygoteelastichome.view.BuildLayerLinearLayout;


public class MainActivity extends AppCompatActivity {

    ElasticScrollView elasticScrollView;
    BuildLayerLinearLayout buildLayerLinearLayout;
    public TextView textView;

    private static final int ITEM_SIZE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        elasticScrollView = (ElasticScrollView) findViewById(R.id.elasticScrollView);
        buildLayerLinearLayout = (BuildLayerLinearLayout) findViewById(R.id.linear);
        final TextView t;
        t = textView = (TextView) findViewById(R.id.text);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = (displayMetrics.widthPixels - 60) / ITEM_SIZE;
        int height = (int) (width / 340f * 600);
        int viewwidth = 30;

        View view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(viewwidth, 0));
        buildLayerLinearLayout.addView(view);

        CardView cardView1 = new CardView(this);
        cardView1.setLayoutParams(new LinearLayout.LayoutParams(width, height));
//        buildLayerLinearLayout.addView(cardView1);
        TextView textView = new TextView(this);
        textView.setText("ADAS");
        textView.setGravity(Gravity.CENTER);
        cardView1.addView(textView);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText("click ADAS");
            }
        });

        BezelImageView imageView1 = new BezelImageView(this);
        imageView1.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView1);
        imageView1.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_music_light, width, height));
        imageView1.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView2 = new BezelImageView(this);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView2);
        imageView2.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_navigation_light, width, height));
        imageView2.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView3 = new BezelImageView(this);
        imageView3.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView3);
        imageView3.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_record_light, width, height));
        imageView3.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView4 = new BezelImageView(this);
        imageView4.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView4);
        imageView4.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_map_light, width, height));
        imageView4.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView5 = new BezelImageView(this);
        imageView5.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView5);
        imageView5.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_filemanager_light, width, height));
        imageView5.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView6 = new BezelImageView(this);
        imageView6.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView6);
        imageView6.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_fmtransmit_light, width, height));
        imageView6.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView7 = new BezelImageView(this);
        imageView7.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView7);
        imageView7.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_wechat_light, width, height));
        imageView7.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView8 = new BezelImageView(this);
        imageView8.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView8);
        imageView8.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_edog_light, width, height));
        imageView8.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView9 = new BezelImageView(this);
        imageView9.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView9);
        imageView9.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_fmonline_light, width, height));
        imageView9.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        BezelImageView imageView10 = new BezelImageView(this);
        imageView10.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        buildLayerLinearLayout.addView(imageView10);
        imageView10.setImageBitmap(decodeSampledBitmapFromResource(getResources(),
                R.drawable.icon_setting_light, width, height));
        imageView10.setMaskDrawable(getResources().getDrawable(R.drawable.roundrect));

        view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(30, 0));
        buildLayerLinearLayout.addView(view);

        elasticScrollView.setChildViews(new View[]{
               /* cardView1, */imageView1, imageView2, imageView3,
                imageView4, imageView5, imageView6, imageView7,
                imageView8, imageView9, imageView10});

        elasticScrollView.setScrollChangeListener(new ElasticScrollView.OnScrollChangeListener() {
            @Override
            public void OnScrollChange(int centerViewIndex) {
                t.setText("centerView:" + centerViewIndex);
            }
        });
    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            // Calculate ratios of height and width to requested height and width
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);

            // Choose the smallest ratio as inSampleSize value, this will guarantee
            // a final image with both dimensions larger than or equal to the
            // requested height and width.
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }

        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.normal:
                elasticScrollView.setAnimType(ElasticScrollView.NORMAL_ANIM);
                break;

            case R.id.rebound:
                elasticScrollView.setAnimType(ElasticScrollView.REBOUND_ANIM);
                break;
        }
        return true;
    }
}
