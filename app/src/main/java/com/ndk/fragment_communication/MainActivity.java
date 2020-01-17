package com.ndk.fragment_communication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;




public class MainActivity  extends FragmentActivity implements OnButtonPressListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onButtonPressed(String msg) {
        // TODO Auto-generated method stub
        FragmentTwo Obj = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.frag_2);
        Obj.onFragmentInteraction(msg);
    }

}
