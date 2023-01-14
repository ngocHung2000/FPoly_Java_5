package com.poly.Service;

import com.poly.Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    List<Animal> _lst;

    public AnimalService() {
        _lst = new ArrayList<>();
        this.fakeData();
    }

    public void add(Animal x){
        if (x==null){
            return;
        }
        _lst.add(x);
    }

    public void update(Animal x){
        if (x==null){
            return;
        }
        for(int i = 0;i < _lst.size(); i++){
            if (_lst.get(i).getMa().equals(x.getMa())){
                _lst.set(i,x);
                break;
            }
        }
    }

    public void delete
            (String key){
        if (key==null){
            return;
        }
        for(int i = 0;i < _lst.size(); i++){
            if (_lst.get(i).getMa().equals(key)){
                _lst.remove(i);
                break;
            }
        }
    }

    public List<Animal> getLst(){
        return _lst;
    }

    public List<Animal> find(float first,float last){
        List<Animal> result = new ArrayList<>();

        for(Animal x : _lst){
            if (x.getCanNang() >= first && x.getCanNang() <= last ){
                result.add(x);
                System.out.println("ok");
            }
        }
        return result;
    }

    public Animal findByMa(String ma){

        for(Animal x : _lst){
            if (x.getMa().equals(ma)){
                return x;
            }
        }
        return null;
    }

    public void fakeData(){
        _lst.add(new Animal("A1","Dog",10));
        _lst.add(new Animal("A2","Cat",15));
        _lst.add(new Animal("A3","Lion",20));
        _lst.add(new Animal("A4","Chicken",25));
        _lst.add(new Animal("A5","Snake",30));
        _lst.add(new Animal("A6","Pig",35));
    }

}
