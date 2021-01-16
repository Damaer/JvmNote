# JvmNote
## 学习JVM的重要性

从上层应用程序到底层操作系统，到底有哪些东西？

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210114002215.png)
平时开发的应用程序主要基于各种框架，譬如`Spring`,`SpringMVC`,`Mybatis`,而各种框架又是基于`Java API`来实现的，`Java API`调用执行是在`JVM`上的，而`JVM`则是运行在操作系统上的，操作系统是在物理机器打交道的。

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210113235309.png)

在框架上进行业务开发，或者学习框架如何使用，是大部分开发者的工作。但是实际上我们不该执着于框架该如何使用,而是应该往下走，一般最后遇到的问题都会到`JVM`和操作系统的问题。即使现在的 `JVM` 已经很完善，帮开发者做了很多事，但是我们不该以此为理由不去了解 `JVM` 的原理。架构师把开发者变成温室里的花朵和温水里的青蛙，如果有一天出现以下问题，该怎么解决：

- 运行系统卡死，系统无法访问，直接 `OOM` 。
- 线上 `GC` （垃圾回收）有问题，需要 `dump` 内存，进行分析。
- 新项目上线，需要对系统进行评估，设置 `JVM` 的参数。
- 面试时被问及实际项目中 `JVM` 参数调优。

几乎所有的高级语言在交给机器CPU执行之前，都会经历 **高级语言 --> 汇编语言 --> 机器指令** 的过程，因为计算机是不会直接识别高级语言的。了解高级语言如何转换成能被机器识别的语言，是开发者必须掌握的技能。

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116142340.png)

`Java`比`C++`多了动态内存分配以及垃圾回收技术，`Java`的虚拟机帮开发者做了垃圾收集，编译优化等一系列工作，里面的垃圾收集算法有哪些？怎么执行的？`JIT`编译器是怎么工作的？这些往往也是面试常谈的话题。懂得`JVM`的内部机构和工作机制，有利于设计高拓展的应用和快速诊断运行时的问题。

## 如何学习JVM

去官网找虚拟机规范（英文版）：
https://www.oracle.com/cn/java/technologies/javase-downloads.html

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116152110.png)

找到：`Java Language and Virtual Machine Specifications`:
![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116152135.png)

打开之后是：https://docs.oracle.com/javase/specs/index.html ,也就是Java语言和虚拟机的规范。

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116152402.png)

可以选择以下书籍，如果是初学，最好学周志明老师的深入理解`Java`虚拟机，虚拟机规范会直接劝退：
- Java虚拟机规范（`Java SE 8版`）
- 深入理解Java虚拟机（JVM高级特性与最佳实践）

![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116153436.png)

`Java`规范只是标准，不同的版本规范不一样，同一个版本的规范在不同的虚拟机上有不一样的实现，初学者应该从最热门主流的`HotSpot`虚拟机开始,也就是Oracle自己推出的Java虚拟机。

通过`cmd`可以看出，我装的`Java`环境使用的就是64位的`HotSpot`虚拟机：
![](https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210116154122.png)

## 如何真正搞懂JVM？

在了解JVM规范和原理的情况下，自己手动实现一个简易的Java虚拟机。对于大部分人来说，挺难的，但是世间万物，为之则不难，不为，则难。一步登天则难，步步为营则不难。

Github仓库地址：https://github.com/Damaer/JvmNote  
文档地址：https://damaer.github.io/JvmNote/  

PS：本笔记是在宋红康老师的JVM视频中学习的笔记，均经过实践，加上自己的理解。地址：https://www.bilibili.com/video/BV1PJ411n7xZ ，强烈推荐！！！

**【作者简介】**：  
秦怀，公众号【**秦怀杂货店**】作者，技术之路不在一时，山高水长，纵使缓慢，驰而不息。这个世界希望一切都很快，更快，但是我希望自己能走好每一步，写好每一篇文章，期待和你们一起交流。

此文章仅代表自己（本菜鸟）学习积累记录，或者学习笔记，如有侵权，请联系作者核实删除。人无完人，文章也一样，文笔稚嫩，在下不才，勿喷，如果有错误之处，还望指出，感激不尽~ 

<div align=center><img width="550" height="200" src="https://markdownpicture.oss-cn-qingdao.aliyuncs.com/20210107005121.png"/></div>
