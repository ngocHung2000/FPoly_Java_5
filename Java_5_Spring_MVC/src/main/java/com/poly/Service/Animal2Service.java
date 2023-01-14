package com.poly.Service;

import com.poly.Model.Animal;
import com.poly.Model.Animal2;

import java.util.ArrayList;
import java.util.List;

public class Animal2Service {

    List<Animal2> _lst;

    public Animal2Service() {
        _lst = new ArrayList<>();
        this.fakeData();
    }

    public void add(Animal2 data){
        if(data!=null){
            _lst.add(data);
        }
    }

    public void update(Animal2 data){
        if(data!=null){
            for (int i = 0; i < _lst.size(); i++){
                if (data.getMa().equals(_lst.get(i).getMa())) _lst.set(i,data);
            }
        }
    }

    public void delete(String key){
        if(key!=null){
            for (int i = 0; i < _lst.size();i++){
                if (key.equals(_lst.get(i).getMa())) _lst.remove(i);
            }
        }
    }

    public List<Animal2> getLst(){
        return _lst;
    }

    public void fakeData(){
        _lst.add(new Animal2("DV1","Cat1",10,"Châu Á"));
        _lst.add(new Animal2("DV2","Cat1",10,"Châu Á"));
        _lst.add(new Animal2("DV3","Cat1",10,"Châu Á"));
        _lst.add(new Animal2("DV4","Cat1",10,"Châu Á"));
        _lst.add(new Animal2("DV5","Cat1",10,"Châu Á"));
    }
}
