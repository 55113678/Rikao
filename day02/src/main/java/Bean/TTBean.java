package Bean;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class TTBean {


    /**
     * message : success
     * data : {"pc_feed_focus":[{"title":"罗兴亚难民潮：43.6万人涌入孟加拉 争抢救济物品艰难求生","display_url":"/group/6469986714803110158/","has_video":false,"image_url":"//p9.pstatp.com/origin/3e780007983660d6c1e1","has_image":true,"group_id":6469986714803110158,"media_url":"http://toutiao.com/m5784742177"},{"title":"2017国庆热门景点人潮预警 人少又好玩的去处？呵呵不存在的","display_url":"/group/6469978900545552654/","has_video":false,"image_url":"//p1.pstatp.com/origin/3e79000796dae5a7cd63","has_image":true,"group_id":6469978900545552654,"media_url":"http://toutiao.com/m5739097906"},{"title":"周冬雨娜扎柳岩红毯\u201c比美\u201d 吴京拄拐杖获岳云鹏护送","display_url":"/group/6469735394224112141/","has_video":false,"image_url":"//p1.pstatp.com/origin/3e7b00058f66123a954b","has_image":true,"group_id":6469735394224112141,"media_url":"http://toutiao.com/m50266454509"},{"title":"雷霆媒体日：新三巨头正式合体 威少主人范十足 瓜哥乔治尽显内秀","display_url":"/group/6469865442936324366/","has_video":false,"image_url":"//p3.pstatp.com/origin/3e7900059810bd8d8cfc","has_image":true,"group_id":6469865442936324366,"media_url":"http://toutiao.com/m5998410715"},{"title":"辽宁舰服役5周年 不可不知的10件事","display_url":"/group/6469637060859789838/","has_video":false,"image_url":"//p1.pstatp.com/origin/3e7a000298e281320743","has_image":true,"group_id":6469637060859789838,"media_url":"http://toutiao.com/m5786921589"},{"title":"香港女星都怎么保养的 你能从50岁的周慧敏脸上看到皱纹吗","display_url":"/group/6469877437638754573/","has_video":false,"image_url":"//p3.pstatp.com/origin/3e780005925e8a495fce","has_image":true,"group_id":6469877437638754573,"media_url":"http://toutiao.com/m5738017030"},{"title":"黄圣依产后复出秀干练短发造型，希望有一个全新的形象","display_url":"/group/6469349162545578509/","has_video":false,"image_url":"//p1.pstatp.com/origin/3e7b00039f7c64f6f75f","has_image":true,"group_id":6469349162545578509,"media_url":"http://toutiao.com/m50266454509"},{"title":"安倍晋三宣布将解散众院提前大选 称为突破国难","display_url":"/group/6469669236276543758/","has_video":false,"image_url":"//p1.pstatp.com/origin/3e7a00028eabfd840941","has_image":true,"group_id":6469669236276543758,"media_url":"http://toutiao.com/m5784742177"},{"title":"丁俊晖世界公开赛夺冠 除了130多万奖金还有三大纪录","display_url":"/group/6469507376270049549/","has_video":false,"image_url":"//p3.pstatp.com/origin/3e7b000375386b97f772","has_image":true,"group_id":6469507376270049549,"media_url":"http://toutiao.com/m1564293928517634"},{"title":"65万大奔掉坑里18天终被\u201c救出\u201d 施工方与车主达成和解","display_url":"/group/6469619876566450445/","has_video":false,"image_url":"//p3.pstatp.com/origin/3e7a00028fd2aaeb35fb","has_image":true,"group_id":6469619876566450445,"media_url":"http://toutiao.com/m5739097906"}]}
     */

    private String message;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<PcFeedFocusBean> pc_feed_focus;

        public List<PcFeedFocusBean> getPc_feed_focus() {
            return pc_feed_focus;
        }

        public void setPc_feed_focus(List<PcFeedFocusBean> pc_feed_focus) {
            this.pc_feed_focus = pc_feed_focus;
        }

        public static class PcFeedFocusBean {
            /**
             * title : 罗兴亚难民潮：43.6万人涌入孟加拉 争抢救济物品艰难求生
             * display_url : /group/6469986714803110158/
             * has_video : false
             * image_url : //p9.pstatp.com/origin/3e780007983660d6c1e1
             * has_image : true
             * group_id : 6469986714803110158
             * media_url : http://toutiao.com/m5784742177
             */

            private String title;
            private String display_url;
            private boolean has_video;
            private String image_url;
            private boolean has_image;
            private long group_id;
            private String media_url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDisplay_url() {
                return display_url;
            }

            public void setDisplay_url(String display_url) {
                this.display_url = display_url;
            }

            public boolean isHas_video() {
                return has_video;
            }

            public void setHas_video(boolean has_video) {
                this.has_video = has_video;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public boolean isHas_image() {
                return has_image;
            }

            public void setHas_image(boolean has_image) {
                this.has_image = has_image;
            }

            public long getGroup_id() {
                return group_id;
            }

            public void setGroup_id(long group_id) {
                this.group_id = group_id;
            }

            public String getMedia_url() {
                return media_url;
            }

            public void setMedia_url(String media_url) {
                this.media_url = media_url;
            }
        }
    }
}
