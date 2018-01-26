package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andDishesidIsNull() {
            addCriterion("dishesid is null");
            return (Criteria) this;
        }

        public Criteria andDishesidIsNotNull() {
            addCriterion("dishesid is not null");
            return (Criteria) this;
        }

        public Criteria andDishesidEqualTo(Integer value) {
            addCriterion("dishesid =", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidNotEqualTo(Integer value) {
            addCriterion("dishesid <>", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidGreaterThan(Integer value) {
            addCriterion("dishesid >", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishesid >=", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidLessThan(Integer value) {
            addCriterion("dishesid <", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidLessThanOrEqualTo(Integer value) {
            addCriterion("dishesid <=", value, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidIn(List<Integer> values) {
            addCriterion("dishesid in", values, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidNotIn(List<Integer> values) {
            addCriterion("dishesid not in", values, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidBetween(Integer value1, Integer value2) {
            addCriterion("dishesid between", value1, value2, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishesidNotBetween(Integer value1, Integer value2) {
            addCriterion("dishesid not between", value1, value2, "dishesid");
            return (Criteria) this;
        }

        public Criteria andDishnameIsNull() {
            addCriterion("dishname is null");
            return (Criteria) this;
        }

        public Criteria andDishnameIsNotNull() {
            addCriterion("dishname is not null");
            return (Criteria) this;
        }

        public Criteria andDishnameEqualTo(String value) {
            addCriterion("dishname =", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotEqualTo(String value) {
            addCriterion("dishname <>", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThan(String value) {
            addCriterion("dishname >", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThanOrEqualTo(String value) {
            addCriterion("dishname >=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThan(String value) {
            addCriterion("dishname <", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThanOrEqualTo(String value) {
            addCriterion("dishname <=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLike(String value) {
            addCriterion("dishname like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotLike(String value) {
            addCriterion("dishname not like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameIn(List<String> values) {
            addCriterion("dishname in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotIn(List<String> values) {
            addCriterion("dishname not in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameBetween(String value1, String value2) {
            addCriterion("dishname between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotBetween(String value1, String value2) {
            addCriterion("dishname not between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andAddressesIsNull() {
            addCriterion("addresses is null");
            return (Criteria) this;
        }

        public Criteria andAddressesIsNotNull() {
            addCriterion("addresses is not null");
            return (Criteria) this;
        }

        public Criteria andAddressesEqualTo(String value) {
            addCriterion("addresses =", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesNotEqualTo(String value) {
            addCriterion("addresses <>", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesGreaterThan(String value) {
            addCriterion("addresses >", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesGreaterThanOrEqualTo(String value) {
            addCriterion("addresses >=", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesLessThan(String value) {
            addCriterion("addresses <", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesLessThanOrEqualTo(String value) {
            addCriterion("addresses <=", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesLike(String value) {
            addCriterion("addresses like", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesNotLike(String value) {
            addCriterion("addresses not like", value, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesIn(List<String> values) {
            addCriterion("addresses in", values, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesNotIn(List<String> values) {
            addCriterion("addresses not in", values, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesBetween(String value1, String value2) {
            addCriterion("addresses between", value1, value2, "addresses");
            return (Criteria) this;
        }

        public Criteria andAddressesNotBetween(String value1, String value2) {
            addCriterion("addresses not between", value1, value2, "addresses");
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