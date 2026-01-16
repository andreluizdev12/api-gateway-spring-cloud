# Spring Cloud Gateway Lab

Study project based on the Spring Cloud Gateway *Getting Started* guide, extended with additional configurations to better reflect a real-world API Gateway setup.

## Overview

This project explores core concepts of **Spring Cloud Gateway**, focusing on route configuration, filters, circuit breakers, and externalized configuration.  
The goal is to consolidate knowledge and serve as a reference for future projects.

## Features

- Route configuration using `RouteLocator`
- Request filtering (custom headers)
- Circuit Breaker with fallback route
- Externalized configuration using `@ConfigurationProperties`
- Environment-based configuration (profiles / environment variables)
- Reactive stack with Spring WebFlux

## Configuration

Routes target URIs are externalized and can be configured via:

### `application.yml`
```yaml
uri:
  httpbin: http://httpbin.org:80
