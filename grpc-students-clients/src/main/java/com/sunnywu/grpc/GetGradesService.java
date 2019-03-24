package com.sunnywu.grpc;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.api.GrpcAchieveNqlApi;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author
 * @create 2019-03-24 17:39
 **/
public class GetGradesService {

    private static final Logger logger = Logger.getLogger(GetGradesService.class.getName());
    private int port = 50051;
    private Server server;

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new GrpcAchieveNqlApi())
                .build()
                .start();
        logger.info("Server started, listening on "+ port);

        Runtime.getRuntime().addShutdownHook(new Thread(){

            @Override
            public void run(){
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                GetGradesService.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    // block 一直到退出程序
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }

    public  static  void main(String[] args) throws IOException, InterruptedException {
        final GetGradesService server = new GetGradesService();
        server.start();
        server.blockUntilShutdown();
    }

}
