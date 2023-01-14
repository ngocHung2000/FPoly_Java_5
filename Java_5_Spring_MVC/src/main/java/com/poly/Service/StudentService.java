package com.poly.Service;

import com.poly.Model.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Students> _lst;

    public StudentService() {
        _lst = new ArrayList<>();
        this.fakeData();
    }

    public void add(Students data){
        if(data!=null){
            _lst.add(data);
        }
    }

    public void update(Students data){
        if(data!=null){
            for (int i = 0; i < this._lst.size(); i++){
                if(data.getMa().equals(this._lst.get(i).getMa())){
                    this._lst.set(i,data);
                }
            }
        }
    }

    public void delete(String key){
        if(key!=null){
            for (int i = 0; i < this._lst.size(); i++){
                if(key.equals(this._lst.get(i).getMa())){
                    this._lst.remove(i);
                }
            }
        }
    }

    public List<Students> getLst(){
        return this._lst;
    }

    public void fakeData(){
        _lst.add(new Students("A1","Ngoc Hung","ngochung1809"));
        _lst.add(new Students("A2","Ngoc Hung 1","ngochung1809"));
        _lst.add(new Students("A3","Ngoc Hung 2","ngochu12122g1809"));
        _lst.add(new Students("A4","Ngoc Hung 3","ngochung18021219"));
        _lst.add(new Students("A5","Ngoc Hung 4","ngochung18094324"));
    }

}
