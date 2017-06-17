package com.qg.fangrui;

import com.qg.fangrui.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by FunriLy on 2017/6/11.
 * From small beginnings comes great things.
 */
public class NettyChatMain {

    private static final Logger logger = LoggerFactory.getLogger(NettyChatMain.class);

    public static void main(String[] args) {
        final ChatServer server = new ChatServer(Constants.DEFAULT_PORT);
        server.init();
        server.start();
        // 注册进程钩子，在JVM进程关闭前释放资源
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                server.shutdown();
                logger.warn(">>>>>>>>>> jvm shutdown");
                System.exit(0);
            }
        });
    }
}
