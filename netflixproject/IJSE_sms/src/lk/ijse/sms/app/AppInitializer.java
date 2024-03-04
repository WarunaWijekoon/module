package lk.ijse.sms.app;
import com.netflix.ribbon.api.*;
import com.netflix.zuul.service.ApiGateway;
import com.spring_security.api.Decorder;

public class AppInitializer {
    public static void main(String[] args) {
        new SecurityConfig();
        new RibbonService(); //netflix-ribbon api
        new RibbonGateway(); //netflix-ribbon api
        new ApiGateway();   //netflix-zuul service
        new Decorder();     //spring security api
       new RibbonConfig(); //netflix -config
        new webSecurityConfig(); //spring config
        new Interceptor(); // spring util
        new Viz(); //netflix -util

    }
}
