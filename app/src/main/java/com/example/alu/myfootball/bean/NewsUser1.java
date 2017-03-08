package com.example.alu.myfootball.bean;

import java.util.List;

/**
 * Created by alu on 2017/3/2.
 */

public class NewsUser1 {
    private String reason;
    private ResultBean result;
    private int error_code;

    @Override
    public String toString() {
        return "NewsUser1{" +
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
        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {

            //ArrayList判断是否包括该对象
            @Override
            public boolean equals(Object obj) {
                if(obj instanceof DataBean){
                    DataBean u = (DataBean) obj;
                    return this.url.equals(u.url)&&this.title.equals(u.title);
                }
                return super.equals(obj);
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }

            /**
             * uniquekey : 02c560856470da61f8cf9010958912ab
             * title : 42岁港姐曾靠寻秦记一炮而红 被骂小三后下嫁穷小伙拍戏流产
             * date : 2017-02-28 12:23
             * category : 头条
             * author_name : 前瞻网
             * url : http://mini.eastday.com/mobile/170228122300411.html
             * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
