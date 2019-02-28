# MicroserviceAPIGateway
It is a single entry point into the system, used to handle requests by routing them to the appropriate backend service or by invoking multiple backend services and aggregating the results. Also, it can be used for authentication, insights, stress and canary testing, service migration, static response handling, active traffic management.  

Netflix open sourced such an edge service, and now with Spring Cloud we can enable it with one @EnableZuulProxyannotation. 
