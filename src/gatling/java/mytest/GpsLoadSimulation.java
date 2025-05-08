package mytest;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.time.Duration;

public class GpsLoadSimulation extends Simulation {

    HttpProtocolBuilder httpProtocol = http
//            .baseUrl("http://ts.where-car.com:8090") // 서버 주소
            .baseUrl("http://ts.where-car.com:8080") // 서버 주소
            .contentTypeHeader("application/json")
            .header("Token", "eyJhbGciOiJIUzI1NiJ9.eyJtZG4iOiIwMTIzNDU2Nzg5MCIsImlhdCI6MTc0NjY4MzI4NiwiZXhwIjoxNzQ3MDI4ODg2fQ.12_aGWoczj4KA4wvDtn_Nz0cqQlcbgvrzdi7tHS2vDc");


    ScenarioBuilder scn = scenario("GPS Load Test")
            .exec(
                    http("Send GPS Logs")
//                            .post("/api/gps")
                            .post("/api/hub/gps")
                            .body(StringBody(jsonBody))
                            .check(status().is(200))
            );


    {
        setUp(
                scn.injectOpen(
                        constantUsersPerSec(400).during(Duration.ofSeconds(1))
                )
        ).protocols(httpProtocol);
    }



    private static final String jsonBody = """
        {
            "mdn": "0234567890",
            "tid": "A001",
            "mid": "6",
            "pv": "5",
            "did": "1",
            "oTime": "202304011540",
            "cCnt": "60",
            "cList": [
                {
                    "sec": "00",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "01",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "02",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "03",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "04",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "05",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "06",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "07",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "08",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "09",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "10",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "11",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "12",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "13",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "14",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "15",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "16",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "17",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "18",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "19",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "20",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "21",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "22",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "23",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "24",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "25",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "26",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "27",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "28",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "29",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "30",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "31",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "32",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "33",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "34",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "35",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "36",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "37",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "38",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "39",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "40",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "41",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "42",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "43",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "13"
                },
                {
                    "sec": "44",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "14"
                },
                {
                    "sec": "45",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "15"
                },
                {
                    "sec": "46",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "47",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "48",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "49",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "50",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "51",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "52",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "53",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "54",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "55",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "56",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "12"
                },
                {
                    "sec": "57",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "16"
                },
                {
                    "sec": "58",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "17"
                },
                {
                    "sec": "59",
                    "gcd": "A",
                    "lat": "1212121",
                    "lon": "2121212",
                    "ang": "100",
                    "spd": "50",
                    "sum": "1000000",
                    "bat": "18"
                }
            ]
        }
        """;




}