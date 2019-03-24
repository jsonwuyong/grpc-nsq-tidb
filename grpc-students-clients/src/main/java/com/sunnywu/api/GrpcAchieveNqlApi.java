package com.sunnywu.api;/**
 * Created by sunny
 * 2019/3/24.
 */

import com.sunnywu.entity.User;
import com.sunnywu.grpc.GradesGrpc;
import com.sunnywu.grpc.GradesReply;
import com.sunnywu.grpc.GradesRequest;
import com.sunnywu.nsq.NsqProducter;
import com.sunnywu.service.UserService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author
 * @create 2019-03-24 18:43
 **/
public class GrpcAchieveNqlApi  extends  GradesGrpc.GradesImplBase {

    @Autowired
    private UserService userService;


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
        //插入数据库
        User user = new User();
        user.setUserAge(12);
        user.setUserName(request.getName());
        userService.insertUser(user);
        //发nsq消息
        NsqProducter nsqProducter = new NsqProducter();
        nsqProducter.nsqProducer(user.getUserName());

    }


}
