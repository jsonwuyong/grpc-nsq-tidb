package com.sunnywu.api;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.GetGradesService;
import com.sunnywu.grpc.GetGradesClients;
import com.sunnywu.nsq.NsqConsumer;
import com.sunnywu.nsq.NsqProducter;
import com.sunnywu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 *
 * @author
 * @create 2019-03-24 18:43
 **/
public class GrpcAchieveNqlTest {

    @Autowired
    private UserService userService;

    //开始启动一个grpc的服务
    public static void  beginGrpcService(){
        try {
            final GetGradesService server = new GetGradesService();
            server.start();
            server.blockUntilShutdown();
        }catch(IOException e){
            e.printStackTrace();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

    }
    //休眠6秒之后启动grpc客户端
    public static void sleepTime(long times){
        try {
           Thread.sleep(times);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //启动客户端
    public static void startGetGradesClents(){
        GetGradesClients client = new GetGradesClients("127.0.0.1",50051);
        String user = "wuyong";
        client.greet(user);
    }

    //消费者
    public static void consumerNsqMgs(String name){
        NsqConsumer nsqConsumer = new NsqConsumer();
        nsqConsumer.nsqConsumerTest(name);
    }


    public static void main(String[] args){
        //启动客户端
        consumerNsqMgs("wuyong");

    }

}
