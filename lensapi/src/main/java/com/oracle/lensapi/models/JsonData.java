package com.oracle.lensapi.models;

import java.util.List;

/**
 * Created by seacosta on 28/04/2016.
 */
public class JsonData {

    private String name;
    private String subtitle;
    private List<String> headers;
    private List<List<String>> content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<String>> getContent() {
        return content;
    }

    public void setContent(List<List<String>> content) {
        this.content = content;
    }
}
