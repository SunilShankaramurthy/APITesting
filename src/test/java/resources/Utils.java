package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Utils {

    public static RequestSpecification reqspec;
    public static RequestSpecification requestSpecification() throws FileNotFoundException {
        if (reqspec==null){
            PrintStream log=new PrintStream("logging.txt");
            reqspec=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                    .addQueryParam("key","qaclick123")
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
        }
        return reqspec;
    }
}
