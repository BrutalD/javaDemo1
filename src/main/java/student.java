/**
 * student
 *
 * @author pudinr
 * @version 1.0
 * @className PACKAGE_NAME.student
 * @copyright Copyright 2022 pudinr, Inc All rights reserved.
 * @date 2022-12-02 10:48
 */
public class student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
