# NetLook
通信状态查看，查看当前的连接，定位连接文件，发现可疑连接并kill掉进程

<h1 align="center">
    <img src="/image/pic02.png" width="500" height="484">
</h1>

## INSTALL

* 环境要求：JDK1.8版本以上
* 运行样例：[NetLook.jar](https://github.com/kailanguage/NetLook/blob/master/NetLook.jar)  demo版本仅在windows上正常运行
* 运行源码：[NetLook](https://github.com/kailanguage/NetLook/tree/master/NetLook)  使用可以编译JavaFX的编译器编译源码

## FAQ
***Q: 为什么软件在mac上无法查看网络信息？***

A: 目前源码和Demo仅在win上运行正常.

***Q:为什么其他按钮点击没有反应？***

A: 源码主要为界面设计，编译可运行，正常显示当前系统（win）的网络状态，其他按钮没有实现处理事件.

***Q:为什么我下载的在编译器上出现中文乱码？***

A: 请将编译器编码UTF-8改为GBK.

## NEWS

本项目由目前仅由kailang开发，如果你对此项目感兴趣的话，可以一起将该项目进行到底！

## TAGS
[![](https://img.shields.io/badge/blog-kailanguage-blue.svg)](https:kailanguage.github.io)
![](https://img.shields.io/badge/JavaFX-2.0-green.svg)
[![GitHub license](https://img.shields.io/github/license/kailanguage/NetLook.svg)](https://github.com/kailanguage/NetLook/blob/master/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/kailanguage/NetLook.svg)](https://github.com/kailanguage/NetLook/issues)


## CREDITS

（暂时没有贡献者，期待您的加入！）

## HISTORY

2018年12月6日 V1.0.0demo 预设项目功能及大体界面

## COPYING

LGPL V2.1

## LICENSE

[许可证](/LICENSE)

## MANIFEST
```
NetLook/
└────── bin/
    │   ├── kailanguage.netlook.main/
    │   │   ├──Main.java
    │   │   └──MainPane.java
    │   └── kailanguage.netlook.util
    │       └──Netstat.java
    └── src/
        ├── kailanguage.netlook.main/
        │   ├──Main.java
        │   └──MainPane.java
        └── kailanguage.netlook.util
            └──Netstat.java

```


