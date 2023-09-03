Evosuite setup steps
=======================================================

1. Pull JDK 8 compatible evosuite docer image

		docker pull evosuite/evosuite:latest-java-8

2. Navigate to the code base. 

3. As evosuite works with the **bytecode**, next step is to **compile** code. Proceed to run the build either for maven or gradle as per the project's configuration
   
		mvn clean compile

	or

		gradle clean build


4. Execute the below docker run to generate test cases from the root location of the code

		docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest-java-8 -target target/classes

	If it is gradle build

		docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest-java-8 -target build/classes

5. To create unit test cases for one class file

   		docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest-java-8 -target target/classes -class com.accionlabs.simplelogic.Arithmatic

6. To create unit test cases for one class file using criterion option

		docker run -it -u ${UID} -v ${PWD}/evodemo:/evosuite evosuite/evosuite:latest-java-8 -target com.accionlabs.db -criterion branch

> Instead of Using ${PWD} in all the above docker commands, the engineer can replace it with either absolute or relative path 

> e.g., docker run -it -u ${UID} -v ~/your/local/path/to/code/evodemo:/evosuite evosuite/evosuite:latest-java-8 -target com.accionlabs.db -criterion branch
