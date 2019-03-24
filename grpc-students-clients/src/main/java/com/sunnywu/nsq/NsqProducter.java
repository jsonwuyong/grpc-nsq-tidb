package com.sunnywu.nsq;/**
 * Created by sunny
 * 2019/3/19.
 */

import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.exceptions.NSQException;

import java.util.concurrent.TimeoutException;

/**
 * 生产者
 * @author
 * @create 2019-03-19 14:47
 **/
public class NsqProducter {

    public static void nsqProducer(String name){
        NSQProducer producer = new NSQProducer();
        producer.addAddress("106.12.206.242",4150).start();
        try {
            producer.produce(name, "sunny say is ok".getBytes());
        } catch (NSQException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        nsqProducer("sunny");
    }
}
