
How to execute test scenarios (properly)
****************************************

Start Active MQ service (must have TSTQUEUE defined)

.. code-block:: console

	./actibemq console

Start Consumer service with settings and log4j config

.. code-block:: console

	java -Dlog4j.configuration=file:./log4j.properties -jar Consumer.jar u2s.properties

Logs are written to ./logs/ separately for our code and Apache libraries and copied to console.

Push some messages to TSTQUEUE

.. code-block:: console

	java -jar Producer.jar u2s.properties
