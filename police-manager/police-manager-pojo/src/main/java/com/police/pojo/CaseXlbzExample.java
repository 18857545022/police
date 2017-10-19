package com.police.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseXlbzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseXlbzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAjbhIsNull() {
            addCriterion("ajbh is null");
            return (Criteria) this;
        }

        public Criteria andAjbhIsNotNull() {
            addCriterion("ajbh is not null");
            return (Criteria) this;
        }

        public Criteria andAjbhEqualTo(String value) {
            addCriterion("ajbh =", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotEqualTo(String value) {
            addCriterion("ajbh <>", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhGreaterThan(String value) {
            addCriterion("ajbh >", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhGreaterThanOrEqualTo(String value) {
            addCriterion("ajbh >=", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLessThan(String value) {
            addCriterion("ajbh <", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLessThanOrEqualTo(String value) {
            addCriterion("ajbh <=", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhLike(String value) {
            addCriterion("ajbh like", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotLike(String value) {
            addCriterion("ajbh not like", value, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhIn(List<String> values) {
            addCriterion("ajbh in", values, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotIn(List<String> values) {
            addCriterion("ajbh not in", values, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhBetween(String value1, String value2) {
            addCriterion("ajbh between", value1, value2, "ajbh");
            return (Criteria) this;
        }

        public Criteria andAjbhNotBetween(String value1, String value2) {
            addCriterion("ajbh not between", value1, value2, "ajbh");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNull() {
            addCriterion("bjsj is null");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNotNull() {
            addCriterion("bjsj is not null");
            return (Criteria) this;
        }

        public Criteria andBjsjEqualTo(Date value) {
            addCriterion("bjsj =", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotEqualTo(Date value) {
            addCriterion("bjsj <>", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThan(Date value) {
            addCriterion("bjsj >", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("bjsj >=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThan(Date value) {
            addCriterion("bjsj <", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThanOrEqualTo(Date value) {
            addCriterion("bjsj <=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjIn(List<Date> values) {
            addCriterion("bjsj in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotIn(List<Date> values) {
            addCriterion("bjsj not in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjBetween(Date value1, Date value2) {
            addCriterion("bjsj between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotBetween(Date value1, Date value2) {
            addCriterion("bjsj not between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andAfddIsNull() {
            addCriterion("afdd is null");
            return (Criteria) this;
        }

        public Criteria andAfddIsNotNull() {
            addCriterion("afdd is not null");
            return (Criteria) this;
        }

        public Criteria andAfddEqualTo(String value) {
            addCriterion("afdd =", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotEqualTo(String value) {
            addCriterion("afdd <>", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddGreaterThan(String value) {
            addCriterion("afdd >", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddGreaterThanOrEqualTo(String value) {
            addCriterion("afdd >=", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLessThan(String value) {
            addCriterion("afdd <", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLessThanOrEqualTo(String value) {
            addCriterion("afdd <=", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLike(String value) {
            addCriterion("afdd like", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotLike(String value) {
            addCriterion("afdd not like", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddIn(List<String> values) {
            addCriterion("afdd in", values, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotIn(List<String> values) {
            addCriterion("afdd not in", values, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddBetween(String value1, String value2) {
            addCriterion("afdd between", value1, value2, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotBetween(String value1, String value2) {
            addCriterion("afdd not between", value1, value2, "afdd");
            return (Criteria) this;
        }

        public Criteria andAjlbIsNull() {
            addCriterion("ajlb is null");
            return (Criteria) this;
        }

        public Criteria andAjlbIsNotNull() {
            addCriterion("ajlb is not null");
            return (Criteria) this;
        }

        public Criteria andAjlbEqualTo(String value) {
            addCriterion("ajlb =", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotEqualTo(String value) {
            addCriterion("ajlb <>", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbGreaterThan(String value) {
            addCriterion("ajlb >", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbGreaterThanOrEqualTo(String value) {
            addCriterion("ajlb >=", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLessThan(String value) {
            addCriterion("ajlb <", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLessThanOrEqualTo(String value) {
            addCriterion("ajlb <=", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbLike(String value) {
            addCriterion("ajlb like", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotLike(String value) {
            addCriterion("ajlb not like", value, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbIn(List<String> values) {
            addCriterion("ajlb in", values, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotIn(List<String> values) {
            addCriterion("ajlb not in", values, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbBetween(String value1, String value2) {
            addCriterion("ajlb between", value1, value2, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjlbNotBetween(String value1, String value2) {
            addCriterion("ajlb not between", value1, value2, "ajlb");
            return (Criteria) this;
        }

        public Criteria andAjxlIsNull() {
            addCriterion("ajxl is null");
            return (Criteria) this;
        }

        public Criteria andAjxlIsNotNull() {
            addCriterion("ajxl is not null");
            return (Criteria) this;
        }

        public Criteria andAjxlEqualTo(String value) {
            addCriterion("ajxl =", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlNotEqualTo(String value) {
            addCriterion("ajxl <>", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlGreaterThan(String value) {
            addCriterion("ajxl >", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlGreaterThanOrEqualTo(String value) {
            addCriterion("ajxl >=", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlLessThan(String value) {
            addCriterion("ajxl <", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlLessThanOrEqualTo(String value) {
            addCriterion("ajxl <=", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlLike(String value) {
            addCriterion("ajxl like", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlNotLike(String value) {
            addCriterion("ajxl not like", value, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlIn(List<String> values) {
            addCriterion("ajxl in", values, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlNotIn(List<String> values) {
            addCriterion("ajxl not in", values, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlBetween(String value1, String value2) {
            addCriterion("ajxl between", value1, value2, "ajxl");
            return (Criteria) this;
        }

        public Criteria andAjxlNotBetween(String value1, String value2) {
            addCriterion("ajxl not between", value1, value2, "ajxl");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}