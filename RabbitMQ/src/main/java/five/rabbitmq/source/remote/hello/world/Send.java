package five.rabbitmq.source.remote.hello.world;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by Pankaj Nimgade on 26-05-2016.
 * <br/>
 * <p>Producing means nothing more than sending.
 * A program that sends messages is a producer.
 * We'll draw it like that, with "P":</p>
 * <p> This program acts as 'Producer'</p>
 */
public class Send {

    /**
     * <p>Set up the queue name where the messages will be stored, this messages comes from Producer</p>
     * <p>This queue name will be created on rabbitMQ broker</p>
     */
    private final static String QUEUE_NAME = "hello_world";

    public static void main(String[] args) throws Exception {

        // START: we can create a connection to the server:
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(MyLinks.IP_ADDRESS);
        factory.setUsername(MyLinks.USERNAME);
        factory.setPassword(MyLinks.PASSWORD);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        // END  : we can create a connection to the server:

        /**
         * Next we create a channel, which is where most of the API for getting things done resides.
         * To send, we must declare a queue for us to send to; then we can publish a message to the queue:
         * */
        // START: create a channel:
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World! test app-pankaj";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
        // END  : create a channel:

        // START: close the channel and the connection;
        channel.close();
        connection.close();
        //  END : close the channel and the connection;
    }
}
