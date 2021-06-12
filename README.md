# checkoutsystem

checkoutsystem is the solution for the zeller coding
[challenge](https://github.com/zhaoyi0113/zeller-backend-ts-coding-challenge)

```bash
Prices are configured in prices.properties
List of items is an Enum com.zeller.computerstore.model.Products
Pricing Rule is in com.zeller.computerstore.pricing.rules.LaunchPricingRule 
```

## Installation

Download the project from github.

```bash
mvn clean install
mvn eclipse:eclipse
```
Import the project in eclipse

## Usage

Run the class com.zeller.computerstore.util.RunMe after entering the desired value for the skus in 

```bash
String scannedSKUs = "atv,ipd,ipd,atv,ipd,ipd,ipd";
```

In the console, it will print the Total value for the given skus.

## Test Cases
Junit Test Cases are added for the examples mentioned in the challenge. Surefire report at target/site

```bash
mvn surefire-report:report-only
```