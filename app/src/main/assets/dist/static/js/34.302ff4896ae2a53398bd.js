webpackJsonp([34],{"3zCX":function(t,n,i){var e=i("O5Vl");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);i("rjj0")("34f3bab6",e,!0,{})},Ds5C:function(t,n,i){"use strict";function e(t){i("3zCX")}Object.defineProperty(n,"__esModule",{value:!0});var a=i("rLAy"),o=i("ABCa"),A=(o.a,a.a,{mounted:function(){this.$refs.scroll.$el.style.height=document.body.clientHeight-94+"px",this.initdata()},components:{XHeader:o.a,Toast:a.a},data:function(){return{noData:!1,list:[],pageIndex:1,pageSize:15}},methods:{initdata:function(){var t=this,n=new Date;this.start=n.getFullYear()+""+(n.getMonth()+1),this.$ajax.post("",{"MSH.1":"qtylfw","MSH.2":"qryList",GRDAID:this.$root.loginInfo.grdaid,pageIndex:this.pageIndex,pageSize:this.pageSize,CHZBM:this.$root.loginInfo.CHZBM,token:this.$root.loginInfo.token}).then(function(n){t.$refs.scroll.finishPullUp(),t.$refs.scroll.finishPullDown(),void 0!==n&&void 0!==n.rows&&n.rows.length>0?(1==t.pageIndex?t.list=n.rows:t.list=t.list.concat(n.rows),t.noData=!1):t.judge()}).catch(function(n){t.judge(),console.log(n)})},judge:function(){this.pageIndex>1?this.$vux.toast.text("没有更多了","bottom"):(this.list=[],this.noData=!0)},pullingDown:function(){this.pageIndex=1,this.initdata()},pullingUp:function(){this.pageIndex++,this.initdata()},cancerDetail:function(t,n,i){this.$router.push({name:"diagnosisRrecords",params:{TYPE:n,CBH:t,TM:i}})}}}),s=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",{staticClass:"other-main"},[e("div",{staticClass:"cdct_container",on:{touchstart:t.addLinkBg,touchend:t.removeLinkBg,touchmove:t.moveLinkBg}},[e("div",{staticClass:"cdct_header"},[e("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(n){t.$router.goBack()}}},[t._v("其他医疗服务记录")])],1),t._v(" "),e("scroll",{ref:"scroll",staticStyle:{height:"calc(100% - 50px)"},attrs:{data:t.list,pullDownRefresh:!0,isloading:t.$store.state.CONTROL_LOADDING},on:{pullingDown:t.pullingDown,pullingUp:t.pullingUp}},t._l(t.list,function(n,a){return e("div",{key:a,staticClass:"other-content-box",on:{click:function(i){t.cancerDetail(n.CBH,n.TYPE,n.TM)}}},[2==n.TYPE?e("div",{staticClass:"chro-item-list cdct_addLinkitem"},[e("p",{staticClass:"chro-title cdct_onetxtcut"},[t._v(t._s(n.CJGMC))]),t._v(" "),e("div",{staticClass:"chro-simple-info vux-1px-b"},[t._v("\n                        "+t._s(n.CONTENT)+"\n                    ")]),t._v(" "),e("div",{staticClass:"chro-simple-date"},[e("div",{staticClass:"cdct_onetxtcut"},[e("img",{attrs:{width:"15",height:"15",src:i("bULN"),alt:""}}),t._v(t._s(n.TM))]),t._v(" "),e("div",{staticClass:"cdct_onetxtcut"},[e("img",{attrs:{width:"12",height:"15",src:i("ZCt0"),alt:""}}),t._v(t._s(n.CYSXM))])])]):t._e()])})),t._v(" "),t.noData?e("div",{staticClass:"error"},[t._v("暂无记录")]):t._e()],1)])},r=[],c={render:s,staticRenderFns:r},l=c,d=i("VU/8"),p=e,C=d(A,l,!1,p,"data-v-726ba320",null);n.default=C.exports},O5Vl:function(t,n,i){var e=i("kxFB");n=t.exports=i("FZ+f")(!0),n.push([t.i,"\n.other-main[data-v-726ba320],\n.cdct_container[data-v-726ba320] {\n    height: 100%;\n}\n.other-content-wrapper[data-v-726ba320] {\n    padding-top: 84px;\n}\n.nodata[data-v-726ba320] {\n    text-align: center;\n    position: relative;\n    top: 60px;\n}\n.nodata .text[data-v-726ba320] {\n    color: #999999;\n    margin-top: 15px;\n}\n.chro-item-list[data-v-726ba320] {\n    padding: 17px 15px 14px 15px;\n    background: #fff;\n    margin-bottom: 10px;\n}\n.chro-item-list .chro-title[data-v-726ba320] {\n    color: #333333;\n    font-size: 1.8rem;\n}\n.chro-item-list .chro-simple-info[data-v-726ba320] {\n    padding: 15px 0;\n    color: #666666;\n    font-size: 1.6rem;\n    text-overflow: ellipsis;\n    overflow: hidden;\n    white-space: nowrap;\n}\n.chro-item-list .chro-simple-date[data-v-726ba320] {\n    display: -webkit-box;\n    display: -webkit-flex;\n    display: flex;\n    margin-top: 14px;\n}\n.chro-item-list .chro-simple-date div[data-v-726ba320] {\n    -webkit-box-flex: 1;\n    -webkit-flex: 1;\n            flex: 1;\n    color: #999;\n    font-size: 1.4rem;\n}\n.chro-item-list .chro-simple-date div img[data-v-726ba320] {\n    position: relative;\n    top: 2px;\n    margin-right: 10px;\n}\n.chro-item-list .chro-simple-date div[data-v-726ba320]:last-child {\n    text-align: right;\n}\n.error[data-v-726ba320] {\n    background-image: url("+e(i("RqX9"))+");\n    z-index: 0;\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/HealthRrecords/MedicalServerRecords/otherMedicineServer.vue"],names:[],mappings:";AACA;;IAEI,aAAa;CAChB;AACD;IACI,kBAAkB;CACrB;AACD;IACI,mBAAmB;IACnB,mBAAmB;IACnB,UAAU;CACb;AACD;IACI,eAAe;IACf,iBAAiB;CACpB;AACD;IACI,6BAA6B;IAC7B,iBAAiB;IACjB,oBAAoB;CACvB;AACD;IACI,eAAe;IACf,kBAAkB;CACrB;AACD;IACI,gBAAgB;IAChB,eAAe;IACf,kBAAkB;IAClB,wBAAwB;IACxB,iBAAiB;IACjB,oBAAoB;CACvB;AACD;IACI,qBAAqB;IACrB,sBAAsB;IACtB,cAAc;IACd,iBAAiB;CACpB;AACD;IACI,oBAAoB;IACpB,gBAAgB;YACR,QAAQ;IAChB,YAAY;IACZ,kBAAkB;CACrB;AACD;IACI,mBAAmB;IACnB,SAAS;IACT,mBAAmB;CACtB;AACD;IACI,kBAAkB;CACrB;AACD;IACI,gDAA+D;IAC/D,WAAW;CACd",file:"otherMedicineServer.vue",sourcesContent:["\n.other-main[data-v-726ba320],\n.cdct_container[data-v-726ba320] {\n    height: 100%;\n}\n.other-content-wrapper[data-v-726ba320] {\n    padding-top: 84px;\n}\n.nodata[data-v-726ba320] {\n    text-align: center;\n    position: relative;\n    top: 60px;\n}\n.nodata .text[data-v-726ba320] {\n    color: #999999;\n    margin-top: 15px;\n}\n.chro-item-list[data-v-726ba320] {\n    padding: 17px 15px 14px 15px;\n    background: #fff;\n    margin-bottom: 10px;\n}\n.chro-item-list .chro-title[data-v-726ba320] {\n    color: #333333;\n    font-size: 1.8rem;\n}\n.chro-item-list .chro-simple-info[data-v-726ba320] {\n    padding: 15px 0;\n    color: #666666;\n    font-size: 1.6rem;\n    text-overflow: ellipsis;\n    overflow: hidden;\n    white-space: nowrap;\n}\n.chro-item-list .chro-simple-date[data-v-726ba320] {\n    display: -webkit-box;\n    display: -webkit-flex;\n    display: flex;\n    margin-top: 14px;\n}\n.chro-item-list .chro-simple-date div[data-v-726ba320] {\n    -webkit-box-flex: 1;\n    -webkit-flex: 1;\n            flex: 1;\n    color: #999;\n    font-size: 1.4rem;\n}\n.chro-item-list .chro-simple-date div img[data-v-726ba320] {\n    position: relative;\n    top: 2px;\n    margin-right: 10px;\n}\n.chro-item-list .chro-simple-date div[data-v-726ba320]:last-child {\n    text-align: right;\n}\n.error[data-v-726ba320] {\n    background-image: url('~viewImgs/HealthRecords/norecords.png');\n    z-index: 0;\n}\n"],sourceRoot:""}])},RqX9:function(t,n,i){t.exports=i.p+"static/img/norecords.2e125f5.png"},ZCt0:function(t,n){t.exports="data:image/png;base64,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"}});
//# sourceMappingURL=34.302ff4896ae2a53398bd.js.map