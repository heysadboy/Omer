package sadboy.omer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import in.omerjerk.processing.video.android.*;

public class MainActivity extends AppCompatActivity {

    Capture cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    void setup() {

        size(720, 1280, P2D);

        //Use this to print list of resolutions supported by the camera
        Capture.printCompatibleResolutionsList(cap);

        String[] cameras = Capture.list();
        cap = new Capture(this, cameras[0]);
        cap.start();
    }

    void draw() {
        image(cap, 0, 0);
    }

    void captureEvent(Capture c) {
        c.read();
    }
}
