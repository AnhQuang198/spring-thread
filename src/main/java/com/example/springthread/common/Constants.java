package com.example.springthread.common;

public class Constants {
    public static class RESPONSE_TYPE {
        public static final String SUCCESS = "SUCCESS";
        public static final String ERROR = "ERROR";
        public static final String WARNING = "WARNING";
        public static final String CONFIRM = "CONFIRM";
        public static final String invalidPermission = "invalidPermission";
    }

    public static class STATUS {
        public static final String ACTIVE = "ACTIVE";
        public static final String IN_ACTIVE = "IN_ACTIVE";
    }

    public static class CATEGORY_TYPE {
        public static final String ISSUE = "ISSUE";
        public static final String PRIORITY = "PRIORITY";
        public static final String ISSUE_SOURCE = "ISSUE_SOURCE";
    }

    public static class ISSUE_SOURCE_TYPE {
        public static final String MANUAL = "MANUAL"; //nhập tay
        public static final String SYSTEM = "SYSTEM"; //hệ thống
    }
}
