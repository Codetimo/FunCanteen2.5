package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class CanteenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CanteenExample() {
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

        public Criteria andCanteenidIsNull() {
            addCriterion("canteenid is null");
            return (Criteria) this;
        }

        public Criteria andCanteenidIsNotNull() {
            addCriterion("canteenid is not null");
            return (Criteria) this;
        }

        public Criteria andCanteenidEqualTo(Integer value) {
            addCriterion("canteenid =", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidNotEqualTo(Integer value) {
            addCriterion("canteenid <>", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidGreaterThan(Integer value) {
            addCriterion("canteenid >", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("canteenid >=", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidLessThan(Integer value) {
            addCriterion("canteenid <", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidLessThanOrEqualTo(Integer value) {
            addCriterion("canteenid <=", value, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidIn(List<Integer> values) {
            addCriterion("canteenid in", values, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidNotIn(List<Integer> values) {
            addCriterion("canteenid not in", values, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidBetween(Integer value1, Integer value2) {
            addCriterion("canteenid between", value1, value2, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteenidNotBetween(Integer value1, Integer value2) {
            addCriterion("canteenid not between", value1, value2, "canteenid");
            return (Criteria) this;
        }

        public Criteria andCanteennameIsNull() {
            addCriterion("canteenname is null");
            return (Criteria) this;
        }

        public Criteria andCanteennameIsNotNull() {
            addCriterion("canteenname is not null");
            return (Criteria) this;
        }

        public Criteria andCanteennameEqualTo(String value) {
            addCriterion("canteenname =", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameNotEqualTo(String value) {
            addCriterion("canteenname <>", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameGreaterThan(String value) {
            addCriterion("canteenname >", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameGreaterThanOrEqualTo(String value) {
            addCriterion("canteenname >=", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameLessThan(String value) {
            addCriterion("canteenname <", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameLessThanOrEqualTo(String value) {
            addCriterion("canteenname <=", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameLike(String value) {
            addCriterion("canteenname like", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameNotLike(String value) {
            addCriterion("canteenname not like", value, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameIn(List<String> values) {
            addCriterion("canteenname in", values, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameNotIn(List<String> values) {
            addCriterion("canteenname not in", values, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameBetween(String value1, String value2) {
            addCriterion("canteenname between", value1, value2, "canteenname");
            return (Criteria) this;
        }

        public Criteria andCanteennameNotBetween(String value1, String value2) {
            addCriterion("canteenname not between", value1, value2, "canteenname");
            return (Criteria) this;
        }

        public Criteria andAdidIsNull() {
            addCriterion("adid is null");
            return (Criteria) this;
        }

        public Criteria andAdidIsNotNull() {
            addCriterion("adid is not null");
            return (Criteria) this;
        }

        public Criteria andAdidEqualTo(Integer value) {
            addCriterion("adid =", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotEqualTo(Integer value) {
            addCriterion("adid <>", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThan(Integer value) {
            addCriterion("adid >", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adid >=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThan(Integer value) {
            addCriterion("adid <", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThanOrEqualTo(Integer value) {
            addCriterion("adid <=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidIn(List<Integer> values) {
            addCriterion("adid in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotIn(List<Integer> values) {
            addCriterion("adid not in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidBetween(Integer value1, Integer value2) {
            addCriterion("adid between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotBetween(Integer value1, Integer value2) {
            addCriterion("adid not between", value1, value2, "adid");
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