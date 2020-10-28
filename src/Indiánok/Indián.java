package Indiánok;

import java.util.List;

public class Indián {
    String name;
    String tribe;
    String gender;
    int age;
    List<String> tools;

    public Indián(String name, String tribe, String gender, int age, List<String> tools) {
        this.name = name;
        this.tribe = tribe;
        this.gender = gender;
        this.age = age;
        this.tools = tools;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Indián{" +
                "name='" + name + '\'' +
                ", tribe='" + tribe + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                '}';
    }
}
