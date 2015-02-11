##Spring 3.0의 @Async에 대한 예제
BookGetter의 setBulkList을 비동기와 동기로 수행하여 차이점 테스트

Spring MVC template로 생성 후 
<org.springframework-version>3.0.7.RELEASE</org.springframework-version> 버전 지정

<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-asm</artifactId>
	<version>${org.springframework-version}</version>
</dependency>
<dependency>
	<groupId>cglib</groupId>
	<artifactId>cglib</artifactId>
	<version>2.2.2</version>
</dependency>

@Async를 위한
라이브러리 추가

servlet-context.xml에 

xmlns:task="http://www.springframework.org/schema/task"
xsi:schemaLocation=http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.0.xsd
	
<task:executor id="asyncExecutor" pool-size="100-1000" queue-capacity="1000"  rejection-policy="ABORT" />
<task:annotation-driven executor="asyncExecutor" />

추가
		