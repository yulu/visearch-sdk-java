package com.visenze.visearch;

import java.util.List;
import java.util.Map;

public class PagedSearchResult<T extends ImageResult> extends PagedResult<T> {

    private List<Facet> facets;

    private Map<String, String> queryInfo;

    private String rawJson;

    public PagedSearchResult(Integer page, Integer limit, Integer total, List<T> result) {
        super(page, limit, total, result);
    }

    public PagedSearchResult(PagedResult pagedResult) {
        super(pagedResult.getPage(), pagedResult.getLimit(), pagedResult.getTotal(), pagedResult.getResult());
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setQueryInfo(Map<String, String> queryInfo) {
        this.queryInfo = queryInfo;
    }

    public Map<String, String> getQueryInfo() {
        return queryInfo;
    }

    public void setRawJson(String rawJson) {
        this.rawJson = rawJson;
    }

    public String getRawJson() {
        return rawJson;
    }
}