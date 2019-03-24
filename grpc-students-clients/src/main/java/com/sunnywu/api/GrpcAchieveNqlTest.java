package com.sunnywu.api;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.GetGradesService;
import com.sunnywu.grpc.GetGradesClients;
import com.sunnywu.nsq.NsqConsumer;

import java.io.IOException;

/**
 *
 * @author
 * @create 2019-03-24 18:43
 **/
public class GrpcAchieveNqlTest {

    //开始启动一个grpc的服务
    public void  beginGrpcService() throws IOException,InterruptedException {
        final GetGradesService server = new GetGradesService();
        server.start();
        server.blockUntilShutdown();
    }
    //休眠6秒之后启动grpc客户端
    public void sleepTime(long times){
        try {
           Thread.sleep(times);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //启动客户端
    public void startGetGradesClents(){
        GetGradesClients client = new GetGradesClients("127.0.0.1",50051);
        String user = "wuyong";
        client.greet(user);
    }

    //消费者
    public void consumerNsqMgs(String name){
        NsqConsumer nsqConsumer = new NsqConsumer();
        nsqConsumer.nsqConsumerTest(name);
    }
    //生产者


}
