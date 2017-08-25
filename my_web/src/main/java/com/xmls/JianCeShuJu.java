package com.xmls;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.xmls.util.JaxbDateAdapter;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class JianCeShuJu {
	
	
    private Integer bianhao;
	@XmlElement(name = "Organ")
    private String organ;
	
    private Date createdate;
	
    private String inspect;
	
    private String isvisa;
	@XmlElement(name = "SanZhouZhiDongLiyinshu")
    private BigDecimal sanzhouzhidongliyinshu;
	@XmlElement(name = "BaoBiaoBianHao")
    private String baobiaobianhao;
	@XmlElement(name = "HaoPaiLeiBie")
    private String haopaileibie;
	@XmlElement(name = "HaoPaiHaoMa")
    private String haopaihaoma;
	@XmlElement(name = "DiPanHaoMa")
    private String dipanhaoma;
	@XmlElement(name = "FaDongJiHaoMa")
    private String fadongjihaoma;
	@XmlElement(name = "JianCeZhanDaiMa")
    private String jiancezhandaima;
	@XmlElement(name = "JianCeZhanMingCheng")
    private String jiancezhanmingcheng;
	@XmlElement(name = "Jianceleibie")
    private String jianceleibie;
	@XmlElement(name = "JianCeriqi")
    private Date jianceriqi;
	@XmlElement(name = "WeiXiuYeHuMingCheng")
    private String weixiuyehumingcheng;
	@XmlElement(name = "WeiXiuYeHuDaiMa")
    private String weixiuyehudaima;
	@XmlElement(name = "yehudizhi")
    private String yehudizhi;
	@XmlElement(name = "yehuyoubian")
    private String yehuyoubian;
	@XmlElement(name = "yehulianxidianhua")
    private String yehulianxidianhua;
	@XmlElement(name = "JianCeCiShu")
    private Integer jiancecishu;
	@XmlElement(name = "YinCheYuan")
    private String yincheyuan;
	@XmlElement(name = "edingniujugonglv")
    private BigDecimal edingniujugonglv;
	@XmlElement(name = "XiaoZhengQuDongLunShuChuGongLv")
    private BigDecimal xiaozhengqudonglunshuchugonglv;
	@XmlElement(name = "XiaoZhengQuDongLunShuChuGongLvYuEDingNiuJuGongLvBi")
    private BigDecimal xiaozhengqudonglunshuchugonglvyuedingniujugonglvbi;
	@XmlElement(name = "edinggonglv")
    private BigDecimal edinggonglv;
	@XmlElement(name = "XiaoZhengQuDongLunShuChuGongLvYuEDingNiuJuGongLvBipingjia")
    private String xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia;
	@XmlElement(name = "XiaoZhengQuDongLunShuChuGongLvYuEDingGongLvBi")
    private BigDecimal xiaozhengqudonglunshuchugonglvyuedinggonglvbi;
	@XmlElement(name = "XiaoZhengQuDongLunShuChuGongLvYuEDingGongLvBipingjia")
    private String xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia;
	@XmlElement(name = "YiZhouZhouHe")
    private BigDecimal yizhouzhouhe;
	@XmlElement(name = "YiZhouZhouHezuo")
    private BigDecimal yizhouzhouhezuo;
	@XmlElement(name = "YiZhouZhouHeyou")
    private BigDecimal yizhouzhouheyou;
	@XmlElement(name = "YiZhouZhouHepingjia")
    private String yizhouzhouhepingjia;
	@XmlElement(name = "ErZhouZhouHepingjia")
    private String erzhouzhouhepingjia;
	@XmlElement(name = "SanZhouZhouHepingjia")
    private String sanzhouzhouhepingjia;
	@XmlElement(name = "ErZhouZhouHezuo")
    private BigDecimal erzhouzhouhezuo;
	@XmlElement(name = "ErZhouZhouHeyou")
    private BigDecimal erzhouzhouheyou;
	@XmlElement(name = "SanZhouZhouHeyou")
    private BigDecimal sanzhouzhouheyou;
	@XmlElement(name = "SanZhouZhouHezuo")
    private BigDecimal sanzhouzhouhezuo;
	@XmlElement(name = "SanZhouZhouHe")
    private BigDecimal sanzhouzhouhe;
	@XmlElement(name = "ErZhouZhouHe")
    private BigDecimal erzhouzhouhe;
	@XmlElement(name = "SiZhouZhouHe")
    private BigDecimal sizhouzhouhe;
	@XmlElement(name = "ZhengCheXingCheZhiDong")
    private BigDecimal zhengchexingchezhidong;
	@XmlElement(name = "ZhengCheXingCheZhiDongpingjia")
    private String zhengchexingchezhidongpingjia;
	@XmlElement(name = "QianZhouXingCheZhiDong")
    private BigDecimal qianzhouxingchezhidong;
	@XmlElement(name = "YiZhouZhiDongLiZuo")
    private BigDecimal yizhouzhidonglizuo;
	@XmlElement(name = "YiZhouZhiDongLiYou")
    private BigDecimal yizhouzhidongliyou;
	@XmlElement(name = "ErZhouZhiDongLiYou")
    private BigDecimal erzhouzhidongliyou;
	@XmlElement(name = "ErZhouZhiDongLiZuo")
    private BigDecimal erzhouzhidonglizuo;
	@XmlElement(name = "SanZhouZhiDongLiZuo")
    private BigDecimal sanzhouzhidonglizuo;
	@XmlElement(name = "SanZhouZhiDongLiYou")
    private BigDecimal sanzhouzhidongliyou;
	@XmlElement(name = "SiZhouZhiDongLiYou")
    private BigDecimal sizhouzhidongliyou;
	@XmlElement(name = "SiZhouZhiDongLiZuo")
    private BigDecimal sizhouzhidonglizuo;
	@XmlElement(name = "YiZhouxingcheZhiDongLipingjia")
    private String yizhouxingchezhidonglipingjia;
	@XmlElement(name = "ErZhouxingcheZhiDongLipingjia")
    private String erzhouxingchezhidonglipingjia;
	@XmlElement(name = "SanZhouxingcheZhiDongLipingjia")
    private String sanzhouxingchezhidonglipingjia;
	@XmlElement(name = "YiZhouZhiDongLiPingHeng")
    private BigDecimal yizhouzhidonglipingheng;
	@XmlElement(name = "ErZhouZhiDongLiPingHeng")
    private BigDecimal erzhouzhidonglipingheng;
	@XmlElement(name = "SanZhouZhiDongLiPingHeng")
    private BigDecimal sanzhouzhidonglipingheng;
	@XmlElement(name = "SiZhouZhiDongLiPingHeng")
    private BigDecimal sizhouzhidonglipingheng;
	@XmlElement(name = "YiZhouZhiDongLiPingHengpingjia")
    private String yizhouzhidonglipinghengpingjia;
	@XmlElement(name = "ErZhouZhiDongLiPingHengpingjia")
    private String erzhouzhidonglipinghengpingjia;
	@XmlElement(name = "SanZhouZhiDongLiPingHengpingjia")
    private String sanzhouzhidonglipinghengpingjia;
	@XmlElement(name = "YiZhouCheLunZuZhiZuo")
    private BigDecimal yizhouchelunzuzhizuo;
	@XmlElement(name = "YiZhouCheLunZuZhiYou")
    private BigDecimal yizhouchelunzuzhiyou;
	@XmlElement(name = "ErZhouCheLunZuZhiYou")
    private BigDecimal erzhouchelunzuzhiyou;
	@XmlElement(name = "ErZhouCheLunZuZhiZuo")
    private BigDecimal erzhouchelunzuzhizuo;
	@XmlElement(name = "SanZhouCheLunZuZhiZuo")
    private BigDecimal sanzhouchelunzuzhizuo;
	@XmlElement(name = "SanZhouCheLunZuZhiYou")
    private BigDecimal sanzhouchelunzuzhiyou;
	@XmlElement(name = "SiZhouCheLunZuZhiYou")
    private BigDecimal sizhouchelunzuzhiyou;
	@XmlElement(name = "SiZhouCheLunZuZhiZuo")
    private BigDecimal sizhouchelunzuzhizuo;
	@XmlElement(name = "SanZhouCheLunZuZhiZuopingjia")
    private String sanzhouchelunzuzhizuopingjia;
	@XmlElement(name = "SanZhouCheLunZuZhiYoupingjia")
    private String sanzhouchelunzuzhiyoupingjia;
	@XmlElement(name = "ErZhouCheLunZuZhiYoupingjia")
    private String erzhouchelunzuzhiyoupingjia;
	@XmlElement(name = "ErZhouCheLunZuZhiZuopingjia")
    private String erzhouchelunzuzhizuopingjia;
	@XmlElement(name = "YiZhouCheLunZuZhiZuopingjia")
    private String yizhouchelunzuzhizuopingjia;
	@XmlElement(name = "YiZhouCheLunZuZhiYoupingjia")
    private String yizhouchelunzuzhiyoupingjia;
	@XmlElement(name = "ZhuCheZhiDong")
    private BigDecimal zhuchezhidong;
	@XmlElement(name = "ZhuCheZhiDongzuo")
    private BigDecimal zhuchezhidongzuo;
	@XmlElement(name = "ZhuCheZhiDongyou")
    private BigDecimal zhuchezhidongyou;
	@XmlElement(name = "ZhuCheZhiDongpingjia")
    private String zhuchezhidongpingjia;
	@XmlElement(name = "ZhiDongJuLi")
    private BigDecimal zhidongjuli;
	@XmlElement(name = "ZhiDongJuLipingjia")
    private String zhidongjulipingjia;
	@XmlElement(name = "ZhiDongJianSuDu")
    private BigDecimal zhidongjiansudu;
	@XmlElement(name = "ZhiDongJianSuDupingjia")
    private String zhidongjiansudupingjia;
	@XmlElement(name = "ZhiDongPaoPianLiangpingjia")
    private String zhidongpaopianliangpingjia;
	
    private BigDecimal zhidongpaopianliang;
	@XmlElement(name = "QianZhouXuanJiaXiaoLvZuo")
    private BigDecimal qianzhouxuanjiaxiaolvzuo;
	@XmlElement(name = "QianZhouXuanJiaXiaoLvYou")
    private BigDecimal qianzhouxuanjiaxiaolvyou;
	@XmlElement(name = "QianZhouXuanJiaXiaoLvpingjia")
    private String qianzhouxuanjiaxiaolvpingjia;
	@XmlElement(name = "HouZhouXuanJiaXiaoLvpingjia")
    private String houzhouxuanjiaxiaolvpingjia;
	@XmlElement(name = "HouZhouXuanJiaXiaoLvZuo")
    private BigDecimal houzhouxuanjiaxiaolvzuo;
	@XmlElement(name = "HouZhouXuanJiaXiaoLvYou")
    private BigDecimal houzhouxuanjiaxiaolvyou;
	@XmlElement(name = "HouZhouZuoYouXuanJiaXiaoLvCha")
    private BigDecimal houzhouzuoyouxuanjiaxiaolvcha;
	@XmlElement(name = "QianZhouZuoYouXuanJiaXiaoLvCha")
    private BigDecimal qianzhouzuoyouxuanjiaxiaolvcha;
	@XmlElement(name = "Tongzhouzuoyoulunchazhipingjia")
    private String tongzhouzuoyoulunchazhipingjia;
	@XmlElement(name = "ZuoDengFaGuangQiangDu")
    private BigDecimal zuodengfaguangqiangdu;
	@XmlElement(name = "YouDengFaGuangQiangDu")
    private BigDecimal youdengfaguangqiangdu;
	@XmlElement(name = "YouDengFaGuangQiangDupingjia")
    private String youdengfaguangqiangdupingjia;
	@XmlElement(name = "ZuoDengFaGuangQiangDupingjia")
    private String zuodengfaguangqiangdupingjia;
	@XmlElement(name = "ZuoJinGuangShangXiaPianYi")
    private BigDecimal zuojinguangshangxiapianyi;
	@XmlElement(name = "YouJinGuangShangXiaPianYi")
    private BigDecimal youjinguangshangxiapianyi;
	@XmlElement(name = "YouJinGuangShuiPingPianYi")
    private BigDecimal youjinguangshuipingpianyi;
	@XmlElement(name = "ZuoJinGuangShuiPingPianYi")
    private BigDecimal zuojinguangshuipingpianyi;
	@XmlElement(name = "ZuoYuanGuangShangXiaPianYi")
    private BigDecimal zuoyuanguangshangxiapianyi;
	@XmlElement(name = "ZuoYuanGuangShuiPingPianYi")
    private BigDecimal zuoyuanguangshuipingpianyi;
	@XmlElement(name = "YouYuanGuangShuiPingPianYi")
    private BigDecimal youyuanguangshuipingpianyi;
	@XmlElement(name = "YouYuanGuangShangXiaPianYi")
    private BigDecimal youyuanguangshangxiapianyi;
	@XmlElement(name = "YouYuanGuangShangXiaPianYipingjia")
    private String youyuanguangshangxiapianyipingjia;
	@XmlElement(name = "YouYuanGuangShuiPingPianYipingjia")
    private String youyuanguangshuipingpianyipingjia;
	@XmlElement(name = "ZuoYuanGuangShuiPingPianYipingjia")
    private String zuoyuanguangshuipingpianyipingjia;
	@XmlElement(name = "ZuoYuanGuangShangXiaPianYipingjia")
    private String zuoyuanguangshangxiapianyipingjia;
	@XmlElement(name = "ZuoJinGuangShuiPingPianYipingjia")
    private String zuojinguangshuipingpianyipingjia;
	@XmlElement(name = "YouJinGuangShuiPingPianYipingjia")
    private String youjinguangshuipingpianyipingjia;
	@XmlElement(name = "YouJinGuangShangXiaPianYipingjia")
    private String youjinguangshangxiapianyipingjia;
	@XmlElement(name = "ZuoJinGuangShangXiaPianYipingjia")
    private String zuojinguangshangxiapianyipingjia;
	@XmlElement(name = "DaiSuCOpingjia")
    private String daisucopingjia;
	@XmlElement(name = "DaiSuHCpingjia")
    private String daisuhcpingjia;
	@XmlElement(name = "DaiSuHC")
    private BigDecimal daisuhc;
	@XmlElement(name = "DaiSuCO")
    private BigDecimal daisuco;
	@XmlElement(name = "GaoDaiSuCO")
    private BigDecimal gaodaisuco;
	@XmlElement(name = "GaoDaiSuHC")
    private BigDecimal gaodaisuhc;
	@XmlElement(name = "GaoDaiSuHCpingjia")
    private String gaodaisuhcpingjia;
	@XmlElement(name = "GaoDaiSuCOpingjia")
    private String gaodaisucopingjia;
	
    private String shangxiantuxiang;
	@XmlElement(name = "CheSuBiaoShiZhiWuCha")
    private BigDecimal chesubiaoshizhiwucha;
	@XmlElement(name = "CheSuBiaoShiZhiWuChayinshu")
    private BigDecimal chesubiaoshizhiwuchayinshu;
	@XmlElement(name = "CheSuBiaoShiZhiWuChapingjia")
    private String chesubiaoshizhiwuchapingjia;
	@XmlElement(name = "ZuoZhuXiaoHouQing")
    private BigDecimal zuozhuxiaohouqing;
	@XmlElement(name = "YouZhuXiaoHouQing")
    private BigDecimal youzhuxiaohouqing;
	@XmlElement(name = "ZhuXiaoHouQingpingjia")
    private String zhuxiaohouqingpingjia;
	@XmlElement(name = "YouZhuXiaoNeiQing")
    private BigDecimal youzhuxiaoneiqing;
	@XmlElement(name = "ZuoZhuXiaoNeiQing")
    private BigDecimal zuozhuxiaoneiqing;
	@XmlElement(name = "ZhuXiaoNeiQingpingjia")
    private String zhuxiaoneiqingpingjia;
	@XmlElement(name = "YouQianLunWaiQing")
    private BigDecimal youqianlunwaiqing;
	@XmlElement(name = "ZuoQianLunWaiQing")
    private BigDecimal zuoqianlunwaiqing;
	@XmlElement(name = "QianLunWaiQingpingjia")
    private String qianlunwaiqingpingjia;
	@XmlElement(name = "CheLunQianShu")
    private BigDecimal chelunqianshu;
	@XmlElement(name = "CheLunQianShupingjia")
    private String chelunqianshupingjia;
	@XmlElement(name = "ZhuanXiangLunHengXiangCeHuaLiang")
    private BigDecimal zhuanxianglunhengxiangcehualiang;
	@XmlElement(name = "ZhuanXiangLunHengXiangCeHuaLiangpingjia")
    private String zhuanxianglunhengxiangcehualiangpingjia;
	@XmlElement(name = "ZhuanXiangPanZiYouZhuanDongLiangpingjia")
    private String zhuanxiangpanziyouzhuandongliangpingjia;
	@XmlElement(name = "ZhuanXiangPanZiYouZhuanDongLiang")
    private BigDecimal zhuanxiangpanziyouzhuandongliang;
	@XmlElement(name = "LaBaShengJi")
    private BigDecimal labashengji;
	@XmlElement(name = "LaBaShengJipingjia")
    private String labashengjipingjia;
	@XmlElement(name = "YanDupingjia")
    private String yandupingjia;
	@XmlElement(name = "YanDu")
    private BigDecimal yandu;
	@XmlElement(name = "GuangXiShouXiShu")
    private BigDecimal guangxishouxishu;
	@XmlElement(name = "GuangXiShouXiShupingjia")
    private String guangxishouxishupingjia;
	@XmlElement(name = "PingDingPingYu")
    private String pingdingpingyu;
	@XmlElement(name = "JianCeJieGuo")
    private String jiancejieguo;
	@XmlElement(name = "BiaoZhiXiang")
    private String biaozhixiang;
	@XmlElement(name = "GuoLiangKongQiXiShu")
    private BigDecimal guoliangkongqixishu;
	@XmlElement(name = "GuoLiangKongQiXiShupingjia")
    private String guoliangkongqixishupingjia;
	@XmlElement(name = "WaiJianYuan")
    private String waijianyuan;
	@XmlElement(name = "CheTiWaiYuanDuiChengGaoDuCha")
    private BigDecimal chetiwaiyuanduichenggaoducha;
	@XmlElement(name = "CheTiWaiYuanDuiChengGaoDuChapingjia")
    private String chetiwaiyuanduichenggaoduchapingjia;
	@XmlElement(name = "ZuoYouZhouJuChapingjia")
    private String zuoyouzhoujuchapingjia;
	@XmlElement(name = "ZuoYouZhouJuCha")
    private BigDecimal zuoyouzhoujucha;
	@XmlElement(name = "CheLiangHouXuan")
    private BigDecimal chelianghouxuan;
	@XmlElement(name = "CheLiangHouXuanpingjia")
    private String chelianghouxuanpingjia;
	@XmlElement(name = "WeiXingCheLunHuaWenShenDupingjia")
    private String weixingchelunhuawenshendupingjia;
	@XmlElement(name = "WeiXingCheLunHuaWenShenDu")
    private BigDecimal weixingchelunhuawenshendu;
	@XmlElement(name = "ZhuanXiangLunHuaWenShenDu")
    private BigDecimal zhuanxianglunhuawenshendu;
	@XmlElement(name = "ZhuanXiangLunHuaWenShenDupingjia")
    private String zhuanxianglunhuawenshendupingjia;
	@XmlElement(name = "QiTaLunTaiHuaWenShenDupingjia")
    private String qitaluntaihuawenshendupingjia;
	@XmlElement(name = "QiTaLunTaiHuaWenShenDu")
    private BigDecimal qitaluntaihuawenshendu;
	@XmlElement(name = "LiHeQiTaBanLi")
    private BigDecimal liheqitabanli;
	@XmlElement(name = "LiHeQiTaBanLipingjia")
    private String liheqitabanlipingjia;
	@XmlElement(name = "LiHeQiTaBanZiYouXingChengpingjia")
    private String liheqitabanziyouxingchengpingjia;
	@XmlElement(name = "ZhiDongTaBanZiYouXingCheng")
    private BigDecimal zhidongtabanziyouxingcheng;
	@XmlElement(name = "ZhiDongTaBanZiYouXingChengpingjia")
    private String zhidongtabanziyouxingchengpingjia;
	@XmlElement(name = "ZhiDongTaBanLipingjia")
    private String zhidongtabanlipingjia;
	@XmlElement(name = "ZhiDongTaBanLi")
    private BigDecimal zhidongtabanli;
	@XmlElement(name = "LiHeQiTaBanZiYouXingCheng")
    private BigDecimal liheqitabanziyouxingcheng;
	@XmlElement(name = "LunTaiQiYa")
    private BigDecimal luntaiqiya;
	@XmlElement(name = "LunTaiQiYapingjia")
    private String luntaiqiyapingjia;
	@XmlElement(name = "QianZhouZuoLunDongPingHengpingjia")
    private String qianzhouzuolundongpinghengpingjia;
	@XmlElement(name = "QianZhouZuoLunDongPingHeng")
    private BigDecimal qianzhouzuolundongpingheng;
	@XmlElement(name = "QianZhouYouLunDongPingHeng")
    private BigDecimal qianzhouyoulundongpingheng;
	@XmlElement(name = "QianZhouYouLunDongPingHengpingjia")
    private String qianzhouyoulundongpinghengpingjia;
	@XmlElement(name = "HouZhouYouLunDongPingHengpingjia")
    private String houzhouyoulundongpinghengpingjia;
	@XmlElement(name = "HouZhouZuoLunDongPingHengpingjia")
    private String houzhouzuolundongpinghengpingjia;
	@XmlElement(name = "HouZhouZuoLunDongPingHeng")
    private BigDecimal houzhouzuolundongpingheng;
	@XmlElement(name = "HouZhouYouLunDongPingHeng")
    private BigDecimal houzhouyoulundongpingheng;
	@XmlElement(name = "buhegexiangmudaima")
    private String buhegexiangmudaima;
	
	@XmlElement(name = "Fangyumifengxingpingjia")
    private String fangyumifengxingpingjia;
	@XmlElement(name = "Fangyumifengxing")
    private BigDecimal fangyumifengxing;
	@XmlElement(name = "Xiaqusheng")
    private String xiaqusheng;
	@XmlElement(name = "Xiaqushi")
    private String xiaqushi;
	@XmlElement(name = "Xiaquxian")
    private String xiaquxian;
	@XmlElement(name = "xiaquzhen")
    private String xiaquzhen;
	
    private String shifouqianzhang;
	
    private String qianzhangren;
	
    private Date qianzhangshijian;
	
    private String qianzhangdanwei;
	
    private String juqianyuanyin;
	@XmlElement(name = "Yehumingcheng")
    private String yehumingcheng;
	
    private Integer cheliangdiannaobianhao;
	@XmlElement(name = "Yingyunzhenghao")
    private String yingyunzhenghao;
	@XmlElement(name = "Chejiahaoma")
    private String chejiahaoma;
	@XmlElement(name = "Changpai")
    private String changpai;
	@XmlElement(name = "Xinghao")
    private String xinghao;
	@XmlElement(name = "Ranliao")
    private String ranliao;
	@XmlElement(name = "HeZaiZhiLianghuozaikeshu")
    private Integer hezaizhilianghuozaikeshu;
	@XmlElement(name = "Cheliangleibie")
    private String cheliangleibie;
	@XmlElement(name = "cheliangleixing")
    private String cheliangleixing;
	@XmlJavaTypeAdapter(JaxbDateAdapter.class)
	@XmlElement(name = "JianCeKaiShiShiJian")
    private Date jiancekaishishijian;
	@XmlJavaTypeAdapter(JaxbDateAdapter.class)
	@XmlElement(name = "JianCeJieShuShiJian")
    private Date jiancejieshushijian;
	@XmlElement(name = "Zhucedengjiriqi")
    private Date zhucedengjiriqi;
	@XmlElement(name = "ZhengCheXingCheZhiDongyinshu")
    private BigDecimal zhengchexingchezhidongyinshu;
	
    private BigDecimal yizhouxingchezhidongliyinshu;
	@XmlElement(name = "ErZhouXingCheZhiDongLiyinshu")
    private BigDecimal erzhouxingchezhidongliyinshu;
	
    private BigDecimal sanzhouxingchezhidongliyinshu;
	
    private BigDecimal sizhouxingchezhidongliyinshu;
	@XmlElement(name = "YiZhouZhiDongLiPingHengyinshu")
    private BigDecimal yizhouzhidonglipinghengyinshu;
	@XmlElement(name = "ErZhouZhiDongLiPingHengyinshu")
    private BigDecimal erzhouzhidonglipinghengyinshu;
	@XmlElement(name = "SanZhouZhiDongLiPingHengyinshu")
    private BigDecimal sanzhouzhidonglipinghengyinshu;
	@XmlElement(name = "SiZhouZhiDongLiPingHengyinshu")
    private BigDecimal sizhouzhidonglipinghengyinshu;
	@XmlElement(name = "YiZhouCheLunZuZhiZuoyinshu")
    private BigDecimal yizhouchelunzuzhizuoyinshu;
	@XmlElement(name = "YiZhouCheLunZuZhiYouyinshu")
    private BigDecimal yizhouchelunzuzhiyouyinshu;
	@XmlElement(name = "ErZhouCheLunZuZhiZuoyinshu")
    private BigDecimal erzhouchelunzuzhizuoyinshu;
	@XmlElement(name = "ErZhouCheLunZuZhiYouyinshu")
    private BigDecimal erzhouchelunzuzhiyouyinshu;
	@XmlElement(name = "SanZhouCheLunZuZhiZuoyinshu")
    private BigDecimal sanzhouchelunzuzhizuoyinshu;
	@XmlElement(name = "SanZhouCheLunZuZhiYouyinshu")
    private BigDecimal sanzhouchelunzuzhiyouyinshu;
	@XmlElement(name = "SiZhouCheLunZuZhiZuoyinshu")
    private BigDecimal sizhouchelunzuzhizuoyinshu;
	@XmlElement(name = "SiZhouCheLunZuZhiYouyinshu")
    private BigDecimal sizhouchelunzuzhiyouyinshu;
	@XmlElement(name = "ZhuCheZhiDongyinshu")
    private BigDecimal zhuchezhidongyinshu;
	@XmlElement(name = "Yizhouzhidongliquxian")
    private String yizhouzhidongliquxian;
	@XmlElement(name = "Erzhouzhidongliquxian")
    private String erzhouzhidongliquxian;
	@XmlElement(name = "Sanzhouzhidongliquxian")
    private String sanzhouzhidongliquxian;
	@XmlElement(name = "Sizhouzhidongliquxian")
    private String sizhouzhidongliquxian;
	@XmlElement(name = "GongLvquxiantuxiang")
    private String gonglvquxiantuxiang;
	@XmlElement(name = "Qianzhouzuoxuanjiaquxian")
    private String qianzhouzuoxuanjiaquxian;
	@XmlElement(name = "qianzhouyouxuanjiaquxian")
    private String qianzhouyouxuanjiaquxian;
	@XmlElement(name = "houzhouzuoxuanjiaquxian")
    private String houzhouzuoxuanjiaquxian;
	@XmlElement(name = "houzhouyouxuanjiaquxian")
    private String houzhouyouxuanjiaquxian;
	@XmlElement(name = "SiZhouZhouHezuo")
    private BigDecimal sizhouzhouhezuo;
	@XmlElement(name = "SiZhouZhouHeyou")
    private BigDecimal sizhouzhouheyou;
	@XmlElement(name = "SiZhouZhouHepingjia")
    private String sizhouzhouhepingjia;
	@XmlElement(name = "SiZhouxingcheZhiDongLipingjia")
    private String sizhouxingchezhidonglipingjia;
	@XmlElement(name = "SiZhouZhiDongLiPingHengpingjia")
    private String sizhouzhidonglipinghengpingjia;
	@XmlElement(name = "SiZhouCheLunZuZhiYoupingjia")
    private String sizhouchelunzuzhiyoupingjia;
	@XmlElement(name = "SiZhouCheLunZuZhiZuopingjia")
    private String sizhouchelunzuzhizuopingjia;
	@XmlElement(name = "waijianzongpingjia")
    private String waijianzongpingjia;
	
    private Date shujushangchuanshijian;
	@XmlElement(name = "Shifoupaopian")
    private String shifoupaopian;
	@XmlElement(name = "ASM5025CO")
    private BigDecimal asm5025co;
	@XmlElement(name = "ASM5025COpingjia")
    private String asm5025copingjia;
	@XmlElement(name = "ASM5025HC")
    private BigDecimal asm5025hc;
	@XmlElement(name = "ASM5025HCpingjia")
    private String asm5025hcpingjia;
	@XmlElement(name = "ASM5025NO")
    private BigDecimal asm5025no;
	@XmlElement(name = "ASM5025NOpingjia")
    private String asm5025nopingjia;
	@XmlElement(name = "ASM2540CO")
    private BigDecimal asm2540co;
	@XmlElement(name = "ASM2540COpingjia")
    private String asm2540copingjia;
	@XmlElement(name = "ASM2540HC")
    private BigDecimal asm2540hc;
	@XmlElement(name = "ASM540HCpingjia")
    private String asm540hcpingjia;
	@XmlElement(name = "ASM2540NO")
    private BigDecimal asm2540no;
	@XmlElement(name = "ASM2540NOpingjia")
    private String asm2540nopingjia;
	@XmlElement(name = "ASMpingjia")
    private String asmpingjia;
	@XmlElement(name = "LUGDK100")
    private BigDecimal lugdk100;
	@XmlElement(name = "LUGDK100pingjia")
    private String lugdk100pingjia;
	@XmlElement(name = "LUGDK90")
    private BigDecimal lugdk90;
	@XmlElement(name = "LUGDK90pingjia")
    private String lugdk90pingjia;
	@XmlElement(name = "LUGDK80")
    private BigDecimal lugdk80;
	@XmlElement(name = "LUGDK80pingjia")
    private String lugdk80pingjia;
	@XmlElement(name = "LUGDMaxPower")
    private BigDecimal lugdmaxpower;
	@XmlElement(name = "LUGDMaxPowerRev")
    private BigDecimal lugdmaxpowerrev;
	@XmlElement(name = "LUGDpingjia")
    private String lugdpingjia;
	@XmlElement(name = "VMASHC")
    private BigDecimal vmashc;
	@XmlElement(name = "VMASHCpingjia")
    private String vmashcpingjia;
	@XmlElement(name = "VMASCO")
    private BigDecimal vmasco;
	@XmlElement(name = "VMASCOpingjia")
    private String vmascopingjia;
	@XmlElement(name = "VMASNO")
    private BigDecimal vmasno;
	@XmlElement(name = "VMASNOpingjia")
    private String vmasnopingjia;
	@XmlElement(name = "VMASpingjia")
    private String vmaspingjia;
	
    private String sysZhengbenfuwuqiming;
	
    private String sysZhengbenshujukuming;
	
    private String sysXinzengdenglurenid;
	
    private String sysXinzengdengluren;
	
    private String sysXinzengrenid;
	
    private String sysXinzengren;
	
    private Date sysXinzengshijian;
	
    private String sysZuijinxiugaidenglurenid;
	
    private String sysZuijinxiugaidengluren;
	
    private String sysZuijinxiugairenid;
	
    private String sysZuijinxiugairen;
	
    private Date sysZuijinxiugaishijian;
	
    private String sysXitongzhuangtai;
	
    private String sysZuijinshoulihao;
	
    private String sysXitongbeizhu;
	
    private Date sysShijianchuo;
	
    private BigDecimal yizhouzhidongliyinshu;
	
    private Integer upvisa;
    public Integer getBianhao() {
        return bianhao;
    }

    public void setBianhao(Integer bianhao) {
        this.bianhao = bianhao;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ == null ? null : organ.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect == null ? null : inspect.trim();
    }

    public String getIsvisa() {
        return isvisa;
    }

    public void setIsvisa(String isvisa) {
        this.isvisa = isvisa == null ? null : isvisa.trim();
    }

    public BigDecimal getSanzhouzhidongliyinshu() {
        return sanzhouzhidongliyinshu;
    }

    public void setSanzhouzhidongliyinshu(BigDecimal sanzhouzhidongliyinshu) {
        this.sanzhouzhidongliyinshu = sanzhouzhidongliyinshu;
    }

    public String getBaobiaobianhao() {
        return baobiaobianhao;
    }

    public void setBaobiaobianhao(String baobiaobianhao) {
        this.baobiaobianhao = baobiaobianhao == null ? null : baobiaobianhao.trim();
    }

    public String getHaopaileibie() {
        return haopaileibie;
    }

    public void setHaopaileibie(String haopaileibie) {
        this.haopaileibie = haopaileibie == null ? null : haopaileibie.trim();
    }

    public String getHaopaihaoma() {
        return haopaihaoma;
    }

    public void setHaopaihaoma(String haopaihaoma) {
        this.haopaihaoma = haopaihaoma == null ? null : haopaihaoma.trim();
    }

    public String getDipanhaoma() {
        return dipanhaoma;
    }

    public void setDipanhaoma(String dipanhaoma) {
        this.dipanhaoma = dipanhaoma == null ? null : dipanhaoma.trim();
    }

    public String getFadongjihaoma() {
        return fadongjihaoma;
    }

    public void setFadongjihaoma(String fadongjihaoma) {
        this.fadongjihaoma = fadongjihaoma == null ? null : fadongjihaoma.trim();
    }

    public String getJiancezhandaima() {
        return jiancezhandaima;
    }

    public void setJiancezhandaima(String jiancezhandaima) {
        this.jiancezhandaima = jiancezhandaima == null ? null : jiancezhandaima.trim();
    }

    public String getJiancezhanmingcheng() {
        return jiancezhanmingcheng;
    }

    public void setJiancezhanmingcheng(String jiancezhanmingcheng) {
        this.jiancezhanmingcheng = jiancezhanmingcheng == null ? null : jiancezhanmingcheng.trim();
    }

    public String getJianceleibie() {
        return jianceleibie;
    }

    public void setJianceleibie(String jianceleibie) {
        this.jianceleibie = jianceleibie == null ? null : jianceleibie.trim();
    }

    public Date getJianceriqi() {
        return jianceriqi;
    }

    public void setJianceriqi(Date jianceriqi) {
        this.jianceriqi = jianceriqi;
    }

    public String getWeixiuyehumingcheng() {
        return weixiuyehumingcheng;
    }

    public void setWeixiuyehumingcheng(String weixiuyehumingcheng) {
        this.weixiuyehumingcheng = weixiuyehumingcheng == null ? null : weixiuyehumingcheng.trim();
    }

    public String getWeixiuyehudaima() {
        return weixiuyehudaima;
    }

    public void setWeixiuyehudaima(String weixiuyehudaima) {
        this.weixiuyehudaima = weixiuyehudaima == null ? null : weixiuyehudaima.trim();
    }

    public String getYehudizhi() {
        return yehudizhi;
    }

    public void setYehudizhi(String yehudizhi) {
        this.yehudizhi = yehudizhi == null ? null : yehudizhi.trim();
    }

    public String getYehuyoubian() {
        return yehuyoubian;
    }

    public void setYehuyoubian(String yehuyoubian) {
        this.yehuyoubian = yehuyoubian == null ? null : yehuyoubian.trim();
    }

    public String getYehulianxidianhua() {
        return yehulianxidianhua;
    }

    public void setYehulianxidianhua(String yehulianxidianhua) {
        this.yehulianxidianhua = yehulianxidianhua == null ? null : yehulianxidianhua.trim();
    }

    public Integer getJiancecishu() {
        return jiancecishu;
    }

    public void setJiancecishu(Integer jiancecishu) {
        this.jiancecishu = jiancecishu;
    }

    public String getYincheyuan() {
        return yincheyuan;
    }

    public void setYincheyuan(String yincheyuan) {
        this.yincheyuan = yincheyuan == null ? null : yincheyuan.trim();
    }

    public BigDecimal getEdingniujugonglv() {
        return edingniujugonglv;
    }

    public void setEdingniujugonglv(BigDecimal edingniujugonglv) {
        this.edingniujugonglv = edingniujugonglv;
    }

    public BigDecimal getXiaozhengqudonglunshuchugonglv() {
        return xiaozhengqudonglunshuchugonglv;
    }

    public void setXiaozhengqudonglunshuchugonglv(BigDecimal xiaozhengqudonglunshuchugonglv) {
        this.xiaozhengqudonglunshuchugonglv = xiaozhengqudonglunshuchugonglv;
    }

    public BigDecimal getXiaozhengqudonglunshuchugonglvyuedingniujugonglvbi() {
        return xiaozhengqudonglunshuchugonglvyuedingniujugonglvbi;
    }

    public void setXiaozhengqudonglunshuchugonglvyuedingniujugonglvbi(BigDecimal xiaozhengqudonglunshuchugonglvyuedingniujugonglvbi) {
        this.xiaozhengqudonglunshuchugonglvyuedingniujugonglvbi = xiaozhengqudonglunshuchugonglvyuedingniujugonglvbi;
    }

    public BigDecimal getEdinggonglv() {
        return edinggonglv;
    }

    public void setEdinggonglv(BigDecimal edinggonglv) {
        this.edinggonglv = edinggonglv;
    }

    public String getXiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia() {
        return xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia;
    }

    public void setXiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia(String xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia) {
        this.xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia = xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia == null ? null : xiaozhengqudonglunshuchugonglvyuedingniujugonglvbipingjia.trim();
    }

    public BigDecimal getXiaozhengqudonglunshuchugonglvyuedinggonglvbi() {
        return xiaozhengqudonglunshuchugonglvyuedinggonglvbi;
    }

    public void setXiaozhengqudonglunshuchugonglvyuedinggonglvbi(BigDecimal xiaozhengqudonglunshuchugonglvyuedinggonglvbi) {
        this.xiaozhengqudonglunshuchugonglvyuedinggonglvbi = xiaozhengqudonglunshuchugonglvyuedinggonglvbi;
    }

    public String getXiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia() {
        return xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia;
    }

    public void setXiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia(String xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia) {
        this.xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia = xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia == null ? null : xiaozhengqudonglunshuchugonglvyuedinggonglvbipingjia.trim();
    }

    public BigDecimal getYizhouzhouhe() {
        return yizhouzhouhe;
    }

    public void setYizhouzhouhe(BigDecimal yizhouzhouhe) {
        this.yizhouzhouhe = yizhouzhouhe;
    }

    public BigDecimal getYizhouzhouhezuo() {
        return yizhouzhouhezuo;
    }

    public void setYizhouzhouhezuo(BigDecimal yizhouzhouhezuo) {
        this.yizhouzhouhezuo = yizhouzhouhezuo;
    }

    public BigDecimal getYizhouzhouheyou() {
        return yizhouzhouheyou;
    }

    public void setYizhouzhouheyou(BigDecimal yizhouzhouheyou) {
        this.yizhouzhouheyou = yizhouzhouheyou;
    }

    public String getYizhouzhouhepingjia() {
        return yizhouzhouhepingjia;
    }

    public void setYizhouzhouhepingjia(String yizhouzhouhepingjia) {
        this.yizhouzhouhepingjia = yizhouzhouhepingjia == null ? null : yizhouzhouhepingjia.trim();
    }

    public String getErzhouzhouhepingjia() {
        return erzhouzhouhepingjia;
    }

    public void setErzhouzhouhepingjia(String erzhouzhouhepingjia) {
        this.erzhouzhouhepingjia = erzhouzhouhepingjia == null ? null : erzhouzhouhepingjia.trim();
    }

    public String getSanzhouzhouhepingjia() {
        return sanzhouzhouhepingjia;
    }

    public void setSanzhouzhouhepingjia(String sanzhouzhouhepingjia) {
        this.sanzhouzhouhepingjia = sanzhouzhouhepingjia == null ? null : sanzhouzhouhepingjia.trim();
    }

    public BigDecimal getErzhouzhouhezuo() {
        return erzhouzhouhezuo;
    }

    public void setErzhouzhouhezuo(BigDecimal erzhouzhouhezuo) {
        this.erzhouzhouhezuo = erzhouzhouhezuo;
    }

    public BigDecimal getErzhouzhouheyou() {
        return erzhouzhouheyou;
    }

    public void setErzhouzhouheyou(BigDecimal erzhouzhouheyou) {
        this.erzhouzhouheyou = erzhouzhouheyou;
    }

    public BigDecimal getSanzhouzhouheyou() {
        return sanzhouzhouheyou;
    }

    public void setSanzhouzhouheyou(BigDecimal sanzhouzhouheyou) {
        this.sanzhouzhouheyou = sanzhouzhouheyou;
    }

    public BigDecimal getSanzhouzhouhezuo() {
        return sanzhouzhouhezuo;
    }

    public void setSanzhouzhouhezuo(BigDecimal sanzhouzhouhezuo) {
        this.sanzhouzhouhezuo = sanzhouzhouhezuo;
    }

    public BigDecimal getSanzhouzhouhe() {
        return sanzhouzhouhe;
    }

    public void setSanzhouzhouhe(BigDecimal sanzhouzhouhe) {
        this.sanzhouzhouhe = sanzhouzhouhe;
    }

    public BigDecimal getErzhouzhouhe() {
        return erzhouzhouhe;
    }

    public void setErzhouzhouhe(BigDecimal erzhouzhouhe) {
        this.erzhouzhouhe = erzhouzhouhe;
    }

    public BigDecimal getSizhouzhouhe() {
        return sizhouzhouhe;
    }

    public void setSizhouzhouhe(BigDecimal sizhouzhouhe) {
        this.sizhouzhouhe = sizhouzhouhe;
    }

    public BigDecimal getZhengchexingchezhidong() {
        return zhengchexingchezhidong;
    }

    public void setZhengchexingchezhidong(BigDecimal zhengchexingchezhidong) {
        this.zhengchexingchezhidong = zhengchexingchezhidong;
    }

    public String getZhengchexingchezhidongpingjia() {
        return zhengchexingchezhidongpingjia;
    }

    public void setZhengchexingchezhidongpingjia(String zhengchexingchezhidongpingjia) {
        this.zhengchexingchezhidongpingjia = zhengchexingchezhidongpingjia == null ? null : zhengchexingchezhidongpingjia.trim();
    }

    public BigDecimal getQianzhouxingchezhidong() {
        return qianzhouxingchezhidong;
    }

    public void setQianzhouxingchezhidong(BigDecimal qianzhouxingchezhidong) {
        this.qianzhouxingchezhidong = qianzhouxingchezhidong;
    }

    public BigDecimal getYizhouzhidonglizuo() {
        return yizhouzhidonglizuo;
    }

    public void setYizhouzhidonglizuo(BigDecimal yizhouzhidonglizuo) {
        this.yizhouzhidonglizuo = yizhouzhidonglizuo;
    }

    public BigDecimal getYizhouzhidongliyou() {
        return yizhouzhidongliyou;
    }

    public void setYizhouzhidongliyou(BigDecimal yizhouzhidongliyou) {
        this.yizhouzhidongliyou = yizhouzhidongliyou;
    }

    public BigDecimal getErzhouzhidongliyou() {
        return erzhouzhidongliyou;
    }

    public void setErzhouzhidongliyou(BigDecimal erzhouzhidongliyou) {
        this.erzhouzhidongliyou = erzhouzhidongliyou;
    }

    public BigDecimal getErzhouzhidonglizuo() {
        return erzhouzhidonglizuo;
    }

    public void setErzhouzhidonglizuo(BigDecimal erzhouzhidonglizuo) {
        this.erzhouzhidonglizuo = erzhouzhidonglizuo;
    }

    public BigDecimal getSanzhouzhidonglizuo() {
        return sanzhouzhidonglizuo;
    }

    public void setSanzhouzhidonglizuo(BigDecimal sanzhouzhidonglizuo) {
        this.sanzhouzhidonglizuo = sanzhouzhidonglizuo;
    }

    public BigDecimal getSanzhouzhidongliyou() {
        return sanzhouzhidongliyou;
    }

    public void setSanzhouzhidongliyou(BigDecimal sanzhouzhidongliyou) {
        this.sanzhouzhidongliyou = sanzhouzhidongliyou;
    }

    public BigDecimal getSizhouzhidongliyou() {
        return sizhouzhidongliyou;
    }

    public void setSizhouzhidongliyou(BigDecimal sizhouzhidongliyou) {
        this.sizhouzhidongliyou = sizhouzhidongliyou;
    }

    public BigDecimal getSizhouzhidonglizuo() {
        return sizhouzhidonglizuo;
    }

    public void setSizhouzhidonglizuo(BigDecimal sizhouzhidonglizuo) {
        this.sizhouzhidonglizuo = sizhouzhidonglizuo;
    }

    public String getYizhouxingchezhidonglipingjia() {
        return yizhouxingchezhidonglipingjia;
    }

    public void setYizhouxingchezhidonglipingjia(String yizhouxingchezhidonglipingjia) {
        this.yizhouxingchezhidonglipingjia = yizhouxingchezhidonglipingjia == null ? null : yizhouxingchezhidonglipingjia.trim();
    }

    public String getErzhouxingchezhidonglipingjia() {
        return erzhouxingchezhidonglipingjia;
    }

    public void setErzhouxingchezhidonglipingjia(String erzhouxingchezhidonglipingjia) {
        this.erzhouxingchezhidonglipingjia = erzhouxingchezhidonglipingjia == null ? null : erzhouxingchezhidonglipingjia.trim();
    }

    public String getSanzhouxingchezhidonglipingjia() {
        return sanzhouxingchezhidonglipingjia;
    }

    public void setSanzhouxingchezhidonglipingjia(String sanzhouxingchezhidonglipingjia) {
        this.sanzhouxingchezhidonglipingjia = sanzhouxingchezhidonglipingjia == null ? null : sanzhouxingchezhidonglipingjia.trim();
    }

    public BigDecimal getYizhouzhidonglipingheng() {
        return yizhouzhidonglipingheng;
    }

    public void setYizhouzhidonglipingheng(BigDecimal yizhouzhidonglipingheng) {
        this.yizhouzhidonglipingheng = yizhouzhidonglipingheng;
    }

    public BigDecimal getErzhouzhidonglipingheng() {
        return erzhouzhidonglipingheng;
    }

    public void setErzhouzhidonglipingheng(BigDecimal erzhouzhidonglipingheng) {
        this.erzhouzhidonglipingheng = erzhouzhidonglipingheng;
    }

    public BigDecimal getSanzhouzhidonglipingheng() {
        return sanzhouzhidonglipingheng;
    }

    public void setSanzhouzhidonglipingheng(BigDecimal sanzhouzhidonglipingheng) {
        this.sanzhouzhidonglipingheng = sanzhouzhidonglipingheng;
    }

    public BigDecimal getSizhouzhidonglipingheng() {
        return sizhouzhidonglipingheng;
    }

    public void setSizhouzhidonglipingheng(BigDecimal sizhouzhidonglipingheng) {
        this.sizhouzhidonglipingheng = sizhouzhidonglipingheng;
    }

    public String getYizhouzhidonglipinghengpingjia() {
        return yizhouzhidonglipinghengpingjia;
    }

    public void setYizhouzhidonglipinghengpingjia(String yizhouzhidonglipinghengpingjia) {
        this.yizhouzhidonglipinghengpingjia = yizhouzhidonglipinghengpingjia == null ? null : yizhouzhidonglipinghengpingjia.trim();
    }

    public String getErzhouzhidonglipinghengpingjia() {
        return erzhouzhidonglipinghengpingjia;
    }

    public void setErzhouzhidonglipinghengpingjia(String erzhouzhidonglipinghengpingjia) {
        this.erzhouzhidonglipinghengpingjia = erzhouzhidonglipinghengpingjia == null ? null : erzhouzhidonglipinghengpingjia.trim();
    }

    public String getSanzhouzhidonglipinghengpingjia() {
        return sanzhouzhidonglipinghengpingjia;
    }

    public void setSanzhouzhidonglipinghengpingjia(String sanzhouzhidonglipinghengpingjia) {
        this.sanzhouzhidonglipinghengpingjia = sanzhouzhidonglipinghengpingjia == null ? null : sanzhouzhidonglipinghengpingjia.trim();
    }

    public BigDecimal getYizhouchelunzuzhizuo() {
        return yizhouchelunzuzhizuo;
    }

    public void setYizhouchelunzuzhizuo(BigDecimal yizhouchelunzuzhizuo) {
        this.yizhouchelunzuzhizuo = yizhouchelunzuzhizuo;
    }

    public BigDecimal getYizhouchelunzuzhiyou() {
        return yizhouchelunzuzhiyou;
    }

    public void setYizhouchelunzuzhiyou(BigDecimal yizhouchelunzuzhiyou) {
        this.yizhouchelunzuzhiyou = yizhouchelunzuzhiyou;
    }

    public BigDecimal getErzhouchelunzuzhiyou() {
        return erzhouchelunzuzhiyou;
    }

    public void setErzhouchelunzuzhiyou(BigDecimal erzhouchelunzuzhiyou) {
        this.erzhouchelunzuzhiyou = erzhouchelunzuzhiyou;
    }

    public BigDecimal getErzhouchelunzuzhizuo() {
        return erzhouchelunzuzhizuo;
    }

    public void setErzhouchelunzuzhizuo(BigDecimal erzhouchelunzuzhizuo) {
        this.erzhouchelunzuzhizuo = erzhouchelunzuzhizuo;
    }

    public BigDecimal getSanzhouchelunzuzhizuo() {
        return sanzhouchelunzuzhizuo;
    }

    public void setSanzhouchelunzuzhizuo(BigDecimal sanzhouchelunzuzhizuo) {
        this.sanzhouchelunzuzhizuo = sanzhouchelunzuzhizuo;
    }

    public BigDecimal getSanzhouchelunzuzhiyou() {
        return sanzhouchelunzuzhiyou;
    }

    public void setSanzhouchelunzuzhiyou(BigDecimal sanzhouchelunzuzhiyou) {
        this.sanzhouchelunzuzhiyou = sanzhouchelunzuzhiyou;
    }

    public BigDecimal getSizhouchelunzuzhiyou() {
        return sizhouchelunzuzhiyou;
    }

    public void setSizhouchelunzuzhiyou(BigDecimal sizhouchelunzuzhiyou) {
        this.sizhouchelunzuzhiyou = sizhouchelunzuzhiyou;
    }

    public BigDecimal getSizhouchelunzuzhizuo() {
        return sizhouchelunzuzhizuo;
    }

    public void setSizhouchelunzuzhizuo(BigDecimal sizhouchelunzuzhizuo) {
        this.sizhouchelunzuzhizuo = sizhouchelunzuzhizuo;
    }

    public String getSanzhouchelunzuzhizuopingjia() {
        return sanzhouchelunzuzhizuopingjia;
    }

    public void setSanzhouchelunzuzhizuopingjia(String sanzhouchelunzuzhizuopingjia) {
        this.sanzhouchelunzuzhizuopingjia = sanzhouchelunzuzhizuopingjia == null ? null : sanzhouchelunzuzhizuopingjia.trim();
    }

    public String getSanzhouchelunzuzhiyoupingjia() {
        return sanzhouchelunzuzhiyoupingjia;
    }

    public void setSanzhouchelunzuzhiyoupingjia(String sanzhouchelunzuzhiyoupingjia) {
        this.sanzhouchelunzuzhiyoupingjia = sanzhouchelunzuzhiyoupingjia == null ? null : sanzhouchelunzuzhiyoupingjia.trim();
    }

    public String getErzhouchelunzuzhiyoupingjia() {
        return erzhouchelunzuzhiyoupingjia;
    }

    public void setErzhouchelunzuzhiyoupingjia(String erzhouchelunzuzhiyoupingjia) {
        this.erzhouchelunzuzhiyoupingjia = erzhouchelunzuzhiyoupingjia == null ? null : erzhouchelunzuzhiyoupingjia.trim();
    }

    public String getErzhouchelunzuzhizuopingjia() {
        return erzhouchelunzuzhizuopingjia;
    }

    public void setErzhouchelunzuzhizuopingjia(String erzhouchelunzuzhizuopingjia) {
        this.erzhouchelunzuzhizuopingjia = erzhouchelunzuzhizuopingjia == null ? null : erzhouchelunzuzhizuopingjia.trim();
    }

    public String getYizhouchelunzuzhizuopingjia() {
        return yizhouchelunzuzhizuopingjia;
    }

    public void setYizhouchelunzuzhizuopingjia(String yizhouchelunzuzhizuopingjia) {
        this.yizhouchelunzuzhizuopingjia = yizhouchelunzuzhizuopingjia == null ? null : yizhouchelunzuzhizuopingjia.trim();
    }

    public String getYizhouchelunzuzhiyoupingjia() {
        return yizhouchelunzuzhiyoupingjia;
    }

    public void setYizhouchelunzuzhiyoupingjia(String yizhouchelunzuzhiyoupingjia) {
        this.yizhouchelunzuzhiyoupingjia = yizhouchelunzuzhiyoupingjia == null ? null : yizhouchelunzuzhiyoupingjia.trim();
    }

    public BigDecimal getZhuchezhidong() {
        return zhuchezhidong;
    }

    public void setZhuchezhidong(BigDecimal zhuchezhidong) {
        this.zhuchezhidong = zhuchezhidong;
    }

    public BigDecimal getZhuchezhidongzuo() {
        return zhuchezhidongzuo;
    }

    public void setZhuchezhidongzuo(BigDecimal zhuchezhidongzuo) {
        this.zhuchezhidongzuo = zhuchezhidongzuo;
    }

    public BigDecimal getZhuchezhidongyou() {
        return zhuchezhidongyou;
    }

    public void setZhuchezhidongyou(BigDecimal zhuchezhidongyou) {
        this.zhuchezhidongyou = zhuchezhidongyou;
    }

    public String getZhuchezhidongpingjia() {
        return zhuchezhidongpingjia;
    }

    public void setZhuchezhidongpingjia(String zhuchezhidongpingjia) {
        this.zhuchezhidongpingjia = zhuchezhidongpingjia == null ? null : zhuchezhidongpingjia.trim();
    }

    public BigDecimal getZhidongjuli() {
        return zhidongjuli;
    }

    public void setZhidongjuli(BigDecimal zhidongjuli) {
        this.zhidongjuli = zhidongjuli;
    }

    public String getZhidongjulipingjia() {
        return zhidongjulipingjia;
    }

    public void setZhidongjulipingjia(String zhidongjulipingjia) {
        this.zhidongjulipingjia = zhidongjulipingjia == null ? null : zhidongjulipingjia.trim();
    }

    public BigDecimal getZhidongjiansudu() {
        return zhidongjiansudu;
    }

    public void setZhidongjiansudu(BigDecimal zhidongjiansudu) {
        this.zhidongjiansudu = zhidongjiansudu;
    }

    public String getZhidongjiansudupingjia() {
        return zhidongjiansudupingjia;
    }

    public void setZhidongjiansudupingjia(String zhidongjiansudupingjia) {
        this.zhidongjiansudupingjia = zhidongjiansudupingjia == null ? null : zhidongjiansudupingjia.trim();
    }

    public String getZhidongpaopianliangpingjia() {
        return zhidongpaopianliangpingjia;
    }

    public void setZhidongpaopianliangpingjia(String zhidongpaopianliangpingjia) {
        this.zhidongpaopianliangpingjia = zhidongpaopianliangpingjia == null ? null : zhidongpaopianliangpingjia.trim();
    }

    public BigDecimal getZhidongpaopianliang() {
        return zhidongpaopianliang;
    }

    public void setZhidongpaopianliang(BigDecimal zhidongpaopianliang) {
        this.zhidongpaopianliang = zhidongpaopianliang;
    }

    public BigDecimal getQianzhouxuanjiaxiaolvzuo() {
        return qianzhouxuanjiaxiaolvzuo;
    }

    public void setQianzhouxuanjiaxiaolvzuo(BigDecimal qianzhouxuanjiaxiaolvzuo) {
        this.qianzhouxuanjiaxiaolvzuo = qianzhouxuanjiaxiaolvzuo;
    }

    public BigDecimal getQianzhouxuanjiaxiaolvyou() {
        return qianzhouxuanjiaxiaolvyou;
    }

    public void setQianzhouxuanjiaxiaolvyou(BigDecimal qianzhouxuanjiaxiaolvyou) {
        this.qianzhouxuanjiaxiaolvyou = qianzhouxuanjiaxiaolvyou;
    }

    public String getQianzhouxuanjiaxiaolvpingjia() {
        return qianzhouxuanjiaxiaolvpingjia;
    }

    public void setQianzhouxuanjiaxiaolvpingjia(String qianzhouxuanjiaxiaolvpingjia) {
        this.qianzhouxuanjiaxiaolvpingjia = qianzhouxuanjiaxiaolvpingjia == null ? null : qianzhouxuanjiaxiaolvpingjia.trim();
    }

    public String getHouzhouxuanjiaxiaolvpingjia() {
        return houzhouxuanjiaxiaolvpingjia;
    }

    public void setHouzhouxuanjiaxiaolvpingjia(String houzhouxuanjiaxiaolvpingjia) {
        this.houzhouxuanjiaxiaolvpingjia = houzhouxuanjiaxiaolvpingjia == null ? null : houzhouxuanjiaxiaolvpingjia.trim();
    }

    public BigDecimal getHouzhouxuanjiaxiaolvzuo() {
        return houzhouxuanjiaxiaolvzuo;
    }

    public void setHouzhouxuanjiaxiaolvzuo(BigDecimal houzhouxuanjiaxiaolvzuo) {
        this.houzhouxuanjiaxiaolvzuo = houzhouxuanjiaxiaolvzuo;
    }

    public BigDecimal getHouzhouxuanjiaxiaolvyou() {
        return houzhouxuanjiaxiaolvyou;
    }

    public void setHouzhouxuanjiaxiaolvyou(BigDecimal houzhouxuanjiaxiaolvyou) {
        this.houzhouxuanjiaxiaolvyou = houzhouxuanjiaxiaolvyou;
    }

    public BigDecimal getHouzhouzuoyouxuanjiaxiaolvcha() {
        return houzhouzuoyouxuanjiaxiaolvcha;
    }

    public void setHouzhouzuoyouxuanjiaxiaolvcha(BigDecimal houzhouzuoyouxuanjiaxiaolvcha) {
        this.houzhouzuoyouxuanjiaxiaolvcha = houzhouzuoyouxuanjiaxiaolvcha;
    }

    public BigDecimal getQianzhouzuoyouxuanjiaxiaolvcha() {
        return qianzhouzuoyouxuanjiaxiaolvcha;
    }

    public void setQianzhouzuoyouxuanjiaxiaolvcha(BigDecimal qianzhouzuoyouxuanjiaxiaolvcha) {
        this.qianzhouzuoyouxuanjiaxiaolvcha = qianzhouzuoyouxuanjiaxiaolvcha;
    }

    public String getTongzhouzuoyoulunchazhipingjia() {
        return tongzhouzuoyoulunchazhipingjia;
    }

    public void setTongzhouzuoyoulunchazhipingjia(String tongzhouzuoyoulunchazhipingjia) {
        this.tongzhouzuoyoulunchazhipingjia = tongzhouzuoyoulunchazhipingjia == null ? null : tongzhouzuoyoulunchazhipingjia.trim();
    }

    public BigDecimal getZuodengfaguangqiangdu() {
        return zuodengfaguangqiangdu;
    }

    public void setZuodengfaguangqiangdu(BigDecimal zuodengfaguangqiangdu) {
        this.zuodengfaguangqiangdu = zuodengfaguangqiangdu;
    }

    public BigDecimal getYoudengfaguangqiangdu() {
        return youdengfaguangqiangdu;
    }

    public void setYoudengfaguangqiangdu(BigDecimal youdengfaguangqiangdu) {
        this.youdengfaguangqiangdu = youdengfaguangqiangdu;
    }

    public String getYoudengfaguangqiangdupingjia() {
        return youdengfaguangqiangdupingjia;
    }

    public void setYoudengfaguangqiangdupingjia(String youdengfaguangqiangdupingjia) {
        this.youdengfaguangqiangdupingjia = youdengfaguangqiangdupingjia == null ? null : youdengfaguangqiangdupingjia.trim();
    }

    public String getZuodengfaguangqiangdupingjia() {
        return zuodengfaguangqiangdupingjia;
    }

    public void setZuodengfaguangqiangdupingjia(String zuodengfaguangqiangdupingjia) {
        this.zuodengfaguangqiangdupingjia = zuodengfaguangqiangdupingjia == null ? null : zuodengfaguangqiangdupingjia.trim();
    }

    public BigDecimal getZuojinguangshangxiapianyi() {
        return zuojinguangshangxiapianyi;
    }

    public void setZuojinguangshangxiapianyi(BigDecimal zuojinguangshangxiapianyi) {
        this.zuojinguangshangxiapianyi = zuojinguangshangxiapianyi;
    }

    public BigDecimal getYoujinguangshangxiapianyi() {
        return youjinguangshangxiapianyi;
    }

    public void setYoujinguangshangxiapianyi(BigDecimal youjinguangshangxiapianyi) {
        this.youjinguangshangxiapianyi = youjinguangshangxiapianyi;
    }

    public BigDecimal getYoujinguangshuipingpianyi() {
        return youjinguangshuipingpianyi;
    }

    public void setYoujinguangshuipingpianyi(BigDecimal youjinguangshuipingpianyi) {
        this.youjinguangshuipingpianyi = youjinguangshuipingpianyi;
    }

    public BigDecimal getZuojinguangshuipingpianyi() {
        return zuojinguangshuipingpianyi;
    }

    public void setZuojinguangshuipingpianyi(BigDecimal zuojinguangshuipingpianyi) {
        this.zuojinguangshuipingpianyi = zuojinguangshuipingpianyi;
    }

    public BigDecimal getZuoyuanguangshangxiapianyi() {
        return zuoyuanguangshangxiapianyi;
    }

    public void setZuoyuanguangshangxiapianyi(BigDecimal zuoyuanguangshangxiapianyi) {
        this.zuoyuanguangshangxiapianyi = zuoyuanguangshangxiapianyi;
    }

    public BigDecimal getZuoyuanguangshuipingpianyi() {
        return zuoyuanguangshuipingpianyi;
    }

    public void setZuoyuanguangshuipingpianyi(BigDecimal zuoyuanguangshuipingpianyi) {
        this.zuoyuanguangshuipingpianyi = zuoyuanguangshuipingpianyi;
    }

    public BigDecimal getYouyuanguangshuipingpianyi() {
        return youyuanguangshuipingpianyi;
    }

    public void setYouyuanguangshuipingpianyi(BigDecimal youyuanguangshuipingpianyi) {
        this.youyuanguangshuipingpianyi = youyuanguangshuipingpianyi;
    }

    public BigDecimal getYouyuanguangshangxiapianyi() {
        return youyuanguangshangxiapianyi;
    }

    public void setYouyuanguangshangxiapianyi(BigDecimal youyuanguangshangxiapianyi) {
        this.youyuanguangshangxiapianyi = youyuanguangshangxiapianyi;
    }

    public String getYouyuanguangshangxiapianyipingjia() {
        return youyuanguangshangxiapianyipingjia;
    }

    public void setYouyuanguangshangxiapianyipingjia(String youyuanguangshangxiapianyipingjia) {
        this.youyuanguangshangxiapianyipingjia = youyuanguangshangxiapianyipingjia == null ? null : youyuanguangshangxiapianyipingjia.trim();
    }

    public String getYouyuanguangshuipingpianyipingjia() {
        return youyuanguangshuipingpianyipingjia;
    }

    public void setYouyuanguangshuipingpianyipingjia(String youyuanguangshuipingpianyipingjia) {
        this.youyuanguangshuipingpianyipingjia = youyuanguangshuipingpianyipingjia == null ? null : youyuanguangshuipingpianyipingjia.trim();
    }

    public String getZuoyuanguangshuipingpianyipingjia() {
        return zuoyuanguangshuipingpianyipingjia;
    }

    public void setZuoyuanguangshuipingpianyipingjia(String zuoyuanguangshuipingpianyipingjia) {
        this.zuoyuanguangshuipingpianyipingjia = zuoyuanguangshuipingpianyipingjia == null ? null : zuoyuanguangshuipingpianyipingjia.trim();
    }

    public String getZuoyuanguangshangxiapianyipingjia() {
        return zuoyuanguangshangxiapianyipingjia;
    }

    public void setZuoyuanguangshangxiapianyipingjia(String zuoyuanguangshangxiapianyipingjia) {
        this.zuoyuanguangshangxiapianyipingjia = zuoyuanguangshangxiapianyipingjia == null ? null : zuoyuanguangshangxiapianyipingjia.trim();
    }

    public String getZuojinguangshuipingpianyipingjia() {
        return zuojinguangshuipingpianyipingjia;
    }

    public void setZuojinguangshuipingpianyipingjia(String zuojinguangshuipingpianyipingjia) {
        this.zuojinguangshuipingpianyipingjia = zuojinguangshuipingpianyipingjia == null ? null : zuojinguangshuipingpianyipingjia.trim();
    }

    public String getYoujinguangshuipingpianyipingjia() {
        return youjinguangshuipingpianyipingjia;
    }

    public void setYoujinguangshuipingpianyipingjia(String youjinguangshuipingpianyipingjia) {
        this.youjinguangshuipingpianyipingjia = youjinguangshuipingpianyipingjia == null ? null : youjinguangshuipingpianyipingjia.trim();
    }

    public String getYoujinguangshangxiapianyipingjia() {
        return youjinguangshangxiapianyipingjia;
    }

    public void setYoujinguangshangxiapianyipingjia(String youjinguangshangxiapianyipingjia) {
        this.youjinguangshangxiapianyipingjia = youjinguangshangxiapianyipingjia == null ? null : youjinguangshangxiapianyipingjia.trim();
    }

    public String getZuojinguangshangxiapianyipingjia() {
        return zuojinguangshangxiapianyipingjia;
    }

    public void setZuojinguangshangxiapianyipingjia(String zuojinguangshangxiapianyipingjia) {
        this.zuojinguangshangxiapianyipingjia = zuojinguangshangxiapianyipingjia == null ? null : zuojinguangshangxiapianyipingjia.trim();
    }

    public String getDaisucopingjia() {
        return daisucopingjia;
    }

    public void setDaisucopingjia(String daisucopingjia) {
        this.daisucopingjia = daisucopingjia == null ? null : daisucopingjia.trim();
    }

    public String getDaisuhcpingjia() {
        return daisuhcpingjia;
    }

    public void setDaisuhcpingjia(String daisuhcpingjia) {
        this.daisuhcpingjia = daisuhcpingjia == null ? null : daisuhcpingjia.trim();
    }

    public BigDecimal getDaisuhc() {
        return daisuhc;
    }

    public void setDaisuhc(BigDecimal daisuhc) {
        this.daisuhc = daisuhc;
    }

    public BigDecimal getDaisuco() {
        return daisuco;
    }

    public void setDaisuco(BigDecimal daisuco) {
        this.daisuco = daisuco;
    }

    public BigDecimal getGaodaisuco() {
        return gaodaisuco;
    }

    public void setGaodaisuco(BigDecimal gaodaisuco) {
        this.gaodaisuco = gaodaisuco;
    }

    public BigDecimal getGaodaisuhc() {
        return gaodaisuhc;
    }

    public void setGaodaisuhc(BigDecimal gaodaisuhc) {
        this.gaodaisuhc = gaodaisuhc;
    }

    public String getGaodaisuhcpingjia() {
        return gaodaisuhcpingjia;
    }

    public void setGaodaisuhcpingjia(String gaodaisuhcpingjia) {
        this.gaodaisuhcpingjia = gaodaisuhcpingjia == null ? null : gaodaisuhcpingjia.trim();
    }

    public String getGaodaisucopingjia() {
        return gaodaisucopingjia;
    }

    public void setGaodaisucopingjia(String gaodaisucopingjia) {
        this.gaodaisucopingjia = gaodaisucopingjia == null ? null : gaodaisucopingjia.trim();
    }

    public String getShangxiantuxiang() {
        return shangxiantuxiang;
    }

    public void setShangxiantuxiang(String shangxiantuxiang) {
        this.shangxiantuxiang = shangxiantuxiang == null ? null : shangxiantuxiang.trim();
    }

    public BigDecimal getChesubiaoshizhiwucha() {
        return chesubiaoshizhiwucha;
    }

    public void setChesubiaoshizhiwucha(BigDecimal chesubiaoshizhiwucha) {
        this.chesubiaoshizhiwucha = chesubiaoshizhiwucha;
    }

    public BigDecimal getChesubiaoshizhiwuchayinshu() {
        return chesubiaoshizhiwuchayinshu;
    }

    public void setChesubiaoshizhiwuchayinshu(BigDecimal chesubiaoshizhiwuchayinshu) {
        this.chesubiaoshizhiwuchayinshu = chesubiaoshizhiwuchayinshu;
    }

    public String getChesubiaoshizhiwuchapingjia() {
        return chesubiaoshizhiwuchapingjia;
    }

    public void setChesubiaoshizhiwuchapingjia(String chesubiaoshizhiwuchapingjia) {
        this.chesubiaoshizhiwuchapingjia = chesubiaoshizhiwuchapingjia == null ? null : chesubiaoshizhiwuchapingjia.trim();
    }

    public BigDecimal getZuozhuxiaohouqing() {
        return zuozhuxiaohouqing;
    }

    public void setZuozhuxiaohouqing(BigDecimal zuozhuxiaohouqing) {
        this.zuozhuxiaohouqing = zuozhuxiaohouqing;
    }

    public BigDecimal getYouzhuxiaohouqing() {
        return youzhuxiaohouqing;
    }

    public void setYouzhuxiaohouqing(BigDecimal youzhuxiaohouqing) {
        this.youzhuxiaohouqing = youzhuxiaohouqing;
    }

    public String getZhuxiaohouqingpingjia() {
        return zhuxiaohouqingpingjia;
    }

    public void setZhuxiaohouqingpingjia(String zhuxiaohouqingpingjia) {
        this.zhuxiaohouqingpingjia = zhuxiaohouqingpingjia == null ? null : zhuxiaohouqingpingjia.trim();
    }

    public BigDecimal getYouzhuxiaoneiqing() {
        return youzhuxiaoneiqing;
    }

    public void setYouzhuxiaoneiqing(BigDecimal youzhuxiaoneiqing) {
        this.youzhuxiaoneiqing = youzhuxiaoneiqing;
    }

    public BigDecimal getZuozhuxiaoneiqing() {
        return zuozhuxiaoneiqing;
    }

    public void setZuozhuxiaoneiqing(BigDecimal zuozhuxiaoneiqing) {
        this.zuozhuxiaoneiqing = zuozhuxiaoneiqing;
    }

    public String getZhuxiaoneiqingpingjia() {
        return zhuxiaoneiqingpingjia;
    }

    public void setZhuxiaoneiqingpingjia(String zhuxiaoneiqingpingjia) {
        this.zhuxiaoneiqingpingjia = zhuxiaoneiqingpingjia == null ? null : zhuxiaoneiqingpingjia.trim();
    }

    public BigDecimal getYouqianlunwaiqing() {
        return youqianlunwaiqing;
    }

    public void setYouqianlunwaiqing(BigDecimal youqianlunwaiqing) {
        this.youqianlunwaiqing = youqianlunwaiqing;
    }

    public BigDecimal getZuoqianlunwaiqing() {
        return zuoqianlunwaiqing;
    }

    public void setZuoqianlunwaiqing(BigDecimal zuoqianlunwaiqing) {
        this.zuoqianlunwaiqing = zuoqianlunwaiqing;
    }

    public String getQianlunwaiqingpingjia() {
        return qianlunwaiqingpingjia;
    }

    public void setQianlunwaiqingpingjia(String qianlunwaiqingpingjia) {
        this.qianlunwaiqingpingjia = qianlunwaiqingpingjia == null ? null : qianlunwaiqingpingjia.trim();
    }

    public BigDecimal getChelunqianshu() {
        return chelunqianshu;
    }

    public void setChelunqianshu(BigDecimal chelunqianshu) {
        this.chelunqianshu = chelunqianshu;
    }

    public String getChelunqianshupingjia() {
        return chelunqianshupingjia;
    }

    public void setChelunqianshupingjia(String chelunqianshupingjia) {
        this.chelunqianshupingjia = chelunqianshupingjia == null ? null : chelunqianshupingjia.trim();
    }

    public BigDecimal getZhuanxianglunhengxiangcehualiang() {
        return zhuanxianglunhengxiangcehualiang;
    }

    public void setZhuanxianglunhengxiangcehualiang(BigDecimal zhuanxianglunhengxiangcehualiang) {
        this.zhuanxianglunhengxiangcehualiang = zhuanxianglunhengxiangcehualiang;
    }

    public String getZhuanxianglunhengxiangcehualiangpingjia() {
        return zhuanxianglunhengxiangcehualiangpingjia;
    }

    public void setZhuanxianglunhengxiangcehualiangpingjia(String zhuanxianglunhengxiangcehualiangpingjia) {
        this.zhuanxianglunhengxiangcehualiangpingjia = zhuanxianglunhengxiangcehualiangpingjia == null ? null : zhuanxianglunhengxiangcehualiangpingjia.trim();
    }

    public String getZhuanxiangpanziyouzhuandongliangpingjia() {
        return zhuanxiangpanziyouzhuandongliangpingjia;
    }

    public void setZhuanxiangpanziyouzhuandongliangpingjia(String zhuanxiangpanziyouzhuandongliangpingjia) {
        this.zhuanxiangpanziyouzhuandongliangpingjia = zhuanxiangpanziyouzhuandongliangpingjia == null ? null : zhuanxiangpanziyouzhuandongliangpingjia.trim();
    }

    public BigDecimal getZhuanxiangpanziyouzhuandongliang() {
        return zhuanxiangpanziyouzhuandongliang;
    }

    public void setZhuanxiangpanziyouzhuandongliang(BigDecimal zhuanxiangpanziyouzhuandongliang) {
        this.zhuanxiangpanziyouzhuandongliang = zhuanxiangpanziyouzhuandongliang;
    }

    public BigDecimal getLabashengji() {
        return labashengji;
    }

    public void setLabashengji(BigDecimal labashengji) {
        this.labashengji = labashengji;
    }

    public String getLabashengjipingjia() {
        return labashengjipingjia;
    }

    public void setLabashengjipingjia(String labashengjipingjia) {
        this.labashengjipingjia = labashengjipingjia == null ? null : labashengjipingjia.trim();
    }

    public String getYandupingjia() {
        return yandupingjia;
    }

    public void setYandupingjia(String yandupingjia) {
        this.yandupingjia = yandupingjia == null ? null : yandupingjia.trim();
    }

    public BigDecimal getYandu() {
        return yandu;
    }

    public void setYandu(BigDecimal yandu) {
        this.yandu = yandu;
    }

    public BigDecimal getGuangxishouxishu() {
        return guangxishouxishu;
    }

    public void setGuangxishouxishu(BigDecimal guangxishouxishu) {
        this.guangxishouxishu = guangxishouxishu;
    }

    public String getGuangxishouxishupingjia() {
        return guangxishouxishupingjia;
    }

    public void setGuangxishouxishupingjia(String guangxishouxishupingjia) {
        this.guangxishouxishupingjia = guangxishouxishupingjia == null ? null : guangxishouxishupingjia.trim();
    }

    public String getPingdingpingyu() {
        return pingdingpingyu;
    }

    public void setPingdingpingyu(String pingdingpingyu) {
        this.pingdingpingyu = pingdingpingyu == null ? null : pingdingpingyu.trim();
    }

    public String getJiancejieguo() {
        return jiancejieguo;
    }

    public void setJiancejieguo(String jiancejieguo) {
        this.jiancejieguo = jiancejieguo == null ? null : jiancejieguo.trim();
    }

    public String getBiaozhixiang() {
        return biaozhixiang;
    }

    public void setBiaozhixiang(String biaozhixiang) {
        this.biaozhixiang = biaozhixiang == null ? null : biaozhixiang.trim();
    }

    public BigDecimal getGuoliangkongqixishu() {
        return guoliangkongqixishu;
    }

    public void setGuoliangkongqixishu(BigDecimal guoliangkongqixishu) {
        this.guoliangkongqixishu = guoliangkongqixishu;
    }

    public String getGuoliangkongqixishupingjia() {
        return guoliangkongqixishupingjia;
    }

    public void setGuoliangkongqixishupingjia(String guoliangkongqixishupingjia) {
        this.guoliangkongqixishupingjia = guoliangkongqixishupingjia == null ? null : guoliangkongqixishupingjia.trim();
    }

    public String getWaijianyuan() {
        return waijianyuan;
    }

    public void setWaijianyuan(String waijianyuan) {
        this.waijianyuan = waijianyuan == null ? null : waijianyuan.trim();
    }

    public BigDecimal getChetiwaiyuanduichenggaoducha() {
        return chetiwaiyuanduichenggaoducha;
    }

    public void setChetiwaiyuanduichenggaoducha(BigDecimal chetiwaiyuanduichenggaoducha) {
        this.chetiwaiyuanduichenggaoducha = chetiwaiyuanduichenggaoducha;
    }

    public String getChetiwaiyuanduichenggaoduchapingjia() {
        return chetiwaiyuanduichenggaoduchapingjia;
    }

    public void setChetiwaiyuanduichenggaoduchapingjia(String chetiwaiyuanduichenggaoduchapingjia) {
        this.chetiwaiyuanduichenggaoduchapingjia = chetiwaiyuanduichenggaoduchapingjia == null ? null : chetiwaiyuanduichenggaoduchapingjia.trim();
    }

    public String getZuoyouzhoujuchapingjia() {
        return zuoyouzhoujuchapingjia;
    }

    public void setZuoyouzhoujuchapingjia(String zuoyouzhoujuchapingjia) {
        this.zuoyouzhoujuchapingjia = zuoyouzhoujuchapingjia == null ? null : zuoyouzhoujuchapingjia.trim();
    }

    public BigDecimal getZuoyouzhoujucha() {
        return zuoyouzhoujucha;
    }

    public void setZuoyouzhoujucha(BigDecimal zuoyouzhoujucha) {
        this.zuoyouzhoujucha = zuoyouzhoujucha;
    }

    public BigDecimal getChelianghouxuan() {
        return chelianghouxuan;
    }

    public void setChelianghouxuan(BigDecimal chelianghouxuan) {
        this.chelianghouxuan = chelianghouxuan;
    }

    public String getChelianghouxuanpingjia() {
        return chelianghouxuanpingjia;
    }

    public void setChelianghouxuanpingjia(String chelianghouxuanpingjia) {
        this.chelianghouxuanpingjia = chelianghouxuanpingjia == null ? null : chelianghouxuanpingjia.trim();
    }

    public String getWeixingchelunhuawenshendupingjia() {
        return weixingchelunhuawenshendupingjia;
    }

    public void setWeixingchelunhuawenshendupingjia(String weixingchelunhuawenshendupingjia) {
        this.weixingchelunhuawenshendupingjia = weixingchelunhuawenshendupingjia == null ? null : weixingchelunhuawenshendupingjia.trim();
    }

    public BigDecimal getWeixingchelunhuawenshendu() {
        return weixingchelunhuawenshendu;
    }

    public void setWeixingchelunhuawenshendu(BigDecimal weixingchelunhuawenshendu) {
        this.weixingchelunhuawenshendu = weixingchelunhuawenshendu;
    }

    public BigDecimal getZhuanxianglunhuawenshendu() {
        return zhuanxianglunhuawenshendu;
    }

    public void setZhuanxianglunhuawenshendu(BigDecimal zhuanxianglunhuawenshendu) {
        this.zhuanxianglunhuawenshendu = zhuanxianglunhuawenshendu;
    }

    public String getZhuanxianglunhuawenshendupingjia() {
        return zhuanxianglunhuawenshendupingjia;
    }

    public void setZhuanxianglunhuawenshendupingjia(String zhuanxianglunhuawenshendupingjia) {
        this.zhuanxianglunhuawenshendupingjia = zhuanxianglunhuawenshendupingjia == null ? null : zhuanxianglunhuawenshendupingjia.trim();
    }

    public String getQitaluntaihuawenshendupingjia() {
        return qitaluntaihuawenshendupingjia;
    }

    public void setQitaluntaihuawenshendupingjia(String qitaluntaihuawenshendupingjia) {
        this.qitaluntaihuawenshendupingjia = qitaluntaihuawenshendupingjia == null ? null : qitaluntaihuawenshendupingjia.trim();
    }

    public BigDecimal getQitaluntaihuawenshendu() {
        return qitaluntaihuawenshendu;
    }

    public void setQitaluntaihuawenshendu(BigDecimal qitaluntaihuawenshendu) {
        this.qitaluntaihuawenshendu = qitaluntaihuawenshendu;
    }

    public BigDecimal getLiheqitabanli() {
        return liheqitabanli;
    }

    public void setLiheqitabanli(BigDecimal liheqitabanli) {
        this.liheqitabanli = liheqitabanli;
    }

    public String getLiheqitabanlipingjia() {
        return liheqitabanlipingjia;
    }

    public void setLiheqitabanlipingjia(String liheqitabanlipingjia) {
        this.liheqitabanlipingjia = liheqitabanlipingjia == null ? null : liheqitabanlipingjia.trim();
    }

    public String getLiheqitabanziyouxingchengpingjia() {
        return liheqitabanziyouxingchengpingjia;
    }

    public void setLiheqitabanziyouxingchengpingjia(String liheqitabanziyouxingchengpingjia) {
        this.liheqitabanziyouxingchengpingjia = liheqitabanziyouxingchengpingjia == null ? null : liheqitabanziyouxingchengpingjia.trim();
    }

    public BigDecimal getZhidongtabanziyouxingcheng() {
        return zhidongtabanziyouxingcheng;
    }

    public void setZhidongtabanziyouxingcheng(BigDecimal zhidongtabanziyouxingcheng) {
        this.zhidongtabanziyouxingcheng = zhidongtabanziyouxingcheng;
    }

    public String getZhidongtabanziyouxingchengpingjia() {
        return zhidongtabanziyouxingchengpingjia;
    }

    public void setZhidongtabanziyouxingchengpingjia(String zhidongtabanziyouxingchengpingjia) {
        this.zhidongtabanziyouxingchengpingjia = zhidongtabanziyouxingchengpingjia == null ? null : zhidongtabanziyouxingchengpingjia.trim();
    }

    public String getZhidongtabanlipingjia() {
        return zhidongtabanlipingjia;
    }

    public void setZhidongtabanlipingjia(String zhidongtabanlipingjia) {
        this.zhidongtabanlipingjia = zhidongtabanlipingjia == null ? null : zhidongtabanlipingjia.trim();
    }

    public BigDecimal getZhidongtabanli() {
        return zhidongtabanli;
    }

    public void setZhidongtabanli(BigDecimal zhidongtabanli) {
        this.zhidongtabanli = zhidongtabanli;
    }

    public BigDecimal getLiheqitabanziyouxingcheng() {
        return liheqitabanziyouxingcheng;
    }

    public void setLiheqitabanziyouxingcheng(BigDecimal liheqitabanziyouxingcheng) {
        this.liheqitabanziyouxingcheng = liheqitabanziyouxingcheng;
    }

    public BigDecimal getLuntaiqiya() {
        return luntaiqiya;
    }

    public void setLuntaiqiya(BigDecimal luntaiqiya) {
        this.luntaiqiya = luntaiqiya;
    }

    public String getLuntaiqiyapingjia() {
        return luntaiqiyapingjia;
    }

    public void setLuntaiqiyapingjia(String luntaiqiyapingjia) {
        this.luntaiqiyapingjia = luntaiqiyapingjia == null ? null : luntaiqiyapingjia.trim();
    }

    public String getQianzhouzuolundongpinghengpingjia() {
        return qianzhouzuolundongpinghengpingjia;
    }

    public void setQianzhouzuolundongpinghengpingjia(String qianzhouzuolundongpinghengpingjia) {
        this.qianzhouzuolundongpinghengpingjia = qianzhouzuolundongpinghengpingjia == null ? null : qianzhouzuolundongpinghengpingjia.trim();
    }

    public BigDecimal getQianzhouzuolundongpingheng() {
        return qianzhouzuolundongpingheng;
    }

    public void setQianzhouzuolundongpingheng(BigDecimal qianzhouzuolundongpingheng) {
        this.qianzhouzuolundongpingheng = qianzhouzuolundongpingheng;
    }

    public BigDecimal getQianzhouyoulundongpingheng() {
        return qianzhouyoulundongpingheng;
    }

    public void setQianzhouyoulundongpingheng(BigDecimal qianzhouyoulundongpingheng) {
        this.qianzhouyoulundongpingheng = qianzhouyoulundongpingheng;
    }

    public String getQianzhouyoulundongpinghengpingjia() {
        return qianzhouyoulundongpinghengpingjia;
    }

    public void setQianzhouyoulundongpinghengpingjia(String qianzhouyoulundongpinghengpingjia) {
        this.qianzhouyoulundongpinghengpingjia = qianzhouyoulundongpinghengpingjia == null ? null : qianzhouyoulundongpinghengpingjia.trim();
    }

    public String getHouzhouyoulundongpinghengpingjia() {
        return houzhouyoulundongpinghengpingjia;
    }

    public void setHouzhouyoulundongpinghengpingjia(String houzhouyoulundongpinghengpingjia) {
        this.houzhouyoulundongpinghengpingjia = houzhouyoulundongpinghengpingjia == null ? null : houzhouyoulundongpinghengpingjia.trim();
    }

    public String getHouzhouzuolundongpinghengpingjia() {
        return houzhouzuolundongpinghengpingjia;
    }

    public void setHouzhouzuolundongpinghengpingjia(String houzhouzuolundongpinghengpingjia) {
        this.houzhouzuolundongpinghengpingjia = houzhouzuolundongpinghengpingjia == null ? null : houzhouzuolundongpinghengpingjia.trim();
    }

    public BigDecimal getHouzhouzuolundongpingheng() {
        return houzhouzuolundongpingheng;
    }

    public void setHouzhouzuolundongpingheng(BigDecimal houzhouzuolundongpingheng) {
        this.houzhouzuolundongpingheng = houzhouzuolundongpingheng;
    }

    public BigDecimal getHouzhouyoulundongpingheng() {
        return houzhouyoulundongpingheng;
    }

    public void setHouzhouyoulundongpingheng(BigDecimal houzhouyoulundongpingheng) {
        this.houzhouyoulundongpingheng = houzhouyoulundongpingheng;
    }

    public String getBuhegexiangmudaima() {
        return buhegexiangmudaima;
    }

    public void setBuhegexiangmudaima(String buhegexiangmudaima) {
        this.buhegexiangmudaima = buhegexiangmudaima == null ? null : buhegexiangmudaima.trim();
    }

    public Date getJiancekaishishijian() {
        return jiancekaishishijian;
    }

    public void setJiancekaishishijian(Date jiancekaishishijian) {
        this.jiancekaishishijian = jiancekaishishijian;
    }

    public Date getJiancejieshushijian() {
        return jiancejieshushijian;
    }

    public void setJiancejieshushijian(Date jiancejieshushijian) {
        this.jiancejieshushijian = jiancejieshushijian;
    }

    public String getFangyumifengxingpingjia() {
        return fangyumifengxingpingjia;
    }

    public void setFangyumifengxingpingjia(String fangyumifengxingpingjia) {
        this.fangyumifengxingpingjia = fangyumifengxingpingjia == null ? null : fangyumifengxingpingjia.trim();
    }

    public BigDecimal getFangyumifengxing() {
        return fangyumifengxing;
    }

    public void setFangyumifengxing(BigDecimal fangyumifengxing) {
        this.fangyumifengxing = fangyumifengxing;
    }

    public String getXiaqusheng() {
        return xiaqusheng;
    }

    public void setXiaqusheng(String xiaqusheng) {
        this.xiaqusheng = xiaqusheng == null ? null : xiaqusheng.trim();
    }

    public String getXiaqushi() {
        return xiaqushi;
    }

    public void setXiaqushi(String xiaqushi) {
        this.xiaqushi = xiaqushi == null ? null : xiaqushi.trim();
    }

    public String getXiaquxian() {
        return xiaquxian;
    }

    public void setXiaquxian(String xiaquxian) {
        this.xiaquxian = xiaquxian == null ? null : xiaquxian.trim();
    }

    public String getXiaquzhen() {
        return xiaquzhen;
    }

    public void setXiaquzhen(String xiaquzhen) {
        this.xiaquzhen = xiaquzhen == null ? null : xiaquzhen.trim();
    }

    public String getShifouqianzhang() {
        return shifouqianzhang;
    }

    public void setShifouqianzhang(String shifouqianzhang) {
        this.shifouqianzhang = shifouqianzhang == null ? null : shifouqianzhang.trim();
    }

    public String getQianzhangren() {
        return qianzhangren;
    }

    public void setQianzhangren(String qianzhangren) {
        this.qianzhangren = qianzhangren == null ? null : qianzhangren.trim();
    }

    public Date getQianzhangshijian() {
        return qianzhangshijian;
    }

    public void setQianzhangshijian(Date qianzhangshijian) {
        this.qianzhangshijian = qianzhangshijian;
    }

    public String getQianzhangdanwei() {
        return qianzhangdanwei;
    }

    public void setQianzhangdanwei(String qianzhangdanwei) {
        this.qianzhangdanwei = qianzhangdanwei == null ? null : qianzhangdanwei.trim();
    }

    public String getJuqianyuanyin() {
        return juqianyuanyin;
    }

    public void setJuqianyuanyin(String juqianyuanyin) {
        this.juqianyuanyin = juqianyuanyin == null ? null : juqianyuanyin.trim();
    }

    public String getYehumingcheng() {
        return yehumingcheng;
    }

    public void setYehumingcheng(String yehumingcheng) {
        this.yehumingcheng = yehumingcheng == null ? null : yehumingcheng.trim();
    }

    public Integer getCheliangdiannaobianhao() {
        return cheliangdiannaobianhao;
    }

    public void setCheliangdiannaobianhao(Integer cheliangdiannaobianhao) {
        this.cheliangdiannaobianhao = cheliangdiannaobianhao;
    }

    public String getYingyunzhenghao() {
        return yingyunzhenghao;
    }

    public void setYingyunzhenghao(String yingyunzhenghao) {
        this.yingyunzhenghao = yingyunzhenghao == null ? null : yingyunzhenghao.trim();
    }

    public String getChejiahaoma() {
        return chejiahaoma;
    }

    public void setChejiahaoma(String chejiahaoma) {
        this.chejiahaoma = chejiahaoma == null ? null : chejiahaoma.trim();
    }

    public String getChangpai() {
        return changpai;
    }

    public void setChangpai(String changpai) {
        this.changpai = changpai == null ? null : changpai.trim();
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao == null ? null : xinghao.trim();
    }

    public String getRanliao() {
        return ranliao;
    }

    public void setRanliao(String ranliao) {
        this.ranliao = ranliao == null ? null : ranliao.trim();
    }

    public Integer getHezaizhilianghuozaikeshu() {
        return hezaizhilianghuozaikeshu;
    }

    public void setHezaizhilianghuozaikeshu(Integer hezaizhilianghuozaikeshu) {
        this.hezaizhilianghuozaikeshu = hezaizhilianghuozaikeshu;
    }

    public String getCheliangleibie() {
        return cheliangleibie;
    }

    public void setCheliangleibie(String cheliangleibie) {
        this.cheliangleibie = cheliangleibie == null ? null : cheliangleibie.trim();
    }

    public String getCheliangleixing() {
        return cheliangleixing;
    }

    public void setCheliangleixing(String cheliangleixing) {
        this.cheliangleixing = cheliangleixing == null ? null : cheliangleixing.trim();
    }

    public Date getZhucedengjiriqi() {
        return zhucedengjiriqi;
    }

    public void setZhucedengjiriqi(Date zhucedengjiriqi) {
        this.zhucedengjiriqi = zhucedengjiriqi;
    }

    public BigDecimal getZhengchexingchezhidongyinshu() {
        return zhengchexingchezhidongyinshu;
    }

    public void setZhengchexingchezhidongyinshu(BigDecimal zhengchexingchezhidongyinshu) {
        this.zhengchexingchezhidongyinshu = zhengchexingchezhidongyinshu;
    }

    public BigDecimal getYizhouxingchezhidongliyinshu() {
        return yizhouxingchezhidongliyinshu;
    }

    public void setYizhouxingchezhidongliyinshu(BigDecimal yizhouxingchezhidongliyinshu) {
        this.yizhouxingchezhidongliyinshu = yizhouxingchezhidongliyinshu;
    }

    public BigDecimal getErzhouxingchezhidongliyinshu() {
        return erzhouxingchezhidongliyinshu;
    }

    public void setErzhouxingchezhidongliyinshu(BigDecimal erzhouxingchezhidongliyinshu) {
        this.erzhouxingchezhidongliyinshu = erzhouxingchezhidongliyinshu;
    }

    public BigDecimal getSanzhouxingchezhidongliyinshu() {
        return sanzhouxingchezhidongliyinshu;
    }

    public void setSanzhouxingchezhidongliyinshu(BigDecimal sanzhouxingchezhidongliyinshu) {
        this.sanzhouxingchezhidongliyinshu = sanzhouxingchezhidongliyinshu;
    }

    public BigDecimal getSizhouxingchezhidongliyinshu() {
        return sizhouxingchezhidongliyinshu;
    }

    public void setSizhouxingchezhidongliyinshu(BigDecimal sizhouxingchezhidongliyinshu) {
        this.sizhouxingchezhidongliyinshu = sizhouxingchezhidongliyinshu;
    }

    public BigDecimal getYizhouzhidonglipinghengyinshu() {
        return yizhouzhidonglipinghengyinshu;
    }

    public void setYizhouzhidonglipinghengyinshu(BigDecimal yizhouzhidonglipinghengyinshu) {
        this.yizhouzhidonglipinghengyinshu = yizhouzhidonglipinghengyinshu;
    }

    public BigDecimal getErzhouzhidonglipinghengyinshu() {
        return erzhouzhidonglipinghengyinshu;
    }

    public void setErzhouzhidonglipinghengyinshu(BigDecimal erzhouzhidonglipinghengyinshu) {
        this.erzhouzhidonglipinghengyinshu = erzhouzhidonglipinghengyinshu;
    }

    public BigDecimal getSanzhouzhidonglipinghengyinshu() {
        return sanzhouzhidonglipinghengyinshu;
    }

    public void setSanzhouzhidonglipinghengyinshu(BigDecimal sanzhouzhidonglipinghengyinshu) {
        this.sanzhouzhidonglipinghengyinshu = sanzhouzhidonglipinghengyinshu;
    }

    public BigDecimal getSizhouzhidonglipinghengyinshu() {
        return sizhouzhidonglipinghengyinshu;
    }

    public void setSizhouzhidonglipinghengyinshu(BigDecimal sizhouzhidonglipinghengyinshu) {
        this.sizhouzhidonglipinghengyinshu = sizhouzhidonglipinghengyinshu;
    }

    public BigDecimal getYizhouchelunzuzhizuoyinshu() {
        return yizhouchelunzuzhizuoyinshu;
    }

    public void setYizhouchelunzuzhizuoyinshu(BigDecimal yizhouchelunzuzhizuoyinshu) {
        this.yizhouchelunzuzhizuoyinshu = yizhouchelunzuzhizuoyinshu;
    }

    public BigDecimal getYizhouchelunzuzhiyouyinshu() {
        return yizhouchelunzuzhiyouyinshu;
    }

    public void setYizhouchelunzuzhiyouyinshu(BigDecimal yizhouchelunzuzhiyouyinshu) {
        this.yizhouchelunzuzhiyouyinshu = yizhouchelunzuzhiyouyinshu;
    }

    public BigDecimal getErzhouchelunzuzhizuoyinshu() {
        return erzhouchelunzuzhizuoyinshu;
    }

    public void setErzhouchelunzuzhizuoyinshu(BigDecimal erzhouchelunzuzhizuoyinshu) {
        this.erzhouchelunzuzhizuoyinshu = erzhouchelunzuzhizuoyinshu;
    }

    public BigDecimal getErzhouchelunzuzhiyouyinshu() {
        return erzhouchelunzuzhiyouyinshu;
    }

    public void setErzhouchelunzuzhiyouyinshu(BigDecimal erzhouchelunzuzhiyouyinshu) {
        this.erzhouchelunzuzhiyouyinshu = erzhouchelunzuzhiyouyinshu;
    }

    public BigDecimal getSanzhouchelunzuzhizuoyinshu() {
        return sanzhouchelunzuzhizuoyinshu;
    }

    public void setSanzhouchelunzuzhizuoyinshu(BigDecimal sanzhouchelunzuzhizuoyinshu) {
        this.sanzhouchelunzuzhizuoyinshu = sanzhouchelunzuzhizuoyinshu;
    }

    public BigDecimal getSanzhouchelunzuzhiyouyinshu() {
        return sanzhouchelunzuzhiyouyinshu;
    }

    public void setSanzhouchelunzuzhiyouyinshu(BigDecimal sanzhouchelunzuzhiyouyinshu) {
        this.sanzhouchelunzuzhiyouyinshu = sanzhouchelunzuzhiyouyinshu;
    }

    public BigDecimal getSizhouchelunzuzhizuoyinshu() {
        return sizhouchelunzuzhizuoyinshu;
    }

    public void setSizhouchelunzuzhizuoyinshu(BigDecimal sizhouchelunzuzhizuoyinshu) {
        this.sizhouchelunzuzhizuoyinshu = sizhouchelunzuzhizuoyinshu;
    }

    public BigDecimal getSizhouchelunzuzhiyouyinshu() {
        return sizhouchelunzuzhiyouyinshu;
    }

    public void setSizhouchelunzuzhiyouyinshu(BigDecimal sizhouchelunzuzhiyouyinshu) {
        this.sizhouchelunzuzhiyouyinshu = sizhouchelunzuzhiyouyinshu;
    }

    public BigDecimal getZhuchezhidongyinshu() {
        return zhuchezhidongyinshu;
    }

    public void setZhuchezhidongyinshu(BigDecimal zhuchezhidongyinshu) {
        this.zhuchezhidongyinshu = zhuchezhidongyinshu;
    }

    public String getYizhouzhidongliquxian() {
        return yizhouzhidongliquxian;
    }

    public void setYizhouzhidongliquxian(String yizhouzhidongliquxian) {
        this.yizhouzhidongliquxian = yizhouzhidongliquxian == null ? null : yizhouzhidongliquxian.trim();
    }

    public String getErzhouzhidongliquxian() {
        return erzhouzhidongliquxian;
    }

    public void setErzhouzhidongliquxian(String erzhouzhidongliquxian) {
        this.erzhouzhidongliquxian = erzhouzhidongliquxian == null ? null : erzhouzhidongliquxian.trim();
    }

    public String getSanzhouzhidongliquxian() {
        return sanzhouzhidongliquxian;
    }

    public void setSanzhouzhidongliquxian(String sanzhouzhidongliquxian) {
        this.sanzhouzhidongliquxian = sanzhouzhidongliquxian == null ? null : sanzhouzhidongliquxian.trim();
    }

    public String getSizhouzhidongliquxian() {
        return sizhouzhidongliquxian;
    }

    public void setSizhouzhidongliquxian(String sizhouzhidongliquxian) {
        this.sizhouzhidongliquxian = sizhouzhidongliquxian == null ? null : sizhouzhidongliquxian.trim();
    }

    public String getGonglvquxiantuxiang() {
        return gonglvquxiantuxiang;
    }

    public void setGonglvquxiantuxiang(String gonglvquxiantuxiang) {
        this.gonglvquxiantuxiang = gonglvquxiantuxiang == null ? null : gonglvquxiantuxiang.trim();
    }

    public String getQianzhouzuoxuanjiaquxian() {
        return qianzhouzuoxuanjiaquxian;
    }

    public void setQianzhouzuoxuanjiaquxian(String qianzhouzuoxuanjiaquxian) {
        this.qianzhouzuoxuanjiaquxian = qianzhouzuoxuanjiaquxian == null ? null : qianzhouzuoxuanjiaquxian.trim();
    }

    public String getQianzhouyouxuanjiaquxian() {
        return qianzhouyouxuanjiaquxian;
    }

    public void setQianzhouyouxuanjiaquxian(String qianzhouyouxuanjiaquxian) {
        this.qianzhouyouxuanjiaquxian = qianzhouyouxuanjiaquxian == null ? null : qianzhouyouxuanjiaquxian.trim();
    }

    public String getHouzhouzuoxuanjiaquxian() {
        return houzhouzuoxuanjiaquxian;
    }

    public void setHouzhouzuoxuanjiaquxian(String houzhouzuoxuanjiaquxian) {
        this.houzhouzuoxuanjiaquxian = houzhouzuoxuanjiaquxian == null ? null : houzhouzuoxuanjiaquxian.trim();
    }

    public String getHouzhouyouxuanjiaquxian() {
        return houzhouyouxuanjiaquxian;
    }

    public void setHouzhouyouxuanjiaquxian(String houzhouyouxuanjiaquxian) {
        this.houzhouyouxuanjiaquxian = houzhouyouxuanjiaquxian == null ? null : houzhouyouxuanjiaquxian.trim();
    }

    public BigDecimal getSizhouzhouhezuo() {
        return sizhouzhouhezuo;
    }

    public void setSizhouzhouhezuo(BigDecimal sizhouzhouhezuo) {
        this.sizhouzhouhezuo = sizhouzhouhezuo;
    }

    public BigDecimal getSizhouzhouheyou() {
        return sizhouzhouheyou;
    }

    public void setSizhouzhouheyou(BigDecimal sizhouzhouheyou) {
        this.sizhouzhouheyou = sizhouzhouheyou;
    }

    public String getSizhouzhouhepingjia() {
        return sizhouzhouhepingjia;
    }

    public void setSizhouzhouhepingjia(String sizhouzhouhepingjia) {
        this.sizhouzhouhepingjia = sizhouzhouhepingjia == null ? null : sizhouzhouhepingjia.trim();
    }

    public String getSizhouxingchezhidonglipingjia() {
        return sizhouxingchezhidonglipingjia;
    }

    public void setSizhouxingchezhidonglipingjia(String sizhouxingchezhidonglipingjia) {
        this.sizhouxingchezhidonglipingjia = sizhouxingchezhidonglipingjia == null ? null : sizhouxingchezhidonglipingjia.trim();
    }

    public String getSizhouzhidonglipinghengpingjia() {
        return sizhouzhidonglipinghengpingjia;
    }

    public void setSizhouzhidonglipinghengpingjia(String sizhouzhidonglipinghengpingjia) {
        this.sizhouzhidonglipinghengpingjia = sizhouzhidonglipinghengpingjia == null ? null : sizhouzhidonglipinghengpingjia.trim();
    }

    public String getSizhouchelunzuzhiyoupingjia() {
        return sizhouchelunzuzhiyoupingjia;
    }

    public void setSizhouchelunzuzhiyoupingjia(String sizhouchelunzuzhiyoupingjia) {
        this.sizhouchelunzuzhiyoupingjia = sizhouchelunzuzhiyoupingjia == null ? null : sizhouchelunzuzhiyoupingjia.trim();
    }

    public String getSizhouchelunzuzhizuopingjia() {
        return sizhouchelunzuzhizuopingjia;
    }

    public void setSizhouchelunzuzhizuopingjia(String sizhouchelunzuzhizuopingjia) {
        this.sizhouchelunzuzhizuopingjia = sizhouchelunzuzhizuopingjia == null ? null : sizhouchelunzuzhizuopingjia.trim();
    }

    public String getWaijianzongpingjia() {
        return waijianzongpingjia;
    }

    public void setWaijianzongpingjia(String waijianzongpingjia) {
        this.waijianzongpingjia = waijianzongpingjia == null ? null : waijianzongpingjia.trim();
    }

    public Date getShujushangchuanshijian() {
        return shujushangchuanshijian;
    }

    public void setShujushangchuanshijian(Date shujushangchuanshijian) {
        this.shujushangchuanshijian = shujushangchuanshijian;
    }

    public String getShifoupaopian() {
        return shifoupaopian;
    }

    public void setShifoupaopian(String shifoupaopian) {
        this.shifoupaopian = shifoupaopian == null ? null : shifoupaopian.trim();
    }

    public BigDecimal getAsm5025co() {
        return asm5025co;
    }

    public void setAsm5025co(BigDecimal asm5025co) {
        this.asm5025co = asm5025co;
    }

    public String getAsm5025copingjia() {
        return asm5025copingjia;
    }

    public void setAsm5025copingjia(String asm5025copingjia) {
        this.asm5025copingjia = asm5025copingjia == null ? null : asm5025copingjia.trim();
    }

    public BigDecimal getAsm5025hc() {
        return asm5025hc;
    }

    public void setAsm5025hc(BigDecimal asm5025hc) {
        this.asm5025hc = asm5025hc;
    }

    public String getAsm5025hcpingjia() {
        return asm5025hcpingjia;
    }

    public void setAsm5025hcpingjia(String asm5025hcpingjia) {
        this.asm5025hcpingjia = asm5025hcpingjia == null ? null : asm5025hcpingjia.trim();
    }

    public BigDecimal getAsm5025no() {
        return asm5025no;
    }

    public void setAsm5025no(BigDecimal asm5025no) {
        this.asm5025no = asm5025no;
    }

    public String getAsm5025nopingjia() {
        return asm5025nopingjia;
    }

    public void setAsm5025nopingjia(String asm5025nopingjia) {
        this.asm5025nopingjia = asm5025nopingjia == null ? null : asm5025nopingjia.trim();
    }

    public BigDecimal getAsm2540co() {
        return asm2540co;
    }

    public void setAsm2540co(BigDecimal asm2540co) {
        this.asm2540co = asm2540co;
    }

    public String getAsm2540copingjia() {
        return asm2540copingjia;
    }

    public void setAsm2540copingjia(String asm2540copingjia) {
        this.asm2540copingjia = asm2540copingjia == null ? null : asm2540copingjia.trim();
    }

    public BigDecimal getAsm2540hc() {
        return asm2540hc;
    }

    public void setAsm2540hc(BigDecimal asm2540hc) {
        this.asm2540hc = asm2540hc;
    }

    public String getAsm540hcpingjia() {
        return asm540hcpingjia;
    }

    public void setAsm540hcpingjia(String asm540hcpingjia) {
        this.asm540hcpingjia = asm540hcpingjia == null ? null : asm540hcpingjia.trim();
    }

    public BigDecimal getAsm2540no() {
        return asm2540no;
    }

    public void setAsm2540no(BigDecimal asm2540no) {
        this.asm2540no = asm2540no;
    }

    public String getAsm2540nopingjia() {
        return asm2540nopingjia;
    }

    public void setAsm2540nopingjia(String asm2540nopingjia) {
        this.asm2540nopingjia = asm2540nopingjia == null ? null : asm2540nopingjia.trim();
    }

    public String getAsmpingjia() {
        return asmpingjia;
    }

    public void setAsmpingjia(String asmpingjia) {
        this.asmpingjia = asmpingjia == null ? null : asmpingjia.trim();
    }

    public BigDecimal getLugdk100() {
        return lugdk100;
    }

    public void setLugdk100(BigDecimal lugdk100) {
        this.lugdk100 = lugdk100;
    }

    public String getLugdk100pingjia() {
        return lugdk100pingjia;
    }

    public void setLugdk100pingjia(String lugdk100pingjia) {
        this.lugdk100pingjia = lugdk100pingjia == null ? null : lugdk100pingjia.trim();
    }

    public BigDecimal getLugdk90() {
        return lugdk90;
    }

    public void setLugdk90(BigDecimal lugdk90) {
        this.lugdk90 = lugdk90;
    }

    public String getLugdk90pingjia() {
        return lugdk90pingjia;
    }

    public void setLugdk90pingjia(String lugdk90pingjia) {
        this.lugdk90pingjia = lugdk90pingjia == null ? null : lugdk90pingjia.trim();
    }

    public BigDecimal getLugdk80() {
        return lugdk80;
    }

    public void setLugdk80(BigDecimal lugdk80) {
        this.lugdk80 = lugdk80;
    }

    public String getLugdk80pingjia() {
        return lugdk80pingjia;
    }

    public void setLugdk80pingjia(String lugdk80pingjia) {
        this.lugdk80pingjia = lugdk80pingjia == null ? null : lugdk80pingjia.trim();
    }

    public BigDecimal getLugdmaxpower() {
        return lugdmaxpower;
    }

    public void setLugdmaxpower(BigDecimal lugdmaxpower) {
        this.lugdmaxpower = lugdmaxpower;
    }

    public BigDecimal getLugdmaxpowerrev() {
        return lugdmaxpowerrev;
    }

    public void setLugdmaxpowerrev(BigDecimal lugdmaxpowerrev) {
        this.lugdmaxpowerrev = lugdmaxpowerrev;
    }

    public String getLugdpingjia() {
        return lugdpingjia;
    }

    public void setLugdpingjia(String lugdpingjia) {
        this.lugdpingjia = lugdpingjia == null ? null : lugdpingjia.trim();
    }

    public BigDecimal getVmashc() {
        return vmashc;
    }

    public void setVmashc(BigDecimal vmashc) {
        this.vmashc = vmashc;
    }

    public String getVmashcpingjia() {
        return vmashcpingjia;
    }

    public void setVmashcpingjia(String vmashcpingjia) {
        this.vmashcpingjia = vmashcpingjia == null ? null : vmashcpingjia.trim();
    }

    public BigDecimal getVmasco() {
        return vmasco;
    }

    public void setVmasco(BigDecimal vmasco) {
        this.vmasco = vmasco;
    }

    public String getVmascopingjia() {
        return vmascopingjia;
    }

    public void setVmascopingjia(String vmascopingjia) {
        this.vmascopingjia = vmascopingjia == null ? null : vmascopingjia.trim();
    }

    public BigDecimal getVmasno() {
        return vmasno;
    }

    public void setVmasno(BigDecimal vmasno) {
        this.vmasno = vmasno;
    }

    public String getVmasnopingjia() {
        return vmasnopingjia;
    }

    public void setVmasnopingjia(String vmasnopingjia) {
        this.vmasnopingjia = vmasnopingjia == null ? null : vmasnopingjia.trim();
    }

    public String getVmaspingjia() {
        return vmaspingjia;
    }

    public void setVmaspingjia(String vmaspingjia) {
        this.vmaspingjia = vmaspingjia == null ? null : vmaspingjia.trim();
    }

    public String getSysZhengbenfuwuqiming() {
        return sysZhengbenfuwuqiming;
    }

    public void setSysZhengbenfuwuqiming(String sysZhengbenfuwuqiming) {
        this.sysZhengbenfuwuqiming = sysZhengbenfuwuqiming == null ? null : sysZhengbenfuwuqiming.trim();
    }

    public String getSysZhengbenshujukuming() {
        return sysZhengbenshujukuming;
    }

    public void setSysZhengbenshujukuming(String sysZhengbenshujukuming) {
        this.sysZhengbenshujukuming = sysZhengbenshujukuming == null ? null : sysZhengbenshujukuming.trim();
    }

    public String getSysXinzengdenglurenid() {
        return sysXinzengdenglurenid;
    }

    public void setSysXinzengdenglurenid(String sysXinzengdenglurenid) {
        this.sysXinzengdenglurenid = sysXinzengdenglurenid == null ? null : sysXinzengdenglurenid.trim();
    }

    public String getSysXinzengdengluren() {
        return sysXinzengdengluren;
    }

    public void setSysXinzengdengluren(String sysXinzengdengluren) {
        this.sysXinzengdengluren = sysXinzengdengluren == null ? null : sysXinzengdengluren.trim();
    }

    public String getSysXinzengrenid() {
        return sysXinzengrenid;
    }

    public void setSysXinzengrenid(String sysXinzengrenid) {
        this.sysXinzengrenid = sysXinzengrenid == null ? null : sysXinzengrenid.trim();
    }

    public String getSysXinzengren() {
        return sysXinzengren;
    }

    public void setSysXinzengren(String sysXinzengren) {
        this.sysXinzengren = sysXinzengren == null ? null : sysXinzengren.trim();
    }

    public Date getSysXinzengshijian() {
        return sysXinzengshijian;
    }

    public void setSysXinzengshijian(Date sysXinzengshijian) {
        this.sysXinzengshijian = sysXinzengshijian;
    }

    public String getSysZuijinxiugaidenglurenid() {
        return sysZuijinxiugaidenglurenid;
    }

    public void setSysZuijinxiugaidenglurenid(String sysZuijinxiugaidenglurenid) {
        this.sysZuijinxiugaidenglurenid = sysZuijinxiugaidenglurenid == null ? null : sysZuijinxiugaidenglurenid.trim();
    }

    public String getSysZuijinxiugaidengluren() {
        return sysZuijinxiugaidengluren;
    }

    public void setSysZuijinxiugaidengluren(String sysZuijinxiugaidengluren) {
        this.sysZuijinxiugaidengluren = sysZuijinxiugaidengluren == null ? null : sysZuijinxiugaidengluren.trim();
    }

    public String getSysZuijinxiugairenid() {
        return sysZuijinxiugairenid;
    }

    public void setSysZuijinxiugairenid(String sysZuijinxiugairenid) {
        this.sysZuijinxiugairenid = sysZuijinxiugairenid == null ? null : sysZuijinxiugairenid.trim();
    }

    public String getSysZuijinxiugairen() {
        return sysZuijinxiugairen;
    }

    public void setSysZuijinxiugairen(String sysZuijinxiugairen) {
        this.sysZuijinxiugairen = sysZuijinxiugairen == null ? null : sysZuijinxiugairen.trim();
    }

    public Date getSysZuijinxiugaishijian() {
        return sysZuijinxiugaishijian;
    }

    public void setSysZuijinxiugaishijian(Date sysZuijinxiugaishijian) {
        this.sysZuijinxiugaishijian = sysZuijinxiugaishijian;
    }

    public String getSysXitongzhuangtai() {
        return sysXitongzhuangtai;
    }

    public void setSysXitongzhuangtai(String sysXitongzhuangtai) {
        this.sysXitongzhuangtai = sysXitongzhuangtai == null ? null : sysXitongzhuangtai.trim();
    }

    public String getSysZuijinshoulihao() {
        return sysZuijinshoulihao;
    }

    public void setSysZuijinshoulihao(String sysZuijinshoulihao) {
        this.sysZuijinshoulihao = sysZuijinshoulihao == null ? null : sysZuijinshoulihao.trim();
    }

    public String getSysXitongbeizhu() {
        return sysXitongbeizhu;
    }

    public void setSysXitongbeizhu(String sysXitongbeizhu) {
        this.sysXitongbeizhu = sysXitongbeizhu == null ? null : sysXitongbeizhu.trim();
    }

    public Date getSysShijianchuo() {
        return sysShijianchuo;
    }

    public void setSysShijianchuo(Date sysShijianchuo) {
        this.sysShijianchuo = sysShijianchuo;
    }

    public BigDecimal getYizhouzhidongliyinshu() {
        return yizhouzhidongliyinshu;
    }

    public void setYizhouzhidongliyinshu(BigDecimal yizhouzhidongliyinshu) {
        this.yizhouzhidongliyinshu = yizhouzhidongliyinshu;
    }

    public Integer getUpvisa() {
        return upvisa;
    }

    public void setUpvisa(Integer upvisa) {
        this.upvisa = upvisa;
    }
}