# DesignPattern
java design pattern

[适配器模式] (https://design-patterns.readthedocs.io/zh_CN/latest/structural_patterns/adapter.html)

  > 应用：jdbc，代码demo（hdfs rpc调用中应用到的适配器模式）

[生产者消费者模式] (https://juejin.im/entry/596343686fb9a06bbd6f888c)

[模板方法模式] (https://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html)
  > 回调方法就是一个通过回调对象的引用（java中的引用存的是对象的地址）调用的方法。如果把回调对象的引用（地址）作参数传递给另一个方法，当这个引用被用来调用其所指向的方法时，我们就说这是回调方法。回调方法不是由该方法的实现方直接调用，而是在特定的事件或条件发生时由另外的一方调用的，用于对该事件或条件进行响应。
  
  > 模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
  
  > 钩子方法: 原理就是实现为空的方法，在某任务之前、之后、执行中、报异常后调用的方法。通常钩子方法是通过抽象类或是本类中的空方法来实现的。
