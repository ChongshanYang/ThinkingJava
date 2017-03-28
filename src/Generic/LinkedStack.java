package Generic;

/**
 * Created by yanglc on 2017/3/28.
 * 使用泛型、元组实现一个堆栈，不用LinkedList来实现
 * 通过末端哨兵判断栈是否为空
 */
public class LinkedStack<T>{                //这个堆栈具有泛型，可以存入任意类型对象
    private static class Node<U>{           //节点元组，这个元组中存储两个对象，一个是当前堆栈的存储对象，一个是堆栈中下一个节点的元组对象
        U item;
        Node<U> next;
        Node(){ item = null; next=null;}      //用于创建哨兵节点的构造器
        Node(U item,Node<U> next){            //用于创建普通节点的构造器
            this.item = item;
            this.next = next;
        }
        boolean end(){return item==null&&next==null;}
    }
    private Node<T> top = new Node<T>();    //末端哨兵
    public void push(T item){              //传入一个T类型的对象
        top = new Node<T>(item,top);       //将新传入的对象生成一个节点元组，将这个节点置为top，而将原先的top设置为这个节点的next参数
        //System.out.println(top.item);
    }
    public T pop(){
        T result = top.item;               //pop的对象为当前top的item参数
        //System.out.println(result);
        if(!top.end())                     //判断当前top是否为空（哨兵）
            top = top.next;                //将下一个节点置为top
            return result;
    }

    public static void main(String[] args){
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s: "one two three".split(" ")){
            lss.push(s);
        }
        String s;
        while((s=lss.pop())!=null){
            System.out.println(s);
        }
        //System.out.println(lss.pop());
    }

}
