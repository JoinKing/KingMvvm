webpackJsonp([71],{"6Xdy":function(e,t,n){"use strict";function a(e){n("NPEc")}Object.defineProperty(t,"__esModule",{value:!0});var i=n("ABCa"),o=n("jijt"),s=(i.a,o.a,{components:{XHeader:i.a,InlineLoading:o.a},beforeRouteLeave:function(e,t,n){"symptoms"==e.name||"diseaseListSearch"==e.name?(localStorage.setItem("lastcode_Y",this.$route.params.code||window.localStorage.lastcode_Y),localStorage.setItem("lastcode_N",this.$route.params.name||window.localStorage.lastcode_N)):(localStorage.removeItem("lastcode_Y"),localStorage.removeItem("lastcode_N")),n()},data:function(){return{pageIndex:1,pageSize:15,loconame:"",list:[]}},mounted:function(){this.initdata(),this.loconame=this.$route.params.name||window.localStorage.lastcode_N},methods:{initdata:function(){var e=this;this.$ajax.post(this.$root.host,{"MSH.1":"diseasepool","MSH.2":"listDisease",pageIndex:this.pageIndex,pageSize:this.pageSize,cbm:this.$route.params.code||window.localStorage.lastcode_Y,token:this.$root.loginInfo.token}).then(function(t){console.log(t),e.$refs.scroll.finishPullUp(),e.$refs.scroll.finishPullDown(),void 0!==t&&void 0!==t.rows&&t.rows.length>0?1==e.pageIndex?e.list=t.rows:e.list=e.list.concat(t.rows):e.judge()})},judge:function(){this.pageIndex>1?this.$vux.toast.text("没有更多了","bottom"):this.list=[]},pullingDown:function(){this.pageIndex=1,this.initdata()},pullingUp:function(){this.pageIndex++,this.initdata()},cancerDetail:function(e,t){this.$router.push({name:"symptoms",params:{code:t,name:e}})},searchbt:function(){this.$router.push({name:"diseaseListSearch"})}}}),r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"cdct_container"},[n("div",{staticClass:"cdct_header vux-1px-b"},[n("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(t){e.$router.goBack()}}},[e._v(e._s(e.loconame)+"\n      "),n("div",{staticClass:"search",attrs:{slot:"right"},on:{click:e.searchbt},slot:"right"})])],1),e._v(" "),n("div",{staticClass:"disease"},[n("scroll",{ref:"scroll",staticStyle:{height:"100%"},attrs:{data:e.list,pullDownRefresh:!0,isloading:e.$store.state.CONTROL_LOADDING},on:{pullingDown:e.pullingDown,pullingUp:e.pullingUp}},e._l(e.list,function(t,a){return n("div",{key:a,staticClass:"disease-box",on:{click:function(n){e.cancerDetail(t.CJBMC,t.CBM)}}},[n("span",{staticClass:"disease-title"},[e._v(e._s(t.CJBMC))]),e._v(" "),n("p",{staticClass:"disease-txt"},[e._v(e._s(t.CJBGS))])])})),e._v(" "),0==e.list.length?n("div",{staticClass:"error"},[e._v("暂无数据")]):e._e()],1)])},l=[],d={render:r,staticRenderFns:l},c=d,A=n("VU/8"),h=a,g=A(s,c,!1,h,"data-v-6efbd3be",null);t.default=g.exports},NPEc:function(e,t,n){var a=n("tr+s");"string"==typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);n("rjj0")("6b3ab986",a,!0,{})},"tr+s":function(e,t,n){var a=n("kxFB");t=e.exports=n("FZ+f")(!0),t.push([e.i,"\n.cdct_container[data-v-6efbd3be] {\n  height: 100%;\n}\n.disease[data-v-6efbd3be] {\n  width: 100%;\n  height: 100%;\n  overflow: hidden;\n  /* margin-top: 1rem; */\n}\n.disease-box[data-v-6efbd3be] {\n  padding: 2rem 1.5rem;\n  background-color: white;\n  margin-bottom: 1rem;\n}\n.disease-title[data-v-6efbd3be] {\n  color: #333333;\n  display: inline-block;\n  width: 100%;\n  margin-bottom: .7rem;\n}\n.disease-txt[data-v-6efbd3be] {\n  color: #666666;\n  font-size: 1.3rem;\n  line-height: 2rem;\n  overflow: hidden;\n  text-overflow: ellipsis;\n  display: -webkit-box;\n  -webkit-line-clamp: 2;\n  -webkit-box-orient: vertical;\n}\n.search[data-v-6efbd3be] {\n  width: 1.8rem;\n  height: 1.8rem;\n  background: url("+a(n("14Ce"))+") no-repeat center/cover;\n}\n.error[data-v-6efbd3be] {\n  background-image: url("+a(n("tMBN"))+");\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/drugsAndElse/diseaseList.vue"],names:[],mappings:";AACA;EACE,aAAa;CACd;AACD;EACE,YAAY;EACZ,aAAa;EACb,iBAAiB;EACjB,uBAAuB;CACxB;AACD;EACE,qBAAqB;EACrB,wBAAwB;EACxB,oBAAoB;CACrB;AACD;EACE,eAAe;EACf,sBAAsB;EACtB,YAAY;EACZ,qBAAqB;CACtB;AACD;EACE,eAAe;EACf,kBAAkB;EAClB,kBAAkB;EAClB,iBAAiB;EACjB,wBAAwB;EACxB,qBAAqB;EACrB,sBAAsB;EACtB,6BAA6B;CAC9B;AACD;EACE,cAAc;EACd,eAAe;EACf,iEAA4E;CAC7E;AACD;EACE,gDAA8D;CAC/D",file:"diseaseList.vue",sourcesContent:["\n.cdct_container[data-v-6efbd3be] {\n  height: 100%;\n}\n.disease[data-v-6efbd3be] {\n  width: 100%;\n  height: 100%;\n  overflow: hidden;\n  /* margin-top: 1rem; */\n}\n.disease-box[data-v-6efbd3be] {\n  padding: 2rem 1.5rem;\n  background-color: white;\n  margin-bottom: 1rem;\n}\n.disease-title[data-v-6efbd3be] {\n  color: #333333;\n  display: inline-block;\n  width: 100%;\n  margin-bottom: .7rem;\n}\n.disease-txt[data-v-6efbd3be] {\n  color: #666666;\n  font-size: 1.3rem;\n  line-height: 2rem;\n  overflow: hidden;\n  text-overflow: ellipsis;\n  display: -webkit-box;\n  -webkit-line-clamp: 2;\n  -webkit-box-orient: vertical;\n}\n.search[data-v-6efbd3be] {\n  width: 1.8rem;\n  height: 1.8rem;\n  background: url(\"~viewImgs/drugsAndElse/search.png\") no-repeat center/cover;\n}\n.error[data-v-6efbd3be] {\n  background-image: url('~viewImgs/chronicDisease/errorBg.png');\n}\n"],sourceRoot:""}])}});
//# sourceMappingURL=71.a29bce6f923a73825f44.js.map