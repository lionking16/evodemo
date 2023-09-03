Evosuite setup steps
=======================================================

1. Pull JDK 8 compatible evosuite docer image

	docker pull evosuite/evosuite:latest-java-8

2. Navigate to the code base

3. Run build
	maven ==> mvn clean install
	gradle ==> gradle clean build


4. Execute the below docker run to generate test cases from the root location of the code

	docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest-java-8 -target target/classes

	If it is gradle build

	docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest-java-8 -target build/classes
