RabbitMQ is a message broker.
<br/>

The principal idea is pretty simple: it accepts and forwards messages.
<br/>

You can think about it as a post office: when you send mail to the post box you're pretty sure that
Mr. Postman will eventually deliver the mail to your recipient.
Using this metaphor RabbitMQ is a post box, a post office and a postman.
<br/>

The major difference between RabbitMQ and the post office is the fact that it doesn't deal with paper,
instead it accepts, stores and forwards binary blobs of data ‒ messages.
<br/>


Note that the producer, consumer, and broker do not have to reside on the same machine; indeed in most applications they don't.
<br/>