package com.sunnywu.grpc;/**
 * Created by sunny
 * 2019/3/24.
 */

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 * @create 2019-03-24 18:38
 **/
public class GetGradesClients {

    private final ManagedChannel channel;
    private final GradesGrpc.GradesBlockingStub blockingStub;
    private static final Logger logger = Logger.getLogger(GetGradesClients.class.getName());

    public GetGradesClients(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();
        blockingStub = GradesGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public  void greet(String name){
        GradesRequest request = GradesRequest.newBuilder()
                                             .setName(name)
                                             .setIn("5").build();
        GradesReply response;
        try{
            response = blockingStub.getGrades(request);
        } catch (StatusRuntimeException e)
        {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: "+response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        GetGradesClients client = new GetGradesClients("127.0.0.1",50051);
        try{
            String user = "wuyong";
            if (args.length > 0){
                user = args[0];
            }
            client.greet(user);
        }finally {
            client.shutdown();
        }
    }

}
