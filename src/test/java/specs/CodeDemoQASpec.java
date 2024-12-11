package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.filter.log.LogDetail.ALL;

public class CodeDemoQASpec {
    public final static ResponseSpecification successfulResponse200Spec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(ALL)
            .build();

}
