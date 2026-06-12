package ch11.lms;

public class Proffessor {
    int  profID;
    String name;
    String major;
    String lecture;
    String affiliation;

    // 메서드
    String searchStudent(){
        return "정승우";
    }

    String[] searchLectureProf(){
        return  new String[]{"자바, DB"};
    }

    void makeLecture(String lectureName){
        System.out.println(lectureName + "이 개설되었습니다. ");
    }
}
