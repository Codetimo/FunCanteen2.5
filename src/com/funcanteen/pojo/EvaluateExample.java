package com.funcanteen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateidIsNull() {
            addCriterion("evaluateid is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIsNotNull() {
            addCriterion("evaluateid is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidEqualTo(Integer value) {
            addCriterion("evaluateid =", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotEqualTo(Integer value) {
            addCriterion("evaluateid <>", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThan(Integer value) {
            addCriterion("evaluateid >", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluateid >=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThan(Integer value) {
            addCriterion("evaluateid <", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThanOrEqualTo(Integer value) {
            addCriterion("evaluateid <=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIn(List<Integer> values) {
            addCriterion("evaluateid in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotIn(List<Integer> values) {
            addCriterion("evaluateid not in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidBetween(Integer value1, Integer value2) {
            addCriterion("evaluateid between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluateid not between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNull() {
            addCriterion("evaluatecontent is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIsNotNull() {
            addCriterion("evaluatecontent is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentEqualTo(String value) {
            addCriterion("evaluatecontent =", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotEqualTo(String value) {
            addCriterion("evaluatecontent <>", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThan(String value) {
            addCriterion("evaluatecontent >", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluatecontent >=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThan(String value) {
            addCriterion("evaluatecontent <", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLessThanOrEqualTo(String value) {
            addCriterion("evaluatecontent <=", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentLike(String value) {
            addCriterion("evaluatecontent like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotLike(String value) {
            addCriterion("evaluatecontent not like", value, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentIn(List<String> values) {
            addCriterion("evaluatecontent in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotIn(List<String> values) {
            addCriterion("evaluatecontent not in", values, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentBetween(String value1, String value2) {
            addCriterion("evaluatecontent between", value1, value2, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatecontentNotBetween(String value1, String value2) {
            addCriterion("evaluatecontent not between", value1, value2, "evaluatecontent");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIsNull() {
            addCriterion("evaluatetime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIsNotNull() {
            addCriterion("evaluatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeEqualTo(Date value) {
            addCriterion("evaluatetime =", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotEqualTo(Date value) {
            addCriterion("evaluatetime <>", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeGreaterThan(Date value) {
            addCriterion("evaluatetime >", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluatetime >=", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeLessThan(Date value) {
            addCriterion("evaluatetime <", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluatetime <=", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIn(List<Date> values) {
            addCriterion("evaluatetime in", values, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotIn(List<Date> values) {
            addCriterion("evaluatetime not in", values, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeBetween(Date value1, Date value2) {
            addCriterion("evaluatetime between", value1, value2, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluatetime not between", value1, value2, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWindowesidIsNull() {
            addCriterion("windowesid is null");
            return (Criteria) this;
        }

        public Criteria andWindowesidIsNotNull() {
            addCriterion("windowesid is not null");
            return (Criteria) this;
        }

        public Criteria andWindowesidEqualTo(Integer value) {
            addCriterion("windowesid =", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidNotEqualTo(Integer value) {
            addCriterion("windowesid <>", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidGreaterThan(Integer value) {
            addCriterion("windowesid >", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("windowesid >=", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidLessThan(Integer value) {
            addCriterion("windowesid <", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidLessThanOrEqualTo(Integer value) {
            addCriterion("windowesid <=", value, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidIn(List<Integer> values) {
            addCriterion("windowesid in", values, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidNotIn(List<Integer> values) {
            addCriterion("windowesid not in", values, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidBetween(Integer value1, Integer value2) {
            addCriterion("windowesid between", value1, value2, "windowesid");
            return (Criteria) this;
        }

        public Criteria andWindowesidNotBetween(Integer value1, Integer value2) {
            addCriterion("windowesid not between", value1, value2, "windowesid");
            return (Criteria) this;
        }

        public Criteria andOrdeidIsNull() {
            addCriterion("ordeid is null");
            return (Criteria) this;
        }

        public Criteria andOrdeidIsNotNull() {
            addCriterion("ordeid is not null");
            return (Criteria) this;
        }

        public Criteria andOrdeidEqualTo(Integer value) {
            addCriterion("ordeid =", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidNotEqualTo(Integer value) {
            addCriterion("ordeid <>", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidGreaterThan(Integer value) {
            addCriterion("ordeid >", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordeid >=", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidLessThan(Integer value) {
            addCriterion("ordeid <", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidLessThanOrEqualTo(Integer value) {
            addCriterion("ordeid <=", value, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidIn(List<Integer> values) {
            addCriterion("ordeid in", values, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidNotIn(List<Integer> values) {
            addCriterion("ordeid not in", values, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidBetween(Integer value1, Integer value2) {
            addCriterion("ordeid between", value1, value2, "ordeid");
            return (Criteria) this;
        }

        public Criteria andOrdeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ordeid not between", value1, value2, "ordeid");
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