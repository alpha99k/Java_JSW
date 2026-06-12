package ch11.lms;

import java.util.Arrays;

public class Test {
    static void main(String[] args) {

        //LecturRoom
        LectureRoom room1 = new LectureRoom();      //인스턴스
        room1.location = "인문동";
        room1.lectureNum = 102;
        room1.capacity = 30;

        LectureRoom room2 = new LectureRoom();
        room2.location = "공학동";
        room2.lectureNum = 304;
        room2.capacity = 20;


        //Lecture
        Lecture sub1 = new Lecture();
        sub1.lectureID = 1;
        sub1.lectureName = "인문학 개론";
        sub1.lectureTime = "월요일 3~4교시";
        sub1.prof = "김교수";
        sub1.capacity = 25;
        sub1.useLectureRoom = room1;

        Lecture sub2 = new Lecture();
        sub2.lectureID = 2;
        sub2.lectureName = "자바 기초";
        sub2.lectureTime = "수요일 1~2교시";
        sub2.prof = "박교수";
        sub2.capacity = 20;
        sub2.useLectureRoom = room2;


        // student
        Student s1 = new Student();
        s1.birth = 20030105;
        s1.studentId = "2025123";

        Student s2 = new Student();
        s2.birth = 20031213;
        s2.studentId = "2023456";


        //professor
        Proffessor l1 = new Proffessor();
        l1.name = "김교수";

        Proffessor l2 = new Proffessor();
        l2.name = "박교수";


        l1.makeLecture("자바 기초");
        String[] lectureList = l1.searchLectureProf();
        System.out.println(Arrays.toString(lectureList));

        s1.searchLecture();
        String[] result = s1.searchLecture();
        System.out.println(Arrays.toString(result));
    }
}
