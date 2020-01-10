package lhb.com.corptoview;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CorpToView corpToView;
    private ImageView imageView;
    private static final String CROP_IMAGE_PATH = "/storage/emulated/0/Download/Images/907.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corpToView = (CorpToView) findViewById(R.id.image);
        corpToView.showImage(CROP_IMAGE_PATH);
    }

    public void rotate90(View view) {
        corpToView.rotate90();
    }

    public void cut(View view) {
        imageView = findViewById(R.id.image1);
        imageView.setImageBitmap( corpToView.getClipRectImage());
    }
}
