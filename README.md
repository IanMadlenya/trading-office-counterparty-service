# Trading Office - Counterparty Service
[![Build Status](https://travis-ci.org/spolnik/trading-office-counterparty-service.svg?branch=master)](https://travis-ci.org/spolnik/trading-office-counterparty-service) [![codecov.io](https://codecov.io/github/spolnik/trading-office-counterparty-service/coverage.svg?branch=master)](https://codecov.io/github/spolnik/trading-office-counterparty-service?branch=master) [![Sonar Coverage](https://img.shields.io/sonar/https/sonar-nprogramming.rhcloud.com/trading-office-counterparty-service/coverage.svg)](https://sonar-nprogramming.rhcloud.com/dashboard/index/1) [![Sonar Tech Debt](https://img.shields.io/sonar/https/sonar-nprogramming.rhcloud.com/trading-office-counterparty-service/tech_debt.svg)](https://sonar-nprogramming.rhcloud.com/dashboard/index/1)

Trading Office is reference implementation of microservices architecture, based on Spring Boot. It's modeling part of post trade processing, mainly focused on receiving Fixml message and preparing confirmation for it.

- [Trading Office](#trading-office)
- [Counterparty Service](#counterparty-service)
- [Notes](#notes)

## Trading Office

- [Trading Office](https://github.com/spolnik/trading-office)

## Counterparty Service
- spring boot web application (rest service)
- exposes REST endpoint to query Exchange data based on mic code
- exposes REST endpoint to query Party data based on custom id

Heroku: http://counterparty-service.herokuapp.com/swagger-ui.html

![Component Diagram](https://raw.githubusercontent.com/spolnik/trading-office-counterparty-service/master/design/counterparty_service.png)

## Notes
- checking if [dependencies are up to date](https://www.versioneye.com/user/projects/56ad39427e03c7003ba41427)
- installing RabbitMQ locally (to run end to end test locally) - [instructions](https://www.rabbitmq.com/download.html)
- to run on Mac OS X - /usr/local/sbin/rabbitmq-server 
