package JunitTest;

/**
 * Created by yanglc on 2017/1/10.
 * 学生信息实体
 */
public class EStudent{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 注意：自定义类时要重写equals方法，否则默认equals方法会使用==方式来比较对象的内存地址是否相同，而不是内容是否相同。
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null || obj.getClass() != this.getClass()) return false;

        EStudent other = (EStudent)obj;
        if (!this.getName().equals(other.getName())
                || this.getAge() != other.getAge()) return false;
        return true;
    }
}
