webpackJsonp([111],{"6MYD":function(t,n,e){"use strict";function a(t){e("Xp+1")}Object.defineProperty(n,"__esModule",{value:!0});var i=e("ABCa"),s=e("rLAy"),o=e("jijt"),l=e("FOn0"),A=(i.a,s.a,l.a,o.a,{components:{XHeader:i.a,Toast:s.a,SelectTab:l.a,InlineLoading:o.a},data:function(){return{noData:!1,TabDefault1:{key:"GXY,TNB",val:"全部类型"},TabDefault2:{key:1e4,val:"全部"},select1:[{key:"GXY,TNB",val:"全部类型"},{key:"GXY",val:"高血压"},{key:"TNB",val:"糖尿病"}],select2:[{key:1e4,val:"全部"},{key:3,val:"近三月"},{key:6,val:"近半年"},{key:12,val:"近一年"},{key:36,val:"近三年"}],list:[],isloading:!1,start:"",pageIndex:1,pageSize:15,num:1e4,type:"GXY,TNB"}},mounted:function(){this.initdata()},methods:{initdata:function(){var t=this,n=new Date;this.start=n.getFullYear()+""+(n.getMonth()+1),this.$ajax.post("",{"MSH.1":"mbinfo","MSH.2":"mbsflist",num:this.num,start:this.start,GRDAID:this.$root.loginInfo.grdaid,pageIndex:this.pageIndex,pageSize:this.pageSize,CHZBM:this.$root.loginInfo.CHZBM,type:this.type,token:this.$root.loginInfo.token}).then(function(n){t.$refs.scroll.finishPullUp(),t.$refs.scroll.finishPullDown(),void 0!==n&&void 0!==n.rows&&n.rows.length>0?(1==t.pageIndex?t.list=n.rows:t.list=t.list.concat(n.rows),t.noData=!1):t.judge()})},judge:function(){this.pageIndex>1?this.$vux.toast.text("没有更多了","bottom"):(this.list=[],this.noData=!0)},pullingDown:function(){this.pageIndex=1,this.initdata()},pullingUp:function(){this.pageIndex++,this.initdata()},cancerDetail:function(t,n){"GXY"==t?this.$router.push({name:"HyperRecord",params:{ID:n}}):"TNB"==t&&this.$router.push({name:"DiabetesFollowUp",params:{ID:n}})},selChange1:function(t){this.type=t.key,this.list.length=0,this.pageIndex=1,console.log(t.key),this.initdata()},selChange2:function(t){this.num=t.key,this.list.length=0,this.pageIndex=1,this.initdata(),console.log(this.num)}}}),r=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",{staticClass:"cdct_container",on:{touchstart:t.addLinkBg,touchend:t.removeLinkBg,touchmove:t.moveLinkBg}},[e("div",{staticClass:"cdct_header"},[e("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(n){t.$router.goBack()}}},[t._v("慢病随访信息")])],1),t._v(" "),e("select-tab",{attrs:{TabDefault1:t.TabDefault1,TabDefault2:t.TabDefault2,selectList1:t.select1,selectList2:t.select2},on:{"on-change1":t.selChange1,"on-change2":t.selChange2}}),t._v(" "),e("scroll",{ref:"scroll",staticStyle:{height:"calc(100% - 50px)"},attrs:{data:t.list,pullDownRefresh:!0,isloading:t.$store.state.CONTROL_LOADDING},on:{pullingDown:t.pullingDown,pullingUp:t.pullingUp}},t._l(t.list,function(n,a){return e("div",{key:a,staticClass:"listBox cdct_addLinkitem",on:{click:function(e){t.cancerDetail(n.SFLX,n.ID)}}},[e("h3",{staticClass:"title cdct_onetxtcut"},[t._v(t._s("TNB"==n.SFLX?"2型糖尿病患者随访服务记录表":"高血压患者随访服务记录表"))]),t._v(" "),e("div",{staticClass:"detail vux-1px-b"},[e("p",{staticClass:"details1 cdct_onetxtcut"},[t._v(t._s("TNB"==n.SFLX?"空腹血糖：":"血压：")+t._s(n.VAL)+t._s("TNB"==n.SFLX?n.VAL?"mmol/L":"":n.VAL?"mmHg":""))]),t._v(" "),e("p",{staticClass:"details2 cdct_onetxtcut"},[t._v("随访结果："+t._s(n.RES?n.RES:""))])]),t._v(" "),e("div",{staticClass:"tips"},[e("div",{staticClass:"time cdct_onetxtcut"},[t._v(t._s(n.SFRQ))]),t._v(" "),e("div",{staticClass:"username cdct_onetxtcut"},[t._v(t._s(n.SFYSXM))])])])})),t._v(" "),t.noData?e("div",{staticClass:"error"},[t._v("暂无记录")]):t._e()],1)},d=[],c={render:r,staticRenderFns:d},b=c,p=e("VU/8"),B=a,u=p(A,b,!1,B,"data-v-13b341b4",null);n.default=u.exports},NASd:function(t,n,e){var a=e("kxFB");n=t.exports=e("FZ+f")(!0),n.push([t.i,"\n.cdct_container[data-v-13b341b4] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-13b341b4] {\n  height: 100%;\n}\n.listBox[data-v-13b341b4] {\n  width: 100%;\n  margin-bottom: 10px;\n  padding: 1.7rem 1.5rem 1.4rem;\n  background: #fff;\n  box-shadow: 0px 0px 8px 0px rgba(0, 0, 0, 0.09);\n  border-radius: 4px;\n}\n.listBox .title[data-v-13b341b4] {\n  color: #4A4A4A;\n  font-size: 1.8rem;\n  margin-bottom: 1.5rem;\n  font-weight: 400;\n}\n.listBox .detail[data-v-13b341b4] {\n  padding-bottom: 1.5rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n}\n.listBox .detail .details1[data-v-13b341b4],\n.listBox .detail .details2[data-v-13b341b4] {\n  width: 50%;\n  color: #666;\n}\n.listBox .detail .details2[data-v-13b341b4] {\n  text-align: right;\n}\n.listBox .tips[data-v-13b341b4] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 1.5rem;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.listBox .tips .time[data-v-13b341b4],\n.listBox .tips .username[data-v-13b341b4] {\n  color: #AAA;\n  font-size: 1.4rem;\n  padding-left: 25px;\n  position: relative;\n  max-width: 50%;\n}\n.listBox .tips .time[data-v-13b341b4]::before,\n.listBox .tips .username[data-v-13b341b4]::before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 16px;\n  background-size: 15px 15px;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n}\n.listBox .tips .time[data-v-13b341b4]::before {\n  background-image: url("+a(e("W/ON"))+");\n}\n.listBox .tips .username[data-v-13b341b4]::before {\n  background-size: 12px 15px;\n  background-image: url("+a(e("0GkP"))+");\n}\n.error[data-v-13b341b4] {\n  background-image: url("+a(e("tMBN"))+");\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/HealthRrecords/chronicDisease/index.vue"],names:[],mappings:";AACA;EACE,aAAa;EACb,iBAAiB;CAClB;AACD;EACE,aAAa;CACd;AACD;EACE,YAAY;EACZ,oBAAoB;EACpB,8BAA8B;EAC9B,iBAAiB;EACjB,gDAAgD;EAChD,mBAAmB;CACpB;AACD;EACE,eAAe;EACf,kBAAkB;EAClB,sBAAsB;EACtB,iBAAiB;CAClB;AACD;EACE,uBAAuB;EACvB,qBAAqB;EACrB,sBAAsB;EACtB,cAAc;CACf;AACD;;EAEE,WAAW;EACX,YAAY;CACb;AACD;EACE,kBAAkB;CACnB;AACD;EACE,qBAAqB;EACrB,sBAAsB;EACtB,cAAc;EACd,oBAAoB;EACpB,0BAA0B;EAC1B,uCAAuC;UAC/B,+BAA+B;CACxC;AACD;;EAEE,YAAY;EACZ,kBAAkB;EAClB,mBAAmB;EACnB,mBAAmB;EACnB,eAAe;CAChB;AACD;;EAEE,YAAY;EACZ,mBAAmB;EACnB,QAAQ;EACR,SAAS;EACT,YAAY;EACZ,aAAa;EACb,2BAA2B;EAC3B,oCAAoC;UAC5B,4BAA4B;EACpC,6BAA6B;CAC9B;AACD;EACE,gDAA2D;CAC5D;AACD;EACE,2BAA2B;EAC3B,gDAA+D;CAChE;AACD;EACE,gDAA8D;CAC/D",file:"index.vue",sourcesContent:["\n.cdct_container[data-v-13b341b4] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-13b341b4] {\n  height: 100%;\n}\n.listBox[data-v-13b341b4] {\n  width: 100%;\n  margin-bottom: 10px;\n  padding: 1.7rem 1.5rem 1.4rem;\n  background: #fff;\n  box-shadow: 0px 0px 8px 0px rgba(0, 0, 0, 0.09);\n  border-radius: 4px;\n}\n.listBox .title[data-v-13b341b4] {\n  color: #4A4A4A;\n  font-size: 1.8rem;\n  margin-bottom: 1.5rem;\n  font-weight: 400;\n}\n.listBox .detail[data-v-13b341b4] {\n  padding-bottom: 1.5rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n}\n.listBox .detail .details1[data-v-13b341b4],\n.listBox .detail .details2[data-v-13b341b4] {\n  width: 50%;\n  color: #666;\n}\n.listBox .detail .details2[data-v-13b341b4] {\n  text-align: right;\n}\n.listBox .tips[data-v-13b341b4] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 1.5rem;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.listBox .tips .time[data-v-13b341b4],\n.listBox .tips .username[data-v-13b341b4] {\n  color: #AAA;\n  font-size: 1.4rem;\n  padding-left: 25px;\n  position: relative;\n  max-width: 50%;\n}\n.listBox .tips .time[data-v-13b341b4]::before,\n.listBox .tips .username[data-v-13b341b4]::before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 16px;\n  background-size: 15px 15px;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n}\n.listBox .tips .time[data-v-13b341b4]::before {\n  background-image: url('~viewImgs/MedicalRecords/time.png');\n}\n.listBox .tips .username[data-v-13b341b4]::before {\n  background-size: 12px 15px;\n  background-image: url('~viewImgs/MedicalRecords/username.png');\n}\n.error[data-v-13b341b4] {\n  background-image: url('~viewImgs/chronicDisease/errorBg.png');\n}\n"],sourceRoot:""}])},"Xp+1":function(t,n,e){var a=e("NASd");"string"==typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);e("rjj0")("2ccd8ad4",a,!0,{})}});
//# sourceMappingURL=111.a8f82dbdae771139797a.js.map