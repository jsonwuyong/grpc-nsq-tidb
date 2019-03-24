package com.sunnywu.api;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.grpc.GetGradesClients;
import com.sunnywu.grpc.GetGradesService;

import java.io.IOException;

/**
 *
 * @author
 * @create 2019-03-24 22:46
 **/
public class GrpcServiceSub {

    public static void main(String[] args) throws InterruptedException {
        //启动服务线程
        ThreadGrpcService t = new ThreadGrpcService();
        t.start();
        //休眠一会
        System.out.println("开始休眠");
        seleepMinuins();
        //继续执行
        beginGrpcService();
    }

    public static class ThreadGrpcService extends Thread{
        public void run(){
            try {
                final GetGradesService server = new GetGradesService();
                server.start();
                server.blockUntilShutdown();
            }catch (IOException e){
                e.printStackTrace();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

    public static void  seleepMinuins(){
        //休眠5秒
        try {
            Thread.sleep(5*1000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void beginGrpcService()throws InterruptedException{
        GetGradesClients client = new GetGradesClients("127.0.0.1",50051);
        try{
            System.out.println("执行了grpc客户端");
            String user = "wuyong";
            client.greet(user);
        }finally {
            client.shutdown();
        }
    }
}
