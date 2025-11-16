package com.nskhoa.designpattern.creational.builder.example15;

import java.util.ArrayList;
import java.util.List;

public class QueryCriteria {
    private final String entity;   // Bắt buộc, e.g., "User"
    private List<String> conditions = new ArrayList<>();  // Tùy chọn
    private String sortBy;         // Tùy chọn
    private boolean ascending = true;  // Tùy chọn

    private QueryCriteria(Builder builder) {
        this.entity = builder.entity;
        this.conditions = builder.conditions;
        this.sortBy = builder.sortBy;
        this.ascending = builder.ascending;
    }

    public static class Builder {
        private final String entity;
        private List<String> conditions = new ArrayList<>();
        private String sortBy;
        private boolean ascending = true;

        public Builder(String entity) {
            this.entity = entity;
        }

        public Builder condition(String cond) {
            conditions.add(cond);
            return this;
        }

        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public Builder ascending(boolean ascending) {
            this.ascending = ascending;
            return this;
        }

        public QueryCriteria build() {
            return new QueryCriteria(this);
        }
    }

    // Getters...
    public String getEntity() {
        return entity;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public String getSortBy() {
        return sortBy;
    }

    public boolean isAscending() {
        return ascending;
    }

    public static void main(String[] args) {

// Sử dụng trong Spring Boot repository service:
        QueryCriteria query = new QueryCriteria.Builder("User")
                .condition("age > 18")
                .condition("status = 'active'")
                .sortBy("name")
                .ascending(true)
                .build();

        System.out.println("Entity: " + query.getEntity());
        System.out.println("Conditions: " + query.getConditions());
        System.out.println("Sort By: " + query.getSortBy());
        System.out.println("Ascending: " + query.isAscending());
    }
}

