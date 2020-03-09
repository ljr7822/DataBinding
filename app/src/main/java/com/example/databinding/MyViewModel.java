package com.example.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author iwenLjr
 * @Data 2020/2/7 15:13
 */
public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number;
    public MutableLiveData<Integer> getNumber() {
        if (number == null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }
    public void add(){
        number.setValue(number.getValue()+1);
    }
}
