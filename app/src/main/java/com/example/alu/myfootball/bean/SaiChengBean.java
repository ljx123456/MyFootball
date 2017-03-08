package com.example.alu.myfootball.bean;

import java.util.List;

/**
 * Created by alu on 2017/3/1.
 */

public class SaiChengBean {

    /**
     * reason : 查询成功
     * result : {"key":"皇家马德里","list":[{"c1":"欧冠","c2":"11-27","c3":"03:45","c4R":"0-1","c4T1":"巴塞尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=3255","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/ucl/match/1415/5/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/ucl/2014-11-27/04347425813.shtml","c54":"","c54Link":""},{"c1":"西甲","c2":"11-30","c3":"03:00","c4R":"1-2","c4T1":"马拉加","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/laliga/match/1415/13/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/laliga/2014-11-30/03487429569.shtml","c54":"","c54Link":""},{"c1":"西国王杯","c2":"12-03","c3":"03:00","c4R":"5-0","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"科内利亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=79380","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/CopadelRey/match/1415/1203/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/laliga/2014-12-03/02087432835.shtml","c54":"","c54Link":""},{"c1":"西甲","c2":"12-07","c3":"03:00","c4R":"VS","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"维戈塞尔塔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c51":"","c52":"视频直播","c52Link":"http://video.sina.com.cn/l/pl/sportstv/1691648.html","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112890","c54":"","c54Link":""},{"c1":"欧冠","c2":"12-10","c3":"03:45","c4R":"VS","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"卢多戈雷茨","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=54138","c51":"","c52":"视频暂无","c52Link":"","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=115037","c54":"","c54Link":""},{"c1":"西甲","c2":"12-13","c3":"03:45","c4R":"VS","c4T1":"阿尔梅里亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4418","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频暂无","c52Link":"","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112892","c54":"","c54Link":""}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * key : 皇家马德里
         * list : [{"c1":"欧冠","c2":"11-27","c3":"03:45","c4R":"0-1","c4T1":"巴塞尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=3255","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/ucl/match/1415/5/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/ucl/2014-11-27/04347425813.shtml","c54":"","c54Link":""},{"c1":"西甲","c2":"11-30","c3":"03:00","c4R":"1-2","c4T1":"马拉加","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/laliga/match/1415/13/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/laliga/2014-11-30/03487429569.shtml","c54":"","c54Link":""},{"c1":"西国王杯","c2":"12-03","c3":"03:00","c4R":"5-0","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"科内利亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=79380","c51":"","c52":"视频集锦","c52Link":"http://sports.sina.com.cn/video/g/CopadelRey/match/1415/1203/real/","c53":"全场战报","c53Link":"http://sports.sina.com.cn/g/laliga/2014-12-03/02087432835.shtml","c54":"","c54Link":""},{"c1":"西甲","c2":"12-07","c3":"03:00","c4R":"VS","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"维戈塞尔塔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c51":"","c52":"视频直播","c52Link":"http://video.sina.com.cn/l/pl/sportstv/1691648.html","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112890","c54":"","c54Link":""},{"c1":"欧冠","c2":"12-10","c3":"03:45","c4R":"VS","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4T2":"卢多戈雷茨","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=54138","c51":"","c52":"视频暂无","c52Link":"","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=115037","c54":"","c54Link":""},{"c1":"西甲","c2":"12-13","c3":"03:45","c4R":"VS","c4T1":"阿尔梅里亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4418","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"","c52":"视频暂无","c52Link":"","c53":"图文直播","c53Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112892","c54":"","c54Link":""}]
         */

        private String key;
        private List<ListBean> list;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * c1 : 欧冠
             * c2 : 11-27
             * c3 : 03:45
             * c4R : 0-1
             * c4T1 : 巴塞尔
             * c4T1URL : http://match.sports.sina.com.cn/football/team.php?id=3255
             * c4T2 : 皇家马德里
             * c4T2URL : http://match.sports.sina.com.cn/football/team.php?id=157
             * c51 :
             * c52 : 视频集锦
             * c52Link : http://sports.sina.com.cn/video/g/ucl/match/1415/5/real/
             * c53 : 全场战报
             * c53Link : http://sports.sina.com.cn/g/ucl/2014-11-27/04347425813.shtml
             * c54 :
             * c54Link :
             */

            private String c1;
            private String c2;
            private String c3;
            private String c4R;
            private String c4T1;
            private String c4T1URL;
            private String c4T2;
            private String c4T2URL;
            private String c51;
            private String c52;
            private String c52Link;
            private String c53;
            private String c53Link;
            private String c54;
            private String c54Link;

            public String getC1() {
                return c1;
            }

            public void setC1(String c1) {
                this.c1 = c1;
            }

            public String getC2() {
                return c2;
            }

            public void setC2(String c2) {
                this.c2 = c2;
            }

            public String getC3() {
                return c3;
            }

            public void setC3(String c3) {
                this.c3 = c3;
            }

            public String getC4R() {
                return c4R;
            }

            public void setC4R(String c4R) {
                this.c4R = c4R;
            }

            public String getC4T1() {
                return c4T1;
            }

            public void setC4T1(String c4T1) {
                this.c4T1 = c4T1;
            }

            public String getC4T1URL() {
                return c4T1URL;
            }

            public void setC4T1URL(String c4T1URL) {
                this.c4T1URL = c4T1URL;
            }

            public String getC4T2() {
                return c4T2;
            }

            public void setC4T2(String c4T2) {
                this.c4T2 = c4T2;
            }

            public String getC4T2URL() {
                return c4T2URL;
            }

            public void setC4T2URL(String c4T2URL) {
                this.c4T2URL = c4T2URL;
            }

            public String getC51() {
                return c51;
            }

            public void setC51(String c51) {
                this.c51 = c51;
            }

            public String getC52() {
                return c52;
            }

            public void setC52(String c52) {
                this.c52 = c52;
            }

            public String getC52Link() {
                return c52Link;
            }

            public void setC52Link(String c52Link) {
                this.c52Link = c52Link;
            }

            public String getC53() {
                return c53;
            }

            public void setC53(String c53) {
                this.c53 = c53;
            }

            public String getC53Link() {
                return c53Link;
            }

            public void setC53Link(String c53Link) {
                this.c53Link = c53Link;
            }

            public String getC54() {
                return c54;
            }

            public void setC54(String c54) {
                this.c54 = c54;
            }

            public String getC54Link() {
                return c54Link;
            }

            public void setC54Link(String c54Link) {
                this.c54Link = c54Link;
            }
        }
    }
}
