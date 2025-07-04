package rest.api;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class RestApiOld {
    public static void main(String[] args) throws IOException {
        //task1();
        task2();
        // task3();
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

    public static void task1() throws IOException {
        String jsonUrl = "https://nghttp2.org/httpbin/spec.json";
        List<String> discoveredEndpoints = new ArrayList<>();

        try {
            URL url = new URL(jsonUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Learning Automation");

            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = bufferedReader.readLine()) != null) {
                    content.append(inputLine);
                }
                bufferedReader.close();

                JSONObject jsonResponse = new JSONObject(content.toString());

                if (jsonResponse.has("paths")) {
                    JSONObject pathsObject = jsonResponse.getJSONObject("paths");

                    Iterator<String> keys = pathsObject.keys();
                    while (keys.hasNext()) {
                        String path = keys.next();
                        discoveredEndpoints.add(path);
                    }
                } else {
                    System.out.println("JSON response from " + jsonUrl + " does not contain 'paths' object.");
                }
            } else {
                System.out.println("Failed to fetch API documentation from " + jsonUrl + ". Response Code: " + responseCode);
            }
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error during API documentation discovery from " + jsonUrl);
        }
        System.out.println("Discovered basic Endpoints:");
        for (String endpoint : discoveredEndpoints) {
            System.out.println(endpoint);
        }
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

        List<String> modifiedEndpoints = new ArrayList<>();

        for (String endpoint : discoveredEndpoints) {
            String processedEndpoint = endpoint;
            if (endpoint.contains("{numbytes}")) {
                processedEndpoint = processedEndpoint.replace("{numbytes}", numbytes);
            }
            if (endpoint.contains("{user}") && (endpoint.contains("{passwd}"))) {
                processedEndpoint = processedEndpoint.replace("{user}", user);
                processedEndpoint = processedEndpoint.replace("{passwd}", passwd);
            }
            if (endpoint.contains("{value}")) {
                processedEndpoint = processedEndpoint.replace("{value}", valueS);
            }
            if (endpoint.contains("{etag}")) {
                processedEndpoint = processedEndpoint.replace("{etag}", etag);
            }
            if (endpoint.contains("{codes}")) {
                processedEndpoint = processedEndpoint.replace("{codes}", codes);
            }
            if (endpoint.contains("{n}")) {
                processedEndpoint = processedEndpoint.replace("{n}", n);
            }
            if (endpoint.contains("{qop}") && (endpoint.contains("{user}") && (endpoint.contains("{passwd}") && (endpoint.contains("{algorithm}")
                    && (endpoint.contains("{stale_after}")))))) {
                processedEndpoint = processedEndpoint.replace("{qop}", qop);
                processedEndpoint = processedEndpoint.replace("{user}", user);
                processedEndpoint = processedEndpoint.replace("{passwd}", passwd);
                processedEndpoint = processedEndpoint.replace("{algorithm}", algorithm);
                processedEndpoint = processedEndpoint.replace("{stale_after}", stale_after);
            }
            if (endpoint.contains("{delay}")) {
                processedEndpoint = processedEndpoint.replace("{delay}", delay);
            }
            if (endpoint.contains("{offset}")) {
                processedEndpoint = processedEndpoint.replace("{offset}", offset);
            }
            if (endpoint.contains("{qop}") && endpoint.contains("{user}") && (endpoint.contains("{passwd}"))) {
                processedEndpoint = processedEndpoint.replace("{qop}", qop);
                processedEndpoint = processedEndpoint.replace("{user}", user);
                processedEndpoint = processedEndpoint.replace("{passwd}", passwd);
            }
            if (endpoint.contains("{anything}")) {
                processedEndpoint = processedEndpoint.replace("{anything}", anything);
            }
            if (endpoint.contains("{name}") && (endpoint.contains("{value}"))) {
                processedEndpoint = processedEndpoint.replace("{name}", name);
                processedEndpoint = processedEndpoint.replace("{value}", valueS);
            }
            if (endpoint.contains("{qop}") && (endpoint.contains("{user}") && (endpoint.contains("{passwd}") && (endpoint.contains("{algorithm}"))))) {
                processedEndpoint = processedEndpoint.replace("{qop}", qop);
                processedEndpoint = processedEndpoint.replace("{user}", user);
                processedEndpoint = processedEndpoint.replace("{passwd}", passwd);
                processedEndpoint = processedEndpoint.replace("{algorithm}", algorithm);
            }
            modifiedEndpoints.add(processedEndpoint);
        }
        System.out.println("\nModified Endpoints:");
        for (String endpoint : modifiedEndpoints) {
            System.out.println(endpoint);
        }
        System.out.println("\nStarting sending requests....");
        String baseUrl = "https://nghttp2.org/httpbin";
        Map<String, Integer> resultsOther = new HashMap<>();
        Map<String, Integer> results200 = new HashMap<>(); //Не вимагалося, зробив для наглядності
        for (String modEndpoints : modifiedEndpoints) {
            try {
                URL url = new URL(baseUrl + modEndpoints);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("User-Agent", "Learning Automation");
                connection.setInstanceFollowRedirects(false);
                int responseCode = connection.getResponseCode();
                System.out.println("URL: " + baseUrl + modEndpoints + ", Response Code: " + responseCode);

                if (responseCode != 200) {
                    resultsOther.put(baseUrl + modEndpoints, responseCode);
                } else {
                    results200.put(baseUrl + modEndpoints, responseCode);
                }
                connection.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
                resultsOther.put(baseUrl + modEndpoints, -1);
            }
        }
        System.out.println("\nResults with non-200 status codes:");
        resultsOther.forEach((key, value) -> System.out.println(key + ", " + value));
        System.out.println("\nResults with 200 status codes:"); //Не вимагалося, зробив для наглядності
        results200.forEach((key, value) -> System.out.println(key + ", " + value));
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
    public static void task2() throws IOException {
        Map<String, Object> requestBodyData = new HashMap<>();
        requestBodyData.put("delivery", "18:00");
        requestBodyData.put("custtel", "380982278971");
        requestBodyData.put("comments", "P I Z Z A");
        requestBodyData.put("size", "medium");
        requestBodyData.put("custemail", "DmytroIvanchenko@gmail.com");
        requestBodyData.put("topping", Arrays.asList("bacon", "cheese", "mushroom"));
        requestBodyData.put("custname", "Dmytro Ivanchenko");

        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("User-Agent", "Learning Automation");
        requestHeaders.put("Content-Type", "application/x-www-form-urlencoded");

        List<Map<String, ?>> result = sendPostRequestAndParseResponse(requestBodyData, requestHeaders);

        if (result != null && result.size() == 2) {
            @SuppressWarnings("unchecked")
            Map<String, String> formPart = (Map<String, String>) result.get(0);
            System.out.println("\n--- Дані 'form' з відповіді ---");
            formPart.forEach((key, value) -> System.out.println(key + ": " + value));

            @SuppressWarnings("unchecked")
            Map<String, String> headersPart = (Map<String, String>) result.get(1);
            System.out.println("\n--- Заголовки відповіді ---");
            headersPart.forEach((key, value) -> System.out.println(key + ": " + value));
        } else {
            System.out.println("Не вдалося отримати повну відповідь для POST-запиту.");
        }
    }

    public static List<Map<String, ?>> sendPostRequestAndParseResponse(Map<String, Object> requestBodyData, Map<String, String> requestHeaders) throws IOException {

        String requestUrl = "http://httpbin.org/post";

        Map<String, String> formFields = new HashMap<>();
        Map<String, String> processedResponseHeaders = new HashMap<>();
        List<Map<String, ?>> finalResult = new ArrayList<>();

        HttpURLConnection connection = null;
        try {
            URL url = new URL(requestUrl);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            StringBuilder postBodyBuilder = new StringBuilder();
            boolean firstParam = true;

            for (Map.Entry<String, Object> entry : requestBodyData.entrySet()) {
                if (!firstParam) {
                    postBodyBuilder.append("&");
                }

                String key = URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8);
                Object value = entry.getValue();

                if (value instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<String> valueList = (List<String>) value;
                    boolean firstValueInList = true;
                    for (String item : valueList) {
                        if (!firstValueInList) {
                            postBodyBuilder.append("&");
                        }
                        postBodyBuilder.append(key).append("=").append(URLEncoder.encode(item, StandardCharsets.UTF_8));
                        firstValueInList = false;
                    }
                } else {
                    postBodyBuilder.append(key).append("=").append(URLEncoder.encode(value.toString(), StandardCharsets.UTF_8));
                }
                firstParam = false;
            }

            byte[] postDataBytes = postBodyBuilder.toString().getBytes(StandardCharsets.UTF_8);
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));

            try (OutputStream os = connection.getOutputStream()) {
                os.write(postDataBytes);
                os.flush();
            }

            int responseCode = connection.getResponseCode();
            System.out.println("POST Request URL: " + requestUrl);
            System.out.println("Response Code: " + responseCode);

            BufferedReader bufferedReader = null;
            StringBuilder content = new StringBuilder();
            String inputLine;

            if (responseCode >= 200 && responseCode < 300) {
                bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            } else {
                if (connection.getErrorStream() != null) {
                    bufferedReader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8));
                } else {
                    System.err.println("Потік помилок відсутній для коду відповіді: " + responseCode);
                    bufferedReader = new BufferedReader(new InputStreamReader(new java.io.ByteArrayInputStream("{}".getBytes()), StandardCharsets.UTF_8));
                }
            }
            try (BufferedReader br = bufferedReader) {
                if (br != null) {
                    while ((inputLine = br.readLine()) != null) {
                        content.append(inputLine);
                    }
                }
            }
            System.out.println("Повна відповідь сервера:\n" + content);
            if (content.length() > 0 && content.charAt(0) == '{') {
                JSONObject jsonResponse = new JSONObject(content.toString());
                if (jsonResponse.has("form")) {
                    JSONObject formObject = jsonResponse.getJSONObject("form");
                    Iterator<String> keys = formObject.keys();

                    while (keys.hasNext()) {
                        String currentKey = keys.next();
                        Object rawValue = formObject.get(currentKey);

                        String processedValue;
                        if (rawValue instanceof org.json.JSONArray jsonArray) {
                            StringBuilder combinedValue = new StringBuilder();
                            for (int i = 0; i < jsonArray.length(); i++) {
                                if (i > 0) {
                                    combinedValue.append(", ");
                                }
                                combinedValue.append(jsonArray.getString(i));
                            }
                            processedValue = combinedValue.toString();
                        } else {
                            processedValue = rawValue.toString();
                        }
                        formFields.put(currentKey, processedValue);
                    }
                    System.out.println("Об'єкт 'form' з відповіді:\n" + formFields);
                } else {
                    System.out.println("JSON-відповідь не містить об'єкта 'form'.");
                }
            } else {
                System.out.println("Отриманий контент не є JSON або порожній.");
            }

            Map<String, List<String>> rawResponseHeaders = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : rawResponseHeaders.entrySet()) {
                String headerName = entry.getKey();
                List<String> headerValues = entry.getValue();

                if (headerName != null && !headerValues.isEmpty()) {
                    processedResponseHeaders.put(headerName, headerValues.get(0));
                }
            }
            System.out.println("\nЗаголовки відповіді:\n" + processedResponseHeaders);
            finalResult.add(formFields);
            finalResult.add(processedResponseHeaders);

            return finalResult;

        } catch (IOException e) {
            System.err.println("Виникла помилка вводу/виводу під час запиту: " + e.getMessage());
            throw e;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
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
    Return list of unique languages

    Task 3.2:
    Write a method that will find the number of people for whom the specified language is the official language.
    Algorithm:
    The method takes as a parameter a list of language codes
    For each language code get json from https://restcountries.com/v3/lang/[language code]
    In the received json, summarize the population values
    Depending on the programming language, return a HashMap or dictionary with pairs: language code, sum of population for language
    Additional requirements:
    Send requests with 'User-Agent': 'Learning Automation'*/

//        public static void task3 () throws IOException {
//            String basicUrl = "http://httpbin.org/forms/post";              //Не забути прибрати, щось не згодився ніде
//            String requestUrl = "http://httpbin.org/post";
//            String paramUrl = "comments=P+I+Z+Z+A&custemail=DmytroIvanchenko@gmail.com&custname=Dmytro+Ivanchenko" +
//                    "&custtel=380982278971&delivery=18:00&size=medium&topping=bacon&topping=cheese&topping=mushroom";
//            Map<String, String> formFields = new HashMap<>();
//            try {
//                URL url = new URL(requestUrl);
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("POST");
//                connection.setRequestProperty("User-Agent", "Learning Automation");
//                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//                connection.setDoOutput(true);
//                byte[] postDataBytes = paramUrl.getBytes("UTF-8");
//                connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
//                OutputStream outputStream = connection.getOutputStream();
//                outputStream.write(postDataBytes);
//                outputStream.flush();
//                outputStream.close();
//                int responseCode = connection.getResponseCode();
//                System.out.println("POST Request URL: " + requestUrl);
//                System.out.println("Response Code: " + responseCode);
//                BufferedReader bufferedReader;
//                StringBuilder content = new StringBuilder();
//                String inputLine;
//                if (responseCode >= 200 && responseCode < 300) {
//                    bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
//                    while ((inputLine = bufferedReader.readLine()) != null) {
//                        content.append(inputLine);
//                    }
//                    bufferedReader.close();
//                    System.out.println("Input Stream: " + content);
//                    JSONObject jsonResponse = new JSONObject(content.toString());
//                    if (jsonResponse.has("form")) {
//
//                        JSONObject formObject = jsonResponse.getJSONObject("form");
//                        Iterator<String> keys = formObject.keys();
//
//                        while (keys.hasNext()) {
//                            String currentKey = keys.next();
//                            Object rawValue = formObject.get(currentKey);
//                            String processedValue;
//                            if (rawValue instanceof org.json.JSONArray) {
//                                org.json.JSONArray jsonArray = (org.json.JSONArray) rawValue;
//                                StringBuilder combinedValue = new StringBuilder();
//                                for (int i = 0; i < jsonArray.length(); i++) {
//                                    if (i > 0) {
//                                        combinedValue.append(", ");
//                                    }
//                                    combinedValue.append(jsonArray.getString(i));
//                                }
//                                processedValue = combinedValue.toString();
//                            } else {
//                                processedValue = rawValue.toString();
//                            }
//                            formFields.put(currentKey, processedValue);
//                        }
//                        System.out.println("\"Form\" consist of: " + formFields);
//
//                    } else {
//                        System.out.println("JSON response from " + requestUrl + " does not contain 'paths' object.");
//                    }
//                    Map<String, List<String>> responseHeaders = connection.getHeaderFields();
//                    Map<String, String> processedResponseHeaders = new HashMap<>();
//                    for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
//                        String headerName = entry.getKey();
//                        List<String> headerValues = entry.getValue();
//                        processedResponseHeaders.put(headerName, headerValues.get(0));
//                    }
//                    System.out.println("\nResponse Headers:");
//                    processedResponseHeaders.forEach((key, value) -> System.out.println(key + ": " + value));
//                    bufferedReader.close();
//                } else {
//                    bufferedReader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "UTF-8"));
//                    while ((inputLine = bufferedReader.readLine()) != null) {
//                        content.append(inputLine);
//                    }
//                }
//                connection.disconnect();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }





