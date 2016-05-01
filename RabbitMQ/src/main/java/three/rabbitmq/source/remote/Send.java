package three.rabbitmq.source.remote;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by Pankaj Nimgade on 17-04-2016.
 */
public class Send {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(MyLinks.Server.IP_ADDRESS);
        factory.setUsername(MyLinks.Credentials.USERNAME);
        factory.setPassword(MyLinks.Credentials.PASSWORD);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        int count = 100;
        while (count > 0) {
            String message = "Hello World! " + count;
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            count--;
            System.out.println(" [x] Sent '" + message + "'");
        }

        channel.close();
        connection.close();

    }

}
