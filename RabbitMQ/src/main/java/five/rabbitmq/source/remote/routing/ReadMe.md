<p>In this tutorial we're going to add a feature to it -
we're going to make it possible to subscribe only to a subset of the messages.
For example, we will be able to direct only critical error messages to the log file (to save disk space),
while still being able to print all of the log messages on the console.</p>


<p>Bindings

   In previous examples we were already creating bindings. You may recall code like:

   channel.queueBind(queueName, EXCHANGE_NAME, "");

   A binding is a relationship between an exchange and a queue.
   This can be simply read as: the queue is interested in messages from this exchange.

   Bindings can take an extra routingKey parameter.
   To avoid the confusion with a basic_publish parameter we're going to call it a binding key.
   This is how we could create a binding with a key:

   channel.queueBind(queueName, EXCHANGE_NAME, "black");

   The meaning of a binding key depends on the exchange type.
   The fanout exchanges, which we used previously, simply ignored its value.</p>