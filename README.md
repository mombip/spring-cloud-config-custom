# spring-cloud-config-custom
Test implementaion of custom property source for spring-cloud-config-server
## config-server-custom
Spring cloud config server application with addidtional Spring MVC controller to verify configured Property sources ( [TestController.java](https://github.com/mombip/spring-cloud-config-custom/blob/master/config-server-custom/src/main/java/com/test/server/TestController.java) ) it is maped to http://localhost:8888/myenv

## config-server-client-app
Simple Spring MVC application with bootstrap configured with folowing configuration: [bootstrap.properties](https://github.com/mombip/spring-cloud-config-custom/blob/master/config-server-client-app/src/main/resources/bootstrap.properties)
Application accesible by defult at: http://localhost:8080/myenv

## spring-cloud-config-custom
Custom PropertySource with CustomPropertySourceLocator with hardcoded name ("custom") and properties:
(see: [CustomPropertySourceLocator.java](https://github.com/mombip/spring-cloud-config-custom/blob/master/spring-cloud-config-custom/src/main/java/com/test/cloud/config/custom/CustomPropertySourceLocator.java) )
```
test.prop1=CUSTOM-VALUE-1
test.prop2=CUSTOM-VALUE-2
test.prop3=CUSTOM-VALUE-3
```


