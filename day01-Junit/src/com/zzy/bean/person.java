package com.zzy.bean;

public class person {
    private String name;
    private int age;
    private char sex;

    public person() {
    }

    public person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * ��ȡ
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * ����
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "person{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
    public void behavior(){

    }
}
