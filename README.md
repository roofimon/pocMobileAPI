# How to setup project locally
1. Clone this project to your local machine
2. In case you are using IntelliJ please run "gradle idea" first
2. Run "gradle test"

# How to run
1. Run "gradle build"
2. Run "java -jar build/libs/poc-mobile-rtr-0.1.0.jar"
3. Open Rest client and use this url http://127.0.0.1:8080/refill/topup/0 for success case
4. Open Rest client and use this url http://127.0.0.1:8080/refill/topup/1 for failure case

# How to do stress test using Apache ab
1. Run an application
2. Run "ab -k -c 25 -n 10000 127.0.0.1:8080/refill/topup/0" for 25 concurrent with 100,0000 requests
