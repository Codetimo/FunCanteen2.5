package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class WindowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WindowExample() {
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

        public Criteria andWindowidIsNull() {
            addCriterion("windowid is null");
            return (Criteria) this;
        }

        public Criteria andWindowidIsNotNull() {
            addCriterion("windowid is not null");
            return (Criteria) this;
        }

        public Criteria andWindowidEqualTo(Integer value) {
            addCriterion("windowid =", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidNotEqualTo(Integer value) {
            addCriterion("windowid <>", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidGreaterThan(Integer value) {
            addCriterion("windowid >", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("windowid >=", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidLessThan(Integer value) {
            addCriterion("windowid <", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidLessThanOrEqualTo(Integer value) {
            addCriterion("windowid <=", value, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidIn(List<Integer> values) {
            addCriterion("windowid in", values, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidNotIn(List<Integer> values) {
            addCriterion("windowid not in", values, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidBetween(Integer value1, Integer value2) {
            addCriterion("windowid between", value1, value2, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindowidNotBetween(Integer value1, Integer value2) {
            addCriterion("windowid not between", value1, value2, "windowid");
            return (Criteria) this;
        }

        public Criteria andWindownameIsNull() {
            addCriterion("windowname is null");
            return (Criteria) this;
        }

        public Criteria andWindownameIsNotNull() {
            addCriterion("windowname is not null");
            return (Criteria) this;
        }

        public Criteria andWindownameEqualTo(String value) {
            addCriterion("windowname =", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameNotEqualTo(String value) {
            addCriterion("windowname <>", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameGreaterThan(String value) {
            addCriterion("windowname >", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameGreaterThanOrEqualTo(String value) {
            addCriterion("windowname >=", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameLessThan(String value) {
            addCriterion("windowname <", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameLessThanOrEqualTo(String value) {
            addCriterion("windowname <=", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameLike(String value) {
            addCriterion("windowname like", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameNotLike(String value) {
            addCriterion("windowname not like", value, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameIn(List<String> values) {
            addCriterion("windowname in", values, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameNotIn(List<String> values) {
            addCriterion("windowname not in", values, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameBetween(String value1, String value2) {
            addCriterion("windowname between", value1, value2, "windowname");
            return (Criteria) this;
        }

        public Criteria andWindownameNotBetween(String value1, String value2) {
            addCriterion("windowname not between", value1, value2, "windowname");
            return (Criteria) this;
        }

        public Criteria andCanidIsNull() {
            addCriterion("canid is null");
            return (Criteria) this;
        }

        public Criteria andCanidIsNotNull() {
            addCriterion("canid is not null");
            return (Criteria) this;
        }

        public Criteria andCanidEqualTo(Integer value) {
            addCriterion("canid =", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidNotEqualTo(Integer value) {
            addCriterion("canid <>", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidGreaterThan(Integer value) {
            addCriterion("canid >", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("canid >=", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidLessThan(Integer value) {
            addCriterion("canid <", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidLessThanOrEqualTo(Integer value) {
            addCriterion("canid <=", value, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidIn(List<Integer> values) {
            addCriterion("canid in", values, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidNotIn(List<Integer> values) {
            addCriterion("canid not in", values, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidBetween(Integer value1, Integer value2) {
            addCriterion("canid between", value1, value2, "canid");
            return (Criteria) this;
        }

        public Criteria andCanidNotBetween(Integer value1, Integer value2) {
            addCriterion("canid not between", value1, value2, "canid");
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