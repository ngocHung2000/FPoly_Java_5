package com.poly.Service;

import com.poly.Model.StudentInfo;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoService {

    List<StudentInfo> _lst;
    public StudentInfoService() {
        _lst = new ArrayList<>();
        this.fakeData();
    }

    public List<StudentInfo> getLst(){
        return _lst;
    }

    public void add(StudentInfo data){
        if (data == null){
            return;
        }
        _lst.add(data);
    }

    public void update(StudentInfo data){
        if (data == null|| _lst.size() < 0){
            return;
        }
        for (int i = 0; i < _lst.size(); i++) {
            if (data.getMa().equals(_lst.get(i).getMa())){
                _lst.set(i,data);
            }
        }
    }

    public void delete(String key){
        if (key == null|| _lst.size() < 0){
            return;
        }
        for (int i = 0; i < _lst.size(); i++) {
            if (key.equals(_lst.get(i).getMa())){
                _lst.remove(i);
            }
        }
    }

    public List<StudentInfo> findByName(String x){
        List<StudentInfo> data = new ArrayList<>();

        for (StudentInfo z: _lst) {
            if (x.equals(z.getTen())){
                data.add(z);
            }
        }
        return data;
    }

    public void fakeData(){
        _lst.add(new StudentInfo("SV1","Ngoc Hung",18,"Diem Dien, Thai Thuy, Thai Binh"));
        _lst.add(new StudentInfo("SV2","Ngoc Hu",18,"Diem Dien, Thai Thuy, Thai Binh"));
        _lst.add(new StudentInfo("SV3","Ngoc Hg",18,"Diem Dien, Thai Thuy, Thai Binh"));
        _lst.add(new StudentInfo("SV4","N Hung",18,"Diem Dien, Thai Thuy, Thai Binh"));
        _lst.add(new StudentInfo("SV5","Ngong",18,"Diem Dien, Thai Thuy, Thai Binh"));
    }
}
