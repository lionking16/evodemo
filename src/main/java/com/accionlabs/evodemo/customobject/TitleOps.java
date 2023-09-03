// Copyright (c) 2023 Boomi, Inc.
package com.accionlabs.evodemo.customobject;

import java.util.LinkedList;
import java.util.List;

public class TitleOps {
    private List<Title> titleList;
    public TitleOps() {
        this.titleList = new LinkedList<>();
    }

    public TitleOps(List<Title> titleList) {
        this.titleList = titleList;
    }

    public void add(Title title) {
        this.titleList.add(title);
    }

    public int countTitles(List<Title> titles) {
        return this.titleList.size();
    }
}
