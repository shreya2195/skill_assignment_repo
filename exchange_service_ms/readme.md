commands to use:
mvn clean install
mvn spring-boot:run

log4j2.xml is available inside src/env 
For checking the logs, the below path is required to be created .
logging.config=C:/Users/shrey/Documents/microservices/exchange_service/config/log4j2.xml

User Story 1: Loading data into database 
Q1.
And only last 12 months are included (you may restrict yourself to the rate as of the 1st day of the month in question) 
And only GBP/USD/HKD currencies are included 

Explanation:
Project Port = 9091
Once the project is enable h2-console will be available in the below :
http://localhost:9091/h2-console

Rest Endpoint :
http://localhost:9091/getExchangeRates/historicRates/{date}/{base}/{accessKey}

Date Format (e.g YYYY-MM-DD)
base= EUR

Hit the api with different dates (i.e 1st of every month) to insert 12 records to the h2 db.
The same will be displayed back as output.

Q2.
Given a specific date (e.g. 2019-05-01) 
When I access the rates end-point to get the exchange rate for that date for Pounds Sterling (GBP) against the Euro (EUR) 
Then GBP to EUR rate must be the same rate from the API for that date (e.g. 0.86248) 

Explanation:

Rest Endpoint :
http://localhost:9091/fetchExchangeRates/{specificDate}/{base}/{accessKey}

Date Format (e.g YYYY-MM-DD)
base= EUR

Hit the API with date as 2019-05-01 to get the list of all rates i.e GBP and EUR

Q3.
 to load data for whole year 
 
 Explanation:
 
Rest Endpoint :
http://localhost:9091/fetchExchangeRates/monthly/{startDate}/{endDate}
 
Date Format (e.g YYYY-MM-DD)
Provide Start date > End Date
(eg.  start Date =2021-10-08 to endDate = 2020-10-08)

User Story 2
Q4.
Rest Endpoint :

Then data between given date and Today to be returned 

  Explanation:
Rest Endpoint :
http://localhost:9091/fetchExchangeRates/date/{date}

Date Format (e.g YYYY-MM-DD)

Provide the Date till which we want the records from today's date.

This API will return the records which are inserted to the DB in scenario 1.