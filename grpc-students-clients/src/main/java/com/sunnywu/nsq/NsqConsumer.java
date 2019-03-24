package com.sunnywu.nsq;/**
 * Created by sunny
 * 2019/3/19.
 */

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.NSQMessage;
import com.github.brainlag.nsq.callbacks.NSQMessageCallback;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;

/**
 * 消费者
 * @author
 * @create 2019-03-19 14:40
 **/
public class NsqConsumer {

    public static void main(String[] args){
        nsqConsumerTest("wuyong");
    }

    public static void nsqConsumerTest(String name){
        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("106.12.206.242",4161);
        NSQConsumer consumer = new NSQConsumer(lookup, name, "nsq_to_java", new NSQMessageCallback() {
            public void message(NSQMessage nsqMessage) {
                byte b[] = nsqMessage.getMessage();
                String s = new String(b);
                System.out.println(s);
                nsqMessage.finished();
            }
        });
        consumer.start();

    }


}
