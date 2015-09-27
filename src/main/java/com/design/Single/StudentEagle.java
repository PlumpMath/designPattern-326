package com.design.Single;

/**
 * Created by lei on 15-9-27.
 */
public class StudentEagle {
    private Integer id;
    private String name;
    private String sex;

    private static StudentEagle student = new StudentEagle();

    private  StudentEagle() {
    }


    public static StudentEagle getInstance(){

        return student;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentEagle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1  = Student.getInstance();
        student1.setId(2134243);
        student1.setName("sunlei");
        student1.setSex("男");

        System.out.println(student1);

        Student student2 = Student.getInstance();
        System.out.println(student2);
    }
}
