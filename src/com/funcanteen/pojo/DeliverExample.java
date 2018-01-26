package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeliverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverExample() {
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

        public Criteria andDeliveridIsNull() {
            addCriterion("deliverid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveridIsNotNull() {
            addCriterion("deliverid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveridEqualTo(Integer value) {
            addCriterion("deliverid =", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridNotEqualTo(Integer value) {
            addCriterion("deliverid <>", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridGreaterThan(Integer value) {
            addCriterion("deliverid >", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverid >=", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridLessThan(Integer value) {
            addCriterion("deliverid <", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridLessThanOrEqualTo(Integer value) {
            addCriterion("deliverid <=", value, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridIn(List<Integer> values) {
            addCriterion("deliverid in", values, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridNotIn(List<Integer> values) {
            addCriterion("deliverid not in", values, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridBetween(Integer value1, Integer value2) {
            addCriterion("deliverid between", value1, value2, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDeliveridNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverid not between", value1, value2, "deliverid");
            return (Criteria) this;
        }

        public Criteria andDelivernameIsNull() {
            addCriterion("delivername is null");
            return (Criteria) this;
        }

        public Criteria andDelivernameIsNotNull() {
            addCriterion("delivername is not null");
            return (Criteria) this;
        }

        public Criteria andDelivernameEqualTo(String value) {
            addCriterion("delivername =", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotEqualTo(String value) {
            addCriterion("delivername <>", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameGreaterThan(String value) {
            addCriterion("delivername >", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameGreaterThanOrEqualTo(String value) {
            addCriterion("delivername >=", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLessThan(String value) {
            addCriterion("delivername <", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLessThanOrEqualTo(String value) {
            addCriterion("delivername <=", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameLike(String value) {
            addCriterion("delivername like", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotLike(String value) {
            addCriterion("delivername not like", value, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameIn(List<String> values) {
            addCriterion("delivername in", values, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotIn(List<String> values) {
            addCriterion("delivername not in", values, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameBetween(String value1, String value2) {
            addCriterion("delivername between", value1, value2, "delivername");
            return (Criteria) this;
        }

        public Criteria andDelivernameNotBetween(String value1, String value2) {
            addCriterion("delivername not between", value1, value2, "delivername");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIsNull() {
            addCriterion("deliverphone is null");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIsNotNull() {
            addCriterion("deliverphone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneEqualTo(String value) {
            addCriterion("deliverphone =", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotEqualTo(String value) {
            addCriterion("deliverphone <>", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneGreaterThan(String value) {
            addCriterion("deliverphone >", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("deliverphone >=", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLessThan(String value) {
            addCriterion("deliverphone <", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLessThanOrEqualTo(String value) {
            addCriterion("deliverphone <=", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneLike(String value) {
            addCriterion("deliverphone like", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotLike(String value) {
            addCriterion("deliverphone not like", value, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneIn(List<String> values) {
            addCriterion("deliverphone in", values, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotIn(List<String> values) {
            addCriterion("deliverphone not in", values, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneBetween(String value1, String value2) {
            addCriterion("deliverphone between", value1, value2, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andDeliverphoneNotBetween(String value1, String value2) {
            addCriterion("deliverphone not between", value1, value2, "deliverphone");
            return (Criteria) this;
        }

        public Criteria andWindidIsNull() {
            addCriterion("windid is null");
            return (Criteria) this;
        }

        public Criteria andWindidIsNotNull() {
            addCriterion("windid is not null");
            return (Criteria) this;
        }

        public Criteria andWindidEqualTo(Integer value) {
            addCriterion("windid =", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidNotEqualTo(Integer value) {
            addCriterion("windid <>", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidGreaterThan(Integer value) {
            addCriterion("windid >", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("windid >=", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidLessThan(Integer value) {
            addCriterion("windid <", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidLessThanOrEqualTo(Integer value) {
            addCriterion("windid <=", value, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidIn(List<Integer> values) {
            addCriterion("windid in", values, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidNotIn(List<Integer> values) {
            addCriterion("windid not in", values, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidBetween(Integer value1, Integer value2) {
            addCriterion("windid between", value1, value2, "windid");
            return (Criteria) this;
        }

        public Criteria andWindidNotBetween(Integer value1, Integer value2) {
            addCriterion("windid not between", value1, value2, "windid");
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