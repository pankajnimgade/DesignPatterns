package five.rabbitmq.source.remote.hello.world;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by Pankaj Nimgade on 26-05-2016.
 * <p>Consuming has a similar meaning to receiving.
 * A consumer is a program that mostly waits to receive messages.
 * On our drawings it's shown with "C": </p>
 */
public class Recv {

    /**
     * <p>Set up the queue name where the messages will be stored, this messages comes from Producer</p>
     * <p>This queue name will be created on rabbitMQ broker</p>
     */
    private final static String QUEUE_NAME = "hello_world";

    public static void main(String[] argv) throws Exception {

        // START: we can create a connection to the server:
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        // END : we can create a connection to the server:

        /**
         * Note that we declare the queue here, as well.
         * Because we might start the receiver before the sender,
         * we want to make sure the queue exists before we try to consume messages from it.
         * */
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");


        //We're about to tell the server to deliver us the messages from the queue.
        // Since it will push us messages asynchronously,
        // we provide a callback in the form of an object,
        // that will buffer the messages until we're ready to use them.
        // That is what a DefaultConsumer subclass does.
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
