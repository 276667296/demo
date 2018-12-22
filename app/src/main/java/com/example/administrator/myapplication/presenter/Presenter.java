package com.example.administrator.myapplication.presenter;

import com.example.administrator.myapplication.model.Student;
import com.example.administrator.myapplication.view.IView;

/**
 * Created by Administrator on 2018/12/17 0017.
 */

public class Presenter {
    private IView iView;
    private Student student;

    public Presenter(IView iView) {
        this.iView = iView;
        student = new Student();
    }

    public void loadData() {
        //生成一个student的请求逻辑
        student.setName("这是的数据");
        //之后  主持人把数据交给View
        onDataResult(student.getName());
    }

    public void onDataResult(String data) {
        //  数据交给View
        iView.setData(data);
    }
}
