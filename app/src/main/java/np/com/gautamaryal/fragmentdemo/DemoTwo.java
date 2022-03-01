package np.com.gautamaryal.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class DemoTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_two);

        loadInitialSectioinFirst();
        loadInitialSectioinTwo();

        findViewById(R.id.load_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFirst();
            }
        });

        findViewById(R.id.load_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSecond();
            }
        });
    }
    public void loadInitialSectioinFirst()
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentOne fm_one = new FragmentOne();
        fragmentTransaction.add(R.id.frame_container, fm_one);
        fragmentTransaction.commit();

    }

    public void loadInitialSectioinTwo()
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentThree fm_three = new FragmentThree();
        fragmentTransaction.add(R.id.frame_container_second, fm_three);
        fragmentTransaction.commit();

    }



    public void loadFirst()
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentOne fm_one = new FragmentOne();
        fragmentTransaction.replace(R.id.frame_container, fm_one);
        fragmentTransaction.commit();


    }

    public void loadSecond()
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentTwo fm_two = new FragmentTwo();
        fragmentTransaction.replace(R.id.frame_container, fm_two);
        fragmentTransaction.commit();
    }

}