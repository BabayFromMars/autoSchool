package rest.api;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.*;
import java.util.stream.Collectors;

public class RestApi {
    public static void main(String[] args) {
        task1();
        Map<String, Object> requestBodyData = new HashMap<>();
        requestBodyData.put("delivery", "18:00");
        requestBodyData.put("custtel", "380982278971");
        requestBodyData.put("comments", "P I Z Z A");
        requestBodyData.put("size", "medium");
        requestBodyData.put("custemail", "DmytroIvanchenko@gmail.com");
        requestBodyData.put("topping", Arrays.asList("bacon", "cheese", "mushroom"));
        requestBodyData.put("custname", "Dmytro Ivanchenko");
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Learning Automation");
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        RestApi.task2(requestBodyData, headers);
        task3_1();
        task3_2(task3_1());
    }

    /*Task1
   Description:
   There is a resource https://nghttp2.org/httpbin/, which describes all requests supported by the service.
   Task:
   Investigate the resource using DevTools (e.g. Network tab). Try to find a way to get all the URLs where requests that can be send.
   Write a script that will find all internal URL paths where response codes are not equal to 200
   Algorithm:
   Examine requests sent upon navigation to https://nghttp2.org/httpbin/
   Find an entity where a list of all service URLs is described.(e.g. "/ip")
   Get the response code for each subresource.
   Depending on the programming language, return HashMap or dictionary with subresources whose response code is not equal to 200.
   Additional requirements:
   Send requests with 'User-Agent': 'Learning Automation'
   Find the list of resources using fiddler/developer console
   The return should contain pairs like: "https://nghttp2.org/httpbin/bla/", 401*/
    public static Map<String, Integer> task1() {
        String numbytes = "100";
        String user = "Sysadmin";
        String passwd = "12345qwerty";
        String valueS = "SGVsbG8gV29ybGQ=";
        String etag = "my_test_etag";
        String qop = "auth";
        String codes = "500";
        String n = "3";
        String algorithm = "MD5";
        String stale_after = "10";
        String delay = "2";
        String offset = "1";
        String anything = "test_data";
        String name = "TestName";

        List<Object> discoveredEndpoints = new ArrayList<>();
        Response response = RestAssured
                .given()
                .header("User-Agent", "Learning Automation")
                .when()
                .get("https://nghttp2.org/httpbin/spec.json");
        JsonPath jsonPath = response.jsonPath();
        discoveredEndpoints.addAll(jsonPath.getMap("paths").keySet());
        List<String> modifiedEndpoints = new ArrayList<>();
        for (Object endpoint : discoveredEndpoints) {
            String processedEndpoint = (String) endpoint;
            if (processedEndpoint.contains("{numbytes}")) {
                processedEndpoint = processedEndpoint.replace("{numbytes}", numbytes);
            }
            if (processedEndpoint.contains("{user}")) {
                processedEndpoint = processedEndpoint.replace("{user}", user);
            }
            if (processedEndpoint.contains("{passwd}")) {
                processedEndpoint = processedEndpoint.replace("{passwd}", passwd);
            }
            if (processedEndpoint.contains("{value}")) {
                processedEndpoint = processedEndpoint.replace("{value}", valueS);
            }
            if (processedEndpoint.contains("{etag}")) {
                processedEndpoint = processedEndpoint.replace("{etag}", etag);
            }
            if (processedEndpoint.contains("{qop}")) {
                processedEndpoint = processedEndpoint.replace("{qop}", qop);
            }
            if (processedEndpoint.contains("{codes}")) {
                processedEndpoint = processedEndpoint.replace("{codes}", codes);
            }
            if (processedEndpoint.contains("{n}")) {
                processedEndpoint = processedEndpoint.replace("{n}", n);
            }
            if (processedEndpoint.contains("{algorithm}")) {
                processedEndpoint = processedEndpoint.replace("{algorithm}", algorithm);
            }
            if (processedEndpoint.contains("{stale_after}")) {
                processedEndpoint = processedEndpoint.replace("{stale_after}", stale_after);
            }
            if (processedEndpoint.contains("{delay}")) {
                processedEndpoint = processedEndpoint.replace("{delay}", delay);
            }
            if (processedEndpoint.contains("{offset}")) {
                processedEndpoint = processedEndpoint.replace("{offset}", offset);
            }
            if (processedEndpoint.contains("{anything}")) {
                processedEndpoint = processedEndpoint.replace("{anything}", anything);
            }
            if (processedEndpoint.contains("{name}")) {
                processedEndpoint = processedEndpoint.replace("{name}", name);
            }
            modifiedEndpoints.add(processedEndpoint);
        }
        System.out.println(" Task 1. Starting sending requests... Please wait...");
        String baseUrl = "https://nghttp2.org/httpbin";
        Map<String, Integer> resultsOther = new HashMap<>();
        Map<String, Integer> results200 = new HashMap<>(); //Не вимагалося, зробив для наглядності і цікавості

        for (String modEndpoints : modifiedEndpoints) {
            Response responseModifiedEndpoints = RestAssured
                    .given()
                    .header("User-Agent", "Learning Automation")
                    .when()
                    .get(baseUrl + modEndpoints);
            int responseCode = responseModifiedEndpoints.getStatusCode();
            if (responseCode != 200) {
                resultsOther.put(baseUrl + modEndpoints, responseCode);
            } else {
                results200.put(baseUrl + modEndpoints, responseCode);
            }
        }
        System.out.println("\nResults with non-200 status codes:");
        resultsOther.forEach((key, value) -> System.out.println(key + ", " + value));
        System.out.println("\nResults with 200 status codes:"); //Не вимагалося, зробив для наглядності
        results200.forEach((key, value) -> System.out.println(key + ", " + value));
        return resultsOther;
    }

    /*Task2
    Description:
    There is a form http://httpbin.org/forms/post
    By clicking on the ‘Submit order’ button, a post request is sent to http://httpbin.org/post
    Json with all the artifacts of the request is returned.
    Task:
    Write a script that will send a POST request, return a json part of the response ('form') and all response headers.
    Algorithm:
    Examine the request/response when the button on 'Submit order' is clicked http://httpbin.org/forms/post
    Write a method that will take two parameters: the POST request body and headers. Depending on the programming language,
    return a List with two HashMaps or a tuple with two dictionaries: the 'form' object of the response body and response headers
    Additional requirements:
    Send requests with 'User-Agent': 'Learning Automation'*/
    public static List<Map<String, ?>> task2(Map<String, Object> requestBodyData, Map<String, String> headers) {

        Response response = RestAssured
                .given()
                .headers(headers)
                .formParams(requestBodyData)
                .when()
                .post("http://httpbin.org/post");
        Map<String, Object> responseForm;
        JsonPath responseJson = response.jsonPath();
        responseForm = responseJson.getMap("form");
        Map<String, String> responseHeaders = response.getHeaders().asList().stream().
                collect(Collectors.toMap(Header::getName, Header::getValue));
        System.out.println("--- Task 2 Results ---");
        List<Map<String, ?>> finalResultList = new ArrayList<>();
        finalResultList.add(responseForm);
        finalResultList.add(responseHeaders);
        System.out.println("Final Result Map: " + finalResultList);
        return finalResultList;
    }

    /*
    Task3
    Description:
    There is a REST API for getting information by country:
    https://restcountries.com/

    Task 3.1:
    Write a method that will find all language codes obtained from https://restcountries.com/v3/all
    Algorithm:
    Get json https://restcountries.com/v3/all
    For every country get list of languages
    Return list of unique languages*/
    public static List<String> task3_1() {
        Response response = RestAssured
                .given()
                .headers("User-Agent", "Learning Automation")
                .when()
                .get("https://restcountries.com/v3.1/all?fields=languages");
        JsonPath responseJson = response.jsonPath();
        List<Map<String, Object>> languagesRawData = responseJson.getList("");
        //    System.out.println("test: " + languagesRawData); //Для контролю, я пам'ятаю, що ніякого закоментованого коду не має бути
        Set<String> languagesFinal = new HashSet<>();
        for (int i = 0; i < languagesRawData.size(); i++) {
            Map<String, Object> curentCountry = languagesRawData.get(i);
            Map<String, String> languages = (Map<String, String>) curentCountry.get("languages");
            if (languages != null) {
                languagesFinal.addAll(languages.keySet());
            }
        }
        System.out.println("(task3_1 called) List of unique languages: " + languagesFinal);
        return new ArrayList<>(languagesFinal);
    }

    /*Task 3.2:
   Write a method that will find the number of people for whom the specified language is the official language.
   Algorithm:
   The method takes as a parameter a list of language codes
   For each language code get json from https://restcountries.com/v3/lang/[language code]
   In the received json, summarize the population values
   Depending on the programming language, return a HashMap or dictionary with pairs: language code, sum of population for language
   Additional requirements:
   Send requests with 'User-Agent': 'Learning Automation'*/
    public static Map<String, Long> task3_2(List<String> languageCodes) {
        Map<String, Long> finalResult = new HashMap<>();
        for (String oneCode : languageCodes) {
            Response response32 = RestAssured
                    .given()
                    .headers("User-Agent", "Learning Automation")
                    .when()
                    .get("https://restcountries.com/v3.1/lang/" + oneCode)
                    .then()
                    .extract().response();
            JsonPath responseJson = response32.jsonPath();
            List<Integer> populationNum = responseJson.getList("population");
            long totalPopulationNum = 0;
            for (Integer population : populationNum) {
                if (population == null) {
                    totalPopulationNum = totalPopulationNum;
                } else {
                    totalPopulationNum += population;
                }
                finalResult.put(oneCode, totalPopulationNum);
            }
            System.out.println("Language code: \"" + oneCode + "\" has population: " + totalPopulationNum); //Для наглядності
        }
        System.out.println("Task 3 Result: " + finalResult); //Для наглядності
        return finalResult;
    }
}
