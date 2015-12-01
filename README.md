# ThreadsExplained
Java Threads implementation
*******************************************************************************
Author       : Getha Jagannathan
*******************************************************************************

Description  : 

1. This is a simple application to explain multithreading in Java
2. Threads are used to preform multiple actions simultaneously, for exampe printing a document when checking the emails.
3. In this case both actions are mutually exclusive and can run simultaneously.
4. The program shows the difference between User and Deamon threads
5. The program also shows the difference between the use of run() and start() to start a thread
6. run() method starts execution within the same thread and treats the threads as mere method calls - hence the calls are sequential
7. start() method starts executing the threads simultaneously hence the output is unpredictable.
8. A deamon thread works in the background and the JVM does not wait for the completion of the deamon thread
9. Once all the user threads(non-deamon) have completed the JVM stops the execution even if the deamon thread is still running.
