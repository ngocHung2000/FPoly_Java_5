package com.example.luyentap.Service;

import com.example.luyentap.Model.Info;

import java.util.ArrayList;
import java.util.List;

public class InfoService {

    List<Info> _lst;

    public InfoService() {
        _lst = new ArrayList<>();
        this.fakeData();
    }

    public void add(Info data){
        if (data!=null){
            _lst.add(data);
        }
    }

    public Info findByName(String name){
        if (name!=null&&_lst!=null){
            for (int i = 0; i < _lst.size();i++){
                if (name.equals(_lst.get(i).getTen())){
                    return _lst.get(i);
                }
            }
        }
        return null;
    }

    public void update(Info data){
        if (data!=null&&_lst!=null){
            for (int i = 0; i < _lst.size();i++){
                if (data.getTen().equals(_lst.get(i).getTen())){
                    _lst.set(i,data);
                }
            }
        }
    }

    public void delete(String ten){
        if (ten!=null && _lst!=null){
            for (int i = 0; i < _lst.size();i++){
                if (ten.equals(_lst.get(i).getTen())){
                    _lst.remove(i);
                }
            }
        }
    }

    public List<Info> getLst(){
        return _lst;
    }

    public List<Info> find(String x,int style){
        List<Info> data = new ArrayList<>();

        if (style==0){
                if (x!=null&&_lst!=null){
                    for (int i = 0; i < _lst.size();i++){
                        if (x.contains(_lst.get(i).getTen())){
                            data.add(_lst.get(i));
                        }
                    }
             }
        } else if (style == 1) {
            if (x!=null&&_lst!=null){
                for (int i = 0; i < _lst.size();i++){
                    if (Integer.parseInt(x) == _lst.get(i).getTuoi()){
                        data.add(_lst.get(i));
                    }
                }
            }
        }else {
            if (x!=null&&_lst!=null){
                for (int i = 0; i < _lst.size();i++){
                    if (x.contains(_lst.get(i).getKv())){
                        data.add(_lst.get(i));
                    }
                }
            }
        }
        return data;
    }

    public void fakeData(){
        _lst.add(new Info("Cây ăn quả","Táo",3,"Đồng bằng"));
        _lst.add(new Info("Cây ăn quả","Cam",4,"Trung Du"));
        _lst.add(new Info("Cây ăn quả","Sầu riêng",5,"Miền Nam"));
        _lst.add(new Info("Cây ăn quả","Vải",7,"Bắc giang"));
        _lst.add(new Info("Cây ăn quả","Mít",310,"Miền Bắc"));
    }

}
