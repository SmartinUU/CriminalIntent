package com.bignerdranch.android.criminalintent.db;

/**
 * Created on 19-05-29
 *
 * @function 描述表名和数据字段
 */
public class CriemDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
