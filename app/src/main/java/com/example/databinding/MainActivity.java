package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import com.example.databinding.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    MyViewModel myViewModel;
    // 创建一个binding对象
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // 使用binding的DataBindingUtil.setContentView()方法绑定布局
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        // 创建myViewModel对象
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        //myViewModel = new ViewModelProvider();
        // 将具体的值绑定进去,就是将 ViewModel 绑定进去
        binding.setDate(myViewModel);
        // 刷新
        binding.setLifecycleOwner(this);
    }
}
