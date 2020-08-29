test:
	mvn clean surefire-report:report

gradle-test:
	gradle clean build test	