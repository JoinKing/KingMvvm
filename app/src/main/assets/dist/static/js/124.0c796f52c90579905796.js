webpackJsonp([124],{tjyj:function(t,s,c){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var i=c("ABCa"),_=c("+7p8"),a=c("yXmd"),o=(i.a,_.a,a.a,{components:{XHeader:i.a,Collapse:_.a,showMore:a.a},data:function(){return{info:{}}},mounted:function(){this.getDeathRecord()},methods:{getDeathRecord:function(){var t=this;this.$vux.loading.show({text:"加载中..."}),this.$ajax.post("",{"MSH.1":"deathService","MSH.2":"getById",GRDAID:this.$root.loginInfo.grdaid,CHZBM:this.$root.loginInfo.CHZBM,token:this.$root.loginInfo.token}).then(function(s){console.log(s),t.$vux.loading.hide(),void 0!==s&&(t.info=s)}).catch(function(s){console.log(s),t.$vux.loading.hide()})}}}),v=function(){var t=this,s=t.$createElement,c=t._self._c||s;return c("div",[c("div",{staticClass:"cdct_container meternal_info_wrapper"},[c("div",{staticClass:"cdct_header"},[c("XHeader",{staticStyle:{"box-shadow":"0 0 0 #fff","border-bottom":"1px solid #E1E1E1"},attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(s){t.$router.goBack()}}},[t._v("孕产妇死亡登记")])],1),t._v(" "),c("collapse",[c("div",{staticClass:"cdct_row_title",staticStyle:{"margin-top":"10px"},attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("基本信息")]),t._v(" "),c("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("死者姓名")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.GRXM))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("身份证号")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SFZBH&&18==t.info.SFZBH.length?t.info.SFZBH.substring(0,2)+"**************"+t.info.SFZBH.substring(16,18):""))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("性别")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.GRXBMC))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("民族")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.MZMC))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("主要主业及工种")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.ZYLBDM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("户口所在地")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.HK))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("生前常住地址")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SQCZDZ))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("婚姻状况")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.HYDM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("文化程度")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.WHCDDM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("生前工作单位")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.GZDWMC))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("出生日期")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CSRQ))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("死亡日期")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SWRQ))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("实足年龄")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SWNL?t.info.SWNL+"岁":""))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("死亡地点")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.SWDDDM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("死者家属姓名")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CJSXM))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("家属联系电话")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CJSLXDH)+" ")])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("家属联系地址")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CJSLXDZ))])])])]),t._v(" "),c("collapse",{staticStyle:{"margin-top":"10px"}},[c("div",{staticClass:"cdct_row_title",attrs:{slot:"collapseTitle"},slot:"collapseTitle"},[t._v("致死的主要疾病诊断")]),t._v(" "),c("div",{attrs:{slot:"collapseContent"},slot:"collapseContent"},[c("show-more",{attrs:{title:"（a）直接导致死亡的疾病或情况"},model:{value:t.info.CZSJBZDA,callback:function(s){t.$set(t.info,"CZSJBZDA",s)},expression:"info.CZSJBZDA "}}),t._v(" "),c("show-more",{attrs:{title:"（a）直接导致死亡疾病ICD编码"},model:{value:t.info.CZSICDABM,callback:function(s){t.$set(t.info,"CZSICDABM",s)},expression:"info.CZSICDABM"}}),t._v(" "),c("show-more",{attrs:{title:"（b）引起（a）的疾病或情况"},model:{value:t.info.CZSJBZDB,callback:function(s){t.$set(t.info,"CZSJBZDB",s)},expression:"info.CZSJBZDB"}}),t._v(" "),c("show-more",{attrs:{title:"（b）引起（a）的疾病ICD编码"},model:{value:t.info.CZSICDBBM,callback:function(s){t.$set(t.info,"CZSICDBBM",s)},expression:"info.CZSICDBBM"}}),t._v(" "),c("show-more",{attrs:{title:"（c）引起（b）的疾病或情况"},model:{value:t.info.CZSJBZDC,callback:function(s){t.$set(t.info,"CZSJBZDC",s)},expression:"info.CZSJBZDC"}}),t._v(" "),c("show-more",{attrs:{title:"（c）引起（b）的疾病ICD编码"},model:{value:t.info.CZSICDCBM,callback:function(s){t.$set(t.info,"CZSICDCBM",s)},expression:"info.CZSICDCBM"}}),t._v(" "),c("show-more",{attrs:{title:"其它疾病诊断（促进死亡，但与导致死亡无关的其他重要情况）："},model:{value:t.info.CQTJBZD,callback:function(s){t.$set(t.info,"CQTJBZD",s)},expression:"info.CQTJBZD"}})],1)]),t._v(" "),c("div",{staticClass:"cdct_row",staticStyle:{"margin-top":"10px"}},[c("div",{staticClass:"cdct_row_l"},[t._v("生前上述疾病最高诊断单位")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BZGZDDWBM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("生前上述疾病最高诊断依据")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BZGZDYJBM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("孕产妇死亡原因")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.BSWYYBM_NAME))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("住院号")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CZYH))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("医师签名")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CYSMC))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("填报日期")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.DTBRQ&&t.info.DTBRQ.length>10?t.info.DTBRQ.substring(0,10):"")+"\n            ")])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("根本死亡原因")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CGBSWYY))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("根本死亡ICD编码")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.CGBSWICDBM))])]),t._v(" "),c("div",{staticClass:"cdct_row"},[c("div",{staticClass:"cdct_row_l"},[t._v("医疗机构")]),t._v(" "),c("div",{staticClass:"cdct_row_r"},[t._v(t._s(t.info.YLJGID_NAME))])])],1)])},l=[],d={render:v,staticRenderFns:l},r=d,n=c("VU/8"),C=n(o,r,!1,null,null,null);s.default=C.exports}});
//# sourceMappingURL=124.0c796f52c90579905796.js.map