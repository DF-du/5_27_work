package com.dlf.a5_27_work.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class DatasBean {
    /**
     * id : 33
     * thumbnail : https://img.owspace.com/Public/uploads/Picture/2020-02-01/5e353606af2eb.jpeg
     * title : 单读·启示录
     * description : 如实写下了你们的所见所闻，这会是一份真挚而沉重的纪录，我们会留存它。
     * <p>
     * 投稿邮箱：anonymous@owspace.com
     * model : 11
     * uid : 1166183
     * name :
     * excerpt : “我们的机器生动得让人不安，我们自己却死气沉沉得让人恐惧。”
     * lead : 不管是蒂尔受 9·11 刺激后成立了 Palantir，还是比尔受智利之邀建立“赛博协同”项目；不管是前者为捍卫资本主义目标，还是后者为服务社会主义计划——这些计算机技术系统被称为“自由机器”。但现实中，“自由机器”无法避免地走向了自由的对立面。
     * 技术的发展不总是代表前进、解放，也可能将人类社会带向疯狂、病态。一个事实摆在了眼前，“数字利维坦”开启对人类的统治，我们活在德勒兹描绘的控制社会里。当每个行为都被追踪，权力对人的控制将更加持续、隐秘而精细。长此以往，我们还是所谓的人吗？
     * position : 0
     * create_time : 1590539400
     * update_time : 2020/05/27
     * tags : [{"name":""}]
     * status : 1
     * video :
     * fm :
     * link_url :
     * publish_time : 0
     * view : 1.7w
     * share : http://static.owspace.com/wap/296904.html
     * comment : 0
     * good : 7
     * bookmark : 0
     * show_uid : 1166183
     * fm_play :
     * lunar_type : 1
     * html5 : http://static.owspace.com/wap/296904.html
     * author : 冯骏原
     * tpl : 1
     * avatar : https://img.owspace.com/Public/static/avatar/2.png
     * category : TO READ
     * hot_comments : []
     * parseXML : 1
     * nickname :
     * total_url :
     */
    @Id
    private Long idl;
    private String id;
    private String thumbnail;
    private String title;
    private String description;
    private int model;
    private String uid;
    private String name;
    private String excerpt;
    private String lead;
    private String position;
    private String create_time;
    private String update_time;
    private String status;
    private String video;
    private String fm;
    private String link_url;
    private String publish_time;
    private String view;
    private String share;
    private String comment;
    private String good;
    private String bookmark;
    private String show_uid;
    private String fm_play;
    private String lunar_type;
    private String html5;
    private String author;
    private int tpl;
    private String avatar;
    private String category;
    private int parseXML;
    private String nickname;
    private String total_url;
    @Generated(hash = 1124528962)
    public DatasBean(Long idl, String id, String thumbnail, String title, String description, int model, String uid, String name,
            String excerpt, String lead, String position, String create_time, String update_time, String status, String video, String fm,
            String link_url, String publish_time, String view, String share, String comment, String good, String bookmark, String show_uid,
            String fm_play, String lunar_type, String html5, String author, int tpl, String avatar, String category, int parseXML,
            String nickname, String total_url) {
        this.idl = idl;
        this.id = id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
        this.model = model;
        this.uid = uid;
        this.name = name;
        this.excerpt = excerpt;
        this.lead = lead;
        this.position = position;
        this.create_time = create_time;
        this.update_time = update_time;
        this.status = status;
        this.video = video;
        this.fm = fm;
        this.link_url = link_url;
        this.publish_time = publish_time;
        this.view = view;
        this.share = share;
        this.comment = comment;
        this.good = good;
        this.bookmark = bookmark;
        this.show_uid = show_uid;
        this.fm_play = fm_play;
        this.lunar_type = lunar_type;
        this.html5 = html5;
        this.author = author;
        this.tpl = tpl;
        this.avatar = avatar;
        this.category = category;
        this.parseXML = parseXML;
        this.nickname = nickname;
        this.total_url = total_url;
    }
    @Generated(hash = 128729784)
    public DatasBean() {
    }
    public Long getIdl() {
        return this.idl;
    }
    public void setIdl(Long idl) {
        this.idl = idl;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getModel() {
        return this.model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public String getUid() {
        return this.uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExcerpt() {
        return this.excerpt;
    }
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }
    public String getLead() {
        return this.lead;
    }
    public void setLead(String lead) {
        this.lead = lead;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getCreate_time() {
        return this.create_time;
    }
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
    public String getUpdate_time() {
        return this.update_time;
    }
    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getVideo() {
        return this.video;
    }
    public void setVideo(String video) {
        this.video = video;
    }
    public String getFm() {
        return this.fm;
    }
    public void setFm(String fm) {
        this.fm = fm;
    }
    public String getLink_url() {
        return this.link_url;
    }
    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }
    public String getPublish_time() {
        return this.publish_time;
    }
    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }
    public String getView() {
        return this.view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public String getShare() {
        return this.share;
    }
    public void setShare(String share) {
        this.share = share;
    }
    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getGood() {
        return this.good;
    }
    public void setGood(String good) {
        this.good = good;
    }
    public String getBookmark() {
        return this.bookmark;
    }
    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }
    public String getShow_uid() {
        return this.show_uid;
    }
    public void setShow_uid(String show_uid) {
        this.show_uid = show_uid;
    }
    public String getFm_play() {
        return this.fm_play;
    }
    public void setFm_play(String fm_play) {
        this.fm_play = fm_play;
    }
    public String getLunar_type() {
        return this.lunar_type;
    }
    public void setLunar_type(String lunar_type) {
        this.lunar_type = lunar_type;
    }
    public String getHtml5() {
        return this.html5;
    }
    public void setHtml5(String html5) {
        this.html5 = html5;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getTpl() {
        return this.tpl;
    }
    public void setTpl(int tpl) {
        this.tpl = tpl;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getParseXML() {
        return this.parseXML;
    }
    public void setParseXML(int parseXML) {
        this.parseXML = parseXML;
    }
    public String getNickname() {
        return this.nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getTotal_url() {
        return this.total_url;
    }
    public void setTotal_url(String total_url) {
        this.total_url = total_url;
    }

    @Override
    public String toString() {
        return "DatasBean{" +
                "idl=" + idl +
                ", id='" + id + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", model=" + model +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", excerpt='" + excerpt + '\'' +
                ", lead='" + lead + '\'' +
                ", position='" + position + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", status='" + status + '\'' +
                ", video='" + video + '\'' +
                ", fm='" + fm + '\'' +
                ", link_url='" + link_url + '\'' +
                ", publish_time='" + publish_time + '\'' +
                ", view='" + view + '\'' +
                ", share='" + share + '\'' +
                ", comment='" + comment + '\'' +
                ", good='" + good + '\'' +
                ", bookmark='" + bookmark + '\'' +
                ", show_uid='" + show_uid + '\'' +
                ", fm_play='" + fm_play + '\'' +
                ", lunar_type='" + lunar_type + '\'' +
                ", html5='" + html5 + '\'' +
                ", author='" + author + '\'' +
                ", tpl=" + tpl +
                ", avatar='" + avatar + '\'' +
                ", category='" + category + '\'' +
                ", parseXML=" + parseXML +
                ", nickname='" + nickname + '\'' +
                ", total_url='" + total_url + '\'' +
                '}';
    }
}
