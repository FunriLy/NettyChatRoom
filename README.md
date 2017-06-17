
## NettyChatRoom

### 关键字 : Netty WebSocket Web聊天室 计网课设

### 私有协议定义
协议比较简单，所有的消息都一个Json字符串，格式如下：
`head | body | extend`

- head作为头部，用int类型存储，4个字节；
- body 消息的有效载体，用string类型存储，长度无限度；
- extend 协议的扩展字段，用map类型存储； 

### 注意事项
本项目其实集中了两个项目，一个是Netty打包为jar包运行；然后将HTML页面打包为war包放置于Tomcat服务器下运行即可。

### 参考资料
* 《Netty权威指南》(第2版)
* Netty参考项目：https://github.com/beyondfengyu/HappyChat