### 项目说明

本项目是网站[**mingzuozhibi.com**][mzzb]的一个后端模块，是为方便[**名作之壁吧**][home]的吧友而创建的。本网站以名作之壁吧宗旨和愿景作为指引，在与贴吧功能不冲突的前提下，寻找自己的定位和发展方向。

**名作之壁吧宗旨**

名作之壁吧以日本动画的销量为主要讨论话题，主要包括动画BD/DVD、轻小说、漫画、游戏、动画相关CD等，兼论动画票房、收视率以及业界商业相关。

**名作之壁吧愿景**

名作之壁吧致力于成为动画商业化讨论领域的专业型贴吧，以专业、低调、务实、开放为发展目标，欢迎对动画销量、业界、产业相关话题有兴趣的同好发帖交流。

[home]: https://tieba.baidu.com/f?kw=名作之壁&ie=utf-8
[mzzb]: https://mingzuozhibi.com

### 安装说明

**下载**
```bash
git clone https://github.com/mingzuozhibi/mzzb-disc-spider.git
```

**依赖**
```
jdk8, maven3, activemq5, redis5
```

**初始化**
```bash
cd mzzb-disc-spider
sh manual/initial.sh
```

**测试运行**
```bash
mvn clean compile
mvn spring-boot:run
```

**后台运行**
```bash
sh app.sh st -f
```

**后台终止**
```bash
sh app.sh qt -f
```

**更多命令**
```bash
sh app.sh help
```