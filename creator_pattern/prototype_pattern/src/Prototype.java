public interface Prototype extends Cloneable {
    Prototype clone();
}
/*
* 在Java中，要实现原型模式，需要通过克隆来创建新对象。Cloneable接口在Java中的作用是标识对象是可以被克隆的，它是一个标记接口（Marker Interface），并不包含任何方法。但是，它在Object类的clone()方法中起到了重要的作用。

在Java中，Object类提供了一个clone()方法，它可以创建并返回一个对象的浅拷贝（shallow copy）。然而，clone()方法是受保护的，也就是说，只能被对象本身或其子类访问。

当一个类实现了Cloneable接口并重写了clone()方法时，它表明这个类是可克隆的，并且clone()方法可以被外部访问。否则，如果尝试对未实现Cloneable接口的对象调用clone()方法，会抛出CloneNotSupportedException异常。

因此，为了让一个类能够安全地进行克隆操作，需要确保它实现了Cloneable接口，这样在调用clone()方法时就不会抛出异常
*
* */