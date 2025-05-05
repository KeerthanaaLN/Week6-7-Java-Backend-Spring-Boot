package org.example;

import com.sun.net.httpserver.*;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.*;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new RootHandler());
        server.createContext("/headers", new HeaderHandler());
        server.createContext("/query", new QueryHandler());
        server.createContext("/body", new BodyHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server started at http://localhost:8000/");
    }

    static class RootHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Welcome to Java Web Server!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class HeaderHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            Headers headers = exchange.getRequestHeaders();
            StringBuilder response = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                response.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.toString().getBytes());
            os.close();
        }
    }

    static class QueryHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            String response = "Query Parameters: " + query;
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class BodyHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            InputStream is = exchange.getRequestBody();
            String body = new String(is.readAllBytes());
            String response = "Body Received: " + body;
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}

