## 栈的定义

栈(Stack)是一种后进先出的数据结构（LIFO:last in first out），只允许访问栈中的第一个数据项：即最后插入的数据项。移除这个数据项之后，才能看到第二个数据项

往栈中存入数据称之为压栈(push)，移除数据称之为弹栈(pop)，此外通常还提供查看栈顶元素的peek方法，此方法可以查看栈顶元素的值，但是并不会将其移除。

java.util.Stack就是JDK提供的一种对栈的实现，这个实现是基于数组的，由于栈非常简单，我们没有必须要分析源码，直接按照以下方法提供一个相同的自己的实现，此外，我们也可以基于链表来实现一个栈

### 基于数组的栈的实现

关于基于数组的栈的实现，只有一点值得注意的地方，其是LIFO，但是我们在使用数组的时候，并不需要每次都将元素插入数组的第一个位置，然后将之前的所有元素后移一个位置，只要用一个变量记住最后一个添加的元素的位置即可，当弹栈时，直接返回这个位置上的数字即可

