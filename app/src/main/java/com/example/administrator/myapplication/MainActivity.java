package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.presenter.Presenter;
import com.example.administrator.myapplication.view.IView;

public class MainActivity extends AppCompatActivity implements IView{
    private Presenter presenter;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        presenter = new Presenter(this);
    }

    @Override
    public void setData(String data) {
        tv.setText(data);
    }
    public  void onClick(View view){
        presenter.loadData();
    }
}
