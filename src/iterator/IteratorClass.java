package iterator;


import java.util.Iterator;

/**
 * Created by yanglc on 2017/1/8.
 */
public class IteratorClass implements Iterable<String>{
    protected String[] words = ("实现Iterable接口(1)，为普通类添加迭代器(2)，迭代器类在iterator()方法中使用匿名内部类实现并实例化(3)").split("，");
    int index = 0;
    public Iterator<String> iterator(){
        return new Iterator<String>(){
            public String next(){
                return words[index++];
            }
            public boolean hasNext(){
                return index < words.length;
            }
            public void remove(){
                //这个方法不用实现
            }
        };
    }

}
