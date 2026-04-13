# TinyDSA Starter — Java

TinyDSA 课程起始代码（Java）——从零手搓经典数据结构与算法。

## 结构

```
src/main/java/cn/bootcraft/tinydsa/   # 核心实现（所有数据结构累积在此）
tests/                                  # 每个 stage 一个测试 (TestS01 … TestS17)
bootcraft.yml                           # 课程元数据
pom.xml                                 # Maven 配置
```

## 开始

在 `src/main/java/cn/bootcraft/tinydsa/` 目录下找到 `TODO` 注释，按 stage 顺序逐步实现。

## 规则

- **禁止使用** `ArrayList`、`LinkedList`、`HashMap` 等 `java.util` 集合类
- 底层存储必须使用 `int[]` 原生数组 + 手动 `System.arraycopy` 扩容
- 测试文件（`tests/`）请勿修改
