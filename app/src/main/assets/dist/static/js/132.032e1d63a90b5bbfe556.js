webpackJsonp([132],{"4Ocm":function(t,s,_){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var c=_("ABCa"),i=_("+7p8"),a=_("yXmd"),o=(c.a,i.a,a.a,{components:{XHeader:c.a,Collapse:i.a,showMore:a.a},data:function(){return{id:"",info:{}}},mounted:function(){this.getParams()},methods:{getParams:function(){var t=this.$route.params;this.id=t.ID,this.getDetail()},getDetail:function(){var t=this;this.$vux.loading.show({text:"加载中..."}),this.$ajax.post("",{"MSH.1":"suifangService","MSH.2":"getFirstCQSFById",id:this.id,token:this.$root.loginInfo.token}).then(function(s){t.$vux.loading.hide(),console.log(s),void 0!==s&&(t.info=s)}).catch(function(s){console.log(s),t.$vux.loading.hide()})}}}),v=function(){var t=this,s=t.$createElement,_=t._self._c||s;return _("div",[_("div",{staticClass:"cdct_container"},[_("div",{staticClass:"cdct_header"},[_("XHeader",{staticStyle:{"box-shadow":"0 0 0 #fff","border-bottom":"1px solid #E1E1E1"},attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(s){t.$router.goBack()}}},[t._v("第一次产前随访")])],1),t._v(" "),_("collapse",[_("div",{staticClass:"cdct_row_title",staticStyle:{"margin-top":"10px"},attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("基本信息")]),t._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("姓名")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.GRXM))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("编号")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BH))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("填表日期")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.TBRQ))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("孕周")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.TBYZ))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("孕妇年龄")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YFNL?t.info.YFNL+"岁":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("丈夫姓名")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZFXM))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("丈夫年龄")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZFNL?t.info.ZFNL+"岁":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("丈夫电话")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZFDHHM))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("孕次")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YC))])]),t._v(" "),_("show-more",{attrs:{title:"产次"},model:{value:t.info.CC,callback:function(s){t.$set(t.info,"CC",s)},expression:"info.CC"}}),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("末次月经")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.MCYJRQ))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("预产期")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YCQ))])]),t._v(" "),_("show-more",{attrs:{title:"既往史"},model:{value:t.info.JWSMC,callback:function(s){t.$set(t.info,"JWSMC",s)},expression:"info.JWSMC"}}),t._v(" "),_("show-more",{attrs:{title:"家族史"},model:{value:t.info.JZSMC,callback:function(s){t.$set(t.info,"JZSMC",s)},expression:"info.JZSMC"}}),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("妇科手术史")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.FKSSS))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("孕产史")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YCSMC))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("身高")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SG?t.info.SG+"cm":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("体重")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.TZ?t.info.TZ+"kg":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("体质指数(BMI)")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.TZZS?t.info.TZZS+"kg/m²":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("血压")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SSY)+"/"+t._s(t.info.SZY)+" mmHg")])])],1)]),t._v(" "),_("collapse",{staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("听诊")]),t._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("心脏")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.XZTZMS))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("肺部")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.FBTZMS))])])])]),t._v(" "),_("collapse",{staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("妇科检查")]),t._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("外阴")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.WYJCBZ))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("阴道")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YDJCMS))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("宫颈")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.GJJCMS))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("子宫")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZGJCMS))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("附件")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.FJJCMS))])])])]),t._v(" "),_("collapse",{staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("辅助检查")]),t._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("show-more",{attrs:{title:"血常规"},model:{value:t.info.XCGQTJG,callback:function(s){t.$set(t.info,"XCGQTJG",s)},expression:"info.XCGQTJG"}}),t._v(" "),_("show-more",{attrs:{title:"尿常规"},model:{value:t.info.NCGQTJG,callback:function(s){t.$set(t.info,"NCGQTJG",s)},expression:"info.NCGQTJG"}}),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("血型：")])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("ABO")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ABOXXMC))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("Rh")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.RHXXDM_NAME))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("血糖")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.XTJCZ?t.info.XTJCZ+"mmol/L":""))])]),t._v(" "),_("show-more",{attrs:{title:"肝功能"}},[_("div",[t._v("血清谷丙转氨酶："+t._s(t.info.GBZAM?t.info.GBZAM+"U/L":""))]),t._v(" "),_("div",[t._v("血清谷草转氨酶："+t._s(t.info.GCZAM?t.info.GCZAM+"U/L":""))]),t._v(" "),_("div",[t._v("白蛋白："+t._s(t.info.BDB?t.info.BDB+"g/L":""))]),t._v(" "),_("div",[t._v("总胆红素："+t._s(t.info.ZDHS?t.info.ZDHS+"μmol/L":""))]),t._v(" "),_("div",[t._v("结合胆红素："+t._s(t.info.JHDHS?t.info.JHDHS+"μmol/L":""))])]),t._v(" "),_("show-more",{attrs:{title:"肾功能"}},[_("div",[t._v("血清肌酐："+t._s(t.info.XQJG?t.info.XQJG+"μmol/L":""))]),t._v(" "),_("div",[t._v("血尿素："+t._s(t.info.XNSD?t.info.XNSD+"μmol/L":""))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("阴道分泌物：")])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("异常")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YDFMWDM_NAME))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("阴道清洁度")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YDFMWMC))])]),t._v(" "),_("show-more",{attrs:{title:"乙型肝炎"}},[_("div",[t._v("乙型肝炎表面抗原："+t._s(null==t.info.YGBKY?"不详":1==t.info.YGBKY?"阴性":"阳性"))]),t._v(" "),_("div",[t._v("乙型肝炎表面抗体："+t._s(null==t.info.YGBKT?"不详":1==t.info.YGBKT?"阴性":"阳性"))]),t._v(" "),_("div",[t._v("乙型肝炎e抗原："+t._s(null==t.info.YGEKY?"不详":1==t.info.YGEKY?"阴性":"阳性"))]),t._v(" "),_("div",[t._v("乙型肝炎e抗体："+t._s(null==t.info.YGEKT?"不详":1==t.info.YGEKT?"阴性":"阳性"))]),t._v(" "),_("div",[t._v("乙型肝炎核心抗体："+t._s(null==t.info.YGHKT?"不详":1==t.info.YGHKT?"阴性":"阳性"))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("梅毒血清学实验")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(null==t.info.MDSY?"不详":1==t.info.MDSY?"阴性":"阳性"))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("HIV抗体检测")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(null==t.info.HIVSY?"不详":1==t.info.HIVSY?"阴性":2==t.info.HIVSY?"阳性":"不确定"))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("B超")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BC))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("其他")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.QTZFJC))])])],1)]),t._v(" "),_("div",{staticClass:"cdct_row",staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row_l"},[t._v("总体评估")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(null==t.info.ZTPGDM?"不详":0==t.info.ZTPGDM?"未见异常":"异常"))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("保健指导")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BJZDDM_NAME))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("转诊意见")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(null==t.info.ZZBZ?"不详":0==t.info.ZZBZ?"否":"是"))])]),t._v(" "),1==t.info.ZZBZ?_("div",[_("show-more",{attrs:{title:"原因"},model:{value:t.info.ZZYY,callback:function(s){t.$set(t.info,"ZZYY",s)},expression:"info.ZZYY"}}),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("科室与机构")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZRKSMC))])])],1):t._e(),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("下次随访日期")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.XCFSRQ))])]),t._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[t._v("随访医生签字")]),t._v(" "),_("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SFYSXM))])])],1)])},l=[],d={render:v,staticRenderFns:l},r=d,n=_("VU/8"),C=n(o,r,!1,null,null,null);s.default=C.exports}});
//# sourceMappingURL=132.032e1d63a90b5bbfe556.js.map