package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class DishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishExample() {
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

        public Criteria andDishidIsNull() {
            addCriterion("dishid is null");
            return (Criteria) this;
        }

        public Criteria andDishidIsNotNull() {
            addCriterion("dishid is not null");
            return (Criteria) this;
        }

        public Criteria andDishidEqualTo(Integer value) {
            addCriterion("dishid =", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotEqualTo(Integer value) {
            addCriterion("dishid <>", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThan(Integer value) {
            addCriterion("dishid >", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishid >=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThan(Integer value) {
            addCriterion("dishid <", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThanOrEqualTo(Integer value) {
            addCriterion("dishid <=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidIn(List<Integer> values) {
            addCriterion("dishid in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotIn(List<Integer> values) {
            addCriterion("dishid not in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidBetween(Integer value1, Integer value2) {
            addCriterion("dishid between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotBetween(Integer value1, Integer value2) {
            addCriterion("dishid not between", value1, value2, "dishid");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andWinidIsNull() {
            addCriterion("winid is null");
            return (Criteria) this;
        }

        public Criteria andWinidIsNotNull() {
            addCriterion("winid is not null");
            return (Criteria) this;
        }

        public Criteria andWinidEqualTo(Integer value) {
            addCriterion("winid =", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidNotEqualTo(Integer value) {
            addCriterion("winid <>", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidGreaterThan(Integer value) {
            addCriterion("winid >", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("winid >=", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidLessThan(Integer value) {
            addCriterion("winid <", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidLessThanOrEqualTo(Integer value) {
            addCriterion("winid <=", value, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidIn(List<Integer> values) {
            addCriterion("winid in", values, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidNotIn(List<Integer> values) {
            addCriterion("winid not in", values, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidBetween(Integer value1, Integer value2) {
            addCriterion("winid between", value1, value2, "winid");
            return (Criteria) this;
        }

        public Criteria andWinidNotBetween(Integer value1, Integer value2) {
            addCriterion("winid not between", value1, value2, "winid");
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