webpackJsonp([90],{"DOc/":function(s,t,_){var c=_("WQaI");"string"==typeof c&&(c=[[s.i,c,""]]),c.locals&&(s.exports=c.locals);_("rjj0")("0d04c478",c,!0,{})},WQaI:function(s,t,_){t=s.exports=_("FZ+f")(!0),t.push([s.i,"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n","",{version:3,sources:[],names:[],mappings:"",file:"F12T30MonthsPE.vue",sourceRoot:""}])},"pHN/":function(s,t,_){"use strict";function c(s){_("DOc/")}Object.defineProperty(t,"__esModule",{value:!0});var i=_("ABCa"),n=_("+7p8"),a=_("BMUy"),v=_("yXmd"),d=(i.a,n.a,v.a,a.a,{components:{XHeader:i.a,Collapse:n.a,ShowMore:v.a,backTop:a.a},mounted:function(){this.params=this.$route.params,this.getInfo()},data:function(){return{info:{},params:{}}},methods:{getInfo:function(){var s=this;this.$ajax.post("",{"MSH.1":"childrenExamService","MSH.2":"getById",DATA_TYPE:this.params.DATA_TYPE,ID:this.params.ID,token:this.$root.loginInfo.token}).then(function(t){console.log(t),t&&(s.info=t)}).catch(function(s){console.log(s)})}}}),o=function(){var s=this,t=s.$createElement,_=s._self._c||t;return _("div",{staticClass:"cdct_container"},[_("div",{staticClass:"cdct_header"},[_("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(t){s.$router.goBack()}}},[s._v(s._s(s.params.NAME))])],1),s._v(" "),_("collapse",{staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[s._v("基础信息")]),s._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("姓名")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.JMXM))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("编号")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.JKDABH))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("月龄")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.SZNL))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("随访日期")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.TJRQ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("体重")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.TZ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("身长")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.SC))])])])]),s._v(" "),_("collapse",[_("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[s._v("体格检查")]),s._v(" "),_("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("面色")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.MS))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("皮肤")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.PF))])]),s._v(" "),8!=this.params.DATA_TYPE?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("前囟")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.QXBHBZ))])]):s._e(),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("前囟径")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.QXHJ+"cm*"+s.info.QXZJ+"cm"))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("颈部包块")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.JBBKBZ))])]),s._v(" "),1==this.info.JBBKBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("颈部包块描述")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.JBBKJC))])]):s._e(),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("眼睛")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.YWGJCBZ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("耳外观")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.EWGJCBZ))])]),s._v(" "),5==this.params.DATA_TYPE||7==this.params.DATA_TYPE?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("听力")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.TLJC))])]):s._e(),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("出牙/龋齿数(颗)")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.CYS+"/"+s.info.QCS))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("胸部")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.XBJCYCBZ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("腹部")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.FBCZYCBZ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("四肢")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.SZHDBZ))])]),s._v(" "),1==this.info.SZHDBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("四肢检查描述")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.SZJC))])]):s._e(),s._v(" "),5!=this.params.DATA_TYPE?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("步态")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.BTQKBZ))])]):s._e(),s._v(" "),1==this.info.BTQKBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("步态检查结果")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.BTJCJG))])]):s._e(),s._v(" "),8!=this.params.DATA_TYPE?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("可疑佝偻病体征")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.GLBTZ))])]):s._e(),s._v(" "),6==this.params.DATA_TYPE||8==this.params.DATA_TYPE?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("血红蛋白值")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.XHDBZ))])]):s._e()])]),s._v(" "),_("div",{staticStyle:{"margin-top":"10px"}},[_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("户外活动")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.HWHDSC))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("服用维生素D")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.FYWDJL))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("发育评估")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.TGPJ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("两次随访患病情况")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.LCSFHBBZ))])]),s._v(" "),1==this.info.LCSFHBBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("两次随访间患肺炎住院次数")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.LCSFFYZYCS))])]):s._e(),s._v(" "),1==this.info.LCSFHBBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("两次随访间患腹泻住院次数")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.LCSFFXZYCS))])]):s._e(),s._v(" "),1==this.info.LCSFHBBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("两次随访间因外伤往院次数")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.LCSFWSZYCS))])]):s._e(),s._v(" "),1==this.info.LCSFHBBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("两次随访间患其他疾病情况")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.LCSFQTQK))])]):s._e(),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("转诊建议")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.ZZBZ))])]),s._v(" "),1==this.info.ZZBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("转诊原因")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.ZZYY))])]):s._e(),s._v(" "),1==this.info.ZZBZ?_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("转诊机构及科室")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.ZRJGKSMC))])]):s._e(),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("指导")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.CLJZDYJ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("下次随访日期")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.YYXCJCRQ))])]),s._v(" "),_("div",{staticClass:"cdct_row"},[_("div",{staticClass:"cdct_row_l"},[s._v("随访医生")]),s._v(" "),_("div",{staticClass:"cdct_row_r"},[s._v(s._s(s.info.JCZ))])])])],1)},l=[],r={render:o,staticRenderFns:l},C=r,w=_("VU/8"),e=c,f=w(d,C,!1,e,null,null);t.default=f.exports}});
//# sourceMappingURL=90.79241e7c6765b9e51906.js.map