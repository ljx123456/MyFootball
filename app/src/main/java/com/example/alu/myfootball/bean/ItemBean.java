package com.example.alu.myfootball.bean;

import java.util.List;

/**
 * Created by alu on 2017/2/28.
 */

public class ItemBean {
    @Override
    public String toString() {
        return "ItemBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * reason : 查询成功
     * result : {"key":"西甲","tabs":{"saicheng1":"第24轮赛程","saicheng2":"第25轮赛程","saicheng3":null,"jifenbang":"积分榜","sheshoubang":"射手榜"},"views":{"saicheng1":[{"c1":"已结束","c2":"02-25周六","c3":"03:45","c4T1":"拉斯帕尔马斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c4R":"0-1","c4T2":"皇家社会","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","liveid":"869689"},{"c1":"已结束","c2":"02-25周六","c3":"20:00","c4T1":"阿拉维斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c4R":"2-1","c4T2":"瓦伦西亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","liveid":"869693"},{"c1":"已结束","c2":"02-25周六","c3":"23:15","c4T1":"皇家贝蒂斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c4R":"1-2","c4T2":"塞维利亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149774","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-26/doc-ifyavvsk3544806.shtml?cre=360.ala.xj.sc","liveid":"869691"},{"c1":"已结束","c2":"02-26周日","c3":"01:30","c4T1":"莱加内斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c4R":"4-0","c4T2":"拉科鲁尼亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","liveid":"869694"},{"c1":"已结束","c2":"02-26周日","c3":"03:45","c4T1":"埃瓦尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4R":"3-0","c4T2":"马拉加","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","liveid":"869690"},{"c1":"已结束","c2":"02-26周日","c3":"19:00","c4T1":"西班牙人","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c4R":"3-0","c4T2":"奥萨苏纳","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","liveid":"869687"},{"c1":"已结束","c2":"02-26周日","c3":"23:15","c4T1":"马德里竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c4R":"1-2","c4T2":"巴塞罗那","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","liveid":"869695"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"毕尔巴鄂竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c4R":"3-1","c4T2":"格拉纳达","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","liveid":"869692"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"希洪竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c4R":"1-1","c4T2":"维戈塞尔塔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","liveid":"869696"},{"c1":"已结束","c2":"02-27周一","c3":"03:45","c4T1":"比利亚雷亚尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c4R":"2-3","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149776","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-27/doc-ifyavvsk3644684.shtml?cre=360.ala.xj.sc","liveid":"869688"}],"saicheng2":[{"c1":"未开赛","c2":"03-01周三","c3":"02:30","c4T1":"皇家社会","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c4R":"VS","c4T2":"埃瓦尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149784","liveid":"869700"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"马拉加","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c4R":"VS","c4T2":"皇家贝蒂斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149781","liveid":"869701"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"瓦伦西亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c4R":"VS","c4T2":"莱加内斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149786","liveid":"869704"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"巴塞罗那","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c4R":"VS","c4T2":"希洪竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149777","liveid":"869706"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"奥萨苏纳","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c4R":"VS","c4T2":"比利亚雷亚尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149782","liveid":"869698"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"维戈塞尔塔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c4R":"VS","c4T2":"西班牙人","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149778","liveid":"869697"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"格拉纳达","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c4R":"VS","c4T2":"阿拉维斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149780","liveid":"869703"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4R":"VS","c4T2":"拉斯帕尔马斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149783","liveid":"869699"},{"c1":"未开赛","c2":"03-03周五","c3":"03:45","c4T1":"拉科鲁尼亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c4R":"VS","c4T2":"马德里竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149779","liveid":"869705"},{"c1":"未开赛","c2":"03-03周五","c3":"04:30","c4T1":"塞维利亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c4R":"VS","c4T2":"毕尔巴鄂竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149785","liveid":"869702"}],"saicheng3":null,"jifenbang":[{"c1":"1","c2":"皇家马德里","c2L":"http://match.sports.sina.com.cn/football/team.php?id=157","c3":"23","c41":"17","c42":"4","c43":"2","c5":"38","c6":"55"},{"c1":"2","c2":"巴塞罗那","c2L":"http://match.sports.sina.com.cn/football/team.php?id=130","c3":"24","c41":"16","c42":"6","c43":"2","c5":"45","c6":"54"},{"c1":"3","c2":"塞维利亚","c2L":"http://match.sports.sina.com.cn/football/team.php?id=166","c3":"24","c41":"16","c42":"4","c43":"4","c5":"19","c6":"52"},{"c1":"4","c2":"马德里竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=162","c3":"24","c41":"13","c42":"6","c43":"5","c5":"23","c6":"45"},{"c1":"5","c2":"皇家社会","c2L":"http://match.sports.sina.com.cn/football/team.php?id=160","c3":"24","c41":"14","c42":"2","c43":"8","c5":"5","c6":"44"},{"c1":"6","c2":"比利亚雷亚尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=219","c3":"24","c41":"10","c42":"9","c43":"5","c5":"14","c6":"39"},{"c1":"7","c2":"埃瓦尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c3":"24","c41":"11","c42":"5","c43":"8","c5":"8","c6":"38"},{"c1":"8","c2":"毕尔巴鄂竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=131","c3":"24","c41":"11","c42":"5","c43":"8","c5":"2","c6":"38"},{"c1":"9","c2":"西班牙人","c2L":"http://match.sports.sina.com.cn/football/team.php?id=182","c3":"24","c41":"9","c42":"8","c43":"7","c5":"2","c6":"35"},{"c1":"10","c2":"维戈塞尔塔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=165","c3":"23","c41":"10","c42":"4","c43":"9","c5":"0","c6":"34"}],"sheshoubang":[{"c1":"1","c2":"梅西","c2L":"http://match.sports.sina.com.cn/football/player.php?id=19054","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"20","c5":"3"},{"c1":"2","c2":"苏亚雷斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=39336","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"18","c5":"0"},{"c1":"3","c2":"C罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=14937","c3":"皇家马德里","c3L":"http://match.sports.sina.com.cn/football/team.php?id=157","c4":"16","c5":"5"},{"c1":"4","c2":"阿斯帕斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=40270","c3":"维戈塞尔塔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=165","c4":"13","c5":"2"},{"c1":"5","c2":"塞尔吉-恩里克","c2L":"http://match.sports.sina.com.cn/football/player.php?id=80791","c3":"埃瓦尔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4":"10","c5":"0"},{"c1":"6","c2":"格里兹曼","c2L":"http://match.sports.sina.com.cn/football/player.php?id=76650","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"0"},{"c1":"7","c2":"杰拉德","c2L":"http://match.sports.sina.com.cn/football/player.php?id=93721","c3":"西班牙人","c3L":"http://match.sports.sina.com.cn/football/team.php?id=182","c4":"9","c5":"0"},{"c1":"8","c2":"加梅罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=42779","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"1"},{"c1":"9","c2":"威利安","c2L":"http://match.sports.sina.com.cn/football/player.php?id=73314","c3":"皇家社会","c3L":"http://match.sports.sina.com.cn/football/team.php?id=160","c4":"9","c5":"2"},{"c1":"10","c2":"卡拉斯科","c2L":"http://match.sports.sina.com.cn/football/player.php?id=119718","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"8","c5":"0"}]}}
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
        @Override
        public String toString() {
            return "ResultBean{" +
                    "key='" + key + '\'' +
                    ", tabs=" + tabs +
                    ", views=" + views +
                    '}';
        }

        /**
         * key : 西甲
         * tabs : {"saicheng1":"第24轮赛程","saicheng2":"第25轮赛程","saicheng3":null,"jifenbang":"积分榜","sheshoubang":"射手榜"}
         * views : {"saicheng1":[{"c1":"已结束","c2":"02-25周六","c3":"03:45","c4T1":"拉斯帕尔马斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c4R":"0-1","c4T2":"皇家社会","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","liveid":"869689"},{"c1":"已结束","c2":"02-25周六","c3":"20:00","c4T1":"阿拉维斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c4R":"2-1","c4T2":"瓦伦西亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","liveid":"869693"},{"c1":"已结束","c2":"02-25周六","c3":"23:15","c4T1":"皇家贝蒂斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c4R":"1-2","c4T2":"塞维利亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149774","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-26/doc-ifyavvsk3544806.shtml?cre=360.ala.xj.sc","liveid":"869691"},{"c1":"已结束","c2":"02-26周日","c3":"01:30","c4T1":"莱加内斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c4R":"4-0","c4T2":"拉科鲁尼亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","liveid":"869694"},{"c1":"已结束","c2":"02-26周日","c3":"03:45","c4T1":"埃瓦尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4R":"3-0","c4T2":"马拉加","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","liveid":"869690"},{"c1":"已结束","c2":"02-26周日","c3":"19:00","c4T1":"西班牙人","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c4R":"3-0","c4T2":"奥萨苏纳","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","liveid":"869687"},{"c1":"已结束","c2":"02-26周日","c3":"23:15","c4T1":"马德里竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c4R":"1-2","c4T2":"巴塞罗那","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","liveid":"869695"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"毕尔巴鄂竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c4R":"3-1","c4T2":"格拉纳达","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","liveid":"869692"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"希洪竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c4R":"1-1","c4T2":"维戈塞尔塔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","liveid":"869696"},{"c1":"已结束","c2":"02-27周一","c3":"03:45","c4T1":"比利亚雷亚尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c4R":"2-3","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149776","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-27/doc-ifyavvsk3644684.shtml?cre=360.ala.xj.sc","liveid":"869688"}],"saicheng2":[{"c1":"未开赛","c2":"03-01周三","c3":"02:30","c4T1":"皇家社会","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c4R":"VS","c4T2":"埃瓦尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149784","liveid":"869700"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"马拉加","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c4R":"VS","c4T2":"皇家贝蒂斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149781","liveid":"869701"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"瓦伦西亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c4R":"VS","c4T2":"莱加内斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149786","liveid":"869704"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"巴塞罗那","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c4R":"VS","c4T2":"希洪竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149777","liveid":"869706"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"奥萨苏纳","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c4R":"VS","c4T2":"比利亚雷亚尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149782","liveid":"869698"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"维戈塞尔塔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c4R":"VS","c4T2":"西班牙人","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149778","liveid":"869697"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"格拉纳达","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c4R":"VS","c4T2":"阿拉维斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149780","liveid":"869703"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4R":"VS","c4T2":"拉斯帕尔马斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149783","liveid":"869699"},{"c1":"未开赛","c2":"03-03周五","c3":"03:45","c4T1":"拉科鲁尼亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c4R":"VS","c4T2":"马德里竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149779","liveid":"869705"},{"c1":"未开赛","c2":"03-03周五","c3":"04:30","c4T1":"塞维利亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c4R":"VS","c4T2":"毕尔巴鄂竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149785","liveid":"869702"}],"saicheng3":null,"jifenbang":[{"c1":"1","c2":"皇家马德里","c2L":"http://match.sports.sina.com.cn/football/team.php?id=157","c3":"23","c41":"17","c42":"4","c43":"2","c5":"38","c6":"55"},{"c1":"2","c2":"巴塞罗那","c2L":"http://match.sports.sina.com.cn/football/team.php?id=130","c3":"24","c41":"16","c42":"6","c43":"2","c5":"45","c6":"54"},{"c1":"3","c2":"塞维利亚","c2L":"http://match.sports.sina.com.cn/football/team.php?id=166","c3":"24","c41":"16","c42":"4","c43":"4","c5":"19","c6":"52"},{"c1":"4","c2":"马德里竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=162","c3":"24","c41":"13","c42":"6","c43":"5","c5":"23","c6":"45"},{"c1":"5","c2":"皇家社会","c2L":"http://match.sports.sina.com.cn/football/team.php?id=160","c3":"24","c41":"14","c42":"2","c43":"8","c5":"5","c6":"44"},{"c1":"6","c2":"比利亚雷亚尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=219","c3":"24","c41":"10","c42":"9","c43":"5","c5":"14","c6":"39"},{"c1":"7","c2":"埃瓦尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c3":"24","c41":"11","c42":"5","c43":"8","c5":"8","c6":"38"},{"c1":"8","c2":"毕尔巴鄂竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=131","c3":"24","c41":"11","c42":"5","c43":"8","c5":"2","c6":"38"},{"c1":"9","c2":"西班牙人","c2L":"http://match.sports.sina.com.cn/football/team.php?id=182","c3":"24","c41":"9","c42":"8","c43":"7","c5":"2","c6":"35"},{"c1":"10","c2":"维戈塞尔塔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=165","c3":"23","c41":"10","c42":"4","c43":"9","c5":"0","c6":"34"}],"sheshoubang":[{"c1":"1","c2":"梅西","c2L":"http://match.sports.sina.com.cn/football/player.php?id=19054","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"20","c5":"3"},{"c1":"2","c2":"苏亚雷斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=39336","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"18","c5":"0"},{"c1":"3","c2":"C罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=14937","c3":"皇家马德里","c3L":"http://match.sports.sina.com.cn/football/team.php?id=157","c4":"16","c5":"5"},{"c1":"4","c2":"阿斯帕斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=40270","c3":"维戈塞尔塔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=165","c4":"13","c5":"2"},{"c1":"5","c2":"塞尔吉-恩里克","c2L":"http://match.sports.sina.com.cn/football/player.php?id=80791","c3":"埃瓦尔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4":"10","c5":"0"},{"c1":"6","c2":"格里兹曼","c2L":"http://match.sports.sina.com.cn/football/player.php?id=76650","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"0"},{"c1":"7","c2":"杰拉德","c2L":"http://match.sports.sina.com.cn/football/player.php?id=93721","c3":"西班牙人","c3L":"http://match.sports.sina.com.cn/football/team.php?id=182","c4":"9","c5":"0"},{"c1":"8","c2":"加梅罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=42779","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"1"},{"c1":"9","c2":"威利安","c2L":"http://match.sports.sina.com.cn/football/player.php?id=73314","c3":"皇家社会","c3L":"http://match.sports.sina.com.cn/football/team.php?id=160","c4":"9","c5":"2"},{"c1":"10","c2":"卡拉斯科","c2L":"http://match.sports.sina.com.cn/football/player.php?id=119718","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"8","c5":"0"}]}
         */

        private String key;
        private TabsBean tabs;
        private ViewsBean views;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public TabsBean getTabs() {
            return tabs;
        }

        public void setTabs(TabsBean tabs) {
            this.tabs = tabs;
        }

        public ViewsBean getViews() {
            return views;
        }

        public void setViews(ViewsBean views) {
            this.views = views;
        }

        public static class TabsBean {
            @Override
            public String toString() {
                return "TabsBean{" +
                        "saicheng1='" + saicheng1 + '\'' +
                        ", saicheng2='" + saicheng2 + '\'' +
                        ", saicheng3=" + saicheng3 +
                        ", jifenbang='" + jifenbang + '\'' +
                        ", sheshoubang='" + sheshoubang + '\'' +
                        '}';
            }

            /**
             * saicheng1 : 第24轮赛程
             * saicheng2 : 第25轮赛程
             * saicheng3 : null
             * jifenbang : 积分榜
             * sheshoubang : 射手榜
             */

            private String saicheng1;
            private String saicheng2;
            private Object saicheng3;
            private String jifenbang;
            private String sheshoubang;

            public String getSaicheng1() {
                return saicheng1;
            }

            public void setSaicheng1(String saicheng1) {
                this.saicheng1 = saicheng1;
            }

            public String getSaicheng2() {
                return saicheng2;
            }

            public void setSaicheng2(String saicheng2) {
                this.saicheng2 = saicheng2;
            }

            public Object getSaicheng3() {
                return saicheng3;
            }

            public void setSaicheng3(Object saicheng3) {
                this.saicheng3 = saicheng3;
            }

            public String getJifenbang() {
                return jifenbang;
            }

            public void setJifenbang(String jifenbang) {
                this.jifenbang = jifenbang;
            }

            public String getSheshoubang() {
                return sheshoubang;
            }

            public void setSheshoubang(String sheshoubang) {
                this.sheshoubang = sheshoubang;
            }
        }

        public static class ViewsBean {
            /**
             * saicheng1 : [{"c1":"已结束","c2":"02-25周六","c3":"03:45","c4T1":"拉斯帕尔马斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c4R":"0-1","c4T2":"皇家社会","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149772","liveid":"869689"},{"c1":"已结束","c2":"02-25周六","c3":"20:00","c4T1":"阿拉维斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c4R":"2-1","c4T2":"瓦伦西亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149767","liveid":"869693"},{"c1":"已结束","c2":"02-25周六","c3":"23:15","c4T1":"皇家贝蒂斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c4R":"1-2","c4T2":"塞维利亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149774","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-26/doc-ifyavvsk3544806.shtml?cre=360.ala.xj.sc","liveid":"869691"},{"c1":"已结束","c2":"02-26周日","c3":"01:30","c4T1":"莱加内斯","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c4R":"4-0","c4T2":"拉科鲁尼亚","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149773","liveid":"869694"},{"c1":"已结束","c2":"02-26周日","c3":"03:45","c4T1":"埃瓦尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4R":"3-0","c4T2":"马拉加","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149770","liveid":"869690"},{"c1":"已结束","c2":"02-26周日","c3":"19:00","c4T1":"西班牙人","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c4R":"3-0","c4T2":"奥萨苏纳","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149771","liveid":"869687"},{"c1":"已结束","c2":"02-26周日","c3":"23:15","c4T1":"马德里竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c4R":"1-2","c4T2":"巴塞罗那","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149769","liveid":"869695"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"毕尔巴鄂竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c4R":"3-1","c4T2":"格拉纳达","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149768","liveid":"869692"},{"c1":"已结束","c2":"02-27周一","c3":"01:30","c4T1":"希洪竞技","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c4R":"1-1","c4T2":"维戈塞尔塔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","c52":"图文数据","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149775","liveid":"869696"},{"c1":"已结束","c2":"02-27周一","c3":"03:45","c4T1":"比利亚雷亚尔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c4R":"2-3","c4T2":"皇家马德里","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c51":"全场统计","c51Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149776","c52":"全场战报","c52Link":"http://sports.sina.com.cn/g/laliga/2017-02-27/doc-ifyavvsk3644684.shtml?cre=360.ala.xj.sc","liveid":"869688"}]
             * saicheng2 : [{"c1":"未开赛","c2":"03-01周三","c3":"02:30","c4T1":"皇家社会","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=160","c4R":"VS","c4T2":"埃瓦尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4417","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149784","liveid":"869700"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"马拉加","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=163","c4R":"VS","c4T2":"皇家贝蒂斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=154","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149781","liveid":"869701"},{"c1":"未开赛","c2":"03-01周三","c3":"04:30","c4T1":"瓦伦西亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=169","c4R":"VS","c4T2":"莱加内斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4526","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149786","liveid":"869704"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"巴塞罗那","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=130","c4R":"VS","c4T2":"希洪竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=4416","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149777","liveid":"869706"},{"c1":"未开赛","c2":"03-02周四","c3":"02:30","c4T1":"奥萨苏纳","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=220","c4R":"VS","c4T2":"比利亚雷亚尔","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=219","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149782","liveid":"869698"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"维戈塞尔塔","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=165","c4R":"VS","c4T2":"西班牙人","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=182","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149778","liveid":"869697"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"格拉纳达","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=23165","c4R":"VS","c4T2":"阿拉维斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=155","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149780","liveid":"869703"},{"c1":"未开赛","c2":"03-02周四","c3":"04:30","c4T1":"皇家马德里","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=157","c4R":"VS","c4T2":"拉斯帕尔马斯","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=221","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149783","liveid":"869699"},{"c1":"未开赛","c2":"03-03周五","c3":"03:45","c4T1":"拉科鲁尼亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=161","c4R":"VS","c4T2":"马德里竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=162","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149779","liveid":"869705"},{"c1":"未开赛","c2":"03-03周五","c3":"04:30","c4T1":"塞维利亚","c4T1URL":"http://match.sports.sina.com.cn/football/team.php?id=166","c4R":"VS","c4T2":"毕尔巴鄂竞技","c4T2URL":"http://match.sports.sina.com.cn/football/team.php?id=131","c51":"视频暂无","c51Link":"","c52":"前瞻预测","c52Link":"http://match.sports.sina.com.cn/livecast/g/live.php?id=149785","liveid":"869702"}]
             * saicheng3 : null
             * jifenbang : [{"c1":"1","c2":"皇家马德里","c2L":"http://match.sports.sina.com.cn/football/team.php?id=157","c3":"23","c41":"17","c42":"4","c43":"2","c5":"38","c6":"55"},{"c1":"2","c2":"巴塞罗那","c2L":"http://match.sports.sina.com.cn/football/team.php?id=130","c3":"24","c41":"16","c42":"6","c43":"2","c5":"45","c6":"54"},{"c1":"3","c2":"塞维利亚","c2L":"http://match.sports.sina.com.cn/football/team.php?id=166","c3":"24","c41":"16","c42":"4","c43":"4","c5":"19","c6":"52"},{"c1":"4","c2":"马德里竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=162","c3":"24","c41":"13","c42":"6","c43":"5","c5":"23","c6":"45"},{"c1":"5","c2":"皇家社会","c2L":"http://match.sports.sina.com.cn/football/team.php?id=160","c3":"24","c41":"14","c42":"2","c43":"8","c5":"5","c6":"44"},{"c1":"6","c2":"比利亚雷亚尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=219","c3":"24","c41":"10","c42":"9","c43":"5","c5":"14","c6":"39"},{"c1":"7","c2":"埃瓦尔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c3":"24","c41":"11","c42":"5","c43":"8","c5":"8","c6":"38"},{"c1":"8","c2":"毕尔巴鄂竞技","c2L":"http://match.sports.sina.com.cn/football/team.php?id=131","c3":"24","c41":"11","c42":"5","c43":"8","c5":"2","c6":"38"},{"c1":"9","c2":"西班牙人","c2L":"http://match.sports.sina.com.cn/football/team.php?id=182","c3":"24","c41":"9","c42":"8","c43":"7","c5":"2","c6":"35"},{"c1":"10","c2":"维戈塞尔塔","c2L":"http://match.sports.sina.com.cn/football/team.php?id=165","c3":"23","c41":"10","c42":"4","c43":"9","c5":"0","c6":"34"}]
             * sheshoubang : [{"c1":"1","c2":"梅西","c2L":"http://match.sports.sina.com.cn/football/player.php?id=19054","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"20","c5":"3"},{"c1":"2","c2":"苏亚雷斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=39336","c3":"巴塞罗那","c3L":"http://match.sports.sina.com.cn/football/team.php?id=130","c4":"18","c5":"0"},{"c1":"3","c2":"C罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=14937","c3":"皇家马德里","c3L":"http://match.sports.sina.com.cn/football/team.php?id=157","c4":"16","c5":"5"},{"c1":"4","c2":"阿斯帕斯","c2L":"http://match.sports.sina.com.cn/football/player.php?id=40270","c3":"维戈塞尔塔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=165","c4":"13","c5":"2"},{"c1":"5","c2":"塞尔吉-恩里克","c2L":"http://match.sports.sina.com.cn/football/player.php?id=80791","c3":"埃瓦尔","c3L":"http://match.sports.sina.com.cn/football/team.php?id=4417","c4":"10","c5":"0"},{"c1":"6","c2":"格里兹曼","c2L":"http://match.sports.sina.com.cn/football/player.php?id=76650","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"0"},{"c1":"7","c2":"杰拉德","c2L":"http://match.sports.sina.com.cn/football/player.php?id=93721","c3":"西班牙人","c3L":"http://match.sports.sina.com.cn/football/team.php?id=182","c4":"9","c5":"0"},{"c1":"8","c2":"加梅罗","c2L":"http://match.sports.sina.com.cn/football/player.php?id=42779","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"9","c5":"1"},{"c1":"9","c2":"威利安","c2L":"http://match.sports.sina.com.cn/football/player.php?id=73314","c3":"皇家社会","c3L":"http://match.sports.sina.com.cn/football/team.php?id=160","c4":"9","c5":"2"},{"c1":"10","c2":"卡拉斯科","c2L":"http://match.sports.sina.com.cn/football/player.php?id=119718","c3":"马德里竞技","c3L":"http://match.sports.sina.com.cn/football/team.php?id=162","c4":"8","c5":"0"}]
             */

            private Object saicheng3;
            private List<Saicheng1Bean> saicheng1;
            private List<Saicheng2Bean> saicheng2;
            private List<JifenbangBean> jifenbang;
            private List<SheshoubangBean> sheshoubang;

            public Object getSaicheng3() {
                return saicheng3;
            }

            public void setSaicheng3(Object saicheng3) {
                this.saicheng3 = saicheng3;
            }

            public List<Saicheng1Bean> getSaicheng1() {
                return saicheng1;
            }

            public void setSaicheng1(List<Saicheng1Bean> saicheng1) {
                this.saicheng1 = saicheng1;
            }

            public List<Saicheng2Bean> getSaicheng2() {
                return saicheng2;
            }

            public void setSaicheng2(List<Saicheng2Bean> saicheng2) {
                this.saicheng2 = saicheng2;
            }

            public List<JifenbangBean> getJifenbang() {
                return jifenbang;
            }

            public void setJifenbang(List<JifenbangBean> jifenbang) {
                this.jifenbang = jifenbang;
            }

            public List<SheshoubangBean> getSheshoubang() {
                return sheshoubang;
            }

            public void setSheshoubang(List<SheshoubangBean> sheshoubang) {
                this.sheshoubang = sheshoubang;
            }

            public static class Saicheng1Bean {
                /**
                 * c1 : 已结束
                 * c2 : 02-25周六
                 * c3 : 03:45
                 * c4T1 : 拉斯帕尔马斯
                 * c4T1URL : http://match.sports.sina.com.cn/football/team.php?id=221
                 * c4R : 0-1
                 * c4T2 : 皇家社会
                 * c4T2URL : http://match.sports.sina.com.cn/football/team.php?id=160
                 * c51 : 全场统计
                 * c51Link : http://match.sports.sina.com.cn/livecast/g/live.php?id=149772
                 * c52 : 图文数据
                 * c52Link : http://match.sports.sina.com.cn/livecast/g/live.php?id=149772
                 * liveid : 869689
                 */

                private String c1;
                private String c2;
                private String c3;
                private String c4T1;
                private String c4T1URL;
                private String c4R;
                private String c4T2;
                private String c4T2URL;
                private String c51;
                private String c51Link;
                private String c52;
                private String c52Link;
                private String liveid;

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

                public String getC4R() {
                    return c4R;
                }

                public void setC4R(String c4R) {
                    this.c4R = c4R;
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

                public String getC51Link() {
                    return c51Link;
                }

                public void setC51Link(String c51Link) {
                    this.c51Link = c51Link;
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

                public String getLiveid() {
                    return liveid;
                }

                public void setLiveid(String liveid) {
                    this.liveid = liveid;
                }
            }

            public static class Saicheng2Bean {
                /**
                 * c1 : 未开赛
                 * c2 : 03-01周三
                 * c3 : 02:30
                 * c4T1 : 皇家社会
                 * c4T1URL : http://match.sports.sina.com.cn/football/team.php?id=160
                 * c4R : VS
                 * c4T2 : 埃瓦尔
                 * c4T2URL : http://match.sports.sina.com.cn/football/team.php?id=4417
                 * c51 : 视频暂无
                 * c51Link :
                 * c52 : 前瞻预测
                 * c52Link : http://match.sports.sina.com.cn/livecast/g/live.php?id=149784
                 * liveid : 869700
                 */

                private String c1;
                private String c2;
                private String c3;
                private String c4T1;
                private String c4T1URL;
                private String c4R;
                private String c4T2;
                private String c4T2URL;
                private String c51;
                private String c51Link;
                private String c52;
                private String c52Link;
                private String liveid;

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

                public String getC4R() {
                    return c4R;
                }

                public void setC4R(String c4R) {
                    this.c4R = c4R;
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

                public String getC51Link() {
                    return c51Link;
                }

                public void setC51Link(String c51Link) {
                    this.c51Link = c51Link;
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

                public String getLiveid() {
                    return liveid;
                }

                public void setLiveid(String liveid) {
                    this.liveid = liveid;
                }
            }

            public static class JifenbangBean {
                /**
                 * c1 : 1
                 * c2 : 皇家马德里
                 * c2L : http://match.sports.sina.com.cn/football/team.php?id=157
                 * c3 : 23
                 * c41 : 17
                 * c42 : 4
                 * c43 : 2
                 * c5 : 38
                 * c6 : 55
                 */

                private String c1;
                private String c2;
                private String c2L;
                private String c3;
                private String c41;
                private String c42;
                private String c43;
                private String c5;
                private String c6;

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

                public String getC2L() {
                    return c2L;
                }

                public void setC2L(String c2L) {
                    this.c2L = c2L;
                }

                public String getC3() {
                    return c3;
                }

                public void setC3(String c3) {
                    this.c3 = c3;
                }

                public String getC41() {
                    return c41;
                }

                public void setC41(String c41) {
                    this.c41 = c41;
                }

                public String getC42() {
                    return c42;
                }

                public void setC42(String c42) {
                    this.c42 = c42;
                }

                public String getC43() {
                    return c43;
                }

                public void setC43(String c43) {
                    this.c43 = c43;
                }

                public String getC5() {
                    return c5;
                }

                public void setC5(String c5) {
                    this.c5 = c5;
                }

                public String getC6() {
                    return c6;
                }

                public void setC6(String c6) {
                    this.c6 = c6;
                }
            }

            public static class SheshoubangBean {
                /**
                 * c1 : 1
                 * c2 : 梅西
                 * c2L : http://match.sports.sina.com.cn/football/player.php?id=19054
                 * c3 : 巴塞罗那
                 * c3L : http://match.sports.sina.com.cn/football/team.php?id=130
                 * c4 : 20
                 * c5 : 3
                 */

                private String c1;
                private String c2;
                private String c2L;
                private String c3;
                private String c3L;
                private String c4;
                private String c5;

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

                public String getC2L() {
                    return c2L;
                }

                public void setC2L(String c2L) {
                    this.c2L = c2L;
                }

                public String getC3() {
                    return c3;
                }

                public void setC3(String c3) {
                    this.c3 = c3;
                }

                public String getC3L() {
                    return c3L;
                }

                public void setC3L(String c3L) {
                    this.c3L = c3L;
                }

                public String getC4() {
                    return c4;
                }

                public void setC4(String c4) {
                    this.c4 = c4;
                }

                public String getC5() {
                    return c5;
                }

                public void setC5(String c5) {
                    this.c5 = c5;
                }
            }
        }
    }
}
