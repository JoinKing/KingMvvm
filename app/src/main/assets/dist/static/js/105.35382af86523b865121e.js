webpackJsonp([105],{ALtg:function(n,a,t){var e=t("kxFB");a=n.exports=t("FZ+f")(!0),a.push([n.i,"\n.cdct_container[data-v-1eb751fa] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-1eb751fa] {\n  height: 100%;\n}\n.familyBox[data-v-1eb751fa] {\n  background: #fff;\n  padding: 1.8rem 1.5rem;\n  margin-top: 10px;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n}\n.familyBox .avater[data-v-1eb751fa] {\n  border-radius: 50%;\n  width: 5rem;\n  height: 5rem;\n  margin-right: 15px;\n  overflow: hidden;\n}\n.familyBox .avater img[data-v-1eb751fa] {\n  width: 100%;\n  height: 100%;\n  object-fit: cover;\n}\n.familyBox .right .name[data-v-1eb751fa] {\n  font-size: 1.8rem;\n  font-weight: 400;\n  padding-bottom: 5px;\n  color: #333;\n}\n.familyBox .right .name .age[data-v-1eb751fa] {\n  color: #666;\n  font-size: 1.2rem;\n  padding-left: 1.2rem;\n}\n.familyBox .right .idcard[data-v-1eb751fa] {\n  color: #999;\n}\n.familyBox .right .SF[data-v-1eb751fa] {\n  display: inline-block;\n  margin-left: 10px;\n  color: #3CB963;\n  font-size: 1.2rem;\n  padding: 0 6px;\n  line-height: 22px;\n  border-radius: 2px;\n  background: #E5FFED;\n}\n.error[data-v-1eb751fa] {\n  background-image: url("+e(t("tMBN"))+");\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/HealthRrecords/MyFamily.vue"],names:[],mappings:";AACA;EACE,aAAa;EACb,iBAAiB;CAClB;AACD;EACE,aAAa;CACd;AACD;EACE,iBAAiB;EACjB,uBAAuB;EACvB,iBAAiB;EACjB,qBAAqB;EACrB,sBAAsB;EACtB,cAAc;CACf;AACD;EACE,mBAAmB;EACnB,YAAY;EACZ,aAAa;EACb,mBAAmB;EACnB,iBAAiB;CAClB;AACD;EACE,YAAY;EACZ,aAAa;EACb,kBAAkB;CACnB;AACD;EACE,kBAAkB;EAClB,iBAAiB;EACjB,oBAAoB;EACpB,YAAY;CACb;AACD;EACE,YAAY;EACZ,kBAAkB;EAClB,qBAAqB;CACtB;AACD;EACE,YAAY;CACb;AACD;EACE,sBAAsB;EACtB,kBAAkB;EAClB,eAAe;EACf,kBAAkB;EAClB,eAAe;EACf,kBAAkB;EAClB,mBAAmB;EACnB,oBAAoB;CACrB;AACD;EACE,gDAA8D;CAC/D",file:"MyFamily.vue",sourcesContent:["\n.cdct_container[data-v-1eb751fa] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-1eb751fa] {\n  height: 100%;\n}\n.familyBox[data-v-1eb751fa] {\n  background: #fff;\n  padding: 1.8rem 1.5rem;\n  margin-top: 10px;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n}\n.familyBox .avater[data-v-1eb751fa] {\n  border-radius: 50%;\n  width: 5rem;\n  height: 5rem;\n  margin-right: 15px;\n  overflow: hidden;\n}\n.familyBox .avater img[data-v-1eb751fa] {\n  width: 100%;\n  height: 100%;\n  object-fit: cover;\n}\n.familyBox .right .name[data-v-1eb751fa] {\n  font-size: 1.8rem;\n  font-weight: 400;\n  padding-bottom: 5px;\n  color: #333;\n}\n.familyBox .right .name .age[data-v-1eb751fa] {\n  color: #666;\n  font-size: 1.2rem;\n  padding-left: 1.2rem;\n}\n.familyBox .right .idcard[data-v-1eb751fa] {\n  color: #999;\n}\n.familyBox .right .SF[data-v-1eb751fa] {\n  display: inline-block;\n  margin-left: 10px;\n  color: #3CB963;\n  font-size: 1.2rem;\n  padding: 0 6px;\n  line-height: 22px;\n  border-radius: 2px;\n  background: #E5FFED;\n}\n.error[data-v-1eb751fa] {\n  background-image: url('~viewImgs/chronicDisease/errorBg.png');\n}\n"],sourceRoot:""}])},ebWl:function(n,a,t){var e=t("ALtg");"string"==typeof e&&(e=[[n.i,e,""]]),e.locals&&(n.exports=e.locals);t("rjj0")("1525e8bc",e,!0,{})},z9vu:function(n,a,t){"use strict";function e(n){t("ebWl")}Object.defineProperty(a,"__esModule",{value:!0});var i=t("mvHQ"),o=t.n(i),r=t("ABCa"),A=t("rLAy"),s=t("FOn0"),l=(r.a,A.a,s.a,{components:{XHeader:r.a,Toast:A.a,SelectTab:s.a},data:function(){return{noData:!1,familyList:[]}},mounted:function(){this.qryMyFamilyList()},methods:{qryMyFamilyList:function(){var n=this;this.$vux.loading.show({text:"加载中..."}),this.$ajax.post("",{"MSH.1":"wdjt","MSH.2":"qryMyFamilyList",GRDAID:this.$root.loginInfo.grdaid,CHZBM:this.$root.loginInfo.CHZBM,token:this.$root.loginInfo.token}).then(function(a){console.log(a),n.$vux.loading.hide(),void 0!==a&&(n.familyList=[],a.length>0?(n.noData=!1,n.familyList=a):n.noData=!0)}).catch(function(a){console.log(a),n.$vux.loading.hide()})},gotoGRDA:function(n){this.$router.push({name:"healthRrecords"}),window.localStorage.setItem("other",o()(n))},CancelRelated:function(){var n=this;this.$vux.confirm.show({title:"提示",content:"取消关联档案后,将不能查看档案信息,确认取消关联档案?",onCancel:function(){},onConfirm:function(){n.$router.push({name:"FileLogin",params:{TYPE:"取消关联"}})}})}}}),d=function(){var n=this,a=n.$createElement,t=n._self._c||a;return t("div",{staticClass:"cdct_container",on:{touchstart:n.addLinkBg,touchend:n.removeLinkBg,touchmove:n.moveLinkBg}},[t("div",{staticClass:"cdct_header"},[t("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(a){n.$router.goBack()}}},[n._v("\n            我的家庭\n            "),t("a",{attrs:{slot:"right"},on:{click:n.CancelRelated},slot:"right"},[n._v("取消关联档案")])])],1),n._v(" "),n._l(n.familyList,function(a,e){return t("div",{key:e,staticClass:"familyBox",on:{click:function(t){n.gotoGRDA(a)}}},[t("div",{staticClass:"avater"},[t("img",{attrs:{src:a.CHZTX?a.CHZTX:"../../static/imgs/avater.png"}})]),n._v(" "),t("dir",{staticClass:"right"},[t("h3",{staticClass:"name"},[n._v(n._s(a.JMXM)),t("span",{staticClass:"age"},[n._v(n._s(a.age)+"岁")]),1==a.HZBZ?t("span",{staticClass:"SF"},[n._v("户主")]):n._e()]),n._v(" "),t("p",{staticClass:"idcard"},[n._v(n._s(a.ZJBH))])])],1)}),n._v(" "),n.noData?t("div",{staticClass:"error"},[n._v("暂无相关信息")]):n._e()],2)},c=[],f={render:d,staticRenderFns:c},B=f,C=t("VU/8"),g=e,m=C(l,B,!1,g,"data-v-1eb751fa",null);a.default=m.exports}});
//# sourceMappingURL=105.35382af86523b865121e.js.map