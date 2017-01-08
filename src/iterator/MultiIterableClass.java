package iterator;

import java.util.*;

/**
 * Created by yanglc on 2017/1/8.
 */
public class MultiIterableClass extends IteratorClass{   //继承实现了Iterable的类，在内部匿名类中实现一个新的Iterator，使用匿名内部类实现适配器模式，调用不同的方法返回具有不同行为的类
        public Iterable<String> reversed(){      //这个方法返回一个新的Iterable对象实例
            return new Iterable<String>(){
                public Iterator<String> iterator(){
                    return new Iterator<String>(){
                        int current = words.length - 1;
                        public String next(){
                            return words[current--];
                        }
                        public boolean hasNext(){
                            return current > -1;
                        }
                    };
                }
            };
        }

        public  Iterable<String> randomized(){
            return new Iterable<String>() {
                @Override
                public Iterator<String> iterator() {
                    ArrayList<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                    Collections.shuffle(shuffled,new Random(47)); //容器的这个方法会打乱容器内容的顺序
                    return shuffled.iterator();    //这个方法没有实现一个新的iterator类，直接返回了list的自有类
                    }
                };
        }
        public static void main(String[] args){
            MultiIterableClass foreach = new MultiIterableClass();
            for(String s :foreach){                   //直接调用对象，会得到原有的（父类实现的）iterator()类实例
                System.out.println(s + " ");
            }
            System.out.println(" ");
            for(String s :foreach.reversed()){         //reverse()方法调用被重新实现了的iterator()类实例
                System.out.println(s + " ");
            }
            System.out.println(" ");
            for(String s :foreach.randomized()){      //randomized()方法调用list类型的iterator类实例，但在调用前将容器中的内容打乱了
                System.out.println(s + " ");
            }
    }
}