package services;

import model.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int id){
        students.add(new Student(name,id));
        System.out.println("Öğrenci eklendi:"+ name);
    }

    public void listStudents(){
        if (students.isEmpty()){
            System.out.println("Hiç öğrenci yok");
            return;
        }else{
            for (Student s: students){
                System.out.println(s);
            }
        }
    }


    public  void removeStudent(int id){
        boolean removed = students.removeIf(s-> s.getId()==id);
        if (removed){
            System.out.println("Öğrenci silindi");
        }else {
            System.out.println("Böyle bir numaraya ait öğrenci bulunamadı");
        }
    }
}
