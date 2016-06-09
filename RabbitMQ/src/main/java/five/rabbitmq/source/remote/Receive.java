package five.rabbitmq.source.remote;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by Pankaj Nimgade on 25-05-2016.
 */
public class Receive {

    private final static String EXCHANGE_NAME = "chat.message.exchange";
    private final static String QUEUE_NAME = "chat.message.user.2";
    private final static String ROUTING_KEY_NAME = "chat.message.user.2";
    public static final String IP_ADDRESS = "162.144.209.190";
    public static final String USERNAME = "test";
    public static final String PASSWORD = "test";
    public static final int PORT = 5672;

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(IP_ADDRESS);
        factory.setUsername(USERNAME);
        factory.setPassword(PASSWORD);
        factory.setPort(PORT);
        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "topic", true);

        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, ROUTING_KEY_NAME);

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };
        channel.basicConsume(queueName, true, consumer);
    }


    /*

    {
  "from_id": "1",
  "to_id": "2",
  "chat_message": "a text message",
  "chat_message_id": "9121465492332",
  "languages_id": "1",
  "created_at": 1465492332
    }
    * */
}
