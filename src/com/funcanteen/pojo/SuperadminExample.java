package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class SuperadminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperadminExample() {
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

        public Criteria andSupadminidIsNull() {
            addCriterion("supadminid is null");
            return (Criteria) this;
        }

        public Criteria andSupadminidIsNotNull() {
            addCriterion("supadminid is not null");
            return (Criteria) this;
        }

        public Criteria andSupadminidEqualTo(Integer value) {
            addCriterion("supadminid =", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidNotEqualTo(Integer value) {
            addCriterion("supadminid <>", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidGreaterThan(Integer value) {
            addCriterion("supadminid >", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supadminid >=", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidLessThan(Integer value) {
            addCriterion("supadminid <", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidLessThanOrEqualTo(Integer value) {
            addCriterion("supadminid <=", value, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidIn(List<Integer> values) {
            addCriterion("supadminid in", values, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidNotIn(List<Integer> values) {
            addCriterion("supadminid not in", values, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidBetween(Integer value1, Integer value2) {
            addCriterion("supadminid between", value1, value2, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminidNotBetween(Integer value1, Integer value2) {
            addCriterion("supadminid not between", value1, value2, "supadminid");
            return (Criteria) this;
        }

        public Criteria andSupadminnameIsNull() {
            addCriterion("supadminname is null");
            return (Criteria) this;
        }

        public Criteria andSupadminnameIsNotNull() {
            addCriterion("supadminname is not null");
            return (Criteria) this;
        }

        public Criteria andSupadminnameEqualTo(String value) {
            addCriterion("supadminname =", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameNotEqualTo(String value) {
            addCriterion("supadminname <>", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameGreaterThan(String value) {
            addCriterion("supadminname >", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameGreaterThanOrEqualTo(String value) {
            addCriterion("supadminname >=", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameLessThan(String value) {
            addCriterion("supadminname <", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameLessThanOrEqualTo(String value) {
            addCriterion("supadminname <=", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameLike(String value) {
            addCriterion("supadminname like", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameNotLike(String value) {
            addCriterion("supadminname not like", value, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameIn(List<String> values) {
            addCriterion("supadminname in", values, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameNotIn(List<String> values) {
            addCriterion("supadminname not in", values, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameBetween(String value1, String value2) {
            addCriterion("supadminname between", value1, value2, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminnameNotBetween(String value1, String value2) {
            addCriterion("supadminname not between", value1, value2, "supadminname");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdIsNull() {
            addCriterion("supadminpwd is null");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdIsNotNull() {
            addCriterion("supadminpwd is not null");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdEqualTo(String value) {
            addCriterion("supadminpwd =", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdNotEqualTo(String value) {
            addCriterion("supadminpwd <>", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdGreaterThan(String value) {
            addCriterion("supadminpwd >", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdGreaterThanOrEqualTo(String value) {
            addCriterion("supadminpwd >=", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdLessThan(String value) {
            addCriterion("supadminpwd <", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdLessThanOrEqualTo(String value) {
            addCriterion("supadminpwd <=", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdLike(String value) {
            addCriterion("supadminpwd like", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdNotLike(String value) {
            addCriterion("supadminpwd not like", value, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdIn(List<String> values) {
            addCriterion("supadminpwd in", values, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdNotIn(List<String> values) {
            addCriterion("supadminpwd not in", values, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdBetween(String value1, String value2) {
            addCriterion("supadminpwd between", value1, value2, "supadminpwd");
            return (Criteria) this;
        }

        public Criteria andSupadminpwdNotBetween(String value1, String value2) {
            addCriterion("supadminpwd not between", value1, value2, "supadminpwd");
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