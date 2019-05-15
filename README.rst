
How to execute test scenarios (properly)
****************************************

Start Active MQ service (must have TSTQUEUE defined)

.. code-block:: console

	./actibemq console

Start Consumer service with settings and log4j config

.. code-block:: console

	java -Dlog4j.configuration=file:./log4j.properties -jar Consumer.jar stm.properties

Logs are written to ./logs/ separetly for our code and apache libs and copied to console.

Push some messages to TSTQUEUE

.. code-block:: console

	java -jar Producer.jar stm.properties
