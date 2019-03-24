package com.sunnywu;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.grpc.GradesGrpc;
import com.sunnywu.grpc.GradesReply;
import com.sunnywu.grpc.GradesRequest;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author
 * @create 2019-03-24 17:40
 **/
public class GradesImpl extends GradesGrpc.GradesImplBase {

    /** 原子Integer */
    public AtomicInteger count = new AtomicInteger(0);
    @Override
    public void getGrades(GradesRequest request, StreamObserver<GradesReply> responseObserver) {
          System.out.println("调用 getGrades");
          GradesReply reply =GradesReply.newBuilder().setMessage("用户ID是:"+request.getName())
                                        .build();
          responseObserver.onNext(reply);
          responseObserver.onCompleted();
          System.out.println(count.incrementAndGet() + Thread.currentThread().getName());
          System.out.println("服务端收到:"+ request.getName()+"用户Id:"+ request.getIn());
          //获取用户ID之后进行查询


    }
}
