package com.winson.commonconvenienttools.entrance;

import com.winson.commonconvenienttools.meta.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerizableEntance {

    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.setAge(18);
        person1.setName("小马");
        person1.setHobby("画画");
        person1.setPhone("15625035695");

        Person person2 = new Person();
        person2.setAge(50);
        person2.setName("小军");
        person2.setHobby("钓鱼");
        person2.setPhone("13659754309");

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        FileOutputStream fos = new FileOutputStream("E:\\Github\\common-convenient-tools\\src\\main\\resources\\data\\person.txt");
        try (ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(list);
        }
        System.out.println("序列化成功");
    }

    public static void main1(String[] args) throws Exception {
        List<Person> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream("E:\\Github\\common-convenient-tools\\src\\main\\resources\\data\\person.txt");
        try (ObjectInputStream is = new ObjectInputStream(fis)) {
            list = (List<Person>) is.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }


}
