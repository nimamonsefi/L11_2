package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("model", "S500");
        jsonObject1.put("year", "2014");
        jsonObject1.put("class", "Sedan");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("model", "E200");
        jsonObject2.put("year", "2017");
        jsonObject2.put("class", "Sedan");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("model", "AMG G63");
        jsonObject3.put("year", "2020");
        jsonObject3.put("class", "SUV");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("model", "C250");
        jsonObject4.put("year", "2013");
        jsonObject4.put("class", "Sedan");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);

        JSONArray jsonArray1 = null;
        try {
            jsonArray1 = (JSONArray) new JSONParser().parse("[{\"model\":\"S500\",\"year\":\"2014\",\"class\":\"Sedan\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray2 = null;
        try {
            jsonArray2 = (JSONArray) new JSONParser().parse("[{\"model\":\"E200\",\"year\":\"2017\",\"class\":\"Sedan\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray3 = null;
        try {
            jsonArray3 = (JSONArray) new JSONParser().parse("[{\"model\":\"AMG G63\",\"year\":\"2020\",\"class\":\"SUV\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray4 = null;
        try {
            jsonArray4 = (JSONArray) new JSONParser().parse("[{\"model\":\"C250\",\"year\":\"2013\",\"class\":\"Sedan\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("**------Array-----**");
        for (Object object : jsonArray1) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Model -> " + jsonObject.get("model"));
            System.out.println("Year -> " + jsonObject.get("year"));
            System.out.println("Class -> " + jsonObject.get("class"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray2) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Model -> " + jsonObject.get("model"));
            System.out.println("Year -> " + jsonObject.get("year"));
            System.out.println("Class -> " + jsonObject.get("class"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray3) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Model -> " + jsonObject.get("model"));
            System.out.println("Year -> " + jsonObject.get("year"));
            System.out.println("Class -> " + jsonObject.get("class"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray4) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Model -> " + jsonObject.get("model"));
            System.out.println("Year -> " + jsonObject.get("year"));
            System.out.println("Class -> " + jsonObject.get("class"));
        }
    }
}
