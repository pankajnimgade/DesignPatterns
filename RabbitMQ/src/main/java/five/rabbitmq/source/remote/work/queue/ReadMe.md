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

<p>In this one we'll create a Work Queue that will be used to distribute time-consuming tasks among multiple workers.</p>

<p>The main idea behind Work Queues (aka: Task Queues) is to avoid doing a resource-intensive task immediately and having to wait for it to complete.
Instead we schedule the task to be done later.
We encapsulate a task as a message and send it to a queue.
A worker process running in the background will pop the tasks and eventually execute the job.
When you run many workers the tasks will be shared between them.</p>

<p>This concept is especially useful in web applications
where it's impossible to handle a complex task during a short HTTP request window.</p>