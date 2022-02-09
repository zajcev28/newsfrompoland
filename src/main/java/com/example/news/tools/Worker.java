package com.example.news.tools;


import com.example.news.news.NewsModel;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Worker {
    public List<NewsModel> getAllNews() {
        List<NewsModel> allNews = new ArrayList<>();
        String url = "https://newsapi.org/v2/top-headlines?country=pl&apiKey=8ff17d6a9745441ca9066e288df6d820";
        try {
            JSONObject jsonText = readJsonFromUrl(url);
            JSONArray articles = jsonText.getJSONArray("articles");

            for (int i = 0; i <articles.length(); i++) {
                NewsModel newsModel = new NewsModel();
                newsModel.setContent(articles.getJSONObject(i).get("description").toString());
                newsModel.setTitle(articles.getJSONObject(i).get("title").toString());
                newsModel.setUrlToImage(articles.getJSONObject(i).get("urlToImage").toString());
                newsModel.setAuthor(articles.getJSONObject(i).get("author").toString());
                newsModel.setUrl(articles.getJSONObject(i).get("url").toString());
                newsModel.setPublishedAt(articles.getJSONObject(i).get("publishedAt").toString());
                allNews.add(newsModel);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }




        return allNews;
    }
    public static JSONObject readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
               JSONObject json = new JSONObject(jsonText);
            System.out.println();
            return json;
        } finally {
            is.close();
        }
    }
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

}
