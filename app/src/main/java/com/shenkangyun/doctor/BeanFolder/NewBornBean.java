package com.shenkangyun.doctor.BeanFolder;

import java.util.List;

/**
 * Created by Administrator on 2018/12/8.
 */

public class NewBornBean {

    /**
     * data : {"pageCount":8,"totalCount":1,"pageNo":0,"list":[{"id":102,"patientID":39,"childsex":"女","childweight":"7","childheight":"40","APgarOne":null,"APgarFive":null,"reason":"1","createUser":null,"createTime":1533201947000,"updateTime":1533261015000,"delFlag":0,"delTime":null,"remark":null}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pageCount : 8
         * totalCount : 1
         * pageNo : 0
         * list : [{"id":102,"patientID":39,"childsex":"女","childweight":"7","childheight":"40","APgarOne":null,"APgarFive":null,"reason":"1","createUser":null,"createTime":1533201947000,"updateTime":1533261015000,"delFlag":0,"delTime":null,"remark":null}]
         */

        private int pageCount;
        private int totalCount;
        private int pageNo;
        private List<ListBean> list;

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 102
             * patientID : 39
             * childsex : 女
             * childweight : 7
             * childheight : 40
             * APgarOne : null
             * APgarFive : null
             * reason : 1
             * createUser : null
             * createTime : 1533201947000
             * updateTime : 1533261015000
             * delFlag : 0
             * delTime : null
             * remark : null
             */

            private int id;
            private int patientID;
            private String childsex;
            private String childweight;
            private String childheight;
            private String APgarOne;
            private String APgarFive;
            private String reason;
            private Object createUser;
            private long createTime;
            private long updateTime;
            private int delFlag;
            private Object delTime;
            private Object remark;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPatientID() {
                return patientID;
            }

            public void setPatientID(int patientID) {
                this.patientID = patientID;
            }

            public String getChildsex() {
                return childsex;
            }

            public void setChildsex(String childsex) {
                this.childsex = childsex;
            }

            public String getChildweight() {
                return childweight;
            }

            public void setChildweight(String childweight) {
                this.childweight = childweight;
            }

            public String getChildheight() {
                return childheight;
            }

            public void setChildheight(String childheight) {
                this.childheight = childheight;
            }

            public String getAPgarOne() {
                return APgarOne;
            }

            public void setAPgarOne(String APgarOne) {
                this.APgarOne = APgarOne;
            }

            public String getAPgarFive() {
                return APgarFive;
            }

            public void setAPgarFive(String APgarFive) {
                this.APgarFive = APgarFive;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public Object getCreateUser() {
                return createUser;
            }

            public void setCreateUser(Object createUser) {
                this.createUser = createUser;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public int getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(int delFlag) {
                this.delFlag = delFlag;
            }

            public Object getDelTime() {
                return delTime;
            }

            public void setDelTime(Object delTime) {
                this.delTime = delTime;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }
        }
    }
}
