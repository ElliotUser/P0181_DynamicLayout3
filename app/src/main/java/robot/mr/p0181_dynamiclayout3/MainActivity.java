package robot.mr.p0181_dynamiclayout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekBar;
    Button button1;
    Button button2;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.sbWeight);
        seekBar.setOnSeekBarChangeListener(this);
        button1 = (Button) findViewById(R.id.bth1);
        button2 = (Button) findViewById(R.id.bth2);

        lParams1 = (LinearLayout.LayoutParams)button1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams)button2.getLayoutParams();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax() - progress;

        lParams1.weight = leftValue;
        lParams2.weight = rightValue;

        button1.setText(String.valueOf(leftValue));
        button2.setText(String.valueOf(rightValue));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
