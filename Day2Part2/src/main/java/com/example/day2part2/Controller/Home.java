package com.example.day2part2.Controller;

import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {

    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> list = new ArrayList<>();
        list.add(new StudentModel(1, "shivam", "Shivam@gmail.com"));
        list.add(new StudentModel(1, "Harshit", "Harshit@gmail.com"));
        list.add(new StudentModel(1, "chitrang", "chitrang@gmail.com"));
        list.add(new StudentModel(1, "basant", "basant@gmail.com"));
        list.add(new StudentModel(1, "rudra", "rudra@gmail.com"));
        return list;
    }
}
