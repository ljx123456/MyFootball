package com.example.alu.myfootball.bean;

import java.util.List;

/**
 * Created by alu on 2017/3/1.
 */

public class DuiZhanBean {

    /**
     * reason : 查询成功
     * result : {"key":"皇家马德里阿尔梅里亚","list":[{"date":"12-13周六","link1content":"视频暂无","link1url":"","link2content":"图文直播","link2url":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112892","link3content":"","link3url":"","live":"","score":"VS","team1":"阿尔梅里亚","team1icon":"http://www.sinaimg.cn/ty/2013/0813/U5244P6DT20130813113821.png","team1url":"http://match.sports.sina.com.cn/football/team.php?id=4418","team2":"皇家马德里","team2icon":"http://www.sinaimg.cn/ty/2013/0510/U5244P6DT20130510172217.jpg","team2url":"http://match.sports.sina.com.cn/football/team.php?id=157","time":"03:45"},{"date":"04-29周三","link1content":"视频暂无","link1url":"","link2content":"图文直播","link2url":"http://match.sports.sina.com.cn/livecast/g/live.php?id=113090","link3content":"","link3url":"","live":"","score":"VS","team1":"皇家马德里","team1icon":"http://www.sinaimg.cn/ty/2013/0510/U5244P6DT20130510172217.jpg","team1url":"http://match.sports.sina.com.cn/football/team.php?id=157","team2":"阿尔梅里亚","team2icon":"http://www.sinaimg.cn/ty/2013/0813/U5244P6DT20130813113821.png","team2url":"http://match.sports.sina.com.cn/football/team.php?id=4418","time":"23:00"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    @Override
    public String toString() {
        return "DuiZhanBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

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
         * key : 皇家马德里阿尔梅里亚
         * list : [{"date":"12-13周六","link1content":"视频暂无","link1url":"","link2content":"图文直播","link2url":"http://match.sports.sina.com.cn/livecast/g/live.php?id=112892","link3content":"","link3url":"","live":"","score":"VS","team1":"阿尔梅里亚","team1icon":"http://www.sinaimg.cn/ty/2013/0813/U5244P6DT20130813113821.png","team1url":"http://match.sports.sina.com.cn/football/team.php?id=4418","team2":"皇家马德里","team2icon":"http://www.sinaimg.cn/ty/2013/0510/U5244P6DT20130510172217.jpg","team2url":"http://match.sports.sina.com.cn/football/team.php?id=157","time":"03:45"},{"date":"04-29周三","link1content":"视频暂无","link1url":"","link2content":"图文直播","link2url":"http://match.sports.sina.com.cn/livecast/g/live.php?id=113090","link3content":"","link3url":"","live":"","score":"VS","team1":"皇家马德里","team1icon":"http://www.sinaimg.cn/ty/2013/0510/U5244P6DT20130510172217.jpg","team1url":"http://match.sports.sina.com.cn/football/team.php?id=157","team2":"阿尔梅里亚","team2icon":"http://www.sinaimg.cn/ty/2013/0813/U5244P6DT20130813113821.png","team2url":"http://match.sports.sina.com.cn/football/team.php?id=4418","time":"23:00"}]
         */

        private String key;
        private List<ListBean> list;

        @Override
        public String toString() {
            return "ResultBean{" +
                    "key='" + key + '\'' +
                    ", list=" + list +
                    '}';
        }

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
             * date : 12-13周六
             * link1content : 视频暂无
             * link1url :
             * link2content : 图文直播
             * link2url : http://match.sports.sina.com.cn/livecast/g/live.php?id=112892
             * link3content :
             * link3url :
             * live :
             * score : VS
             * team1 : 阿尔梅里亚
             * team1icon : http://www.sinaimg.cn/ty/2013/0813/U5244P6DT20130813113821.png
             * team1url : http://match.sports.sina.com.cn/football/team.php?id=4418
             * team2 : 皇家马德里
             * team2icon : http://www.sinaimg.cn/ty/2013/0510/U5244P6DT20130510172217.jpg
             * team2url : http://match.sports.sina.com.cn/football/team.php?id=157
             * time : 03:45
             */

            private String date;
            private String link1content;
            private String link1url;
            private String link2content;
            private String link2url;
            private String link3content;
            private String link3url;
            private String live;
            private String score;
            private String team1;
            private String team1icon;
            private String team1url;
            private String team2;
            private String team2icon;
            private String team2url;
            private String time;

            @Override
            public String toString() {
                return "ListBean{" +
                        "date='" + date + '\'' +
                        ", link1content='" + link1content + '\'' +
                        ", link1url='" + link1url + '\'' +
                        ", link2content='" + link2content + '\'' +
                        ", link2url='" + link2url + '\'' +
                        ", link3content='" + link3content + '\'' +
                        ", link3url='" + link3url + '\'' +
                        ", live='" + live + '\'' +
                        ", score='" + score + '\'' +
                        ", team1='" + team1 + '\'' +
                        ", team1icon='" + team1icon + '\'' +
                        ", team1url='" + team1url + '\'' +
                        ", team2='" + team2 + '\'' +
                        ", team2icon='" + team2icon + '\'' +
                        ", team2url='" + team2url + '\'' +
                        ", time='" + time + '\'' +
                        '}';
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getLink1content() {
                return link1content;
            }

            public void setLink1content(String link1content) {
                this.link1content = link1content;
            }

            public String getLink1url() {
                return link1url;
            }

            public void setLink1url(String link1url) {
                this.link1url = link1url;
            }

            public String getLink2content() {
                return link2content;
            }

            public void setLink2content(String link2content) {
                this.link2content = link2content;
            }

            public String getLink2url() {
                return link2url;
            }

            public void setLink2url(String link2url) {
                this.link2url = link2url;
            }

            public String getLink3content() {
                return link3content;
            }

            public void setLink3content(String link3content) {
                this.link3content = link3content;
            }

            public String getLink3url() {
                return link3url;
            }

            public void setLink3url(String link3url) {
                this.link3url = link3url;
            }

            public String getLive() {
                return live;
            }

            public void setLive(String live) {
                this.live = live;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getTeam1() {
                return team1;
            }

            public void setTeam1(String team1) {
                this.team1 = team1;
            }

            public String getTeam1icon() {
                return team1icon;
            }

            public void setTeam1icon(String team1icon) {
                this.team1icon = team1icon;
            }

            public String getTeam1url() {
                return team1url;
            }

            public void setTeam1url(String team1url) {
                this.team1url = team1url;
            }

            public String getTeam2() {
                return team2;
            }

            public void setTeam2(String team2) {
                this.team2 = team2;
            }

            public String getTeam2icon() {
                return team2icon;
            }

            public void setTeam2icon(String team2icon) {
                this.team2icon = team2icon;
            }

            public String getTeam2url() {
                return team2url;
            }

            public void setTeam2url(String team2url) {
                this.team2url = team2url;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
