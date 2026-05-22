# Java Notes

记录自己手敲的 Java 片段式代码，主要用于练习 Java 基础、数据结构、算法题、设计模式和小型 demo。

## 目录结构

源码统一放在 `src/javanotes` 根包下：

```text
src/javanotes/
├── App.java
├── algorithm/
│   └── sort/                  # 通用算法练习
├── demo/
│   ├── http/                  # HTTP/API 调用示例
│   └── proxy/                 # 静态代理示例
├── foundation/
│   └── datastruct/            # 基础数据结构
├── leetcode/
│   └── p####/                 # LeetCode 题解，按题号分包
├── pattern/
│   └── creational/singleton/  # 设计模式示例
└── practice/
    ├── clone/                 # 克隆相关练习
    ├── concurrency/           # 并发与线程安全练习
    ├── javase/                # Java SE 基础练习
    ├── reference/             # 参数传递练习
    └── string/                # String/StringBuilder 练习
```

## 包名约定

- 统一根包：`javanotes`
- 包名全部小写，按学习主题分层。
- 类名使用 PascalCase，并尽量表达具体含义。
- LeetCode 题解使用 `p题号` 分包，例如 `p0002/AddTwoNumbers.java`。

## 编译验证

可以使用 `javac` 快速检查源码是否能通过编译：

```bash
javac -d /tmp/java-notes-build src/**/*.java
```
