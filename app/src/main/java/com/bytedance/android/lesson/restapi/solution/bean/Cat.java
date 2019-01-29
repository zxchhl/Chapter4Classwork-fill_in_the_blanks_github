package com.bytedance.android.lesson.restapi.solution.bean;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    private List<String> breeds;

    private String id;

    private String url;

    public void setBreeds(List<String> breeds) {

        this.breeds = breeds;

    }

    public List<String> getBreeds() {

        return breeds;

    }



    public void setId(String id) {

        this.id = id;

    }

    public String getId() {

        return id;

    }



    public void setUrl(String url) {

        this.url = url;

    }

    public String getUrl() {

        return url;

    }


    // TODO-C1 (1) Implement your Cat Bean here according to the response json
}
