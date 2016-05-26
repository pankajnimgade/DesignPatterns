package five.rabbitmq.source.remote.topics;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by Pankaj Nimgade on 26-05-2016.
 */
public class EmitLogTopic {

    private static final String EXCHANGE_NAME = "topic_logs";

    //"<speed>.<colour>.<species>"
    public static void main(String[] argv)
            throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");

//        String routingKey = "lazy.orange.elephant";
//        String routingKey = "quick.orange.rabbit";
//        String routingKey = "quick.orange.fox";
//        String routingKey = "lazy.brown.fox";
        String routingKey = "lazy.pink.rabbit";
        String message = "elephant";

        channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes());
        System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");

        connection.close();
    }

}
