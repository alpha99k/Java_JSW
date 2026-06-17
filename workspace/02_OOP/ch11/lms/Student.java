package ch11.lms;

public class Student {    //필드 (멤버변수) 선언  "클래스 안에서 어디서든 쓰일 수 있다."
    String studentId;
    String major;
    String name;
    String phoneNumber;
    int birth;
    byte grade;


    String[] searchLecture(){
        String[] lecture = {"자바 기초", "자바고급", "인문학개론"};              //메서드 안에서 만들어진 변수 -> 지역변수 "해당 메서드 안에서만 사용가능"
        return lecture;
    }

    boolean subjectApplication(String Lecture){
        System.out.println(Lecture + "수강신청");
        return true;
    }

    String searchProf(int prof){
        return "!!! 교수";
    }
}
