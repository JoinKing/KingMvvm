webpackJsonp([89],{"+hUm":function(t,r,i){r=t.exports=i("FZ+f")(!0),r.push([t.i,"\n.up-top[data-v-49ced8f8]{\r\n    margin-top: 1rem;\n}\r\n/* .dep-tips{\r\n    color: #999999;\r\n    font-size: 1.4rem;\r\n    padding-right: 1.6rem;\r\n    background: url('~viewImgs/mine/my-i-07.png')no-repeat right center/.8rem 1.6rem;\r\n} */\n.cdct_row_r[data-v-49ced8f8]{\r\n    color: #333;\n}\n.sub[data-v-49ced8f8]{\r\n    width: 100%;\r\n    margin: 4rem 0 0 0;\n}\n.signOut[data-v-49ced8f8]{\r\n    width: 90vw;\r\n    margin-left: 5vw;\r\n    background:-webkit-linear-gradient(right,rgba(82,196,105,1) 0%,rgba(60,185,99,1) 100%);\r\n    background:linear-gradient(-90deg,rgba(82,196,105,1) 0%,rgba(60,185,99,1) 100%);\r\n    color: white;\r\n    font-size: 1.6rem;\r\n    text-align: center;\r\n    line-height: 4.4rem;\r\n    height: 4.4rem;\r\n    border-radius:.2rem;\n}\r\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/mine/visitCardDetails.vue"],names:[],mappings:";AACA;IACI,iBAAiB;CACpB;AACD;;;;;IAKI;AACJ;IACI,YAAY;CACf;AACD;IACI,YAAY;IACZ,mBAAmB;CACtB;AACD;IACI,YAAY;IACZ,iBAAiB;IACjB,uFAAuF;IACvF,gFAAgF;IAChF,aAAa;IACb,kBAAkB;IAClB,mBAAmB;IACnB,oBAAoB;IACpB,eAAe;IACf,oBAAoB;CACvB",file:"visitCardDetails.vue",sourcesContent:["\n.up-top[data-v-49ced8f8]{\r\n    margin-top: 1rem;\n}\r\n/* .dep-tips{\r\n    color: #999999;\r\n    font-size: 1.4rem;\r\n    padding-right: 1.6rem;\r\n    background: url('~viewImgs/mine/my-i-07.png')no-repeat right center/.8rem 1.6rem;\r\n} */\n.cdct_row_r[data-v-49ced8f8]{\r\n    color: #333;\n}\n.sub[data-v-49ced8f8]{\r\n    width: 100%;\r\n    margin: 4rem 0 0 0;\n}\n.signOut[data-v-49ced8f8]{\r\n    width: 90vw;\r\n    margin-left: 5vw;\r\n    background:-webkit-linear-gradient(right,rgba(82,196,105,1) 0%,rgba(60,185,99,1) 100%);\r\n    background:linear-gradient(-90deg,rgba(82,196,105,1) 0%,rgba(60,185,99,1) 100%);\r\n    color: white;\r\n    font-size: 1.6rem;\r\n    text-align: center;\r\n    line-height: 4.4rem;\r\n    height: 4.4rem;\r\n    border-radius:.2rem;\n}\r\n"],sourceRoot:""}])},LMjk:function(t,r,i){var n=i("+hUm");"string"==typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);i("rjj0")("b4cc0cba",n,!0,{})},b8Rx:function(t,r,i){"use strict";function n(t){i("LMjk")}Object.defineProperty(r,"__esModule",{value:!0});var e=i("ABCa"),a=i("jijt"),c=i("EoFN"),s=(e.a,a.a,c.a,{components:{XHeader:e.a,InlineLoading:a.a,ActionSheet:c.a},mounted:function(){this.getVisitCardDetail()},data:function(){return{CBM:"",info:{}}},methods:{getVisitCardDetail:function(){var t=this;this.$vux.loading.show({text:"加载中..."}),this.$ajax.post("",{"MSH.1":"visitcard","MSH.2":"getVisitCard",token:this.$root.loginInfo.token,cbm:this.$route.params.CBM}).then(function(r){t.$vux.loading.hide(),void 0!==r&&(t.info=r)}).catch(function(r){console.log(r),t.$vux.loading.hide()})}}}),d=function(){var t=this,r=t.$createElement,i=t._self._c||r;return i("div",{staticClass:"cdct_container"},[i("div",{staticClass:"cdct_header vux-1px-b"},[i("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(r){t.$router.goBack()}}},[t._v("就诊卡详情")])],1),t._v(" "),i("div",{staticClass:"up-top"},[i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("姓名")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CHZXM))])]),t._v(" "),i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("证件类型")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CZJLXMC))])]),t._v(" "),i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("证件号码")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CZJHM))])]),t._v(" "),i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("卡类型")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CKPLXMC))])]),t._v(" "),i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("医院")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CYYMC))])]),t._v(" "),i("div",{staticClass:"cdct_row cdct_addLinkitem"},[i("div",{staticClass:"cdct_row_l"},[t._v("就诊卡号")]),t._v(" "),i("div",{staticClass:"cdct_row_r dep-tips"},[t._v(t._s(t.info.CJZKH))])])])])},o=[],v={render:d,staticRenderFns:o},_=v,l=i("VU/8"),C=n,g=l(s,_,!1,C,"data-v-49ced8f8",null);r.default=g.exports}});
//# sourceMappingURL=89.7f129cacb966ed7064d5.js.map