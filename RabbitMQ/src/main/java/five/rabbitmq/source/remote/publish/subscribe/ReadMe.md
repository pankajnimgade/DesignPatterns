<p> In this part we'll do something completely different -- we'll deliver a message to multiple consumers. This pattern is known as "publish/subscribe".

   To illustrate the pattern, we're going to build a simple logging system. It will consist of two programs -- the first will emit log messages and the second will receive and print them.

   In our logging system every running copy of the receiver program will get the messages. That way we'll be able to run one receiver and direct the logs to disk; and at the same time we'll be able to run another receiver and see the logs on the screen.

   Essentially, published log messages are going to be broadcast to all the receivers.<p/>

<p>Exchanges

   In previous parts of the tutorial we sent and received messages to and from a queue.
   Now it's time to introduce the full messaging model in Rabbit.

   Let's quickly go over what we covered in the previous tutorials:

       A producer is a user application that sends messages.
       A queue is a buffer that stores messages.
       A consumer is a user application that receives messages.

   The core idea in the messaging model in RabbitMQ is that the producer never sends any messages directly to a queue.
   Actually, quite often the producer doesn't even know if a message will be delivered to any queue at all.</p>