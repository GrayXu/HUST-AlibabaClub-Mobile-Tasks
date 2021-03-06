# 面向对象编程思维 与 常见集合类的方法
--------

本次任务需要大家学习的内容：

- 简单理解面向对象的思维方式，清楚什么是类对象方法成员，明白面向对象的三大特性，如何创建构造并使用一个类。
- 学习常见集合类的方法（ArrayList, LinkedList, HashMap, HashSet），理解他们的不同之处。学有余力的话，可以尝试阅读源代码，看看这些集合类的内部实现逻辑。

>具体的内容对应《疯狂Java讲义》的五六七章内容。书本讲的比较详细，若是看网课视频，学习速度可能比较快，但是某些细节可能会有所遗漏。


--------


本次任务的作业题目如下：


- 写一工具类，有静态方法
`//功能为传入两个字符串，需要查询sub是否是str的子串（即str内部出现了sub），返回一个整数，`
`//为sub在str中第一次出现的位置（第一个重复字符的索引），若不是子串，则返回-1`
`int getSubStrIndex(String str, String sub);`
并在另一个类中调用这个静态方法。*完成后思考是否有更快的实现方法（算法题）*

- 写一篇小文章说说自己对面向对象思维的理解（写博客也是一个好方式，可以帮助整理思维）。
可以包括以下问题：

>1.类与对象分别是什么，举例说明
>
>2.如何定义一个类,类的组成
>
>3.构造方法的作用是什么?可否有多个构造方法？构造方法中可不可以写return语句呢?
>
>4.对象实例和引用有什么区别？（实例放在堆内存中，引用放在栈内存中）。形式参数分别为基本类型和引用类型会有什么不同？（这个问题其实C语言也有类似的场景）
>
>5.我们会把类中的一些变量叫做成员变量，成员变量和局部变量的区别是什么？
>
>6.什么叫做匿名对象（没有名字的对象），一般使用在什么应用场景？
>
>7.封装是什么?java中封装的体现有哪些?请举例说明。
>
>8.this关键字是什么?(哪个对象调用成员方法，this就代表那个对象)。this关键字的应用场景?
>
>9.static关键字是什么? 有什么特点? 什么时候用呢?

- 回答以下代码里注释的问题：
```
class AF {

    public int num = 200 ;

    public void hello(){
        System.out.printLn("I am a's father");
    }

    public static void bye(){
        System.out.printLn("bye.I am af");
    }

}

class A extends AF {

    public int num2 = 2000;

    public int num = 2000;

    public void hello(){
        System.out.printLn("I am a");
    }

    public static void bye(){
        System.out.printLn("bye.I am a");
    }

}

class Test {

    pulic static void main(String[] args){

    AF af = new A();

    // 下面这句为什么这么输出？
    System.out.printLn(" "+af.num);

    // 下面这句是不能通过编译的，为什么？
    // System.out.printLn(" "+af.num2);

    // 下面这句为什么这么输出？
    af.hello();

    // 下面这句为什么这么输出？
    af.bye();

    }
}
```


>提交一样，还是在任务文件夹下，创建一个自己为名的文件夹，放入你的作答。



--------

本周任务主要希望大家能理解面向对象OOP的思想，Java是一个为了OOP而生的语言（有兴趣可以同进度下看看《Thinking in Java》）。大家到后面用过一些脚本语言（Python，Ruby，JS等）之后，可能发现Java有很多看上去冗余笨重的代码，但实际上他们是有在发挥自己的作用的。

面向对象其实更符合人的思维习惯，能对代码进行更好的封装，方便后期进行维护，还能减少冗余的代码（比如面向过程中）。

举个例子，猫和狗都是一种动物，这里的动物就是一个父类，猫和狗都是继承这个父类下的一个子类，家里养的宠物猫A则是“猫类”的一个对象（或者说实例）。然后你能方便地通过这个对象去调用它的成员方法，比如吃喝拉撒。刚好所有的动物都有吃喝拉撒这个方法，于是可以在动物这个类里把这些方法写上，后面继承动物类的所有子类都可以调用这个吃喝拉撒的方法。

-----

最后，希望大家有问题多问多搜索，可以在大群里面讨论，大家也能互相促进。
上次的作业里，张宇在素数筛选算法里实现了一个优化得不错的算法，值得鼓励。
这次任务比较抽象，可以多写小demo测试一下自己的思考是不是正确。Talk is cheap, show me the code.


grayxu@hust.edu.cn 。
